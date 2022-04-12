
package metodoburbuja;

import java.util.Scanner;

public class Burbuja {
    Scanner entrada = new Scanner (System.in);
    int [] arreglo = new int[5];
    int aux, opc1;
   
    public void Cargar(){
        System.out.println("Rellene el arreglo ");
        for (int i = 0; i<5; i++){
            System.out.print("Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("\n");
    }
 
    public void Imprimir(){
        for (int i = 0; i<5; i++){
            System.out.print(arreglo[i] + "\t");
        } 
        System.out.println("\n");
    }
    
    public void Inverso(){
        for (int i=4; i>=0; i--){
            System.out.print(arreglo[i] + "\t");
        }
        System.out.println("\n");
    }
    
    
    public void Burbuja(){
        for (int i=0; i<(5-1);i++){  //for para ordenar el arreglo 
            for (int j=0; j<(5-1);j++){
                if (arreglo[j] > arreglo[j+1]){ //Si numActual > numSiguiente -> Intercambio
                    aux = arreglo[j];
                    arreglo [j] = arreglo[j+1];
                    arreglo [j+1] = aux; 
                }
            }
        }
        
        System.out.println("Como desea ordenar el arrreglo? ");
        System.out.println(" 1. Creciente ");
        System.out.println(" 2. Dereciente  ");
        System.out.println(" Digite una opcion: ");
        opc1 = entrada.nextInt();
        
        switch (opc1){
            case 1: 
                for (int i=0;i<5; i++){
                    System.out.print(arreglo[i] + " \t ");
                }
                break; 
            case 2: 
                for (int i=(5-1); i>=0; i--){
                    System.out.print(arreglo[i] + " \t ");
                }
                break; 
            default:
                System.out.println("Digite una opcion nuevamente");
                break; 
        
        }
        
    }
}
