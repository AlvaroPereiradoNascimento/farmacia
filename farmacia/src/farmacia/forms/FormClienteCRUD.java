/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmacia.forms;

/**
 *
 * @author Alvaro Pereira do Nascimento
 */
public class FormClienteCRUD extends javax.swing.JFrame {

    /**
     * Creates new form FormCliente
     */
    public FormClienteCRUD() {
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

        LabelID = new javax.swing.JLabel();
        TextFieldID = new javax.swing.JTextField();
        TextFieldNome = new javax.swing.JTextField();
        LabelNome = new javax.swing.JLabel();
        TextFieldTelefone = new javax.swing.JTextField();
        LabelTelefone = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        LabelDtNasc = new javax.swing.JLabel();
        TextFieldDtNasc = new javax.swing.JTextField();
        LabelTelefone3 = new javax.swing.JLabel();
        TextFieldRG = new javax.swing.JTextField();
        LabelTelefone4 = new javax.swing.JLabel();
        TextFieldCPF = new javax.swing.JTextField();
        ButtonCadastra = new javax.swing.JButton();
        ButtonAltera = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ButtonConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelID.setText("ID:");

        TextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIDActionPerformed(evt);
            }
        });

        TextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomeActionPerformed(evt);
            }
        });

        LabelNome.setText("Nome:");

        TextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTelefoneActionPerformed(evt);
            }
        });

        LabelTelefone.setText("Telefone:");

        LabelEmail.setText("E-mail:");

        TextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEmailActionPerformed(evt);
            }
        });

        LabelDtNasc.setText("Dt de Nasc.:");

        TextFieldDtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDtNascActionPerformed(evt);
            }
        });

        LabelTelefone3.setText("RG:");

        TextFieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRGActionPerformed(evt);
            }
        });

        LabelTelefone4.setText("CPF:");

        TextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCPFActionPerformed(evt);
            }
        });

        ButtonCadastra.setText("Cadastra");

        ButtonAltera.setText("Altera");

        jButton1.setText("Exclui");

        ButtonConsulta.setText("Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelEmail)
                            .addComponent(LabelTelefone3)
                            .addComponent(LabelID)
                            .addComponent(LabelTelefone4)
                            .addComponent(LabelNome)
                            .addComponent(LabelTelefone)
                            .addComponent(LabelDtNasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldEmail)
                            .addComponent(TextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonCadastra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonAltera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonConsulta)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelID)
                    .addComponent(TextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDtNasc)
                    .addComponent(TextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelefone3)
                    .addComponent(TextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelefone4)
                    .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastra)
                    .addComponent(ButtonAltera)
                    .addComponent(jButton1)
                    .addComponent(ButtonConsulta))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIDActionPerformed

    private void TextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNomeActionPerformed

    private void TextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTelefoneActionPerformed

    private void TextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEmailActionPerformed

    private void TextFieldDtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDtNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDtNascActionPerformed

    private void TextFieldRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRGActionPerformed

    private void TextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCPFActionPerformed

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
            java.util.logging.Logger.getLogger(FormClienteCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormClienteCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormClienteCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormClienteCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClienteCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAltera;
    private javax.swing.JButton ButtonCadastra;
    private javax.swing.JButton ButtonConsulta;
    private javax.swing.JLabel LabelDtNasc;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JLabel LabelTelefone3;
    private javax.swing.JLabel LabelTelefone4;
    private javax.swing.JTextField TextFieldCPF;
    private javax.swing.JTextField TextFieldDtNasc;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldID;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldRG;
    private javax.swing.JTextField TextFieldTelefone;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
