class Ordenador
{ 
  String marca;
  String procesador;
  int peso;
  boolean encendido = false;
  boolean pantalla = false;
  
  public void EncenderOrdenador()
  {
    if (encendido == true)
    {
      System.out.println("Esta encendido");
    }
    else
    {
      encendido = true;
      pantalla = true;
      System.out.println("Ha sido encendidido");
    }
}
  public void Estado()
  {
    System.out.print("\nEl estado es el siguiente:");
    System.out.print("\nMarca: " + marca);
    System.out.print("\nProcesador" + procesador);
    System.out.print("\nPeso" + peso + "kg.");
   
  }