
package lab2_angelt;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_AngelT {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        ArrayList detectives = new ArrayList();
        
        int opcion;
        
        do{
            System.out.println("Dectectives\n"+
                                "1 - Agregar detectives\n"+
                                "2 - Eliminar detectives\n"+
                                "3 - Modificar detectives\n"+
                                "4 - Log In\n"+
                                "**\nPresione 0 para salir\n**"+
                                "5 - Listar casos pendientes\n");
            opcion=sc.nextInt();
            
            switch (opcion){
                case 1:
                    int opcion_detec;
                    
                    System.out.println("Agregar Dectectives\n"+
                                "1 - Crear\n"+
                                "\n**Presione 0 para regresar**\n");
                    opcion_detec=sc.nextInt();
                    
                    do{
                        String nombre, nacionalidad, user, password;
                        int edad,anios_trabajo;
                        
                        System.out.println("\nEscriba el nombre: \n");
                        nombre=sc.next();
                        System.out.println("Ingrese la edad: \n");
                        edad=sc.nextInt();
                        System.out.println("Ingrese la nacionalidad: \n");
                        nacionalidad=sc.next();
                        System.out.println("Cantidad de años: \n");
                        anios_trabajo=sc.nextInt();
                        System.out.println("Usuario: \n");
                        user=sc.next();
                        System.out.println("Contraseña: \n");
                        password=sc.next();
                        
                                                
                    }while(opcion_detec!=0);
                    
                    break;
                case 2:
                    break;
                case 3: 
                    break;
                case 4:
                    break;
                default:
                    if(opcion<0 || opcion>4)
                    System.out.println("Ingrese una opción válida");
                    break;
                    
            }
        }while (opcion!=0);
        
        
        
    }

}
