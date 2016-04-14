/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
            JOptionPane.showMessageDialog(frm_ventanaPersona, "Persona guardada");
        }
        if(e.getActionCommand().equalsIgnoreCase("Buscar")||e.getActionCommand().equalsIgnoreCase("Consultar"))
        {
            buscar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            metodosPersona.modificarPersona(frm_ventanaPersona.obtenerInformacionAGuardar());
            frm_ventanaPersona.inicializarGUI();
            JOptionPane.showMessageDialog(frm_ventanaPersona, "Persona modificada");
        }
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            metodosPersona.eliminarPersona(frm_ventanaPersona.obtenerInformacionAGuardar()[0]);
            frm_ventanaPersona.inicializarGUI();
            JOptionPane.showMessageDialog(frm_ventanaPersona, "Persona eliminada");
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
            JOptionPane.showMessageDialog(frm_ventanaPersona, "Persona no encontrada");
            
        }
        
    }
}
