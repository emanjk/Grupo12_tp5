
package vistaDirectorio;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;



public class FormularioContactos extends javax.swing.JFrame {
    public static DirectorioTelefonico  directorio = new DirectorioTelefonico(); //Instanciamos DirectorioTelefonico

    //Constructor
    public FormularioContactos() {
        initComponents();
        this.setLocationRelativeTo(null) ;
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        escritorio = new javax.swing.JDesktopPane();
        jlDNI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlCiudad = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtCiudad = new javax.swing.JTextField();
        jbBuscarContacto = new javax.swing.JButton();
        jbBuscarTelefonos = new javax.swing.JButton();
        jbBuscarContactos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(60, 63, 65));

        jlDNI.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jlDNI.setForeground(new java.awt.Color(255, 255, 255));
        jlDNI.setText("Formulario de Contacto");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Direccion:");

        jlCiudad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlCiudad.setForeground(new java.awt.Color(204, 204, 204));
        jlCiudad.setText("Ciudad:");

        jbBuscarContacto.setText("Buscar contacto");
        jbBuscarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarContactoActionPerformed(evt);
            }
        });

        jbBuscarTelefonos.setText("Buscar  por telefono");
        jbBuscarTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTelefonosActionPerformed(evt);
            }
        });

        jbBuscarContactos.setText("Buscar contactos");
        jbBuscarContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarContactosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Telefono:");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        escritorio.setLayer(jlDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jlCiudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtDireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtCiudad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbBuscarContacto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbBuscarTelefonos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbBuscarContactos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jtTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jtDni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtCiudad)
                            .addComponent(jtTelefono)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbBuscarContactos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBuscarTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBuscarContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jlDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarContacto)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(jbBuscarTelefonos)
                        .addGap(6, 6, 6)))
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbBuscarContactos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCiudad))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    //(a)Boton de 'Nuevo'
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        jtDni.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtDireccion.setText("");
        jtCiudad.setText("");
        jtTelefono.setText("");
    }//GEN-LAST:event_jbNuevoActionPerformed

    
    //(b)Boton de 'Guardar'
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if(jtDni.getText().isEmpty() || jtNombre.getText().isEmpty() || jtApellido.getText().isEmpty() || jtDireccion.getText().isEmpty() || jtCiudad.getText().isEmpty() || jtTelefono.getText().isEmpty()) 
          JOptionPane.showMessageDialog(this,"Por favor complete todos los campos ");
      else{
          
        try{  
            int dni = Integer.parseInt(jtDni.getText()); // el JTextField devuelve un tipo String, convertimos a int
            Long telefono = Long.parseLong(jtTelefono.getText());
            String nombre =  jtNombre.getText();
            String apellido = jtApellido.getText();
            String direccion = jtDireccion.getText();
            String ciudad = jtCiudad.getText();   
            
            
            Contacto contacto = new Contacto(dni,nombre,apellido,direccion,ciudad);            
            directorio.agregarContacto(telefono, contacto);
            JOptionPane.showMessageDialog(this, "Contacto guardado con exito!");
            jtDni.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jtDireccion.setText("");
            jtCiudad.setText("");
            jtTelefono.setText(""); 
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Los campos DNI y Telefono tienen que ser numeros ");
            jtDni.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jtDireccion.setText("");
            jtCiudad.setText("");
            jtTelefono.setText(""); 
        
        }
       
      }
        
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    
    
    //(c)Boton de 'Borrar'
    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        if(jtTelefono.getText().isEmpty())
           JOptionPane.showMessageDialog(this, "El campo Telefono esta vacio");
       
       else{
           try{
           Long telefono = Long.parseLong(jtTelefono.getText());
           if(directorio.eliminarContacto(telefono))
               JOptionPane.showMessageDialog(this, "El contacto a sido eliminado del directorio");
           else{
               JOptionPane.showMessageDialog(this, "No se encontro el contacto en el directorio");
               jtTelefono.setText("");
                }
           }catch(NumberFormatException nf){
           
               JOptionPane.showMessageDialog(this, "Los campos DNI y Telefono deben ser numeros validos ");
               jtDni.setText("");
               jtNombre.setText("");
               jtApellido.setText("");
               jtDireccion.setText("");
               jtCiudad.setText("");
               jtTelefono.setText(""); 
           
           }
 
       }
        
    }//GEN-LAST:event_jbBorrarActionPerformed

    
    //(d)Boton de 'Salir'
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       this.dispose();
    
    }//GEN-LAST:event_jbSalirActionPerformed

    
                        //Metodos Adicionales
    
    
    //(e)Boton de 'Buscar un contacto por numero de Telefono'
    private void jbBuscarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarContactoActionPerformed
      for (JInternalFrame frame : escritorio.getAllFrames()) {
           escritorio.remove(frame);
         } 

      
       escritorio.repaint();
       escritorio.revalidate();
       
       BusquedaContacto bc = new BusquedaContacto(); //creamos una instancia de la ventana interna BusquedaContacto
       bc.setVisible(true); //Hace visible la nueva ventana
       escritorio.add(bc) ;
       escritorio.moveToFront(bc); 
    }//GEN-LAST:event_jbBuscarContactoActionPerformed

    
   //(f)Boton de 'Buscar telefonos asociados a un contacto"
    private void jbBuscarTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTelefonosActionPerformed
        //En vez de usar "escritorio.removeAll()"
        for (JInternalFrame frame : escritorio.getAllFrames()) {
           escritorio.remove(frame);
         } 
       escritorio.repaint(); 
       BusquedaTelefono bt = new BusquedaTelefono();
       bt.setVisible(true);
       escritorio.add(bt) ;
       escritorio.moveToFront(bt); 
        
        
    }//GEN-LAST:event_jbBuscarTelefonosActionPerformed

    
    
    
    //(g) Boton de 'Buscar contactos por Ciudad donde viven'
    private void jbBuscarContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarContactosActionPerformed
       ////Eliminar únicamente los JInternalFrame del JDesktopPane
        for (JInternalFrame frame : escritorio.getAllFrames()) {
           escritorio.remove(frame);
         } 
        
       escritorio.repaint(); 
       BusquedaContactos bc = new BusquedaContactos();
       bc.setVisible(true);
       escritorio.add(bc) ;
       escritorio.moveToFront(bc); 
        
    }//GEN-LAST:event_jbBuscarContactosActionPerformed

    
   
   
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioContactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscarContacto;
    private javax.swing.JButton jbBuscarContactos;
    private javax.swing.JButton jbBuscarTelefonos;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCiudad;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
