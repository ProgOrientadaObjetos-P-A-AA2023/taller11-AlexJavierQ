package paquete01;

import java.util.ArrayList;

public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        // Agregar un proceso para generar objetos de tipo Menu Carta, Día,
        // Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        // Iterar y crear los objetos según corresponda. Cada objeto generado,
        // agregar al ArrayList lista
        for (String[] dato : datos001) {
            String nombrePlato = dato[0];
            double valorMenu = Double.parseDouble(dato[1]);
            double valorInicialMenu = Double.parseDouble(dato[2]);
            double valorHelado = Double.parseDouble(dato[3]);
            double valorPastel = Double.parseDouble(dato[4]);

            MenuDeNinos menuNinos = new MenuDeNinos(nombrePlato, valorMenu, valorInicialMenu, valorHelado, valorPastel);
            //   menuNinos.establecerValorMenu(); // Establecer valor del menú
            lista.add(menuNinos);
        }

        for (String[] dato : datos002) {
            String nombrePlato = dato[0];
            double valorMenu = Double.parseDouble(dato[1]);
            double valorInicialMenu = Double.parseDouble(dato[2]);
            double porcentajeDescuento = Double.parseDouble(dato[3]);

            MenuEconomico menuEconomico = new MenuEconomico(nombrePlato, valorMenu, valorInicialMenu, porcentajeDescuento);
            // menuEconomico.establecerValorMenu(); // Establecer valor del menú
            lista.add(menuEconomico);
        }

        for (String[] dato : datos003) {
            String nombrePlato = dato[0];
            double valorMenu = Double.parseDouble(dato[1]);
            double valorInicialMenu = Double.parseDouble(dato[2]);
            double valorPostre = Double.parseDouble(dato[3]);
            double valorBebida = Double.parseDouble(dato[4]);

            MenuDelDia menuDia = new MenuDelDia(nombrePlato, valorMenu, valorInicialMenu, valorPostre, valorBebida);
            // menuDia.establecerValorMenu(); // Establecer valor del menú
            lista.add(menuDia);
        }

        for (String[] dato : datos004) {
            String nombrePlato = dato[0];
            double valorMenu = Double.parseDouble(dato[1]);
            double valorInicialMenu = Double.parseDouble(dato[2]);
            double valorGuarnicion = Double.parseDouble(dato[3]);
            double valorBebida = Double.parseDouble(dato[4]);
            double porcentajeAdicional = Double.parseDouble(dato[5]);

            MenuACarta menuACarta = new MenuACarta(nombrePlato, valorMenu, valorInicialMenu, valorGuarnicion, valorBebida, porcentajeAdicional);
            //  menuACarta.establecerValorMenu(); // Establecer valor del menú
            lista.add(menuACarta);
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", 10, lista);
        //  miCuenta.calcularSubtotal();
        miCuenta.calcularValorTotal();
        System.out.printf("%s\n", miCuenta);
    }
}
