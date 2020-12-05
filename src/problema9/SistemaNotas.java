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
public class SistemaNotas {
    
    int maxRegistros=5;
    Nota[] quizzes = new Nota[maxRegistros];
    int cont=0;
    
    public SistemaNotas(){
    }
    
    //elimina el ult quizz del arreglo
    public boolean eliminarNota(){
        boolean resultado=false;
        if(cont!=0){
            quizzes[cont-1]=null;
            cont--;
            resultado=true;
        }
        return resultado;
    }
    
    //agregar un quizz al arreglo
    public boolean agregarQuizz(Nota qz){
        boolean resultado=false;
        if(cont<maxRegistros){ //el arreglo tiene espacio
            quizzes[cont]=qz;
            cont++;
            resultado=true;
        }
        return resultado;
    }
    
    //mostrar quizzes
    public void mostrarQuizzes(){
        for(int i=0;i<cont;i++){
            if(quizzes[i]!=null)
                System.out.println(quizzes[i].toString());
        }
    }
    
    //calcular promedio
    public float promedioNotas(){
        float retorno=0f;
        
        return retorno;
    }
    
}
