package lab3_simulacionguerra;

import java.util.ArrayList;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Lab3_SimulacionGuerra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Soldado> soldados1 = new ArrayList();

        int option = 0;

        while (option != 14) {

            System.out.printf("\n%s", "1 - Crear Ejército\n2 - Crear Soldado\n3 - Agregar Soldado a un Ejército\n"
                    + "4 - Crear Arma\n4 - Comprar Arma para un Ejército\n5 - Asignar Arma a un Soldado\n6 - Modificar Ejército\n"
                    + "7 - Modificar Ejército\n8 - Listar Ejército\n9 - Eliminar Ejército\n10 - Eliminar Soldad\n11 - Listar Soldados\n"
                    + "12 - Eliminar Arma\n13 - Listar Armas");
            option = input.nextInt();

            switch (option) {

                case 1:
                    break;

                case 2: {

                    System.out.print("Ingrese el nombre del soldado: ");
                    String nombre = input.nextLine();
                    System.out.print("Ingrese el lugar: ");
                    String lugar = input.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = input.nextInt();
                    System.out.println("Ingrese el sexo del soldado: ");
                    char sexo = input.next().charAt(0);
                    
                    soldados1.add(new Soldado(nombre, lugar, edad, sexo));

                }
                break;

                case 3: {
                    System.out.print("Ingrese la posicion del ejercito al cual quiera añadirle un soldado: ");
                    int pos = input.nextInt();
                    
                }
                break;

                case 4:
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
