
package vistaDirectorio;

import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistaDirectorio.BusquedaTelefono.modelo;
import vistaDirectorio.DirectorioTelefonico;


 
public class BusquedaContacto extends javax.swing.JInternalFrame {

    public static DefaultTableModel modelo = new DefaultTableModel(); // Se utilizará para gestionar las columnas y filas de la tabla, usando sus metodos.
    
    public BusquedaContacto() {
        initComponents();
         modelo = new DefaultTableModel();
        armarCabecera();
        cargarDatosALaTabla();
            
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtContacto = new javax.swing.JTable();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda de un Contacto");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Telefono:");

        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });

        jtContacto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtContacto);

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbSalir)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jtTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscar)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbSalir)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    //(1)Boton de 'buscar' por numero de telefono
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       if (jtTelefono.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese número de teléfono");
    } else {
        Long telefonoBuscado;
        try {
            telefonoBuscado = Long.parseLong(jtTelefono.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número de teléfono inválido");
            return;
        }

        // Buscar el contacto asociado al número de teléfono
        Contacto contactoBuscado = DirectorioTelefonico.directorio.get(telefonoBuscado);

        // Si se encuentra el contacto, limpiar la tabla y agregarlo
        if (contactoBuscado != null) {
            // Limpiar la tabla antes de mostrar el resultado
            modelo.setRowCount(0); // Solo se limpia si se encuentra un contacto
            modelo.addRow(new Object[]{
                contactoBuscado.getDni(),
                contactoBuscado.getNombre(),
                contactoBuscado.getApellido(),
                contactoBuscado.getCiudad(),
                contactoBuscado.getDireccion(),
                telefonoBuscado
            });
        } else {
            JOptionPane.showMessageDialog(this, "Contacto no encontrado");
        }
    }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtContacto;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables


    //Metodos Adicionales
    
    //(A)Armamos la cabecera de la tabla
    private void armarCabecera(){
           // Solo agregar columnas si el modelo aún no tiene columnas
    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Telefono");
       
        
        // Configurar el modelo en la tabla
        jtContacto.setModel(modelo);
    }
    }
    
   
    
    //(C) Cargar datos en la tabla
    private void cargarDatosALaTabla(){
     // Limpiar cualquier dato anterior en la tabla
        modelo.setRowCount(0);
    
    // Recorrer el TreeSet y agregar los contactos a la tabla
    for (Map.Entry<Long, Contacto> entry : DirectorioTelefonico.directorio.entrySet()) {
    Long telefono = entry.getKey();
    Contacto contacto = entry.getValue();

    // Agregar una fila con los detalles del contacto a la tabla
    modelo.addRow(new Object[] {contacto.getDni(),contacto.getNombre(),contacto.getApellido(),contacto.getDireccion(),contacto.getCiudad(),telefono});
       

}
    }
    
    
    
    
    
}//final prueba