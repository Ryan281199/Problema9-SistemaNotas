/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Estudiante {

    PadreFamiliar madre;
    PadreFamiliar padre;
    String nombre;
    String apellido;
    int carnet;

    public Estudiante() {
    }   //instanciar sin enviar valor

    public Estudiante(PadreFamiliar padre, String nombre, String apellido, int carnet) {
        this.padre = padre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
    }

    public Estudiante(String nombre, String apellido, int carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
    }

    public Estudiante(PadreFamiliar madre, PadreFamiliar padre, String nombre, String apellido, int carnet) {
        this.madre = madre;
        this.padre = padre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
    }

    public void mencionarDatos() {      //public void autoregistro
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Escriba sus apellidos: ");
        apellido = entrada.nextLine();
        System.out.println("Escriba su carnet: ");
        carnet = entrada.nextInt();
    }

    public void decirDatos() {
        System.out.println("Nombre: " + nombre + "\n"
                + "Apellidos: " + apellido + "\n"
                + "Carnet: " + carnet);
    }

    public void imprimirPadreFamiliar() {
        System.out.println(padre.getNombre() + " " + padre.getApellido());
        System.out.println(madre.getNombre() + " " + madre.getApellido());
        //System.out.println(padre); otra manera de hacerlo, implementando metodo toString en la clase PadreFamiliar
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public PadreFamiliar getPadre() {
        return padre;
    }

    public void setPadre(PadreFamiliar padre) {
        this.padre = padre;
    }

    public PadreFamiliar getMadre() {
        return madre;
    }

    public void setMadre(PadreFamiliar madre) {
        this.madre = madre;
    }

    
}
