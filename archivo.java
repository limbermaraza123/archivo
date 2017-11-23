package archivo1;

import java.io.*;
import java.util.*;

public class Archivo1 
{


    public static void main(String[] args) 
    {
        Alumno obj = new Alumno();
        //obj.mostrar();
        
        
        String bus;
        System.out.print("BUSCAR NOMBRE : ");
        Scanner in = new Scanner(System.in);
        bus = in.nextLine();
        if(bus.trim().equals(""))
        {
        	obj.mostrar();
        }
        else
        {
        	obj.Buscar(bus);
        }
        Calificacion obj1 = new Calificacion();
        obj1.MostrarCalificaciones();
        
        
        
    }
    
}
