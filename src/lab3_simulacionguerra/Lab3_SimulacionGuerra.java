package lab3_simulacionguerra;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3_SimulacionGuerra {

    public static void main(String[] args) {

        ArrayList<Ejercito> ejercitos = new ArrayList();
        ArrayList<Arma> armas = new ArrayList();
        ArrayList<Soldado> soldados1 = new ArrayList();

        Scanner input = new Scanner(System.in);

        int option = 0;

        while (option != 12) {

            System.out.printf("\n%s", "1 - Crear Ejército\n2 - Crear Soldado\n3 - Crear Arma\n"
                    + "4 - Modificar Ejército\n5 - Listar Ejército\n"
                    + "6 - Eliminar Ejército\n7 - Eliminar Soldado\n8 - Listar Soldados\n"
                    + "9 - Eliminar Arma\n10 - Listar Armas\nIngrese opción que desea: ");

            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Nombre del Ejército: ");
                    String nombre = input.next();
                    System.out.print("Región a la que pertenece el Ejército: ");
                    String region = input.next();
                    System.out.print("Dinero disponible: ");
                    double money = input.nextDouble();
                    ArrayList<Soldado> soldados = new ArrayList();
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Ingrese el nombre del soldado: ");
                        String nombre_sol = input.nextLine();
                        nombre_sol = input.nextLine();
                        System.out.print("Ingrese el lugar: ");
                        String lugar = input.nextLine();
                        System.out.print("Ingrese la edad: ");
                        int edad = input.nextInt();
                        System.out.println("Ingrese el sexo del soldado: ");
                        char sexo = input.next().charAt(0);
                        System.out.printf("%s\n%s", "Tipo de Soldado", "1.General\n2.Caballero\n3.Ejecutor\nIngrese el tipo de soldado que desea: ");
                        int tipo_sol = input.nextInt();

                        if (tipo_sol == 1) {
                            System.out.print("Ingrese los años de mandato del General: ");
                            int años = input.nextInt();
                            System.out.println("Arma para el General");
                            System.out.print("Ingrese el nombre del Arma: ");
                            String nombreA = input.next();
                            System.out.print("Ingrese el precio del Arma: ");
                            double price = input.nextDouble();
                            System.out.println("Tipo de Arma");
                            System.out.printf("%s\n%s", "Tipo 1 - Rifle\nTipo 2 - Arma Blanca",
                                    "Tipo deseado: ");
                            int type = input.nextInt();
                            while (type < 1 && type > 2) {
                                System.out.println("El tipo que desea no existe, utilice los propuestos.");
                                System.out.printf("%s\n%s", "Tipo 1 - Rifle\nTipo 2 - Arma Blanca",
                                        "Tipo deseado: ");
                                type = input.nextInt();
                            }
                            Arma a = new Arma();
                            switch (type) {
                                case 1:
                                    System.out.print("Alcance Máximo: ");
                                    int max = input.nextInt();
                                    System.out.print("Alcance Mínimo: ");
                                    int min = input.nextInt();
                                    System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                                    int auto = input.next().charAt(0);
                                    String autom = "";
                                    while (auto != 1 || auto != 2) {
                                        System.out.print("Debe utilizar las opciones propuestas [1/2]");
                                        System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                                        auto = input.next().charAt(0);
                                    }
                                    if (auto == 1) {
                                        autom = "Automática";
                                    } else {
                                        autom = "No automática";
                                    }
                                    a = new Rifle(max, min, autom, nombreA, price);
                                    break;
                                case 2:
                                    System.out.print("Material del Arma Blanca");
                                    String material = input.next();
                                    a = new ArmaBlanca(material, nombreA, price);
                                    break;
                            }
                            soldados.add(new General(años, nombre_sol, lugar, edad, sexo, a));

                        } else if (tipo_sol == 2) {
                            System.out.println("Arma para el Caballero");
                            System.out.print("Ingrese el nombre del Arma: ");
                            String nombreA = input.next();
                            System.out.print("Ingrese el precio del Arma: ");
                            double price = input.nextDouble();
                            System.out.println("Tipo de Arma");
                            System.out.printf("%s\n%s", "Tipo 1 - Rifle\nTipo 2 - Arma Blanca",
                                    "Tipo deseado: ");
                            int type = input.nextInt();
                            while (type < 1 && type > 2) {
                                System.out.println("El tipo que desea no existe, utilice los propuestos.");
                                System.out.printf("%s\n%s", "Tipo 1 - Rifle\nTipo 2 - Arma Blanca",
                                        "Tipo deseado: ");
                                type = input.nextInt();
                            }
                            Arma a = new Arma();
                            switch (type) {
                                case 1:
                                    System.out.print("Alcance Máximo: ");
                                    int max = input.nextInt();
                                    System.out.print("Alcance Mínimo: ");
                                    int min = input.nextInt();
                                    System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                                    int auto = input.next().charAt(0);
                                    String autom = "";
                                    while (auto != 1 || auto != 2) {
                                        System.out.print("Debe utilizar las opciones propuestas [1/2]");
                                        System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                                        auto = input.next().charAt(0);
                                    }
                                    if (auto == 1) {
                                        autom = "Automática";
                                    } else {
                                        autom = "No automática";
                                    }
                                    a = new Rifle(max, min, autom, nombreA, price);
                                    break;
                                case 2:
                                    System.out.print("Material del Arma Blanca");
                                    String material = input.next();
                                    a = new ArmaBlanca(material, nombreA, price);
                                    break;
                            }
                            soldados.add(new Caballero(nombre_sol, lugar, edad, sexo, a));

                        } else if (tipo_sol == 3) {
                            System.out.println("Arma para el Ejecutor");
                            System.out.print("Ingrese el nombre del Arma: ");
                            String nombreA = input.next();
                            System.out.print("Ingrese el precio del Arma: ");
                            double price = input.nextDouble();
                            System.out.println("Tipo de Arma");
                            System.out.printf("%s\n%s", "Tipo 1 - Rifle\nTipo 2 - Arma Blanca",
                                    "Tipo deseado: ");
                            int type = input.nextInt();
                            while (type < 1 && type > 2) {
                                System.out.println("El tipo que desea no existe, utilice los propuestos.");
                                System.out.printf("%s\n%s", "Tipo 1 - Rifle\nTipo 2 - Arma Blanca",
                                        "Tipo deseado: ");
                                type = input.nextInt();
                            }
                            Arma a = new Arma();
                            switch (type) {
                                case 1:
                                    System.out.print("Alcance Máximo: ");
                                    int max = input.nextInt();
                                    System.out.print("Alcance Mínimo: ");
                                    int min = input.nextInt();
                                    System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                                    int auto = input.next().charAt(0);
                                    String autom = "";
                                    while (auto != 1 || auto != 2) {
                                        System.out.print("Debe utilizar las opciones propuestas [1/2]");
                                        System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                                        auto = input.next().charAt(0);
                                    }
                                    if (auto == 1) {
                                        autom = "Automática";
                                    } else {
                                        autom = "No automática";
                                    }
                                    a = new Rifle(max, min, autom, nombreA, price);
                                    break;
                                case 2:
                                    System.out.print("Material del Arma Blanca");
                                    String material = input.next();
                                    a = new ArmaBlanca(material, nombreA, price);
                                    break;
                            }
                            System.out.print("Material de la Bomba: ");
                            String material = input.next();
                            System.out.print("Alcance: ");
                            int reach = input.nextInt();
                            Bomba b = new Bomba(material, reach, nombreA, price);
                            soldados.add(new Ejecutor(b, nombre_sol, lugar, edad, sexo, a));
                        }
                    }
                    Ejercito e = new Ejercito(nombre, region, money, soldados);
                    ejercitos.add(e);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del soldado: ");
                    String nombre_sol = input.nextLine();
                    nombre_sol = input.nextLine();
                    System.out.print("Ingrese el lugar: ");
                    String lugar = input.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = input.nextInt();
                    System.out.println("Ingrese el sexo del soldado: ");
                    char sexo = input.next().charAt(0);
                    System.out.printf("%s\n%s", "Tipo de Soldado", "1.General\n2.Caballero\n3.Ejecutor\nIngrese el tipo de soldado que desea: ");
                    int tipo_sol = input.nextInt();
                    if (tipo_sol == 1) {
                        System.out.print("Ingrese los años de mandato del General: ");
                        int años = input.nextInt();
                        soldados1.add(new General(años, nombre_sol, lugar, edad, sexo));
                    } else if (tipo_sol == 2) {
                        soldados1.add(new Caballero(nombre_sol, lugar, edad, sexo));
                    } else if (tipo_sol == 3) {
                        soldados1.add(new Ejecutor(nombre_sol, lugar, edad, sexo));
                    }
                    break;

                case 3:
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
                            while (auto != 1 || auto != 2) {
                                System.out.print("Debe utilizar las opciones propuestas [1/2]");
                                System.out.print("¿Es automático? [1 - Si/2 - No]: ");
                                auto = input.next().charAt(0);
                            }
                            if (auto == 1) {
                                autom = "Automática";
                            } else {
                                autom = "No automática";
                            }
                            armas.add(new Rifle(max, min, autom, nombreA, price));
                        case 3:
                            System.out.print("Material del Arma Blanca");
                            material = input.next();
                            armas.add(new ArmaBlanca(material, nombreA, price));
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la posicion del ejercito a modificar: ");
                    int pos = input.nextInt();
                    System.out.println("1.Modificar el nombre del ejercito\n"
                            + "2.Modificar La Region\n"
                            + "3.Modificar el Presupuesto\n"
                            + "Ingrese el numero de la opcion a modificar: ");
                    int op = input.nextInt();

                    switch (op) {
                        case 1: {
                            System.out.print("Ingrese el nuevo nombre del ejercito: ");
                            String newName = input.nextLine();
                            ejercitos.get(pos).setNombre(newName);
                        }

                        break;
                        case 2: {
                            System.out.print("Ingrese la nueva region: ");
                            String newRegion = input.nextLine();
                            ejercitos.get(pos).setRegion(newRegion);
                        }
                        break;

                        case 3: {
                            System.out.println("Ingrese el nuevo presupuesto: ");
                            double newDinero = input.nextDouble();
                            ejercitos.get(pos).setDinero_dis(newDinero);
                        }
                    }
                    break;

                case 5:
                    String salida = "";
                    for (Ejercito t : ejercitos) {
                        salida += ejercitos.indexOf(t) + " - " + t + "\n";
                    }
                    System.out.println(salida);
                    break;

                case 6:
                    System.out.print("Ingrese la posición del Ejército a Eliminar: ");
                    pos = input.nextInt();
                    if (pos > ejercitos.size() - 1) {
                        System.out.println("Posición Incorrecta");
                    } else {
                        ejercitos.remove(pos);
                    }
                    break;

                case 7:
                    System.out.print("Ingrese la posición del Soldado a Eliminar: ");
                    pos = input.nextInt();
                    if (pos > soldados1.size() - 1) {
                        System.out.println("Posición Incorrecta");
                    } else {
                        soldados1.remove(pos);
                    }
                    break;

                case 8:
                    salida = "";
                    for (Soldado t : soldados1) {
                        salida += soldados1.indexOf(t) + " - " + t + "\n";
                    }
                    System.out.println(salida);
                    break;

                case 9:
                    System.out.print("Ingrese la posición del Arma a Eliminar: ");
                    pos = input.nextInt();
                    if (pos > armas.size() - 1) {
                        System.out.println("Posición Incorrecta");
                    } else {
                        armas.remove(pos);
                    }
                    break;

                case 10:
                    salida = "";
                    for (Arma t : armas) {
                        salida += armas.indexOf(t) + " - " + t + "\n";
                    }
                    System.out.println(salida);
                    break;

                case 11: {
                    Soldado tablero[][] = new Soldado[10][10];
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero.length; j++) {
                            System.out.print("[ ]");
                        }
                        System.out.println();
                    }

                    System.out.print("Ingrese la posicion del primer ejercito que desea elegir: ");
                    int pos1 = input.nextInt();
                    int cont1 = 0;
                    Random rand = new Random();
                    int aleatorioI;
                    int aleatorioJ;
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero.length; j++) {
                            aleatorioI = 0 + rand.nextInt(11);
                            aleatorioJ = 0 + rand.nextInt(11);
                            if (tablero[aleatorioI][aleatorioJ] instanceof Soldado) {

                            } else if (cont1 < 5) {

                                tablero[aleatorioI][aleatorioJ] = ejercitos.get(pos1).getSoldados().get(cont1);
                                cont1++;
                            }
                        }
                    }
                    System.out.print("Ingrese la posicion del segundo ejercito que desea elegir: ");
                    int pos2 = input.nextInt();
                    int cont2 = 0;
                    aleatorioI = 0;
                    aleatorioJ = 0;
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero.length; j++) {
                            aleatorioI = 0 + rand.nextInt(11);
                            aleatorioJ = 0 + rand.nextInt(11);
                            if (tablero[aleatorioI][aleatorioJ] instanceof Soldado) {

                            } else if (cont1 < 5) {
                                tablero[aleatorioI][aleatorioJ] = ejercitos.get(pos2).getSoldados().get(cont2);
                                cont2++;
                            }
                        }
                    }
                    //llenado del tablero.
                    boolean gane = false;
                    int turno = 1;
                    while (!gane) {
                        if (turno == 1) {
                            System.out.println("Jugador 1");
                            System.out.print("Ingrese el numero i de la posicion del soldado: ");
                            int i1 = input.nextInt();
                            System.out.print("Ingrese el numero j de la posicion del soldado: ");
                            int j1 = input.nextInt();
                            System.out.print("Ingrese el numero i de la posicion a donde lo va mover: ");
                            int i2 = input.nextInt();
                            System.out.print("Ingrese el numero j de la posicion a donde lo va mover: ");
                            int j2 = input.nextInt();
                            for (int i = 0; i < tablero.length; i++) {
                                for (int j = 0; j < tablero.length; j++) {
                                    if (tablero[i2][j2] instanceof Soldado) {
                                        System.out.println("En esa posicion ya hay un soldado");
                                    } else {

                                    }
                                }
                            }
                            int j2 = input.nextInt();
                            turno = 2;
                        } else if (turno == 2) {
                            System.out.println("Jugador 1");
                            System.out.print("Ingrese el numero i de la posicion del soldado: ");
                            int i1 = input.nextInt();
                            System.out.print("Ingrese el numero j de la posicion del soldado: ");
                            int j1 = input.nextInt();
                            System.out.print("Ingrese el numero i de la posicion a donde lo va mover: ");
                            int i2 = input.nextInt();
                            System.out.print("Ingrese el numero j de la posicion a donde lo va mover: ");
                            int j2 = input.nextInt();
                            turno = 1;
                        }
                    }

                }
                break;
            }
        }

    }
}