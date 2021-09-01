/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao;

//import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.UIManager;

/**
 *
 * @author jdhein
 */
public class Terminal extends javax.swing.JFrame {

    Conta conta1;
    Conta conta2;
    /**
     * Creates new form Terminal
     */
    public Terminal() {
        initComponents();
        
        conta1 = new Conta(1, 123, "Jonas", -500, 2000);
        conta2 = new Conta(1, 333, "Juca", 1100, 2000);
        
        imprimeConta();
    }

    public void imprimeConta(){
        try{
            lblNomeConta1.setText(conta1.getNomePessoa());
            if(conta1.getSaldo() >= 0){
                lblSaldoConta1.setForeground(new java.awt.Color(67, 160, 71));
            }else{
                lblSaldoConta1.setForeground(new java.awt.Color(244, 81, 30));
            }
            lblSaldoConta1.setText(Tools.formataValor(conta1.getSaldo(), true));
            
            lblNomeConta2.setText(conta2.getNomePessoa());
            if(conta2.getSaldo() >= 0){
                lblSaldoConta2.setForeground(new java.awt.Color(67, 160, 71));
            }else{
                lblSaldoConta2.setForeground(new java.awt.Color(244, 81, 30));
            }
            lblSaldoConta2.setText(Tools.formataValor(conta2.getSaldo(), true));
        
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnConta1 = new javax.swing.JPanel();
        btnDepositarConta1 = new javax.swing.JButton();
        lblNomeConta1 = new javax.swing.JLabel();
        btnSacarConta1 = new javax.swing.JButton();
        txtValorConta1 = new javax.swing.JTextField();
        lblSaldoConta1 = new javax.swing.JLabel();
        lblConta2 = new javax.swing.JLabel();
        lblSaldo1 = new javax.swing.JLabel();
        btnTransferirConta1 = new javax.swing.JButton();
        jpnConta2 = new javax.swing.JPanel();
        btnDepositarConta2 = new javax.swing.JButton();
        lblNomeConta2 = new javax.swing.JLabel();
        btnSacarConta2 = new javax.swing.JButton();
        txtValorConta2 = new javax.swing.JTextField();
        lblSaldoConta2 = new javax.swing.JLabel();
        lblConta4 = new javax.swing.JLabel();
        lblSaldo3 = new javax.swing.JLabel();
        btnTransferirConta2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnConta1.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        btnDepositarConta1.setText("DEPOSITAR");
        btnDepositarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta1ActionPerformed(evt);
            }
        });

        lblNomeConta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNomeConta1.setText("nome");

        btnSacarConta1.setText("SACAR");
        btnSacarConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta1ActionPerformed(evt);
            }
        });

        lblSaldoConta1.setForeground(new java.awt.Color(0, 0, 204));
        lblSaldoConta1.setText("R$ xx");

        lblConta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConta2.setText("Conta:");

        lblSaldo1.setText("Saldo:");

        btnTransferirConta1.setText("TRANSFERIR");
        btnTransferirConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirConta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnConta1Layout = new javax.swing.GroupLayout(jpnConta1);
        jpnConta1.setLayout(jpnConta1Layout);
        jpnConta1Layout.setHorizontalGroup(
            jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDepositarConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtValorConta1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSacarConta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnConta1Layout.createSequentialGroup()
                        .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblConta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldoConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTransferirConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jpnConta1Layout.setVerticalGroup(
            jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConta1Layout.createSequentialGroup()
                .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConta2)
                    .addComponent(lblNomeConta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnConta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo1)
                    .addComponent(lblSaldoConta1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValorConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSacarConta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDepositarConta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransferirConta1)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        getContentPane().add(jpnConta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 230));

        jpnConta2.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        btnDepositarConta2.setText("DEPOSITAR");
        btnDepositarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarConta2ActionPerformed(evt);
            }
        });

        lblNomeConta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNomeConta2.setText("nome");

        btnSacarConta2.setText("SACAR");
        btnSacarConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarConta2ActionPerformed(evt);
            }
        });

        lblSaldoConta2.setForeground(new java.awt.Color(0, 51, 255));
        lblSaldoConta2.setText("R$ xx");

        lblConta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConta4.setText("Conta:");

        lblSaldo3.setText("Saldo:");

        btnTransferirConta2.setText("TRANSFERIR");
        btnTransferirConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirConta2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnConta2Layout = new javax.swing.GroupLayout(jpnConta2);
        jpnConta2.setLayout(jpnConta2Layout);
        jpnConta2Layout.setHorizontalGroup(
            jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConta2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDepositarConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtValorConta2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSacarConta2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnConta2Layout.createSequentialGroup()
                        .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblConta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSaldo3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldoConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnTransferirConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnConta2Layout.setVerticalGroup(
            jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConta2Layout.createSequentialGroup()
                .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConta4)
                    .addComponent(lblNomeConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnConta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo3)
                    .addComponent(lblSaldoConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValorConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSacarConta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDepositarConta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransferirConta2)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        getContentPane().add(jpnConta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 11, -1, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta1ActionPerformed
        try{
            double valor = Double.parseDouble(txtValorConta1.getText());
            boolean operacao = conta1.sacar(valor);
            if(operacao == true){
                //saque deu certo
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saque Realizado", 'i');
            }else{
                //saque não realizado
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saque Não Realizado", 'e');
            }

            imprimeConta();
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSacarConta1ActionPerformed

    private void btnDepositarConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta1ActionPerformed
        try{
            double valor = Double.parseDouble(txtValorConta1.getText());
            conta1.deposito(valor);

            imprimeConta();
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnDepositarConta1ActionPerformed

    private void btnDepositarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarConta2ActionPerformed
        try{
            double valor = Double.parseDouble(txtValorConta2.getText());
            conta2.deposito(valor);

            imprimeConta();
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnDepositarConta2ActionPerformed

    private void btnSacarConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarConta2ActionPerformed
        try{
            double valor = Double.parseDouble(txtValorConta2.getText());
            if(conta2.sacar(valor)){
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saque Realizado", 'i');
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Saque Não Realizado", 'e');
            }

            imprimeConta();
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSacarConta2ActionPerformed

    private void btnTransferirConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirConta1ActionPerformed
        try{
            
            double valor = Double.parseDouble(txtValorConta1.getText());
            boolean saque = conta1.sacar(valor);
            if(saque == true){
                conta2.deposito(valor);
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Sem saldo suficiente");
            }
            
        }catch(Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao tentar transferir");
        }
    }//GEN-LAST:event_btnTransferirConta1ActionPerformed

    private void btnTransferirConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirConta2ActionPerformed
        try{
            
            double valor = Double.parseDouble(txtValorConta1.getText());
            boolean saque = conta2.sacar(valor);
            conta1.deposito(valor);
            if(saque == true){
                conta1.deposito(valor);
            }else{
                CaixaDeDialogo.obterinstancia().exibirMensagem("Sem saldo suficiente");
            }
            
        }catch(Exception ex){
            CaixaDeDialogo.obterinstancia().exibirMensagem("Erro ao tentar transferir");
        }
    }//GEN-LAST:event_btnTransferirConta2ActionPerformed

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
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            //UIManager.setLookAndFeel( new FlatDarculaLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terminal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositarConta1;
    private javax.swing.JButton btnDepositarConta2;
    private javax.swing.JButton btnSacarConta1;
    private javax.swing.JButton btnSacarConta2;
    private javax.swing.JButton btnTransferirConta1;
    private javax.swing.JButton btnTransferirConta2;
    private javax.swing.JPanel jpnConta1;
    private javax.swing.JPanel jpnConta2;
    private javax.swing.JLabel lblConta2;
    private javax.swing.JLabel lblConta4;
    private javax.swing.JLabel lblNomeConta1;
    private javax.swing.JLabel lblNomeConta2;
    private javax.swing.JLabel lblSaldo1;
    private javax.swing.JLabel lblSaldo3;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JTextField txtValorConta1;
    private javax.swing.JTextField txtValorConta2;
    // End of variables declaration//GEN-END:variables
}
