// Проверка входных слов на то, являются ли они палиндромами
public class Palindrome 
{
    // Точка входа
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            if (isPalindrome(args[i]))
                System.out.println(args[i] + " - is palindrome");
            else
                System.out.println(args[i] + " - is not palindrome");
        }
    }

    // Проверка на палиндром
    public static boolean isPalindrome(String str)
    {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    // Реверс строки
    public static String reverseString(String str)
    {
        return new StringBuffer(str).reverse().toString();
    }
}