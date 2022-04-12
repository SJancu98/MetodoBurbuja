package metodoburbuja;

//@author Sebas

import java.util.Scanner;

public class MetodoBurbuja{

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opc = 0;
        
        Burbuja op = new Burbuja();
        
        do {
            System.out.println("MENU");  
            System.out.println("1. Cargar");  
            System.out.println("2. Imprimir");  
            System.out.println("3. Ivertir");  
            System.out.println("4. Ordenar"); 
            System.out.println("5. Salir"); 
            System.out.print("Digite una opcion: ");
            opc = entrada.nextInt();
            
            switch (opc){
                case 1:
                    op.Cargar();
                    break;
                case 2: 
                    op.Imprimir();
                    break; 
                case 3: 
                    op.Inverso();
                    break; 
                case 4: 
                    op.Burbuja();
                    break; 
                default: 
                    System.out.println("Digite una opcion nuevamente");
                    break; 
            }           
        }while (opc!= 5); 
    }
}
