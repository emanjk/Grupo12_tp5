
package vistaDirectorio;

import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistaDirectorio.BusquedaTelefono.modelo;


public class BusquedaContactos extends javax.swing.JInternalFrame {

    
    public BusquedaContactos() {
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
        jtCiudad = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtContactos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda de contactos");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Ciudad:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtContactos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtContactos);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtCiudad)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jbSalir)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //(a) Boton de 'Buscar contactos por nombre de Ciudad'
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
     if (jtCiudad.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese el nombre de una ciudad");
    } else {
        String ciudadBuscada = jtCiudad.getText().trim();

        // Validar que solo contenga letras
        if (!ciudadBuscada.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "El nombre de la ciudad no debe contener números");
            return;
        }

        // Limpiar la tabla antes de buscar
        modelo.setRowCount(0);

        // Recorrer el directorio buscando coincidencias con la ciudad
        boolean encontrado = false;
        for (Map.Entry<Long, Contacto> entry : DirectorioTelefonico.directorio.entrySet()) {
            Contacto contacto = entry.getValue();
            Long telefono = entry.getKey();

            if (contacto.getCiudad().equalsIgnoreCase(ciudadBuscada)) {
                // Asegúrate de agregar en el orden correcto
                modelo.addRow(new Object[] {contacto.getDni(), contacto.getNombre(), contacto.getApellido(), contacto.getDireccion(), contacto.getCiudad(), telefono});
                encontrado = true;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontraron contactos en la ciudad: " + ciudadBuscada);
        }
    }
    }//GEN-LAST:event_jbBuscarActionPerformed

    
    
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtCiudad;
    private javax.swing.JTable jtContactos;
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
        jtContactos.setModel(modelo);
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
    modelo.addRow(new Object[] {contacto.getDni(), contacto.getNombre(), contacto.getApellido(), contacto.getDireccion() ,contacto.getCiudad(),telefono});
       
    }
}
    

}
