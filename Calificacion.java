package archivo1;

import java.io.*;
import java.util.*;


public class Calificacion 
{
   public String materia;
   public int ci;
   public double nota1;
   public double notafin;
   public double notaprom;

   private File arch;
   public String obs;
   
 public Calificacion()
    {
        arch = new File("F:\\calificaciones.txt"); 
    }
    
     public void mostrar()
    {
        try 
        {  
          Scanner in = new Scanner(arch);
          int s=0;
          while(in.hasNextLine())
          {
             s++;
             materia = in.next();
             nota1 = in.nextDouble();
             ci= in.nextInt();
             System.out.println(s+" "+materia+ " "+nota1 +" "+notafin +" "+ci);
          }
        } 
        catch (Exception ex) 
        {
           System.out.println("ERR0OR"); 
        }
    }
     
	
   
    public void MostrarCalificaciones()
    {
       try 
        { 
          Alumno obj = new Alumno();
          Scanner in = new Scanner(arch);
          
          int k=0;
          int r=0;
          int s=0;
          
          while(in.hasNextLine())
          {
             s++;
             materia = in.next();
             nota1 = in.nextDouble();
             notafin = in.nextDouble();
            
             ci= in.nextInt();
             
             notaprom = ((nota1+notafin)/2);
             
             String nombre = obj.buscarPorCi(ci);
             
            
             if(notaprom >= 51)
             {
                obs = "APROBADO";
                k++;
                
             }
             
             else
             {
                obs = "REPROBADO" ;
                r++;
             }
             
             System.out.println(s+"  "+nombre+"    "+materia+ "    "+nota1+"   "+notafin+"    "+notaprom+"   "+ci+"    "+obs);
             
          }
          System.out.println("APROBADOS: "+k);
          System.out.println("REPROBADOS: "+r);
          System.out.println("");
        } 
        catch (Exception ex) 
        {
           System.out.println("ERRooOR"); 
        }  
    }
    
}
