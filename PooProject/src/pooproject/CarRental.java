/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject;

import java.util.ArrayList;

/**
 * Representa modelo de negocio renta de carros con los datos principales del
 * vehículo.
 *
 * @author Yon Hawer Piñeros
 */
public class CarRental {

    /**
     * Representa los atributos principales de los vehículos.
     */
    public String brand;
    public int model;
    private String plate;
    public ArrayList<String> colors;
    public int cost;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase
     * renta de carros.
     *
     * @param brand
     * @param model
     * @param plate
     * @param colors
     * @param cost
     */
    public CarRental(String brand, int model, String plate, ArrayList<String> colors, int cost) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.colors = colors;
        this.cost = cost;
    }

    /**
     * Representa el acceso a los campos o atributos del alquiler de los
     * vehículos.
     *
     * @return Color del vehiculo seleccionado.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Representa la lista de colores de los vehículos en este caso se
     * selecciona el color de la posición 6 “Orange”.
     */
    public void car1() {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Black");
        colors.add("Gray");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");

        System.out.println(colors.get(6));

    }

}
