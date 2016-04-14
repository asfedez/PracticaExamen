/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Casa
 */
public class ArchivoPersona {
    
    ObjectOutputStream archivoSalida;
    ObjectInputStream archivoEntrada;
    
    
    public void crearArchivo()
    {
        
        try
        {
            archivoSalida = new ObjectOutputStream(new FileOutputStream("personas.dat"));
            System.out.println("Archivo creado");
         
          
        }
        catch(Exception e)
        {
            System.out.println("Error al crear archivo"+e);
        }
        
    }
    
    public void escribirEnElArchivo(Persona persona)
    {
        try
        {
            archivoSalida.writeObject(persona);
            System.out.println("Persona añadida");
        }
        catch(Exception e)
        {
            System.out.println("error al escribir en el archivo"+e);
        }
    }
    
    public ArrayList<Persona> leerArchivo()
    {
        ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
        
        try
        {
            archivoEntrada = new ObjectInputStream(new FileInputStream("personas.dat"));
            while(true)
            {
                listaDePersonas.add((Persona)archivoEntrada.readObject());
            }
        }
        catch(Exception e)
        {
            System.out.println("Fin del archivo"+e);
        }
        return listaDePersonas;
    }
    
  
}
