/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logica.DataConnection;

/**
 *
 * @author user
 */
public class VentanaModificarDatosAdmin extends JFrame {

    
    private static VentanaModificarDatosAdmin ventana;
    /**
     * 
     * Creates new form VentanaModificarDatosAdmin
     */
    public VentanaModificarDatosAdmin() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        jButtonGuardar.setEnabled(false);
        
    }

    public static VentanaModificarDatosAdmin getInstanceSingleton(){
        if(ventana==null){
            ventana=new VentanaModificarDatosAdmin();
        }
        return ventana;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanelDatosAdmin = new javax.swing.JPanel();
        jLabelNombres = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabelActual = new javax.swing.JLabel();
        jPasswordFieldActual = new javax.swing.JPasswordField();
        jLabelNueva = new javax.swing.JLabel();
        jPasswordFieldNuevo = new javax.swing.JPasswordField();
        jButtonGuardar = new javax.swing.JButton();
        jPanelBuscarAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombreABuscar = new javax.swing.JTextField();
        jButtonBuscarAdministrador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAE Instituto Montenegro-Modificar Informacion Admin");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Modificar Datos del Administrador");

        jPanelDatosAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Administrador"));

        jLabelNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNombres.setText("Nombres:");

        jTextFieldNombres.setEditable(false);
        jTextFieldNombres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombresKeyTyped(evt);
            }
        });

        jTextFieldApellidos.setEditable(false);
        jTextFieldApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidosKeyTyped(evt);
            }
        });

        jLabelApellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelApellidos.setText("Apellidos:");

        jLabelNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNombreUsuario.setText("Nombre de Usuario:");

        jTextFieldNombreUsuario.setEditable(false);
        jTextFieldNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldNombreUsuario.setEnabled(false);
        jTextFieldNombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreUsuarioKeyTyped(evt);
            }
        });

        jLabelActual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelActual.setText("Contraseña Actual:");

        jPasswordFieldActual.setEditable(false);
        jPasswordFieldActual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordFieldActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldActualKeyTyped(evt);
            }
        });

        jLabelNueva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNueva.setText("Nueva Contraseña:");

        jPasswordFieldNuevo.setEditable(false);
        jPasswordFieldNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordFieldNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldNuevoKeyTyped(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonGuardar.setText("Guardar Cambios");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosAdminLayout = new javax.swing.GroupLayout(jPanelDatosAdmin);
        jPanelDatosAdmin.setLayout(jPanelDatosAdminLayout);
        jPanelDatosAdminLayout.setHorizontalGroup(
            jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosAdminLayout.createSequentialGroup()
                .addGroup(jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelNombres)
                        .addComponent(jLabelApellidos))
                    .addComponent(jLabelNombreUsuario)
                    .addComponent(jLabelActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombres)
                    .addComponent(jTextFieldNombreUsuario)
                    .addComponent(jPasswordFieldActual)))
            .addGroup(jPanelDatosAdminLayout.createSequentialGroup()
                .addComponent(jLabelNueva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPasswordFieldNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelDatosAdminLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButtonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosAdminLayout.setVerticalGroup(
            jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombres)
                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreUsuario)
                    .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelActual)
                    .addComponent(jPasswordFieldActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNueva)
                    .addComponent(jPasswordFieldNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardar))
        );

        jPanelBuscarAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBuscarAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Administrador"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre de Usuario:");

        jTextFieldNombreABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreABuscarKeyTyped(evt);
            }
        });

        jButtonBuscarAdministrador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBuscarAdministrador.setText("Buscar Administrador");
        jButtonBuscarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAdministradorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Para modificar un administrador, primero debe buscarlo");

        javax.swing.GroupLayout jPanelBuscarAdminLayout = new javax.swing.GroupLayout(jPanelBuscarAdmin);
        jPanelBuscarAdmin.setLayout(jPanelBuscarAdminLayout);
        jPanelBuscarAdminLayout.setHorizontalGroup(
            jPanelBuscarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscarAdminLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanelBuscarAdminLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNombreABuscar))
                    .addGroup(jPanelBuscarAdminLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonBuscarAdministrador))))
        );
        jPanelBuscarAdminLayout.setVerticalGroup(
            jPanelBuscarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarAdminLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanelBuscarAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombreABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButtonBuscarAdministrador))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDatosAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelBuscarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanelBuscarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        char[] arrayC = jPasswordFieldActual.getPassword();
        String passwordActual = new String(arrayC);
        char[] arrayC1= jPasswordFieldNuevo.getPassword();
        String passwordNuevo = new String(arrayC1);
        
        cn = DataConnection.conexion();
			try {

				pst = cn.prepareStatement(
						"update administrador set nickname=?,password=?,nombres=?,apellidos=? where password=?");
				pst.setString(1, jTextFieldNombreUsuario.getText());
				 if(arrayC1.length==0){
                                pst.setString(2, passwordActual);
                                }else{
                                    pst.setString(2, passwordNuevo);
                                }
				pst.setString(3, jTextFieldNombres.getText());
				pst.setString(4, jTextFieldApellidos.getText());
                                pst.setString(5, passwordActual);
				
				int res = pst.executeUpdate();
				if (res > 0) {
                                    jTextFieldApellidos.setText("");
                                    jTextFieldNombreABuscar.setText("");
                                    jTextFieldNombreUsuario.setText("");
                                    jTextFieldNombres.setText("");
                                    jPasswordFieldActual.setText("");
                                    jPasswordFieldNuevo.setText("");
					JOptionPane.showMessageDialog(null, "El administrador se ha modificado");
				} else {
					JOptionPane.showMessageDialog(null, "No se pudo modificar el administrador, ocurrió un error");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBuscarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAdministradorActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            String nickname = jTextFieldNombreABuscar.getText();
            cn = DataConnection.conexion();
            pst = cn.prepareStatement(
                    "select nickname, password,nombres, apellidos from administrador where nickname=?");
            pst.setString(1, nickname);
            result = pst.executeQuery();

            if (result.next()) {

                jTextFieldNombreUsuario.setText(result.getString("nickname"));
                jTextFieldNombres.setText(result.getString("nombres"));
                jTextFieldApellidos.setText(result.getString("apellidos"));
                jPasswordFieldActual.setText(result.getString("password"));
                jButtonGuardar.setEnabled(true);
                jTextFieldNombreUsuario.setEditable(true);
                jTextFieldNombres.setEditable(true);
                jTextFieldApellidos.setEditable(true);
                jPasswordFieldNuevo.setEditable(true);
                jTextFieldNombreABuscar.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "El administrador no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaModificarDatosAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_jButtonBuscarAdministradorActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jTextFieldNombreABuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreABuscarKeyTyped
        // TODO add your handling code here:
        noTeclearNumeros(evt);
        noteclearCaracteres(evt);
    }//GEN-LAST:event_jTextFieldNombreABuscarKeyTyped

    private void jTextFieldNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombresKeyTyped
        // TODO add your handling code here:
        noTeclearNumeros(evt);
        noteclearCaracteres(evt);
    }//GEN-LAST:event_jTextFieldNombresKeyTyped

    private void jTextFieldApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidosKeyTyped
        // TODO add your handling code here:
        noTeclearNumeros(evt);
        noteclearCaracteres(evt);
    }//GEN-LAST:event_jTextFieldApellidosKeyTyped

    private void jTextFieldNombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuarioKeyTyped
        // TODO add your handling code here:
        noteclearCaracteres(evt);
    }//GEN-LAST:event_jTextFieldNombreUsuarioKeyTyped

    private void jPasswordFieldActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldActualKeyTyped
        // TODO add your handling code here:
        noteclearCaracteres(evt);
    }//GEN-LAST:event_jPasswordFieldActualKeyTyped

    private void jPasswordFieldNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldNuevoKeyTyped
        // TODO add your handling code here:
        noteclearCaracteres(evt);
    }//GEN-LAST:event_jPasswordFieldNuevoKeyTyped
 @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/Escudo.png"));


        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarAdministrador;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelActual;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelNueva;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBuscarAdmin;
    private javax.swing.JPanel jPanelDatosAdmin;
    private javax.swing.JPasswordField jPasswordFieldActual;
    private javax.swing.JPasswordField jPasswordFieldNuevo;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombreABuscar;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables

     PreparedStatement pst;
    Connection cn;
    ResultSet result;
     public void noteclearCaracteres(KeyEvent evt) {
        int cadena = (int) evt.getKeyChar();
        if (cadena >= 33 && cadena <= 47
                || cadena >= 58 && cadena <= 64
                || cadena >= 91 && cadena <= 96
                || cadena >= 123 && cadena <= 127) {
            JOptionPane.showMessageDialog(null, "no ingrese caracteres especiales en los campos de texto");
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
        
    }

    /**
     * Metodo para cuando se dijite una letra en un campo de numeros
     *
     * @param evt
     */
    public void noTeclearLetras(KeyEvent evt) {
        if (Character.isLetter((char) evt.getKeyChar())) {
            JOptionPane.showMessageDialog(null, "INGRESE SOLO NÚMEROS");
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }

    /**
     * Metodo para cuando se dijite un numero en un campo de letras
     *
     * @param evt
     */
    public void noTeclearNumeros(KeyEvent evt) {
        if (Character.isDigit((char) evt.getKeyChar())) {
            JOptionPane.showMessageDialog(null, "INGRESE SOLO LETRAS");
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
        }
    }

}
