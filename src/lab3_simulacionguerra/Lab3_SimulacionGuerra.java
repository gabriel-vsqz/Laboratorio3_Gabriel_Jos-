package lab3_simulacionguerra;

import java.util.Scanner;
//import javax.swing.JOptionPane;


public class Lab3_SimulacionGuerra {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int option =  0;
        
        while(option != 14){
            
            System.out.printf("\n%s", "1 - Crear Ejército\n2 - Crear Soldado\n3 - Agregar Soldado a un Ejército\n"
                    + "4 - Crear Arma\n4 - Comprar Arma para un Ejército\n5 - Asignar Arma a un Soldado\n6 - Modificar Ejército\n"
                    + "7 - Modificar Ejército\n8 - Listar Ejército\n9 - Eliminar Ejército\n10 - Eliminar Soldad\n11 - Listar Soldados\n"
                    + "12 - Eliminar Arma\n13 - Listar Armas");
            option = input.nextInt();
        }
    }
    
}