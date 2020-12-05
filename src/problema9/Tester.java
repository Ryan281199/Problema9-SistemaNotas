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
public class Tester {

    public static void main(String args[]) {

        //while(true){
        Scanner entrada = new Scanner(System.in);
        SistemaNotas sistema = new SistemaNotas();
        
        
        //Estudiante est = new Estudiante ("Ryan", "Barrantes Marin", 123456);
        //est.decirDatos();

        System.out.println("Digite el nombre del alumno: ");
        String nom = entrada.next();
        System.out.println("Digite el apellido del alumno: ");
        String ape = entrada.next();
        System.out.println("Digite el carne: ");
        int car = entrada.nextInt();

        Estudiante est = new Estudiante(nom, ape, car); //se instancia el estudiante
        

        System.out.println("Digite el porcentaje: ");
        int pC = entrada.nextInt();
        System.out.println("Digite puntos totales: ");
        int pT = entrada.nextInt();
        System.out.println("Digite puntos obtenidos: ");
        int pO = entrada.nextInt();
        
        //Datos del padre
        System.out.println("Digite el nombre del padre: ");
        String nombrePadre = entrada.next();
        System.out.println("Digite los apellidos del padre: ");
        String apellidosPadre = entrada.next();
        PadreFamiliar pf = new PadreFamiliar(nombrePadre, apellidosPadre);
        est.setPadre(pf); //se asigna el padre a un estudiante
        //PadreFamiliar pf = new PadreFamiliar("Randall", "Barrantes"); otra manera
        
        //Datos de la madre
        System.out.println("Digite el nombre de la madre: ");
        String nombreMadre = entrada.next();
        System.out.println("Digite los apellidos de la madre: ");
        String apellidosMadre = entrada.next();
        PadreFamiliar mf = new PadreFamiliar(nombreMadre, apellidosMadre);
        est.setMadre(mf);
        
        Nota n = new Nota(est, pT, pO, pC); //se instancia la nota

        sistema.agregarQuizz(n);
        n.calcularNota();
        sistema.mostrarQuizzes();
        est.imprimirPadreFamiliar();
        /*
        int respuesta;
        System.out.println("Digite el numero que quiere para la opcion:\n"
        + "1 para agregar datos\n" 
        + "2 para imprimir datos\n" 
        "3 para saber si el estudiante aprobo o no");
        respuesta = entrada.nextInt();
        switch (respuesta) {
                case 1:
                System.out.println("Digite el nombre del alumno: ");
        String nom = entrada.next();
        System.out.println("Digite el apellido del alumno: ");
        String ape = entrada.next();
        System.out.println("Digite el carne: ");
        int car = entrada.nextInt();

        Estudiante est = new Estudiante(nom, ape, car);

        System.out.println("Digite el porcentaje: ");
        int pC = entrada.nextInt();
        System.out.println("Digite puntos totales: ");
        int pT = entrada.nextInt();
        System.out.println("Digite puntos obtenidos: ");
        int pO = entrada.nextInt();

        Nota n = new Nota(est, pT, pO, pC);
        sistema.agregarQuizz(n);
        n.calcularNota();
        break;
        case 2:
        est.decirDatos();
        sistema.mostrarQuizzes();
        break;
        case 3:
        
        
         */
        //Nota not = new Nota(20, 13, 5);
        //not.calcularNota();
        //not.cali();
        //not.getCalificacion();
        
        //}
    }
}
