class Cuentas
{
  private String nombre;
  private String cuenta;
  public double saldo;
  private double tipoDeInteres;
//Codigo con constructores
  public Cuentas(){System.out.println("Objeto iniciado con constructor sin parametros");}//Contructor sin parametros
  public Cuentas(String nom, String cue, double cantidadsal,double cantidadre, double tipo)
  {
    asignarNombre(nom);
    asignarCuenta(cue);
    ingreso(cantidadsal);
    reintegro(cantidadre);
    asignarTipoDeInteres(tipo);
  }

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
  
  public void ingreso(double cantidadsal)
  {
    if (cantidadsal < 0)
    {
      System.out.println("Cantidad negativa");
      return;
    }
    saldo = saldo + cantidadsal;
  }

  public void reintegro(double cantidadre)
  {
    if (saldo - cantidadre < 0)
    {
      System.out.println("No dispone de saldo");
      return;
    }
    saldo = saldo - cantidadre;
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