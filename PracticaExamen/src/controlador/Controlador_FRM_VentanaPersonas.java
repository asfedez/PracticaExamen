/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosPersona;
import vista.FRM_VentanaPersonas;

/**
 *
 * @author Casa
 */
public class Controlador_FRM_VentanaPersonas implements ActionListener {

    FRM_VentanaPersonas frm_ventanaPersona;
    MetodosPersona metodosPersona;
    
    public Controlador_FRM_VentanaPersonas(FRM_VentanaPersonas frm_ventanaPersona) 
    {
        this.frm_ventanaPersona = frm_ventanaPersona;
        metodosPersona= new MetodosPersona();
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            metodosPersona.agregarPersona(frm_ventanaPersona.obtenerInformacionAGuardar());
            frm_ventanaPersona.inicializarGUI();
            System.out.println("guardado");
        }
        if(e.getActionCommand().equalsIgnoreCase("Buscar"))
        {
            buscar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            metodosPersona.modificarPersona(frm_ventanaPersona.obtenerInformacionAGuardar());
            frm_ventanaPersona.inicializarGUI();
            System.out.println("modificado");
        }
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            metodosPersona.eliminarPersona(frm_ventanaPersona.obtenerInformacionAGuardar()[0]);
            frm_ventanaPersona.inicializarGUI();
            System.out.println("eliminado");
        }
    }
    
    
    public void buscar()
    {
        if(metodosPersona.verificarExistencia(frm_ventanaPersona.obtenerInformacionAGuardar()[0]))
        {
            frm_ventanaPersona.mostrarInformacion(metodosPersona.getInformacionConsultada());
            frm_ventanaPersona.habilitarEdicion();
        }
        else
        {
            frm_ventanaPersona.habilitarAgregar();
            System.out.println("No encontrado");
            
        }
        
    }
}
