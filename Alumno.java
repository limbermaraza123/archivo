package archivo1;

import java.io.*;
import java.util.*;

public class Alumno 
{
    public int ci;
    public String nombre;
    public double nota1;
    public double notafin;
   // public double notaprom;
    private File arch;
    
    public Alumno()
    {
        arch = new File("F:\\lista.txt"); 
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
             ci= in.nextInt();
             nombre = in.nextLine();
             System.out.println(s+" "+ci+ " "+nombre);
          }
        System.out.println("TOTAL ALUNMOS ES : "+ contar());
        } 
        catch (Exception ex) 
        {
           System.out.println("ERROR"); 
        }
    }
    
    private int contar()
    {
    	try
    	{
    		int c = 0;
    		Scanner in = new Scanner(arch);
    		 while(in.hasNextLine())
    		 {
    		 	in.nextLine();
    		 	c++;
    		 }
    		 in.close();
    		 return c;
    	}
    	catch (Exception ex) 
        {
           return -1;
        }	
    }
    
    public void Buscar(String par)
    {
    	try
    	{
    		Scanner in = new Scanner(arch);
    		while(in.hasNextLine())
    		 {
    		 	ci = in.nextInt();
    		 	nombre = in.nextLine();
    		 	if(nombre.toUpperCase().contains(par.toUpperCase()))
    		 	{
    		 	System.out.println(ci+ " "+nombre);	
    		 	}

    		 }	
    	}
    
   		catch (Exception ex) 
    	{
           System.out.println("ERROR"); 
    	}		
    }
    
    public String buscarPorCi(int pci)
    {
        try
    	{
    		Scanner in = new Scanner(arch);
                String res = "**";
    		while(in.hasNextLine())
    		 {
    		 	ci = in.nextInt();
    		 	nombre = in.nextLine();
    		 	if(ci == pci)
    		 	{
    		 	res = nombre;
                        break;
    		 	}
                        
    		 }
                in.close();
                return res;
    	}
    
        catch (Exception ex) 
    	{
           System.out.println("ERROR"); 
           return "";
    	}		
    }
   
   
}
