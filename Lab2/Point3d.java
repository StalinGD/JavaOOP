/**
* трёхмерный класс точки.
**/
public class Point3d extends Point2d
{
    /** координата Z **/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d(double x, double y, double z) 
    {
        super(x, y);
        zCoord = z;
    }

    /** Конструктор инициализации **/
    public Point3d(Point3d point) 
    {
        this(point.getX(), point.getY(), point.getZ());
    }

    /** Конструктор по умолчанию. **/
    public Point3d() 
    {
        this(0, 0, 0);
    }

    /** Возвращение координаты Z **/
    public double getZ() 
    {
        return zCoord;
    }

    /** Установка значения координаты Z. **/
    public void setZ(double val) 
    {
        zCoord = val;
    }

    /** Проверка на равенство значений координат с другой точкой **/
    public boolean equals(Point3d other)
    {
        return getX() == other.getX() && getY() == other.getY() && getZ() == other.getZ();
    }

    /** Получение расстояния до другой точки **/
    public double distanceTo(Point3d other)
    {
        return other.substract(this).getMagnitude();
    }

    /** Скалярное умножение **/
    public Point3d multiply(double value)
    {
        return new Point3d(getX() * value, getY() * value, getZ() * value);
    }

    /** Сложение с другой точкой **/
    public Point3d add(Point3d value)
    {
        return new Point3d(getX() + value.getX(), getY() + value.getY(), getZ() + value.getZ());
    }

    /** Вычитание другой точки **/
    public Point3d substract(Point3d value)
    {
        return add(value.multiply(-1));
    }

    /** Получение модуля **/
    public double getMagnitude()
    {
        return Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }
}