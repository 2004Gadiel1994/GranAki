
package Vista;

import Modelo.ConexionBase;
import java.awt.Color;

public class Login extends javax.swing.JFrame {
int xMouse, yMouse;
    public Login() {
        initComponents();
        ConexionBase objConexion = new ConexionBase(); 
        objConexion.getConexion();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblContrasenia = new javax.swing.JLabel();
        jpfContrasenia = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jpIniciar = new javax.swing.JPanel();
        lblIniciar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpBarra = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        lblUsuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GRAN AKI");
        jLabel1.setToolTipText(""); // NOI18N

        lblIniciarSesion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblIniciarSesion.setText("Iniciar Sesion");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblContrasenia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblContrasenia.setText("Contraseña:");

        jpfContrasenia.setForeground(new java.awt.Color(204, 204, 204));
        jpfContrasenia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpfContrasenia.setText("********");
        jpfContrasenia.setBorder(null);
        jpfContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpfContraseniaMousePressed(evt);
            }
        });
        jpfContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfContraseniaActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jpIniciar.setBackground(new java.awt.Color(255, 255, 0));

        lblIniciar.setBackground(new java.awt.Color(255, 255, 0));
        lblIniciar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblIniciar.setForeground(new java.awt.Color(233, 28, 43));
        lblIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciar.setText("Iniciar");
        lblIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpIniciarLayout = new javax.swing.GroupLayout(jpIniciar);
        jpIniciar.setLayout(jpIniciarLayout);
        jpIniciarLayout.setHorizontalGroup(
            jpIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpIniciarLayout.setVerticalGroup(
            jpIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIniciarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("Supermercado ");
        jLabel2.setToolTipText(""); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpfContrasenia)
                        .addComponent(txtUsuario)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblContrasenia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jpIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(187, 187, 187))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblIniciarSesion))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblIniciarSesion)
                .addGap(5, 5, 5)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jpIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 610));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Gran_AKI_logo.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 309, 242));

        jpBarra.setBackground(new java.awt.Color(255, 255, 0));
        jpBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarraMouseDragged(evt);
            }
        });
        jpBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarraMousePressed(evt);
            }
        });

        jpExit.setBackground(new java.awt.Color(255, 255, 255));

        lblExit.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(233, 28, 43));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpExitLayout = new javax.swing.GroupLayout(jpExit);
        jpExit.setLayout(jpExitLayout);
        jpExitLayout.setHorizontalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBarraLayout = new javax.swing.GroupLayout(jpBarra);
        jpBarra.setLayout(jpBarraLayout);
        jpBarraLayout.setHorizontalGroup(
            jpBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBarraLayout.createSequentialGroup()
                .addGap(0, 970, Short.MAX_VALUE)
                .addComponent(jpExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBarraLayout.setVerticalGroup(
            jpBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jpBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 1043, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraMousePressed
       xMouse=evt.getX();
       yMouse=evt.getY();
    }//GEN-LAST:event_jpBarraMousePressed

    private void jpBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,  y - yMouse);
    }//GEN-LAST:event_jpBarraMouseDragged

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        jpExit.setBackground(Color.red);
        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        jpExit.setBackground(Color.WHITE);
        lblExit.setForeground(Color.red);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseEntered
       jpIniciar.setBackground(new Color(212,212,212));
    }//GEN-LAST:event_lblIniciarMouseEntered

    private void lblIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseExited
       jpIniciar.setBackground(Color.white);
    }//GEN-LAST:event_lblIniciarMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese su nombre de Usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if(String.valueOf(jpfContrasenia.getPassword()).isEmpty()){
            jpfContrasenia.setText("********");
            jpfContrasenia.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void jpfContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfContraseniaMousePressed
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su nombre de Usuario");
            txtUsuario.setForeground(Color.gray);
        }
        
        if(String.valueOf(jpfContrasenia.getPassword()).equals("********")){
            jpfContrasenia.setText("");
            jpfContrasenia.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_jpfContraseniaMousePressed

    private void lblIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseClicked
        Controlador.LoginControlador objLogin = new Controlador.LoginControlador();
        //objLogin.validarUsuario(txtUsuario, jpfContrasenia);
        boolean exito = objLogin.validarUsuario(txtUsuario, jpfContrasenia);
        if (exito) {
            dispose();
        }
    }//GEN-LAST:event_lblIniciarMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jpfContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfContraseniaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpBarra;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpIniciar;
    private javax.swing.JPasswordField jpfContrasenia;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
