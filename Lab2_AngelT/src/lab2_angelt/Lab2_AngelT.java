package lab2_angelt;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_AngelT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList detectives = new ArrayList();
        ArrayList casos = new ArrayList();
        ArrayList evidencias = new ArrayList();

        int opcion;

        do {
            System.out.println("Dectectives\n"
                    + "1 - Agregar detectives\n"
                    + "2 - Eliminar detectives\n"
                    + "3 - Modificar detectives\n"
                    + "4 - Log In\n"
                    + "**\nPresione 0 para salir\n**");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int opcion_detec;

                    System.out.println("Agregar Dectectives\n"
                            + "1 - Crear\n"
                            + "\n**Presione 0 para regresar**\n");
                    opcion_detec = sc.nextInt();

                    do {
                        String nombre, nacionalidad, user, password;
                        int edad, anios_trabajo;

                        System.out.println("\nEscriba el nombre: \n");
                        nombre = sc.next();
                        System.out.println("Ingrese la edad: \n");
                        edad = sc.nextInt();
                        System.out.println("Ingrese la nacionalidad: \n");
                        nacionalidad = sc.next();
                        System.out.println("Cantidad de años: \n");
                        anios_trabajo = sc.nextInt();
                        System.out.println("Usuario: \n");
                        user = sc.next();
                        System.out.println("Contraseña: \n");
                        password = sc.next();

                        detectives.add(new Detectives(nombre, edad, nacionalidad, anios_trabajo, user, password));

                    } while (opcion_detec != 0);

                    break;
                case 2:
                    int pos_el;
                    System.out.println("Eliminar Detectives: \n");
                    System.out.println("Ingrese la posición del detective a eliminar: \n");
                    pos_el = sc.nextInt();

                    detectives.remove(pos_el);
                    break;
                case 3:

                    break;
                case 4:
                    String temp = "";
                    int menuLogIn;
                    System.out.println("\nLog In\n\n");

                    do {
                        System.out.println("Bienvenido\n"
                                + "1 - Listar mis datos\n"
                                + "2 - Listar casos\n"
                                + "3 - Registro casos\n"
                                + "4 - Modificar casos\n"
                                + "5 - Enviar mensajes\n"
                                + "6 - Listar mensajes\n"
                                + "**\nPresione 0 para salir\n**");
                        menuLogIn = sc.nextInt();

                        switch (menuLogIn) {
                            case 1:
                                System.out.println("Listar mis datos\n");
                                break;
                            case 2:
                                System.out.println("Listar casos\n");
                                break;
                            case 3:
                                String question = "";
                                System.out.println("Registro casos\n");
                                String lugar,
                                 descripcion;
                                String nom_ev,descrip_ev;
                                int nivel_pel;
                                
                                System.out.println("¿Existen evidencias? Y/N\n");
                                question=sc.next();
                                
                                if(question.equals("Y") || question.equals("y")){
                                    System.out.println("Registro de evidencias\n");
                                    
                                    System.out.println("Nombre de la evidencia: \n");
                                    nom_ev=sc.next();
                                    
                                    System.out.println("Descripción de la evidencia: \n");
                                    descrip_ev=sc.next();
                                    
                                    System.out.println("Nivel de peligrosidad: \n"+
                                                        "1 - Alto\n"+
                                                        "2 - Medio\n"+
                                                        "3 - Bajo\n");
                                    nivel_pel=sc.nextInt();
                                    
                                    evidencias.add(new Evidencias(nom_ev,descrip_ev,nivel_pel));
                                }

                                int tipo;
                                break;
                            case 4:
                                System.out.println("Modificar casos\n");
                                break;
                            case 5:
                                System.out.println("Enviar mensajes\n");
                                break;
                            case 6:
                                System.out.println("Listar mensajes\n");
                                break;
                            default:
                                if (opcion < 0 || opcion > 6) {
                                    System.out.println("Ingrese una opción válida");
                                }
                                break;
                        }

                    } while (menuLogIn != 0);

                    break;
                default:
                    if (opcion < 0 || opcion > 4) {
                        System.out.println("Ingrese una opción válida");
                    }
                    break;

            }
        } while (opcion != 0);

    }

}
