package paquete01;

public class MenuDeNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuDeNinos(String nombrePlato, double valorMenu, double valorInicialMenu,
            double valorHelado, double valorPastel) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    public void establecerValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public void establecerValorPastel(double valorPastel) {
        this.valorPastel = valorPastel;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public double calcularSubtotal() {
        return valorMenu + valorHelado + valorPastel;
    }

    public String toString() {
        return super.toString() + "\nValor helado: " + valorHelado
                + "\nValor pastel: " + valorPastel;
    }
}
