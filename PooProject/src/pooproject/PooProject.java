/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject;

/**
 *
 * @author Yon Hawer Piñeros
 */
public class PooProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Crear instancias de las clases creadas y así obtener la información
         * requerida.
         */
        Person objPerson = new Person("Name", "LastNane1", "LastName2", null, 80);
        objPerson.person1();

        Fruit objFruit = new Fruit("Pera", 5, null);
        objFruit.fruit1();

        BankAccount objBankAccount = new BankAccount("Name", "LastName", 2, false, "Corriente");
        objBankAccount.bank1();

        MobilePhone objMobilePhone = new MobilePhone("Brand", "Model", "Color", 5.6, 5555555);
        objMobilePhone.phone1();

        CarRental objCarRental = new CarRental("", 2000, "ABC123", null, 500000);
        objCarRental.car1();

        Student objStudent = new Student(10, "Name", "LastName", true);
        objStudent.student1();

    }

}
