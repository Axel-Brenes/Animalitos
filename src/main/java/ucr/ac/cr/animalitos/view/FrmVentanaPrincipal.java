package ucr.ac.cr.animalitos.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Rachel
 */
public class FrmVentanaPrincipal extends javax.swing.JFrame {

    int xMouse, yMouse;

    public FrmVentanaPrincipal() {
        this.setUndecorated(true); // Retira los bordes de la ventana.

        initComponents();
        ShowJPanel(new PanelDataPaginaPrincipal());
    }
    /* Método que permite mover la ventana gráfica junto con el mouse, 
    al mantener presionada la ventana se puede mover a cualquir lado de la
    pantalla.
        Utiliza el Mouse.Event.
    
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlBackground = new javax.swing.JPanel();
        PnlToolBar = new javax.swing.JPanel();
        LblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PnlBackgroundLayout = new javax.swing.GroupLayout(PnlBackground);
        PnlBackground.setLayout(PnlBackgroundLayout);
        PnlBackgroundLayout.setHorizontalGroup(
            PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        PnlBackgroundLayout.setVerticalGroup(
            PnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        PnlToolBar.setBackground(new java.awt.Color(243, 241, 237));
        PnlToolBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PnlToolBarMouseDragged(evt);
            }
        });
        PnlToolBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PnlToolBarMousePressed(evt);
            }
        });

        LblExit.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        LblExit.setForeground(new java.awt.Color(255, 0, 51));
        LblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblExit.setText("X");
        LblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PnlToolBarLayout = new javax.swing.GroupLayout(PnlToolBar);
        PnlToolBar.setLayout(PnlToolBarLayout);
        PnlToolBarLayout.setHorizontalGroup(
            PnlToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlToolBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlToolBarLayout.setVerticalGroup(
            PnlToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PnlToolBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PnlToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void PnlToolBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlToolBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_PnlToolBarMouseDragged

    private void PnlToolBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlToolBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_PnlToolBarMousePressed
    
    /* Método que permite salir por completo de la ventana grafica. 
        Además cambia de color cuando el maouse lo toca.
    
    */
    private void LblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblExitMouseEntered
        LblExit.setForeground(Color.white);
    }//GEN-LAST:event_LblExitMouseEntered

    private void LblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblExitMouseExited
        LblExit.setForeground(Color.red);
    }//GEN-LAST:event_LblExitMouseExited

    private void LblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LblExitMouseClicked

    /**
     * Muestra un JPanel en el contenedor principal, ajustando su tamaño y
     * ubicación.
     * El método ajusta el tamaño del JPanel a 730, 490, lo coloca en la
     * posición (0, 0), y lo agrega al contenedor `jPnlBackground`. Luego,
     * actualiza y repinta el contenedor.
     */
    public static void ShowJPanel(JPanel panel) {
        panel.setSize(730, 490);
        panel.setLocation(0, 0);

        //Pintar el JPanel
        PnlBackground.removeAll();
        PnlBackground.add(panel, BorderLayout.CENTER);
        PnlBackground.revalidate();
        PnlBackground.repaint();

    }

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
            java.util.logging.Logger.getLogger(FrmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblExit;
    private static javax.swing.JPanel PnlBackground;
    private javax.swing.JPanel PnlToolBar;
    // End of variables declaration//GEN-END:variables
}
