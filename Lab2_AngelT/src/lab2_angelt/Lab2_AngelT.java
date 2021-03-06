package lab2_angelt;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_AngelT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList detectives = new ArrayList();
        ArrayList casos = new ArrayList();
        ArrayList evidencias = new ArrayList();
        ArrayList mensajes= new ArrayList();

        int opcion;

        do { //Main Menu
            System.out.println("Dectectives\n"
                    + "1 - Agregar detectives\n"
                    + "2 - Modificar detectives\n"
                    + "3 - Eliminar detectives\n"
                    + "4 - Log In\n"
                    + "**Presione 0 para salir**\n");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1://agregar detectives
                    int opcion_detec;
                    String nombre,
                     nacionalidad,
                     user,
                     password;
                    int edad,
                     anios_trabajo;

                    do {
                        System.out.println("Agregar Dectectives\n"
                                + "1 - Crear\n"
                                + "**Presione 0 para regresar al menú anterior**\n");
                        opcion_detec = sc.nextInt();

                        switch (opcion_detec) {
                            case 1:
                                System.out.println("\nEscriba el nombre: \n");
                                nombre = sc.next();
                                System.out.println("Ingrese la edad: \n");
                                edad = sc.nextInt();
                                System.out.println("Ingrese la nacionalidad: \n");
                                nacionalidad = sc.next();
                                System.out.println("Cantidad de años de antigüedad: \n");
                                anios_trabajo = sc.nextInt();
                                System.out.println("Usuario: \n");
                                user = sc.next();
                                System.out.println("Contraseña: \n");
                                password = sc.next();

                                detectives.add(new Detectives(nombre, edad, nacionalidad, anios_trabajo, user, password));

                                break;
                            default:
                                if (opcion_detec < 0 || opcion_detec > 1) {
                                    System.out.println("No existe esa opción");
                                }
                                break;
                        }

                    } while (opcion_detec != 0);

                    break;
                case 2://modificar datos
                    int opt_modi;
                    
                    do{
                        System.out.println("\nModificar datos:\n"+
                                        "1 - Detectives\n"+
                                        "2 - Evidencias\n"
                        + "**Presione 0 para regresar al menú anterior**\n");
                        opt_modi=sc.nextInt();
                        
                        switch(opt_modi){
                            case 1://Modificar detectives
                                int pos_det;
                                System.out.println("Ingrese la posición del detective a modificar: \n");
                                pos_det=sc.nextInt();
                                if(pos_det>=0 && pos_det <detectives.size() 
                                    && detectives.get(pos_det) instanceof Detectives){
                                    
                                    System.out.println("Modificar nombre: \n");
                                    String newName =sc.next();
                                    ((Detectives)detectives.get(pos_det)).setNombre(newName);
                                    
                                    System.out.println("Modificar edad: \n");
                                    int newAge =sc.nextInt();
                                    ((Detectives)detectives.get(pos_det)).setEdad(newAge);
                                    
                                    System.out.println("Modificar Nacionalidad: \n");
                                    String newNat =sc.next();
                                    ((Detectives)detectives.get(pos_det)).setNacionalidad(newNat);
                                    
                                    System.out.println("Modificar Años de Antigüedad: \n");
                                    int newYears =sc.nextInt();
                                    ((Detectives)detectives.get(pos_det)).setAnios_trabajo(newYears);
                                    
                                    System.out.println("Modificar Usuario: \n");
                                    String newUser =sc.next();
                                    ((Detectives)detectives.get(pos_det)).setUser(newUser);
                                    
                                    System.out.println("Modificar Contraseña: \n");
                                    String newPwd =sc.next();
                                    ((Detectives)detectives.get(pos_det)).setPassword(newPwd);
                                    
                                    
                                    
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese la posición de la evidencia a modificar: \n");
                                break;
                            default:
                                if (opcion < 0 || opcion > 3) {
                                    System.out.println("Ingrese una opción válida");
                                }
                                break;
                        }
                    }while(opt_modi!=0);
                    
                    
                    break;
                case 3://eliminar detectives
                    int opt_el;
                    System.out.println("\nModificar datos:\n"+
                                        "1 - Detectives\n"+
                                        "2 - Casos\n"+
                                        "3 - Evidencias\n"
                        + "**Presione 0 para regresar al menú anterior**\n");
                    opt_el=sc.nextInt();
                    
                    switch(opt_el){
                        case 1://eliminar detectives por posición
                            int pos_el_dec;
                            System.out.println("Eliminar Detectives: \n");
                            System.out.println("Ingrese la posición del detective a eliminar: \n");
                            pos_el_dec = sc.nextInt();

                            
                            if(pos_el_dec>=0 && pos_el_dec <detectives.size() 
                                && detectives.get(pos_el_dec) instanceof Detectives){
                    
                            detectives.remove(pos_el_dec);
                            }
                            
                            break;
                        case 2://eliminar casos por posición
                            int pos_el_caso;
                            System.out.println("Eliminar Casos: \n");
                            System.out.println("Ingrese la posición del caso a eliminar: \n");
                            pos_el_caso = sc.nextInt();

                            if(pos_el_caso>=0 && pos_el_caso <casos.size() 
                                && casos.get(pos_el_caso) instanceof Casos){
                    
                            casos.remove(pos_el_caso);
                            }
                            break;
                        case 3://eliminar evidencias por posición
                            int pos_el_ev;
                            System.out.println("Eliminar Casos: \n");
                            System.out.println("Ingrese la posición del caso a eliminar: \n");
                            pos_el_ev = sc.nextInt();

                            if(pos_el_ev>=0 && pos_el_ev <evidencias.size() 
                                && evidencias.get(pos_el_ev) instanceof Evidencias){
                            
                                evidencias.remove(pos_el_ev);
                            }
                            break;
                            
                        default:
                            if (opt_el < 0 || opt_el > 3) {
                                    System.out.println("Ingrese una opción válida");
                                }
                            break;
                    }
                    
                    break;
                case 4://Login menu
                    String temp = "";
                    int menuLogIn;
                    System.out.println("\nLog In\n\n");
                    
                    

                    do {//Menú Log In
                        System.out.println("Bienvenido\n"
                                + "1 - Listar mis datos\n"
                                + "2 - Listar casos\n"
                                + "3 - Registro casos\n"
                                + "4 - Modificar casos\n"
                                + "5 - Enviar mensajes\n"
                                + "6 - Listar mensajes\n"
                                + "**Presione 0 para regresar al menú principal**\n");
                        menuLogIn = sc.nextInt();

                        switch (menuLogIn) {
                            case 1://Listar datos
                                System.out.println("Listar mis datos\n");

                                String s = "";
                                for (Object t : detectives) {
                                    if (t instanceof Detectives) {
                                        s += " " + detectives.indexOf(t) + " " + "- " + t + "\n";
                                    }
                                }
                                System.out.println(s);
                                break;
                                
                            case 2://listar casos
                                System.out.println("Listar casos\n");
                                String cas = "";
                                for (Object t : casos) {
                                    if (t instanceof Casos) {
                                        cas += " " + casos.indexOf(t) + " " + "- " + t + "\n";
                                    }
                                }
                                System.out.println(cas+"\n");
                                break;
                                
                            case 3://Registrar casos

                                String lugar_caso, descri_caso, detective;
                                String question = "";
                                String nom_ev, descrip_ev;
                                int nivel_pel, estado;
                                System.out.println("Registro casos\n");

                                System.out.println("Ingrese el lugar del caso: \n");
                                lugar_caso = sc.next();

                                System.out.println("Descripción del caso: \n");
                                descri_caso = sc.next();

                                System.out.println("Detective a cargo");
                                detective = sc.next();

                                System.out.println("Estado: \n"
                                        + "1 - En proceso\n"
                                        + "2 - Resuelto\n");
                                detective = sc.next();

                                System.out.println("¿Existen evidencias? Y/N\n");
                                question = sc.next();

                                if (question.equals("Y") || question.equals("y")) {
                                    System.out.println("Registro de evidencias\n");

                                    System.out.println("Nombre de la evidencia: \n");
                                    nom_ev = sc.next();

                                    System.out.println("Descripción de la evidencia: \n");
                                    descrip_ev = sc.next();

                                    System.out.println("Nivel de peligrosidad: \n"
                                            + "1 - Alto\n"
                                            + "2 - Medio\n"
                                            + "3 - Bajo\n");
                                    nivel_pel = sc.nextInt();

                                    evidencias.add(new Evidencias(nom_ev, descrip_ev, nivel_pel));
                                } else {
                                    System.out.println("No se registraron evidencias.\n");
                                }

                                casos.add(new Casos());

                                break;
                                
                            case 4://modificar casos
                                System.out.println("Modificar casos\n");
                                int pos_caso;
                                System.out.println("Ingrese la posición del caso a modificar: \n");
                                pos_caso=sc.nextInt();
                                
                                if(pos_caso>=0 && pos_caso <casos.size() 
                                    && casos.get(pos_caso) instanceof Casos){
                                    
                                    System.out.println("Modificar el lugar: \n");
                                    String newPlace =sc.next();
                                    ((Casos)casos.get(pos_caso)).setLugar_caso(newPlace);
                                    
                                    System.out.println("Modificar la descripción: \n");
                                    String newDesc =sc.next();
                                    ((Casos)casos.get(pos_caso)).setDescri_caso(newDesc);
                                    
                                    System.out.println("Modificar el detective: \n");
                                    String newDet =sc.next();
                                    ((Casos)casos.get(pos_caso)).setDetective(newDet);
                                    
                                    System.out.println("Modificar el estado: \n");
                                    int newStat =sc.nextInt();
                                    ((Casos)casos.get(pos_caso)).setEstado(newStat);
                                    
                                }
                                break;
                                
                            case 5:// enviar mensajes
                                String emisor, receptor, contenido;
                                int prioridad;
                                System.out.println("Enviar mensajes\n");
                                
                                System.out.println("Emisor: \n");
                                emisor=sc.next();
                                
                                System.out.println("Receptor: \n");
                                receptor=sc.next();
                                
                                System.out.println("Redacte su mensaje: \n");
                                contenido=sc.next();
                                
                                System.out.println("Prioridad: \n"+
                                                    "1 - Alto\n2 - Medio\n"
                                                    + "3 - Bajo\n");
                                prioridad=sc.nextInt();
                                
                                mensajes.add(new Mensajes(emisor,receptor,contenido,prioridad));
                                
                                break;
                            case 6: //listar mensajes
                                System.out.println("Listar mensajes\n");
                                String men = "";
                                for (Object t : mensajes) {
                                    if (t instanceof Mensajes) {
                                        men += " " + mensajes.indexOf(t) + " " + "- " + t + "\n";
                                    }
                                }
                                System.out.println(men);
                                break;
                            default:
                                if (opcion < 0 || opcion > 6) {
                                    System.out.println("Ingrese una opción válida");
                                }
                                break;
                        }//final main 

                    } while (menuLogIn != 0);//final Login menu
                    
                    break;
                    
                    default:
                        if (opcion < 0 || opcion > 4) {
                        System.out.println("Ingrese una opción válida");
                    }
                    break;

            }
        } while (opcion != 0); //final Main Menu

        System.out.println("Salió exitosamente del programa.");

    }

}
