/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject;

import java.util.ArrayList;

/**
 * Representa el nombre de la fruta y su color respectivo.
 *
 * @author Yon Hawer Piñeros
 */
public class Fruit {

    /**
     * Representa algunos atributos principales de las frutas en especial el
     * color.
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase
     * fruta.
     *
     * @param name
     * @param averageWeight
     * @param colors
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Representa el acceso a los campos o atributos de las frutas.
     *
     * @return Color de la fruta seleccionada.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Representa la lista de colores de las frutas en este caso se selecciona
     * el color en la posición 3 “Brown”.
     */
    public void fruit1() {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Brown");
        colors.add("Green");

        System.out.println(colors.get(3));

    }

}
