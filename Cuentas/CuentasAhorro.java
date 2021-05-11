class CuentasAhorro extends Cuentas{}
private double cuotaMantenimiento;
public CuentasAhorro(){}
public CuentasAhorro(String nom, String cue, double cantidadsal,double cantidadre, double tipo, double mant){
    super(nom,cue,cantidadsal,cantidadre,tipo);
    asignarCuotaMante(mant);
}
public void asignarCuotaMante(double cantidad) {
    if (cantidad < 0){
        System.out.println("Error: Cantidad de saldo negativa");
        return;
    }
    cuotaMantenimiento = cantidad;
}
public double obtenerCuentaMante(){
    return cuotaMantenimiento;
}