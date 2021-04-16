public class Test
{
  public static void main(String[] args)
  {
    Cuentas cuenta01 = new Cuentas();
    cuenta01.asignarNombre("Sayed");
    cuenta01.asignarCuenta("01");
    cuenta01.asignarTipoDeInteres(2.5);

    cuenta01.ingreso(40000);
    cuenta01.reintegro(12000);
    
    System.out.println(cuenta01.obtenerNombre());
    System.out.println(cuenta01.obtenerCuenta());
    System.out.println(cuenta01.estado());
    System.out.println(cuenta01.obtenerTipoDeInteres());
  }
}