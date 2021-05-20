public class Test
{
  public static void main(String[] args)
  {
    CuentasAhorro cuenta01 = new CuentasAhorro();
    cuenta01.asignarNombre("Sayed");
    cuenta01.asignarCuenta("01");
    cuenta01.asignarTipoDeInteres(2.5);
    cuenta01.ingreso(40000);
    cuenta01.reintegro(12000);
    cuenta01.asignarCuotaMante(0.8);
    CuentasAhorro cuenta02 = new CuentasAhorro("Josue","02",70000,20000,3.5,0.8);
    System.out.println();
    System.out.println(cuenta01.obtenerNombre());
    System.out.println(cuenta01.obtenerCuenta());
    System.out.println(cuenta01.estado());
    System.out.println(cuenta01.obtenerTipoDeInteres());
    System.out.println(cuenta01.obtenerCuentaMante());
    System.out.println();
    System.out.println(cuenta02.obtenerNombre());
    System.out.println(cuenta02.obtenerCuenta());
    System.out.println(cuenta02.estado());
    System.out.println(cuenta02.obtenerTipoDeInteres());
    System.out.println(cuenta02.obtenerCuentaMante());
    //Println deja un salto de linea y print no
  }
}