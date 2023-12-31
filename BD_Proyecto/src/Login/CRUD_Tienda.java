package Login;

import java.awt.HeadlessException;
import java.sql.*;
import javax.naming.directory.ModificationItem;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC HOREB
 */

public class CRUD_Tienda extends javax.swing.JFrame {

    //17.- Usa este forma porque mi proyeco es de tipo Private
    //Asi que uso el metodo que creamos de getIntance.
    ConexionTienda conectar = ConexionTienda.getInstancia();

    public CRUD_Tienda() {
        initComponents();
        this.setLocationRelativeTo(null); //Para que centre pantalla
        this.setTitle("REGISTRO DE PRODUCTOS");//Añade titulos
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nproducto = new javax.swing.JTextField();
        txt_precioprod = new javax.swing.JTextField();
        txt_fechaingreso = new javax.swing.JTextField();
        txt_fechavencimiento = new javax.swing.JTextField();
        txt_paisprod = new javax.swing.JComboBox<>();
        btn_ingresaDatos = new javax.swing.JButton();
        btn_actualizaDatos = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_consulta = new javax.swing.JButton();
        btn_verificar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio del producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 153));
        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de ingreso del producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 153));
        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de vencimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 153));
        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pais del producto:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        txt_nproducto.setBackground(new java.awt.Color(0, 51, 255));
        txt_nproducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nproducto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_nproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 300, 30));

        txt_precioprod.setBackground(new java.awt.Color(0, 51, 255));
        txt_precioprod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_precioprod.setForeground(new java.awt.Color(255, 255, 255));
        txt_precioprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioprodActionPerformed(evt);
            }
        });
        getContentPane().add(txt_precioprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 300, 30));

        txt_fechaingreso.setBackground(new java.awt.Color(0, 51, 255));
        txt_fechaingreso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_fechaingreso.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_fechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 300, 30));

        txt_fechavencimiento.setBackground(new java.awt.Color(0, 51, 255));
        txt_fechavencimiento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_fechavencimiento.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_fechavencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 300, 30));

        txt_paisprod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina ", "Indonesia", "India", "Tailandia", "México", "Unión Europea", "Estados Unidos", "Brasil", "China", "Canadá" }));
        getContentPane().add(txt_paisprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 300, 30));

        btn_ingresaDatos.setBackground(new java.awt.Color(255, 204, 0));
        btn_ingresaDatos.setText("Ingresar Datos");
        btn_ingresaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresaDatosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresaDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 110, 40));

        btn_actualizaDatos.setBackground(new java.awt.Color(255, 204, 0));
        btn_actualizaDatos.setText("Actualizar");
        btn_actualizaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizaDatosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizaDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 110, 30));

        btn_salir.setBackground(new java.awt.Color(255, 204, 0));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 110, 30));

        btn_consulta.setBackground(new java.awt.Color(255, 204, 0));
        btn_consulta.setText("Consultar");
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 80, 30));

        btn_verificar.setBackground(new java.awt.Color(255, 204, 0));
        btn_verificar.setText("Verificar BD ");
        btn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 90, 30));

        btn_modificar.setBackground(new java.awt.Color(255, 204, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 80, 30));

        btn_eliminar.setBackground(new java.awt.Color(255, 204, 0));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 90, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingresa una ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        txt_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 140, 30));

        btn_buscar.setBackground(new java.awt.Color(255, 204, 0));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        informacion.setColumns(20);
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 580, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_precioprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioprodActionPerformed

    }//GEN-LAST:event_txt_precioprodActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        JOptionPane.showMessageDialog(null, "Programa Finalizado","MENSAJE",3);
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresaDatosActionPerformed
        
        try {

            //21.- Para que conecte a la BD
            Connection conexion = conectar.conectar();

            //22.- Sirve para cargar,modificar,eliminar, etc de una BD
            PreparedStatement insertar = conexion.prepareStatement("insert into productos values(?,?,?,?,?,?)");

            //Esto va deacuerdo al orden de las ?
            insertar.setString(1, "0");
            insertar.setString(2, txt_nproducto.getText());
            insertar.setString(3, txt_precioprod.getText());
            insertar.setString(4, txt_paisprod.getSelectedItem().toString());
            insertar.setString(5, txt_fechaingreso.getText());
            insertar.setString(6, txt_fechavencimiento.getText());

            //Para que actualice los datos,¡¡importante!!
            insertar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos registrados", "Mensaje", 3);

            conectar.cerrarConexion();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR DE ENTRADA DE DATOS" + e, "MENSAJE", 2);
        }


    }//GEN-LAST:event_btn_ingresaDatosActionPerformed

    private void btn_actualizaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizaDatosActionPerformed

        txt_fechaingreso.setText("");
        txt_fechavencimiento.setText("");
        txt_nproducto.setText("");
        txt_precioprod.setText("");

    }//GEN-LAST:event_btn_actualizaDatosActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        try {
            
            Connection conexion = conectar.conectar();
            PreparedStatement buscar = conexion.prepareStatement("SELECT * FROM productos WHERE codigo = ?");
            buscar.setString(1, txt_buscar.getText().trim());

            ResultSet consulta = buscar.executeQuery();

            while (consulta.next()) {
                txt_nproducto.setText(consulta.getString(2));
                txt_precioprod.setText(consulta.getString(3));
                txt_paisprod.setSelectedItem(consulta.getString(4));
                txt_fechaingreso.setText(consulta.getString(5));
                txt_fechavencimiento.setText(consulta.getString(6));    
            }
            
            JOptionPane.showMessageDialog(null, "Se encontraron los datos");
            
            conectar.cerrarConexion();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed

        informacion.setText("");

        try {

            Connection conexion = conectar.conectar();
            PreparedStatement seleccionar = conexion.prepareStatement("SELECT * FROM productos");
            ResultSet consulta = seleccionar.executeQuery();

            //Este sirve para que podamos traer los datos a Netbeants
            while (consulta.next()) {
                informacion.append(consulta.getString(1));
                informacion.append("   ");
                informacion.append(consulta.getString(2));
                informacion.append("   ");
                informacion.append(consulta.getString(3));
                informacion.append("   ");
                informacion.append(consulta.getString(4));
                informacion.append("   ");
                informacion.append(consulta.getString(5));
                informacion.append("   ");
                informacion.append(consulta.getString(6));
                informacion.append("\n");
            }

            conectar.cerrarConexion();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        }

    }//GEN-LAST:event_btn_consultaActionPerformed

    private void btn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarActionPerformed
       
        try {

            Connection conexion = conectar.conectar();
            PreparedStatement selecionar = conexion.prepareStatement("SELECT * FROM productos");
            ResultSet consultar = selecionar.executeQuery();

            if (consultar.next()) {
                JOptionPane.showMessageDialog(null, "La BD si tiene elementos");
            } else {
                JOptionPane.showMessageDialog(null, "La BD NO tiene elementos");
            }

            conectar.cerrarConexion();

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        }
        
    }//GEN-LAST:event_btn_verificarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
        try {

            Connection conexion = conectar.conectar();
            String ID = txt_buscar.getText().trim();
            PreparedStatement modificar = conexion.prepareStatement("UPDATE productos SET nombre = ?, precio = ?, pais_producto = ?, F_ingreso = ?, F_vencimiento = ? WHERE codigo = " + ID);

            modificar.setString(1, txt_nproducto.getText().trim());
            modificar.setString(2, txt_precioprod.getText().trim());
            modificar.setString(3, txt_paisprod.getSelectedItem().toString());
            modificar.setString(4, txt_fechaingreso.getText().trim());
            modificar.setString(5, txt_fechavencimiento.getText().trim());
            modificar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificacion exitosa!!");

            conectar.cerrarConexion();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        }
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        try {
            
            Connection conexion = conectar.conectar();
            PreparedStatement eliminar = conexion.prepareStatement("delete from productos WHERE codigo = ?");
            
            eliminar.setString(1, txt_buscar.getText().trim());
            eliminar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro eliminado . ");
            
            conectar.cerrarConexion();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de datos", "Mensaje", 2);
        }
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CRUD_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizaDatos;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_ingresaDatos;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_verificar;
    private javax.swing.JTextArea informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_fechaingreso;
    private javax.swing.JTextField txt_fechavencimiento;
    private javax.swing.JTextField txt_nproducto;
    private javax.swing.JComboBox<String> txt_paisprod;
    private javax.swing.JTextField txt_precioprod;
    // End of variables declaration//GEN-END:variables
}
