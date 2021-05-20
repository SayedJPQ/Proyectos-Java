class Carros{
    String marca;
    String modelo;
    String color;
    Boolean arrancar = true;
    Boolean cambiarvelocidad = false;
    Boolean frenar = true;
    boolean acelerar = false;
    boolean pararmotor = false;
    public String ObtenerMarca(){
        return marca;
      }
      public void EstablecerMarca(String ma){
        marca = ma;
      }
      public String ObtenerModelo(){
        return modelo;
      }
      public void EstablecerModelo(String mo){
        modelo = mo;
      }
      public String ObtenerColor(){
        return color;
      }
      public void EstablecerColor(String co){
        color = co;
      }
      public void Encender(){
          if (arrancar == true){
              cambiarvelocidad = true;
              frenar = false;
              acelerar = true;
              pararmotor = false;
          }
          else{
            cambiarvelocidad = false;
            frenar = true;
            acelerar = false;
            pararmotor = true;             
          }
      }
      public void Estado()
      {
        System.out.println("\nEl estado es el siguiente:");
        System.out.println("\nMarca: " + marca);
        System.out.println("\nModelo: " + modelo);
        System.out.println("\ncolor: " + color);
        if (arrancar == true){
          System.out.println("\nEl motor esta encendido");
        }
        else{
          System.out.println("\nEl motor esta apagado");
        }
    }
}