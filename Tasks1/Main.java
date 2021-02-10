import java.util.Scanner;

class Main 
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.println(convert(5));

        System.out.println(points(13, 12));

        System.out.println(footballPoints(3, 4, 2));

        System.out.println(divisibleByFive(37));

        System.out.println(and(false, true));

        System.out.println(howManyWalls(100, 4, 5));

        System.out.println(squared(10));

        System.out.println(profitableGamble(0.2, 50, 9));

        System.out.println(frames(10, 25));

        System.out.println(mod(5, 2));
    }

    public static int convert(int minutes)
    {
        return minutes * 60;
    }

    public static int points(int count2Points, int count3Points)
    {
        return count2Points * 2 + count3Points * 3;
    }

    public static int footballPoints(int wins, int draws, int fails){
        return wins * 3 + draws * 1;
    }

    public static boolean divisibleByFive(int number){
        return number % 5 == 0;
    }

    public static boolean and(boolean a, boolean b){
        return a && b;
    }

    public static int howManyWalls(int paintCount, int w, int h){
        return w * h / paintCount;
    }

    public static int squared(int a) {
        return a * a;
    }

    public static boolean profitableGamble(double prob, int prize, int pay){
        return prob * prize > pay;
    }

    public static int frames(int minutes, int fps){
        return convert(minutes) * fps;
    }

    public static int mod(int a, int b){
        return a - ((a / b) * b);
    }
}