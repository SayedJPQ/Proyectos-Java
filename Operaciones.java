class Operaciones
{
  public static void main (String[] args)
  {
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
   if ( dato1 % 2 == 0)
     System.out.println("Par");
   System.out.println("Valor: " + dato1);
  }
}