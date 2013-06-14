/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlearning;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.border.Border;

/**
 *
 * @author Grupo 6
 */
public class Tablero extends JFrame implements ActionListener {

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
        jPanel1.setSize(350, 350);
        
    }
    
    public static String letra = null;
    public static Color fondo = Color.WHITE;
    public static Color colMalo = new Color(50, 200, 0);
    public static Color colBueno = new Color(100, 100, 100);
    public static Color colExc = new Color(150, 150, 150);
    public static Color colPozo = new Color(0, 0, 0);
    public JButton[] estados;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        comboTipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        radioEpsilon = new javax.swing.JRadioButton();
        radioSoft = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnAleat = new javax.swing.JButton();
        textTau = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textEpsilon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboSize = new javax.swing.JComboBox();
        btnAprende = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Q-learning");
        setMinimumSize(new java.awt.Dimension(730, 350));
        setPreferredSize(new java.awt.Dimension(850, 366));

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEtchedBorder()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Malo", "Bueno", "Excelente", "Pozo", "Inicial", "Final" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Estado");

        buttonGroup1.add(radioEpsilon);
        radioEpsilon.setText("e-greedy");
        radioEpsilon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEpsilonActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioSoft);
        radioSoft.setText("Softmax");
        radioSoft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSoftActionPerformed(evt);
            }
        });

        jLabel2.setText("Políticas");

        btnAleat.setText("Aleatorio");
        btnAleat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatActionPerformed(evt);
            }
        });

        textTau.setToolTipText("");
        textTau.setEnabled(false);

        jLabel3.setText("Tau");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("є");

        jLabel5.setText("Tipo de Mapa");

        jLabel6.setText("Tamaño");

        comboSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6x6", "7x7", "8x8", "9x9", "10x10" }));
        comboSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSizeActionPerformed(evt);
            }
        });

        btnAprende.setText("Aprender");
        btnAprende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprendeActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(comboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAleat)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioEpsilon)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioSoft)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTau, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(textEpsilon)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAprende)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAleat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioEpsilon)
                            .addComponent(jLabel4)
                            .addComponent(textEpsilon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioSoft)
                            .addComponent(textTau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAprende)
                            .addComponent(btnSalir))))
                .addGap(31, 31, 31))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void sizeDePantalla (){
        int size= 0;
        String aux = (String)comboSize.getSelectedItem();
        switch(aux){
            case "6x6":size= 6;
                break;
            case "7x7":size= 7;
                break;
            case "8x8":size= 8;
                break;
            case "9x9":size= 9;
                break;
            case "10x10":size=10;
                break;
        }    
        ConfTab.setSize(size);
    }
    
    public void tipoDePantalla(){
        String aux = (String) comboTipo.getSelectedItem();
        switch(aux){
            case "Malo":{
                letra = "M";
                fondo = colMalo;
            }
                break;
            case "Bueno":{
                letra = "B";
                fondo = colBueno;
            }
                break;
            case "Excelente":{
                letra = "E";
                fondo = colExc;
            }
                break;
            case "Pozo":{
                letra = "P";
                fondo = colPozo;
            }
                break;
            case "Inicial":{
                letra = "Inicial";
                fondo = Color.WHITE;
            }
                break;
            case "Final":{
                letra = "Final";
                fondo = Color.WHITE;
            }
                break;
        }
    }
    
    public void politicaElegida(){
         if(radioEpsilon.isSelected())
            ConfTab.setEpsilon(Float.parseFloat(textEpsilon.getText()));
        else
            ConfTab.setTau(Float.parseFloat(textTau.getText()));
    }
    
    //Pinta un tablero con el tamaño elegido y todos los estados neutro
    
    public void iniciar(){
        sizeDePantalla();
        int size = ConfTab.size;
        estados = new JButton[size*size];
        jPanel1.setVisible(false);
        jPanel1.removeAll();
        jPanel1.setLayout(new GridLayout(size, size));
        for (int i = 0; i < (size*size); i++) {
                            
            final JButton temp = new JButton();
            temp.setBackground(Color.white);
            temp.setSize(290/size, 290/size);
            temp.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    temp.setText(letra);
                    temp.setBackground(fondo);
                }
            });

            //agregar el boton al panel
            jPanel1.add(temp);
            //agregar el boton al arreglo
            estados[i] = temp;
