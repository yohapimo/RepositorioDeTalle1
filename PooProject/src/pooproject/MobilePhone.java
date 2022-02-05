/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject;

/**
 * Representa las características principales del teléfono móvil.
 *
 * @author Yon Hawer Piñeros
 */
public class MobilePhone {

    /**
     * Representa los atributos más importantes del teléfono móvil.
     */
    public String brand;
    public String model;
    public String color;
    public double inches;
    private int number;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase
     * teléfono móvil.
     *
     * @param brand
     * @param model
     * @param color
     * @param inches
     * @param number
     */
    public MobilePhone(String brand, String model, String color, double inches, int number) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.inches = inches;
        this.number = number;
    }

    /**
     * Representa el acceso a los campos o atributos del teléfono móvil.
     *
     * @return El tamaño del teléfono móvil.
     */
    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    /**
     * Representa el método con el cual seleccionamos el tamaño del teléfono
     * móvil.
     */
    public void phone1() {
        System.out.println(getInches());

    }

}
