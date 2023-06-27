package paquete01;

public class MenuACarta extends Menu {

    private double valorGarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuACarta(String nombrePlato, double valorMenu, double valorInicialMenu,
            double valorGarnicion, double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorGarnicion = valorGarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    public void establecerValorGarnicion(double valorGarnicion) {
        this.valorGarnicion = valorGarnicion;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void establecerPorcentajeServicio(double porcentajeServicio) {
        this.porcentajeServicio = porcentajeServicio;
    }

    public double obtenerValorGarnicion() {
        return valorGarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeServicio() {
        return porcentajeServicio;
    }

    @Override
    public double calcularSubtotal() {
        double subtotal = valorMenu + valorGarnicion + valorBebida;
        double servicio = valorInicialMenu * porcentajeServicio / 100.0;
        return subtotal + servicio;
    }

    public String toString() {
        return super.toString() + "\nValor guarnición: " + valorGarnicion
                + "\nValor bebida: " + valorBebida + "\nPorcentaje Adicional: " + porcentajeServicio;
    }
}
