class Tercerejercicio31{
    public static int calcular(int a, int b, int c){
        int resultado = 0;
        resultado = (b*b-4*a*c)/(2*a);
        return resultado;
    }
    public static void main(String[] args){
        int d = 2, e = 2, f = 1, r = 0;
        r = calcular(d, e, f);
        System.out.println("El resultado es: " + r);
    }
}