class Operaciones
{
  public static void main (String[] args)
  {
    //Conversion y operacion con raiz cuadrada
    double a = 10;
    float b = 20;
    int c = 2, r = 0;
    r = (int)(7.5 * Math.sqrt(a) - b / c);
    int dato1,dato2, resultado;
    long dato3 = 1000;
    long dato4 = 5000; 
    long Resultado;
    dato1=30;
    dato2=70;
   //Suma
   resultado = dato1 + dato2;
   System.out.println(dato1 + " + " + dato2 + " = " + resultado);
   //Resta
   resultado = dato1 - dato2;
   System.out.println(dato1 + " - " + dato2 + " = " + resultado);
   //Multiplicacion
   resultado = dato1 * dato2;
   System.out.println(dato1 + " * " + dato2 + " = " + resultado);
   //Division
   resultado = dato1 / dato2;
   System.out.println(dato1 + " / " + dato2 + " = " + resultado);
   //2 Suma
   Resultado = dato3 + dato4;
   System.out.println(dato3 + " + " + dato4 + " = " + Resultado);
   //Operacion combinada
   System.out.println(r);
   if ( dato1 % 2 == 0)
     System.out.println("Par");
   else
    System.out.println("Numero impar");
  System.out.println("Valor: " + dato1);
  }
}