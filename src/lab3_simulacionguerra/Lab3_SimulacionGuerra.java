package lab3_simulacionguerra;

import java.util.ArrayList;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Lab3_SimulacionGuerra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        ArrayList<Ejercito> ejercitos = new ArrayList();
        ArrayList<Arma> armas = new ArrayList();
        ArrayList<Soldado> soldados1 = new ArrayList();

        int option = 0;

        while (option != 14) {

            System.out.printf("\n%s", "1 - Crear Ejército\n2 - Crear Soldado\n3 - Agregar Soldado a un Ejército\n"
                    + "4 - Crear Arma\n4 - Comprar Arma para un Ejército\n5 - Asignar Arma a un Soldado\n6 - Modificar Ejército\n"
                    + "7 - Modificar Ejército\n8 - Listar Ejército\n9 - Eliminar Ejército\n10 - Eliminar Soldad\n11 - Listar Soldados\n"
                    + "12 - Eliminar Arma\n13 - Listar Armas\nIngrese opción que desea: ");
            option = input.nextInt();

            switch (option) {

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

                case 2: {
                    
                    System.out.print("Ingrese el nombre del soldado: ");
                    nombre = input.nextLine();
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
                    
                    System.out.print("Ingrese el nombre del Arma: ");
                    String nombreA = input.next();
                    System.out.print("Ingrese el precio del Arma: ");
                    double price = input.nextDouble();
                    System.out.println("Tipo de Arma");
                    System.out.printf("%s\n%s", "Tipo 1 - Bomba\nTipo 2 - Rifle\nTipo 3 - Arma Blanca",
                            "Tipo deseado: ");
                    int type = input.nextInt();
                    while (type < 1 && type > 3) {
                        System.out.println("El tipo que desea no existe, utilice los propuestos.");
                        System.out.printf("%s\n%s", "Tipo 1 - Bomba\nTipo 2 - Rifle\nTipo 3 - Arma Blanca",
                            "Tipo deseado: ");
                        type = input.nextInt();
                    }
                    switch (type) {
                        case 1:
                            System.out.print("Material de la Bomba: ");
                            String material = input.next();
                            System.out.print("Alcance: ");
                            int reach = input.nextInt();
                            armas.add(new Bomba(material, reach, nombreA, price));
                            break;
                        case 2:
                            System.out.print("Alcance Máximo: ");
                            int max = input.nextInt();
                            System.out.print("Alcance Mínimo: ");
                            int min = input.nextInt();
                            System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                            int auto = input.next().charAt(0);
                            String autom = "";
                            while(auto != 1 || auto != 2){
                                System.out.print("Debe utilizar las opciones propuestas [1/2]");
                                System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                                auto = input.next().charAt(0);
                            }
                            if (auto == 1) {
                                autom = "Automática";
                            }
                            else {
                                autom = "No automática";
                            }
                            armas.add(new Rifle(max, min, autom, nombreA, price));
                            break;
                        case 3:
                            System.out.print("Material del Arma Blanca");
                            material = input.next();
                            armas.add(new ArmaBlanca(material, nombreA, price));
                            break;
                    }
                    
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    String salida = "";
                    for (Ejercito t : ejercitos) {
                        salida += ejercitos.indexOf(t) + " - " + t + "\n";
                    }
                    System.out.println(salida);
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
                    salida = "";
                    for (Arma t : armas) {
                        salida += armas.indexOf(t) + " - " + t + "\n";
                    }
                    System.out.println(salida);
                    break;
            }

        }
    }

}
