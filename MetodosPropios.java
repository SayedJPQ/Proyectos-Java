class MetodosPropios
{
    public static double sumar(double x, double y)
    {
        double resultado = 0;
        resultado = x + y;
        return resultado;
    }
    public static void main(String[] args)
    {
        double a = 10, b = 20, r = 0;
        r = sumar(a, b);
        System.out.println("Suma = " + r);
    }
}