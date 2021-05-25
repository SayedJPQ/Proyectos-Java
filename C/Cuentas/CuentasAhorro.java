class CuentasAhorro extends Cuentas{
private double cuotaMantenimiento;
public CuentasAhorro(){}
public CuentasAhorro(String nom, String cue, double cantidadsal,double cantidadre, double tipo, double mant){
    super(nom,cue,cantidadsal,cantidadre,tipo);
    asignarCuotaMante(mant);
}
public void asignarCuotaMante(double cantidad) {
    if (saldo * cantidad < 0){
        System.out.println("Error: Cantidad de saldo negativa");
        return;
    }
    cuotaMantenimiento = saldo * cantidad;
    cuotaMantenimiento = saldo - cuotaMantenimiento;
}
public double obtenerCuentaMante(){
    return cuotaMantenimiento;
}
public void reintegro(double cantidadre){
    double saldo = estado();
    double TipoDeInteres = obtenerTipoDeInteres();
    if (TipoDeInteres >= 3.5){
        if (saldo - cantidadre < 1500){
            System.out.println("Error: No dispone de la cantidad necesaria");
            return;
        }
    }
    super.reintegro(cantidadre);
}
}