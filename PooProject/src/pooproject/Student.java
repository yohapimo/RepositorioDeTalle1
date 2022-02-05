/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject;

/**
 * Representa las características o atributos del estudiante y tener la
 * información si aprobó.
 *
 * @author Yon Hawer Piñeros
 */
public class Student {

    /**
     * Representa atributos principales del estudiante.
     */
    private int id;
    public String name;
    public String lastName;
    protected boolean graduate;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase
     * estudiante.
     *
     * @param id
     * @param name
     * @param lastName
     * @param graduate
     */
    public Student(int id, String name, String lastName, boolean graduate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.graduate = graduate;
    }

    /**
     * Representa el acceso a los campos o atributos del estudiante en este caso
     * si aprobó o no.
     *
     * @return Retorna El estudiante aprobó “True o False”.
     */
    public boolean isGraduate() {
        return graduate;
    }

    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }

    /**
     * Representa el método con el cual seleccionamos si el estudiante aprobó.
     */
    public void student1() {
        System.out.println(Boolean.logicalAnd(graduate, graduate));

    }

}
