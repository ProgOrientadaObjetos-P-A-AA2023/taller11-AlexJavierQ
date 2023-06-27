package paquete01;

import java.util.ArrayList;
import java.util.List;

public class Ejecutor01 {

    public static void main(String[] args) {
        List<Menu> listaMenu = new ArrayList<>();

        MenuDeNinos menuNinos1 = new MenuDeNinos("Niños 01", 4.50, 2.00, 1.00, 1.50);
        MenuDeNinos menuNinos2 = new MenuDeNinos("Niños 02", 5.50, 3.00, 1.00, 1.50);
        MenuEconomico menuEconomico = new MenuEconomico("Econo 001", 3.00, 4.00, 25.00);
        MenuDelDia menuDia = new MenuDelDia("Dia 001", 7.00, 5.00, 1.00, 1.00);
        MenuACarta menuACarta = new MenuACarta("Carta 001", 10.10, 6.00, 1.50, 2.00, 10.00);

        listaMenu.add(menuNinos1);
        listaMenu.add(menuNinos2);
        listaMenu.add(menuEconomico);
        listaMenu.add(menuDia);
        listaMenu.add(menuACarta);

        Cuenta cuenta = new Cuenta("René Elizalde", 10.0, listaMenu);

        System.out.println(cuenta);
    }
}
