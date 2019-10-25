package lab3_simulacionguerra;

import java.util.ArrayList;
import java.util.Scanner;
//import javax.swing.JOptionPane;


public class Lab3_SimulacionGuerra {

    public static void main(String[] args) {
        
        ArrayList<Ejercito> ejercitos = new ArrayList();
        ArrayList<Arma> armas = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        
        int option =  0;
        
        while(option != 14){
            
            System.out.printf("\n%s", "1 - Crear Ejército\n2 - Crear Soldado\n3 - Agregar Soldado a un Ejército\n"
                    + "4 - Crear Arma\n4 - Comprar Arma para un Ejército\n5 - Asignar Arma a un Soldado\n6 - Modificar Ejército\n"
                    + "7 - Modificar Ejército\n8 - Listar Ejército\n9 - Eliminar Ejército\n10 - Eliminar Soldad\n11 - Listar Soldados\n"
                    + "12 - Eliminar Arma\n13 - Listar Armas");
            option = input.nextInt();
            
            switch(option){
                
                case 1:
                    System.out.print("Nombre del Ejército: ");
                    String nombre = input.next();
                    System.out.print("Región a la que pertenece el Ejército: ");
                    String region = input.next();
                    System.out.print("Dinero disponible: ");
                    double money = input.nextDouble();
                    Ejercito e = new Ejercito(nombre, region, money);
                    ejercitos.add(e);
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    System.out.print("Ingrese el nombre del Arma: ");
                    String nombreA = input.next();
                    System.out.print("Ingrese el precio del Arma: ");
                    double price = input.nextDouble();
                    System.out.print("Tipo de Arma");
                    
                    break;
                    
                case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    break;
                    
                case 8:
                    break;
                    
                case 9:
                    break;
                    
                case 10:
                    break;
                    
                case 11:
                    break;
                    
                case 12:
                    break;
                
                case 13:
                    break;
            }
            
        }
    }
    
}