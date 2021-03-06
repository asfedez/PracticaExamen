/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_VentanaPersonas;

/**
 *
 * @author Casa
 */
public class PanelInformacion extends javax.swing.JPanel {

    Controlador_FRM_VentanaPersonas controlador;
    /**
     * Creates new form PanelInformacion
     */
    public PanelInformacion() {
        initComponents();
        cargarComboBox();
        inicializarGUI();
    }

    
    public String[] obtenerInformacionAGuardar()
    {
        String arreglo[] = new String[3];
        arreglo[0] = this.txtCedula.getText();
        arreglo[1] = this.txtNombre.getText();
        arreglo[2] = ""+this.jcbEdad.getSelectedItem();
        return arreglo;
    }
    
    public void cargarComboBox()
    {
        this.jcbEdad.removeAllItems();
        for(int i=1; i <=100; i++)
        {
            this.jcbEdad.addItem(i);
        }
    }
        
   public String devolverCedula()
   {
       return this.txtCedula.getText();
   }
   
   public void mostrarInformacion(String arreglo[])
   {
       this.txtCedula.setText(arreglo[0]);
       this.txtNombre.setText(arreglo[1]);
       this.jcbEdad.setSelectedIndex(Integer.parseInt(arreglo[2])-1);
   }
   
   public void inicializarGUI()
   {
       this.txtCedula.setEnabled(true);
       this.txtCedula.setText("");
       
       this.txtNombre.setEnabled(false);
       this.txtNombre.setText("");
       
       this.jcbEdad.setEnabled(false);
      
   }
    
   public void habilitarAgregar()
   {
       this.txtCedula.setEnabled(false);
       this.txtNombre.setEnabled(true);
       this.jcbEdad.setEnabled(true);
   }
   
   
   public void agregarEventos(Controlador_FRM_VentanaPersonas controlador)
   {
       this.controlador=controlador;
       this.btnConsultaRapida.addActionListener(controlador);
   }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jcbEdad = new javax.swing.JComboBox();
        btnConsultaRapida = new javax.swing.JButton();

        jLabel1.setText("Cedula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });

        jcbEdad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConsultaRapida.setText("Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtCedula))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultaRapida))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaRapida))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==10)
        {
            controlador.buscar();
        }
    }//GEN-LAST:event_txtCedulaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaRapida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox jcbEdad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
