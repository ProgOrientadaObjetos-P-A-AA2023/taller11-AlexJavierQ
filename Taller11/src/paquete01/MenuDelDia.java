package paquete01;

public class MenuDelDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDelDia(String nombrePlato, double valorMenu, double valorInicialMenu,
            double valorPostre, double valorBebida) {
        super(nombrePlato, valorMenu, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    public void establecerValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public double calcularSubtotal() {
        return valorMenu + valorPostre + valorBebida;
    }

    public String toString() {
        return super.toString() + "\nValor postre: " + valorPostre
                + "\nValor bebida: " + valorBebida;
    }
}