//                estados[i][j] = temp;
        }
        jPanel1.setVisible(true);
    }
        
    public void aleatorio(){
        
        int size = ConfTab.getSize();
        for (int i = 0; i < size*size; i++) {
            float x = new Random().nextFloat();
            if (x < 0.2) {
                estados[i].setText("M");
                estados[i].setBackground(colMalo);
            } else {
                if (x < 0.5) {
                    estados[i].setText("B");
                    estados[i].setBackground(colBueno);
                } else {
                    if (x < 0.6) {
                        estados[i].setText("E");
                        estados[i].setBackground(colExc);
                    } else {
                        if (x < 0.7) {
                            estados[i].setText("P");
                            estados[i].setBackground(colPozo);
                        }
                        else {
                            estados[i].setText("");
                            estados[i].setBackground(Color.WHITE);
                        }
                    }
                }
            }
            jPanel1.add(estados[i]);
        }
        //Para colocar el estado final en una posicion aleatoria
        int y = new Random().nextInt(size*size);
        estados[y].setText("Final");
        estados[y].setBackground(Color.WHITE);
        jPanel1.remove(y);
        jPanel1.add(estados[y]);
        //jPanel1.setVisible(true);
    }    
    
    public void matrizR(){
        int size = ConfTab.getSize();
        for (int i = 0; i < (size*size); i++) {
            if (estados[i].getBackground() == colMalo){
                Matriz.estados[i].setRecompensa(ConfTab.getrMalo());
            } else {
                if (estados[i].getBackground() == colBueno){
                    Matriz.estados[i].setRecompensa(ConfTab.getrBueno());
                } else {
                    if (estados[i].getBackground() == colExc){
                        Matriz.estados[i].setRecompensa(ConfTab.getrExc());
                    } else {
                        if (estados[i].getBackground() == colPozo) {
                            Matriz.estados[i].setRecompensa(ConfTab.getrPozo());
                        } else {
                            if ("Final".equals(estados[i].getText())){
                                Matriz.estados[i].setRecompensa(ConfTab.getrFin());
                            } else
                                Matriz.estados[i].setRecompensa(ConfTab.getrNeutro());
                        }
                    }
                }
            }
        }
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void radioEpsilonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEpsilonActionPerformed
        textEpsilon.setEnabled(true);
        textEpsilon.requestFocusInWindow();
        textTau.setText(null);
        textTau.setEnabled(false);
    }//GEN-LAST:event_radioEpsilonActionPerformed

    private void radioSoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSoftActionPerformed
        textTau.setEnabled(true);
        textTau.requestFocusInWindow();
        textEpsilon.setText(null);
        textEpsilon.setEnabled(false);
    }//GEN-LAST:event_radioSoftActionPerformed

    private void btnAleatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatActionPerformed
        aleatorio();//Completar el paso de parametro con el tamaño de tablero
    }//GEN-LAST:event_btnAleatActionPerformed

    private void comboSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSizeActionPerformed
        iniciar();
    }//GEN-LAST:event_comboSizeActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        tipoDePantalla();    
    }//GEN-LAST:event_comboTipoActionPerformed

    private void btnAprendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprendeActionPerformed
        Matriz.inicializarEstados();
        matrizR();
    }//GEN-LAST:event_btnAprendeActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAleat;
    private javax.swing.JButton btnAprende;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox comboSize;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioEpsilon;
    private javax.swing.JRadioButton radioSoft;
    private javax.swing.JTextField textEpsilon;
    private javax.swing.JTextField textTau;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
