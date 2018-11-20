/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accidentescr;

import java.awt.Color;

/**
 *
 * @author mcv26
 */
public class paginaInicio extends javax.swing.JFrame {

    /**
     * Creates new form paginaInicio
     */
    public paginaInicio() {
        initComponents();
        this.setTitle("Incidentes de Transito en Costa Rica");
        Color color = new Color(53,60,63);
        this.getContentPane().setBackground(color);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        barraInicio = new javax.swing.JMenuBar();
        consultasMenu = new javax.swing.JMenu();
        consultaMapa = new javax.swing.JMenuItem();
        consultaIndicador = new javax.swing.JMenuItem();
        consultaObserver = new javax.swing.JMenuItem();
        acercaMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\reese\\Documents\\NetBeansProjects\\accidentescr\\src\\Imagenes\\322zDJDe_400x400.jpg")); // NOI18N
        jLabel1.setLabelFor(this);
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        barraInicio.setBackground(new java.awt.Color(213, 214, 210));
        barraInicio.setForeground(new java.awt.Color(255, 141, 63));
        barraInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        consultasMenu.setBackground(new java.awt.Color(213, 214, 210));
        consultasMenu.setForeground(new java.awt.Color(255, 141, 63));
        consultasMenu.setText("Consultas ");
        consultasMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        consultaMapa.setBackground(new java.awt.Color(213, 214, 210));
        consultaMapa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultaMapa.setForeground(new java.awt.Color(255, 141, 63));
        consultaMapa.setText("Mapa de Incidentes");
        consultaMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMapaActionPerformed(evt);
            }
        });
        consultasMenu.add(consultaMapa);

        consultaIndicador.setBackground(new java.awt.Color(213, 214, 210));
        consultaIndicador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultaIndicador.setForeground(new java.awt.Color(255, 141, 63));
        consultaIndicador.setText("Estadisticas por Indicadores ");
        consultaIndicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaIndicadorActionPerformed(evt);
            }
        });
        consultasMenu.add(consultaIndicador);

        consultaObserver.setBackground(new java.awt.Color(213, 214, 210));
        consultaObserver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        consultaObserver.setForeground(new java.awt.Color(255, 141, 63));
        consultaObserver.setText("Estadisticas dinámicas ");
        consultaObserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaObserverActionPerformed(evt);
            }
        });
        consultasMenu.add(consultaObserver);

        barraInicio.add(consultasMenu);

        acercaMenu.setBackground(new java.awt.Color(213, 214, 210));
        acercaMenu.setForeground(new java.awt.Color(255, 141, 63));
        acercaMenu.setText("Acerca");
        acercaMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acercaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acercaMenuMouseClicked(evt);
            }
        });
        barraInicio.add(acercaMenu);

        setJMenuBar(barraInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMapaActionPerformed
        paginaMapa mapa;
        mapa = new paginaMapa(this);
        mapa.setVisible(true);
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_consultaMapaActionPerformed

    private void consultaIndicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaIndicadorActionPerformed
        paginaGrafico grafico;
        grafico = new paginaGrafico(this);
        grafico.setVisible(true);
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_consultaIndicadorActionPerformed

    private void acercaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaMenuMouseClicked
        paginaAcerca acerca;
        acerca = new paginaAcerca(this);
        acerca.setVisible(true);
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_acercaMenuMouseClicked

    private void consultaObserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaObserverActionPerformed
        // TODO add your handling code here:
        paginaEstadistica estadistica;
        estadistica = new paginaEstadistica(this);
        estadistica.setVisible(true);
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_consultaObserverActionPerformed

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
            java.util.logging.Logger.getLogger(paginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu acercaMenu;
    private javax.swing.JMenuBar barraInicio;
    private javax.swing.JMenuItem consultaIndicador;
    private javax.swing.JMenuItem consultaMapa;
    private javax.swing.JMenuItem consultaObserver;
    private javax.swing.JMenu consultasMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
