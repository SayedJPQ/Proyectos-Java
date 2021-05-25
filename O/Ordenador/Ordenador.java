class Ordenador
{ 
  String marca;
  String procesador;
  int peso;
  boolean encendido = false;
  boolean pantalla = false;

  public String ObtenerMarca(){
    return marca;
  }
  public void EstablecerMarca(String ma){
    marca = ma;
  }

  public int ObtenerPeso(){
    return peso;
  }
  public void EstablecerPeso(int pe){
    peso = pe;
  }

  public String ObtenerProcesador(){
    return procesador;
  }
  public void EstablecerProcesador(String pro){
    procesador = pro;
  }
  public void EncenderOrdenador()
  {
    if (encendido == true)
    {
      System.out.println("Esta encendido");
    }
    /*else
    {
      encendido = true;
      pantalla = true;
      System.out.println("Ha sido encendidido");
    }*/
}
public void ApagarOrdenador()
{
  if (encendido == false)
  {
    System.out.println("Esta apagado");
  }
}
  public void Estado()
  {
    System.out.println("\nEl estado es el siguiente:");
    System.out.println("\nMarca: " + marca);
    System.out.println("\nProcesador: " + procesador);
    System.out.println("\nPeso: " + peso + " kg.");
    if (encendido == true){
      System.out.println("\nEl ordenador esta encendido");
    }
    else{
      System.out.println("\nEl ordenador esta apagado");
    }
    if (pantalla == true){
      System.out.println("\nLa pantalla esta activada");
    }
    else{
      System.out.println("\nLa pantalla esta desactivada");
  }
  }
}