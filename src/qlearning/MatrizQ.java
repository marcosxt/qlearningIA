/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlearning;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneLayout;
import javax.swing.border.Border;

/**
 *
 * @author Grupo 6
 */
public class MatrizQ extends javax.swing.JFrame {

    /**
     * Creates new form MatrizQ
     */
    public MatrizQ() {
        initComponents();
        int v = ScrollPaneLayout.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneLayout.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(panCentro, v, h);
        panPrinc.setLayout(new BorderLayout());
        panPrinc.add(panNorte, BorderLayout.NORTH);
        panPrinc.add(jsp, BorderLayout.CENTER);
        panPrinc.add(panSur, BorderLayout.SOUTH);
        iniciar();
    }
    
    public void iniciar(){
//        float[] q = Matriz.obtenerMatrizQ();
        int size = ConfTab.size;
        Font fuente = new Font(Font.DIALOG, Font.BOLD, 12);
        panCentro.setVisible(false);
        panCentro.removeAll();
        panCentro.setLayout(new GridLayout(0, 9));
        DecimalFormat df = new DecimalFormat("#.##");
        Border borde = BorderFactory.createEtchedBorder(Color.lightGray, Color.WHITE);
        
        for (int i = 0; i < (size*size); i++) {
                            
            final JTextArea temp = new JTextArea();
            temp.setBorder(borde);
            temp.setFont(fuente);
            temp.setBackground(Color.BLUE);
            temp.setForeground(Color.WHITE);
            temp.setText("Estado: " +i);
            int cantAcc = Matriz.estados[i].acciones.size();
            panCentro.add(temp);
            for (int j = 0; j < 8; j++) {
                final JTextArea acc = new JTextArea();
                acc.setBorder(borde);
                acc.setFont(fuente);
                acc.setBackground(Color.BLUE);
                acc.setForeground(Color.WHITE);
                if (j < cantAcc)
                    acc.setText("Ir al estado "+Matriz.estados[i].getAcciones().get(j).getDestino()+"\nValor Q = "+df.format(Matriz.estados[i].getAcciones().get(j).getValorQ()));
                else 
                    acc.setText("---");
                panCentro.add(acc);
            }            
            //agregar el campo al panel
        }
        panCentro.setVisible(true);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrinc = new javax.swing.JPanel();
        panSur = new javax.swing.JPanel();
        btnContinuar = new javax.swing.JButton();
        panCentro = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        panNorte = new javax.swing.JPanel();

        setTitle("Matriz Q");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setType(java.awt.Window.Type.POPUP);

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSurLayout = new javax.swing.GroupLayout(panSur);
        panSur.setLayout(panSurLayout);
        panSurLayout.setHorizontalGroup(
            panSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSurLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addContainerGap())
        );
        panSurLayout.setVerticalGroup(
            panSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSurLayout.createSequentialGroup()
                .addComponent(btnContinuar)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jScrollBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panCentroLayout = new javax.swing.GroupLayout(panCentro);
        panCentro.setLayout(panCentroLayout);
        panCentroLayout.setHorizontalGroup(
            panCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCentroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panCentroLayout.setVerticalGroup(
            panCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panNorteLayout = new javax.swing.GroupLayout(panNorte);
        panNorte.setLayout(panNorteLayout);
        panNorteLayout.setHorizontalGroup(
            panNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        panNorteLayout.setVerticalGroup(
            panNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panPrincLayout = new javax.swing.GroupLayout(panPrinc);
        panPrinc.setLayout(panPrincLayout);
        panPrincLayout.setHorizontalGroup(
            panPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincLayout.createSequentialGroup()
                .addGroup(panPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(panSur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panPrincLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panPrincLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panNorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );
        panPrincLayout.setVerticalGroup(
            panPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincLayout.createSequentialGroup()
                .addComponent(panNorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(MatrizQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrizQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrizQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrizQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrizQ().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPanel panCentro;
    private javax.swing.JPanel panNorte;
    private javax.swing.JPanel panPrinc;
    private javax.swing.JPanel panSur;
    // End of variables declaration//GEN-END:variables
}
