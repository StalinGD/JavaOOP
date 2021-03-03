import java.util.Scanner;

public class Lab2
{
    // Точка входа
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        Point3d[] points = new Point3d[3];
        for (int p = 0; p < 3; p++)
        {
            System.out.println("Point " + (p + 1));
            System.out.println("X: ");
            double x = console.nextDouble();
            System.out.println("Y: ");
            double y = console.nextDouble();
            System.out.println("Z: ");
            double z = console.nextDouble();
            points[p] = new Point3d(x, y, z);
        }

        if (points[0].equals(points[1]) ||
            points[0].equals(points[2]) ||
            points[1].equals(points[2]))
            System.out.println("Points cannot be equal");
        else 
        {
            System.out.println(computeArea(points[0], points[1], points[2]));
        }
    }

    // Получение площади треугольника
    public static double computeArea(Point3d a, Point3d b, Point3d c)
    {
        double sideA = a.distanceTo(b);
        double sideB = b.distanceTo(c);
        double sideC = c.distanceTo(a);
        double p = 0.5 * (sideA + sideB + sideC);
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}