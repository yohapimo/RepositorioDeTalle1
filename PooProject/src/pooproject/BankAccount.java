/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject;

/**
 * Representa una cuenta bancaria con los datos del cliente y su estado actual.
 *
 * @author Yon Hawer Piñeros
 */
public class BankAccount {

    /**
     * Representa los atributos de la cuenta bancaria.
     */
    public String name;
    public String lastName;
    private int accountNumber;
    protected boolean activated;
    public String type;

    /**
     * Representa el constructor con el cual creamos la instancia de la clase
     * cuenta bancaria.
     *
     * @param name
     * @param lastName
     * @param accountNumber
     * @param activated
     * @param type
     */
    public BankAccount(String name, String lastName, int accountNumber, boolean activated, String type) {
        this.name = name;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.type = type;
    }

    /**
     * Representa el acceso a los campos o atributos de la clase cuenta
     * bancaria.
     *
     * @return Estado de la cuenta bancaria.
     */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Método para imprimir la información solicitada True o False.
     */
    public void bank1() {
        System.out.println(Boolean.getBoolean(type));

    }

}
