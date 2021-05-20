public class MiOrdenador{
    public static void main(String[] args) {
        Ordenador MiOrdenador = new Ordenador();
        MiOrdenador.EstablecerMarca("HP");
        MiOrdenador.EstablecerPeso(2);
        MiOrdenador.EstablecerProcesador("Intel iCore5");
        MiOrdenador.EncenderOrdenador();
        MiOrdenador.Estado();
    }
}