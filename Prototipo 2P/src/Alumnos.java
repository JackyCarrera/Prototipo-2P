/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;//Conectar a la base de datos MYSQL
/**
 *
 * @author Jacky
 */
public class Alumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alumnos
     */
    public Alumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtestatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        txtcarnet = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        jLabel1.setText("Carnet alumno:");

        jLabel2.setText("Nombre Alumno");

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Direccion alumno:");

        eliminar.setText("eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono Alumno:");

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jLabel5.setText("email alumno:");

        jLabel7.setText("Buscar por carnet:");

        jLabel6.setText("estatus alumno:");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtestatus))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtemail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(txttelefono))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(txtdireccion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminar)
                        .addGap(30, 30, 30)
                        .addComponent(modificar)
                        .addGap(18, 18, 18)
                        .addComponent(registrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Buscar))
                            .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar)
                    .addComponent(eliminar)
                    .addComponent(modificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // Codigo para registrar alumnos en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu1", "root", "");//conecta a MYSQL
            PreparedStatement pst = cn.prepareStatement("insert into alumnos1 values(?,?,?,?,?,?)");//Inserta los datos en la tabla alumnos
            pst.setString(1, txtcarnet.getText().trim());
            pst.setString(2, txtnombre.getText().trim());
            pst.setString(3, txtdireccion.getText().trim());
            pst.setString(4, txttelefono.getText().trim());
            pst.setString(5, txtemail.getText().trim());
            pst.setString(6, txtestatus.getText().trim());
            pst.executeUpdate();
            
            txtcarnet.setText("");//Se limpia el txt
            txtnombre.setText("");//Se limpia el txt
            txtdireccion.setText("");//Se limpia el txt
            txttelefono.setText("");//Se limpia el txt
            txtemail.setText("");//Se limpia el txt
            txtestatus.setText("");//Se limpia el txt
            
            Label1.setText("El alumno se registró");//Mensaje que aparecera en pantalla al momento de que ingrese datos a la base de datos

        }catch (Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_registrarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu1", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from alumnos1 where carnet_alumno = ?");
            pst.setString(1, txtbuscar.getText().trim());
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
            txtcarnet.setText(rs.getString("carnet_alumno"));//Se unen los campos de la tabla(MYSQL) a los de JAVA
                txtnombre.setText(rs.getString("nombre_alumnos"));
                txtdireccion.setText(rs.getString("direccion_alumno"));
                txttelefono.setText(rs.getString("telefono_alumno"));
                txtemail.setText(rs.getString("email_alumno"));
                txtestatus.setText(rs.getString("estatus_alumno"));
                
                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Persona no registrada.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        // Este codigo modifica los datos de la base de datos seleccionada:
        
        try {
            String Carnet = txtbuscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu1", "root", "");
            PreparedStatement pst = cn.prepareStatement("update alumnos1 set nombre_alumno= ?,direccion_alumno = ?,telefono_alumno = ? , email_alumno = ?, estatus_alumno = ? carnet_alumno = "+ Carnet);
            
            
            pst.setString(1, txtcarnet.getText().trim());
            pst.setString(2, txtnombre.getText().trim());
            pst.setString(3, txtdireccion.getText().trim());
            pst.setString(3, txttelefono.getText().trim());
            pst.setString(4, txtemail.getText().trim());
            pst.setString(5, txtestatus.getText().trim());
            pst.executeUpdate();
            Label1.setText("Modificación exitosa.");
        }catch (Exception e) {
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
       try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/siu1", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from alumnos1 where carnet_alumno = ?");

            pst.setString(1, txtbuscar.getText().trim());
            pst.executeUpdate();
            
            txtcarnet.setText("");
            txtnombre.setText("");
            txtdireccion.setText("");
            txttelefono.setText("");
            txtemail.setText("");
            txtestatus.setText("");
            Label1.setText("Registro eliminado.");
            
        
} catch (Exception e) {
        }
    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Label1;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton modificar;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcarnet;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtestatus;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
