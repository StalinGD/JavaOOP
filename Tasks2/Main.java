import java.util.Scanner;
import java.util.function.Supplier;
import java.util.ArrayList;

class Main 
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        ArrayList<Supplier<Object>> tasks = new ArrayList<Supplier<Object>>();

        tasks.add(()->oppositeHouse(2, 3));
        tasks.add(()->nameShuffle("Donald Trump"));
        tasks.add(()->discount(1500, 50));
        tasks.add(()->differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        tasks.add(()->equal(3, 4, 3));
        tasks.add(()->reverse("Hello World"));
        tasks.add(()->programmers(147, 33, 526));
        tasks.add(()->getXO("XXxooOabc"));
        tasks.add(()->bomb("Some bOmB here"));
        tasks.add(()->sameAscii("AA", "B@"));

        for (Supplier<Object> task : tasks)
        {
            System.out.println(task.get());
        }
    }

    public static int oppositeHouse(int houseA, int streetLength)
    {
        if (houseA % 2 == 0)
        {
            return (streetLength - (houseA / 2)) * 2 + 1;
        }
        else
        {
            return (streetLength - ((houseA - 1) / 2)) * 2; 
        }
    }

    public static String nameShuffle(String fullName)
    {
        String[] words = fullName.split(" ");
        return words[1] + " " + words[0];
    }

    public static double discount(double basePrice, double discountPercents)
    {
        return basePrice * (1 - discountPercents / 100);
    }

    public static int differenceMaxMin(int[] numbers)
    {
        int max = -99999999;
        int min = 99999999;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < min)
                min = numbers[i];
            if (numbers[i] > max)
                max = numbers[i];
        }

        return max - min;
    }

    public static int equal(int a, int b, int c)
    {
        int result = 0;
        if (a == b) result++;
        if (a == c) result++;

        if (result != 0) result++;

        return result;
    }

    public static String reverse(String str)
    {
        return new StringBuffer(str).reverse().toString();
    }

    public static int programmers(int a, int b, int c) 
    {
        return differenceMaxMin(new int[] {a, b, c});
    }


    public static boolean getXO(String str)
    {
        str = str.toLowerCase();

        int countX = countCharInString(str, 'x');
        int countO = countCharInString(str, 'o');

        return countX == countO;
    }

    private static int countCharInString(String str, char c)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }


    public static String bomb(String phrase)
    {
        phrase = phrase.toLowerCase();
        if (phrase.contains("bomb"))
            return "DUCK!";
        else
            return "Relax, there is no bomb.";
    }

    public static boolean sameAscii(String a, String b)
    {
        return countAscii(a) == countAscii(b);
    }

    private static int countAscii(String str)
    {
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
        {
            sum += (int)str.charAt(i);
        }
        return sum;
    }
}