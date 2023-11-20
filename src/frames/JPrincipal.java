package frames;

import classes.Passagem;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class JPrincipal extends javax.swing.JFrame {
    
    public JPrincipal() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("ferry.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuCompras = new javax.swing.JMenu();
        menuItemNovoCliente = new javax.swing.JMenuItem();
        menuItemNovoVeiculo = new javax.swing.JMenuItem();
        menuItemPortes = new javax.swing.JMenuItem();
        menuItemPassagens = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuRelatorios = new javax.swing.JMenu();
        menuItemTotalGeral = new javax.swing.JMenuItem();
        menuItemTotalporPorte = new javax.swing.JMenuItem();
        menuItemTotalporVeiculo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Ferry Boat");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/0yKnCJHT_400x400.jpg"))); // NOI18N

        jMenu3.setText("|");
        jMenu3.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        menuPrincipal.add(jMenu3);

        menuCompras.setText("Compras/Consultas");
        menuCompras.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N

        menuItemNovoCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItemNovoCliente.setText("Novo Cliente");
        menuItemNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovoClienteActionPerformed(evt);
            }
        });
        menuItemNovoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuItemNovoClienteKeyPressed(evt);
            }
        });
        menuCompras.add(menuItemNovoCliente);

        menuItemNovoVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuItemNovoVeiculo.setText("Novo Veículo");
        menuItemNovoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovoVeiculoActionPerformed(evt);
            }
        });
        menuItemNovoVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuItemNovoVeiculoKeyPressed(evt);
            }
        });
        menuCompras.add(menuItemNovoVeiculo);

        menuItemPortes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuItemPortes.setText("Portes");
        menuItemPortes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPortesActionPerformed(evt);
            }
        });
        menuItemPortes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuItemPortesKeyPressed(evt);
            }
        });
        menuCompras.add(menuItemPortes);

        menuItemPassagens.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuItemPassagens.setText("Passagens");
        menuItemPassagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPassagensActionPerformed(evt);
            }
        });
        menuItemPassagens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuItemPassagensKeyPressed(evt);
            }
        });
        menuCompras.add(menuItemPassagens);

        menuPrincipal.add(menuCompras);

        jMenu4.setText("|");
        jMenu4.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        menuPrincipal.add(jMenu4);

        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N

        menuItemTotalGeral.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        menuItemTotalGeral.setText("Total Geral");
        menuItemTotalGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTotalGeralActionPerformed(evt);
            }
        });
        menuItemTotalGeral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuItemTotalGeralKeyPressed(evt);
            }
        });
        menuRelatorios.add(menuItemTotalGeral);

        menuItemTotalporPorte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menuItemTotalporPorte.setText("Total por Porte");
        menuItemTotalporPorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTotalporPorteActionPerformed(evt);
            }
        });
        menuItemTotalporPorte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuItemTotalporPorteKeyPressed(evt);
            }
        });
        menuRelatorios.add(menuItemTotalporPorte);

        menuItemTotalporVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        menuItemTotalporVeiculo.setText("Total por Veículo");
        menuItemTotalporVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTotalporVeiculoActionPerformed(evt);
            }
        });
        menuItemTotalporVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuItemTotalporVeiculoKeyPressed(evt);
            }
        });
        menuRelatorios.add(menuItemTotalporVeiculo);

        menuPrincipal.add(menuRelatorios);

        jMenu5.setText("|");
        jMenu5.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        menuPrincipal.add(jMenu5);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemTotalGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTotalGeralActionPerformed
        Passagem p = new Passagem();
        
        JOptionPane.showMessageDialog(null, "O total das vendas é de: R$ " + new DecimalFormat("00.00").format(p.valorGeral()));
    }//GEN-LAST:event_menuItemTotalGeralActionPerformed

    private void menuItemNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovoClienteActionPerformed
        JCliente jc = new JCliente();
        jc.setVisible(true);
    }//GEN-LAST:event_menuItemNovoClienteActionPerformed

    private void menuItemNovoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemNovoClienteKeyPressed
        JCliente jc = new JCliente();
        jc.setVisible(true);
    }//GEN-LAST:event_menuItemNovoClienteKeyPressed

    private void menuItemNovoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovoVeiculoActionPerformed
        JVeiculo jv = new JVeiculo();
        jv.setVisible(true);
    }//GEN-LAST:event_menuItemNovoVeiculoActionPerformed

    private void menuItemNovoVeiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemNovoVeiculoKeyPressed
        JVeiculo jv = new JVeiculo();
        jv.setVisible(true);
    }//GEN-LAST:event_menuItemNovoVeiculoKeyPressed

    private void menuItemPortesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPortesActionPerformed
        JPorte jp = new JPorte();
        jp.setVisible(true);
    }//GEN-LAST:event_menuItemPortesActionPerformed

    private void menuItemPortesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemPortesKeyPressed
        JPorte jp = new JPorte();
        jp.setVisible(true);
    }//GEN-LAST:event_menuItemPortesKeyPressed

    private void menuItemPassagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPassagensActionPerformed
        JPassagem jpa = new JPassagem();
        jpa.setVisible(true);
    }//GEN-LAST:event_menuItemPassagensActionPerformed

    private void menuItemPassagensKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemPassagensKeyPressed
        JPassagem jpa = new JPassagem();
        jpa.setVisible(true);
    }//GEN-LAST:event_menuItemPassagensKeyPressed

    private void menuItemTotalGeralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemTotalGeralKeyPressed
        Passagem p = new Passagem();
        
        JOptionPane.showMessageDialog(null, "O total das vendas é de: R$ " + new DecimalFormat("00.00").format(p.valorGeral()));
    }//GEN-LAST:event_menuItemTotalGeralKeyPressed

    private void menuItemTotalporPorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTotalporPorteActionPerformed
        Passagem p = new Passagem();
        
        String porte = "";
        porte = JOptionPane.showInputDialog("Insira o Porte desejado: ");
        JOptionPane.showMessageDialog(null, "O total deste porte foi de: R$ " + new DecimalFormat("00.00").format(p.valorpPorte(porte)));        
    }//GEN-LAST:event_menuItemTotalporPorteActionPerformed

    private void menuItemTotalporPorteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemTotalporPorteKeyPressed
        Passagem p = new Passagem();
        
        String porte = "";
        porte = JOptionPane.showInputDialog("Insira o Porte desejado: ");
        JOptionPane.showMessageDialog(null, "O total deste porte foi de: R$ " + new DecimalFormat("00.00").format(p.valorpPorte(porte))); 
    }//GEN-LAST:event_menuItemTotalporPorteKeyPressed

    private void menuItemTotalporVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTotalporVeiculoActionPerformed
        Passagem p = new Passagem();
        
        String placa = "";
        placa = JOptionPane.showInputDialog("Insira a placa do veículo: ");
        JOptionPane.showMessageDialog(null, "O total deste veículo foi de: R$ " + new DecimalFormat("00.00").format(p.valorpVeiculo(placa))); 
    }//GEN-LAST:event_menuItemTotalporVeiculoActionPerformed

    private void menuItemTotalporVeiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemTotalporVeiculoKeyPressed
        Passagem p = new Passagem();
        
        String placa = "";
        placa = JOptionPane.showInputDialog("Insira a placa do veículo: ");
        JOptionPane.showMessageDialog(null, "O total deste veículo foi de: R$ " + new DecimalFormat("00.00").format(p.valorpVeiculo(placa))); 
    }//GEN-LAST:event_menuItemTotalporVeiculoKeyPressed


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
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu menuCompras;
    private javax.swing.JMenuItem menuItemNovoCliente;
    private javax.swing.JMenuItem menuItemNovoVeiculo;
    private javax.swing.JMenuItem menuItemPassagens;
    private javax.swing.JMenuItem menuItemPortes;
    private javax.swing.JMenuItem menuItemTotalGeral;
    private javax.swing.JMenuItem menuItemTotalporPorte;
    private javax.swing.JMenuItem menuItemTotalporVeiculo;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu menuRelatorios;
    // End of variables declaration//GEN-END:variables
}
