/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

/**
 *
 * @author Win10
 */
public class Nota {
    
    Estudiante estudiante;
    double calificacion;
    int puntosTotal;
    int puntosObtenidos;
    int porcentaje;

    public Nota() {
    }

    public Nota(int puntosTotal, int puntosObtenidos, int porcentaje) {
        this.puntosTotal = puntosTotal;
        this.puntosObtenidos = puntosObtenidos;
        this.porcentaje = porcentaje;
    }

    
    public Nota(Estudiante estudiante, int puntosTotal, int puntosObtenidos, int porcentaje) {
        this.estudiante = estudiante;
        this.puntosTotal = puntosTotal;
        this.puntosObtenidos = puntosObtenidos;
        this.porcentaje = porcentaje;
    }
    
    public void cali() {
        System.out.println("Su calificacion es de: " + calificacion + "\n"
                + "Los puntos totales eran: " + puntosTotal + "\n"
                + "Sus puntos obtenidos son: " + puntosObtenidos + "\n"
                + "El porcentaje del quizz era de: " + porcentaje);
    }

    public void calcularNota() {
        calificacion = (puntosObtenidos * porcentaje) / puntosTotal;
    }

    @Override
    public String toString() {
        return "Nota{" + "calificacion=" + calificacion + ", puntosTotal=" + puntosTotal + ", puntosObtenidos=" + puntosObtenidos + ", porcentaje=" + porcentaje + '}';
    }

    
    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getPuntosTotal() {
        return puntosTotal;
    }

    public void setPuntosTotal(int puntosTotal) {
        this.puntosTotal = puntosTotal;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    

}
