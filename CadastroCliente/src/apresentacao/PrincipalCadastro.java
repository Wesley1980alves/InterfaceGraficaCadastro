package apresentacao;

import dados.ControlaDados;
import static java.awt.font.TextAttribute.WIDTH;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;
import static javax.swing.SpringLayout.WIDTH;
import static javax.swing.text.html.CSS.Attribute.WIDTH;
import static javax.swing.text.html.HTML.Attribute.WIDTH;
import negocio.Cliente;

public class PrincipalCadastro extends javax.swing.JFrame {

    ControlaDados cd = new ControlaDados();
    //Cliente cl=new Cliente();

    public PrincipalCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        botaoconta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaocodico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botaosair = new javax.swing.JButton();
        botaodata = new javax.swing.JTextField();
        botaotodos = new javax.swing.JButton();
        botaonome = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        botaosalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BEM VINDO AO SISTEMA DE CADASTRO DO BANK WD COMPANY  AVIATION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 530, -1));

        botaoconta.setBackground(new java.awt.Color(255, 255, 255));
        botaoconta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocontaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nº Conta: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, -1));

        botaocodico.setEditable(false);
        botaocodico.setBackground(new java.awt.Color(255, 255, 255));
        botaocodico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaocodico.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(botaocodico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        botaosair.setBackground(new java.awt.Color(0, 0, 0));
        botaosair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaosair.setForeground(new java.awt.Color(255, 255, 255));
        botaosair.setText("sair");
        botaosair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosairActionPerformed(evt);
            }
        });
        getContentPane().add(botaosair, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        botaodata.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(botaodata, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 90, -1));

        botaotodos.setBackground(new java.awt.Color(0, 0, 0));
        botaotodos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaotodos.setForeground(new java.awt.Color(255, 255, 255));
        botaotodos.setText("Cadastrados");
        botaotodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaotodosActionPerformed(evt);
            }
        });
        getContentPane().add(botaotodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        botaonome.setBackground(new java.awt.Color(255, 255, 255));
        botaonome.setForeground(new java.awt.Color(0, 0, 0));
        botaonome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaonomeActionPerformed(evt);
            }
        });
        getContentPane().add(botaonome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 182, -1));

        nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.setText("Cliente:");
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 20));

        data.setBackground(new java.awt.Color(204, 255, 255));
        data.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        data.setForeground(new java.awt.Color(0, 0, 0));
        data.setText("Data Cadastro:");
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, -1));

        botaosalvar.setBackground(new java.awt.Color(0, 0, 0));
        botaosalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaosalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaosalvar.setText("salvar");
        botaosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaosalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/p51.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaosairActionPerformed

    private void botaosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosalvarActionPerformed
        Cliente cl=new Cliente();
        cl.setNome(botaonome.getText());
        cl.setData(botaodata.getText());
        cl.setConta(botaoconta.getText());
        

        if (cd.salvar(cl)) {
            JOptionPane.showMessageDialog(null, "registrado");
            botaonome.setText("");
            botaodata.setText("");
            botaoconta.setText("");
            botaonome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "inpossivel cadastrar");
        }


    }//GEN-LAST:event_botaosalvarActionPerformed

    private void botaotodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaotodosActionPerformed
        DlgMostrar dlg = new DlgMostrar(null, true, cd);
        dlg.setVisible(true);
    }//GEN-LAST:event_botaotodosActionPerformed

    private void botaonomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaonomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaonomeActionPerformed

    private void botaocontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocontaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaocontaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField botaocodico;
    private javax.swing.JTextField botaoconta;
    private javax.swing.JTextField botaodata;
    private javax.swing.JTextField botaonome;
    private javax.swing.JButton botaosair;
    private javax.swing.JButton botaosalvar;
    private javax.swing.JButton botaotodos;
    private javax.swing.JLabel data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nome;
    // End of variables declaration//GEN-END:variables
}
