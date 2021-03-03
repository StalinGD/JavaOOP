// Вывод списка простых чисел до 100
public class Primes 
{
    // Точка входа
    public static void main(String[] args)
    {
        int from = 50;
        int to = 102;
        for (int i = from; i <= to; i++)
        {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    // Проверка на простое число
    public static boolean isPrime(int n)
    {
        if (n <= 2) return true;

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0) return false;
        }

        return true;
    }
}