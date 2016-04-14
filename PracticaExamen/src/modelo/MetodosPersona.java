
package modelo;

import java.util.ArrayList;


public class MetodosPersona 
{
    Persona persona;
    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
   
    String arregloInformacionConsultada[] = new String[3];
    
    public void agregarPersona(String arreglo[])
    {
        persona = new Persona(arreglo[0], arreglo[1], Integer.parseInt(arreglo[2]));
        listaPersonas.add(persona);
    }
    
    public boolean verificarExistencia(String cedula)
    {
        boolean existencia = false;
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getCedula().equalsIgnoreCase(cedula)) 
            {
                arregloInformacionConsultada[0]=listaPersonas.get(i).getCedula();
                arregloInformacionConsultada[1]=listaPersonas.get(i).getNombre();
                arregloInformacionConsultada[2]=""+listaPersonas.get(i).getEdad();
                existencia = true;
            }
           
            
            
        }
        return existencia;
    }
    
    public String[] getInformacionConsultada()
    {
        return arregloInformacionConsultada;
    }
    
    public void modificarPersona(String arreglo[])
    {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getCedula().equalsIgnoreCase(arreglo[0])) 
            {
                listaPersonas.get(i).setNombre(arreglo[1]);
                listaPersonas.get(i).setEdad(Integer.parseInt(arreglo[2]));
            }
        }
     
    }
    
    public void eliminarPersona(String cedula)
    {
         for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getCedula().equalsIgnoreCase(cedula)) 
            {
                listaPersonas.remove(i);
            }
        }
    }
    
    
    /////*****Archivo*****////
    
    public ArrayList<Persona> getListaPersonas()
    {
        return listaPersonas;
    }
    
    
    
    
    
}
