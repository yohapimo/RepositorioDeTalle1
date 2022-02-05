/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject;

import java.util.Date;

/**
 * Representa las características o atributos de la persona.
 *
 * @author Yon Hawer Piñeros
 */
public class Person {

    /**
     * Representa algunos atributos más importantes de la persona.
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase
     * persona.
     *
     * @param name
     * @param lastName1
     * @param lastName2
     * @param dateBirth
     * @param height
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Representa el acceso a los campos o atributos de la persona.
     *
     * @return Retorna El Nombre de la persona.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Representa el método con el cual seleccionamos el nombre de la persona.
     */
    public void person1() {
        System.out.println(getName());
    }

}
