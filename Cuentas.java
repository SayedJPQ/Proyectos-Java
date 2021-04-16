class Cuentas
{
  private String nombre;
  private String cuenta;
  private double saldo;
  private double tipoDeInteres;
   
  public void asignarNombre(String nom)
  {
    if (nom.length() == 0)
    {
      System.out.println("Cadena vacia");
      return;
    }
    nombre = nom;
  }

  public String obtenerNombre()
  {
    return nombre;
  }
  public void asignarCuenta(String cue)
  {
    if (cue.length() == 0)
    {
      System.out.println("Cuenta no valida");
      return;
    }
    cuenta = cue;
  }

  public String obtenerCuenta()
  {
    return cuenta;
  }
  
  public double estado()
  {
    return saldo;
  }
  
  public void ingreso(double cantidad)
  {
    if (cantidad < 0)
    {
      System.out.println("Cantidad negativa");
      return;
    }
    saldo = saldo + cantidad;
  }

  public void reintegro(double cantidad)
  {
    if (saldo - cantidad < 0)
    {
      System.out.println("No dispone de saldo");
      return;
    }
    saldo = saldo - cantidad;
  }

  public void asignarTipoDeInteres(double tipo)
  {
    if (tipo < 0)
    {
      System.out.println("Tipo no valido");
      return;
    }
    tipoDeInteres = tipo;
  }
  public double obtenerTipoDeInteres()
  {
    return tipoDeInteres;
  }
}