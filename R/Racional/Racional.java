class Racional{
    private int numerador;
    private int denominador;
    public void AsignarDatos(int num, int den) {
        numerador = num;
        if (den == 0) den = 1;
        denominador = den;
    }
public void VerRacional(){
    System.out.println(numerador + "/" + denominador);
}
}