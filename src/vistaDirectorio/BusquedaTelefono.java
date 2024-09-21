
package vistaDirectorio;

import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vistaDirectorio.BusquedaContacto.modelo;


public class BusquedaTelefono extends javax.swing.JInternalFrame {
    public static DefaultTableModel modelo = new DefaultTableModel(); // Se utilizará para gestionar las columnas y filas de la tabla, usando sus metodos.

   
    public BusquedaTelefono() {
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
        jtApellido = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTelefonos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda de telefonos");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtTelefonos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTelefonos);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jbSalir)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    //(a) Boton de 'Buscar numero de telefonos asociado a un apellido"
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       if(jtApellido.getText().isEmpty())
           JOptionPane.showMessageDialog(this, "Ingrese numero de telefono");
       else{
        
          // Verificar que el campo del apellido no esté vacío
    if(jtApellido.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un apellido");
    } else {
        String apellidoBuscado = jtApellido.getText().trim();
        
        // Validar si el apellido ingresado contiene solo letras (evitar números)
        try {
            // Intentar convertir el apellido a un número, si es posible, lanzar excepción
            Long.parseLong(apellidoBuscado);
            // Si no se lanzó una excepción, significa que se ingresó un número
            JOptionPane.showMessageDialog(this, "El apellido no puede ser un número");
            return; // Salir del método si se ingresó un número
        } catch (NumberFormatException e) {
            // Si ocurre esta excepción, significa que el valor no es un número, lo cual es correcto
        }

        // Limpiar la tabla antes de mostrar el resultado
        modelo.setRowCount(0);
        
        // Agregar solo las columnas "Apellido" y "Teléfono"
        modelo.setColumnCount(0);  // Limpiar las columnas existentes
        modelo.addColumn("Apellido");
        modelo.addColumn("Teléfono");
        
        // Recorrer el directorio de contactos buscando coincidencias con el apellido
        boolean encontrado = false;
        for (Map.Entry<Long, Contacto> entry : DirectorioTelefonico.directorio.entrySet()) {
            Contacto contacto = entry.getValue();
            Long telefono = entry.getKey();
            
            // Comparar el apellido del contacto con el apellido buscado (ignorar mayúsculas/minúsculas)
            if (contacto.getApellido().equalsIgnoreCase(apellidoBuscado)) {
                // Si hay coincidencia, agregar una fila a la tabla con el apellido y teléfono
                modelo.addRow(new Object[] {contacto.getApellido(), telefono});
                encontrado = true;
            }
        }
        
        
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "No se encontraron contactos con el apellido: " + apellidoBuscado);
        }
    }}
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
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTable jtTelefonos;
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
        jtTelefonos.setModel(modelo);
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
