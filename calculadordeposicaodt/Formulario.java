/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadordeposicaodt;

import javax.swing.JOptionPane;

/**
 *
 * @author henrm
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }
    
    
    //*************************variaveis globais************************************
    
    Double preco_entr,       // preço de entrada é o valor digitado
           preco_simp;   // preço simplicado é o usado para os cálculos de posição
    int situacao;               // indicará qual cálculo realizar de acordo com o preço de entrada

    int ctr = 2; // quantidade de contratos

    //********************************************************************************
    
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RBComprado = new javax.swing.JRadioButton();
        RBVendido = new javax.swing.JRadioButton();
        jLabelSL1 = new javax.swing.JLabel();
        jLabelCV = new javax.swing.JLabel();
        jLabelEntr2 = new javax.swing.JLabel();
        jLabelSLFinal = new javax.swing.JLabel();
        jLabelSG1 = new javax.swing.JLabel();
        jLabelSGFinal = new javax.swing.JLabel();
        jLabelSGProt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelSG2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabelMedio = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonCtr1 = new javax.swing.JButton();
        jButtonCtr2 = new javax.swing.JButton();
        jButtonCtr4 = new javax.swing.JButton();
        jButtonCtr3 = new javax.swing.JButton();
        jLabelLossCheio = new javax.swing.JLabel();
        jLabelContratos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Posição");

        txtPreco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPreco.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Preço");

        buttonGroup1.add(RBComprado);
        RBComprado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RBComprado.setSelected(true);
        RBComprado.setText("Comprado");
        RBComprado.setName("jRComprado"); // NOI18N
        RBComprado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBCompradoActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBVendido);
        RBVendido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RBVendido.setText("Vendido");
        RBVendido.setName("jRVendido"); // NOI18N

        jLabelSL1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSL1.setText("Stop Loss 1");

        jLabelCV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCV.setText("Posição Comprada ou Vendida");

        jLabelEntr2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEntr2.setText("Entrada 2");

        jLabelSLFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSLFinal.setText("Stop Loss Final");

        jLabelSG1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSG1.setText("Stop Gain 1");

        jLabelSGFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSGFinal.setText("Stop Gain Final");

        jLabelSGProt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSGProt.setText("Stop Gain de Proteção");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelSG2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSG2.setText("Stop Gain 2");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Calculadora de Posição Day Trade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabelMedio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMedio.setText("Medio após 2a Entrada");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Risco (em valores)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nº de contrato mínimo");

        jButtonCtr1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCtr1.setText("1");
        jButtonCtr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCtr1ActionPerformed(evt);
            }
        });

        jButtonCtr2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCtr2.setText("2");
        jButtonCtr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCtr2ActionPerformed(evt);
            }
        });

        jButtonCtr4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCtr4.setText("4");
        jButtonCtr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCtr4ActionPerformed(evt);
            }
        });

        jButtonCtr3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCtr3.setText("3");
        jButtonCtr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCtr3ActionPerformed(evt);
            }
        });

        jLabelLossCheio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLossCheio.setText("Loss Cheio");

        jLabelContratos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContratos.setText(" 2 contratos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCV)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBComprado, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(RBVendido))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabelSGProt)
                    .addComponent(jLabelSGFinal)
                    .addComponent(jLabelSG1)
                    .addComponent(jLabelEntr2)
                    .addComponent(jLabelSLFinal)
                    .addComponent(jLabelSL1)
                    .addComponent(jLabelMedio)
                    .addComponent(jLabelSG2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCtr1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCtr2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCtr3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCtr4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabelContratos))
                        .addGap(0, 198, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLossCheio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBComprado)
                    .addComponent(RBVendido)
                    .addComponent(jButtonCtr1)
                    .addComponent(jButtonCtr2)
                    .addComponent(jButtonCtr3)
                    .addComponent(jButtonCtr4))
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabelContratos)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelLossCheio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(96, 96, 96)
                .addComponent(jLabelCV)
                .addGap(18, 18, 18)
                .addComponent(jLabelSG1)
                .addGap(11, 11, 11)
                .addComponent(jLabelSL1)
                .addGap(18, 18, 18)
                .addComponent(jLabelEntr2)
                .addGap(18, 18, 18)
                .addComponent(jLabelMedio)
                .addGap(18, 18, 18)
                .addComponent(jLabelSG2)
                .addGap(18, 18, 18)
                .addComponent(jLabelSLFinal)
                .addGap(18, 18, 18)
                .addComponent(jLabelSGFinal)
                .addGap(18, 18, 18)
                .addComponent(jLabelSGProt)
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBCompradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBCompradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBCompradoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String simp, aux;            //simp = 3 ultimos caracteres da string, aux: troca ',' por '.'
        
        //valores para saída nos preços
        Double sg1 = 0.0,
               sl1 = 0.0,
               entr2 = 0.0,
               medio = 0.0,
               sg2 = 0.0,
               slf = 0.0,
               sgf = 0.0,
               sgprot = 0.0;
        
                //verifica se o preço esta no formato correto (4 numeros , ou ponto, 1 numero decimal , ou sejam 6 caracteres, se não ,envia mensagem e termina a função)
        
        if(txtPreco.getText().length() != 6) {
            JOptionPane.showMessageDialog(null,"Formato de preço de entrada incorreto!");
            return;
        }
        //pega a vírgula e substitui por ponto (atualização futura - por hora apenas emite aviso para corrigir erro)
        if(txtPreco.getText().substring(4,5).equals(",")) {
            JOptionPane.showMessageDialog(null,"Utilize \".\" (ponto) ao invés de \",\" (vírgula)");
            return;
        }

        //converte preço de entrada em número
        preco_entr = Double.parseDouble(txtPreco.getText());
        
        // pega apenas final para saber qual cálculo realizar posteriormente
        simp = txtPreco.getText();
        simp = simp.substring(3,6);
                
        preco_simp = Double.parseDouble(simp);
                
        jLabelEntr2.setText(preco_simp.toString()); //DEBUG
        
        
        
        if(RBComprado.isSelected()) { // Se comprado está selecionado...
            if((preco_simp == 0.5)||(preco_simp == 3.0)||(preco_simp == 5.5)||(preco_simp == 8.0)) {// se o preço é permitido para entrada de COMPRA
                jLabelCV.setText("COMPRADO a "+ txtPreco.getText() );
                
                
                // CÁLCULOS E SAÍDAS FINAIS DAS LABELS PARA : <<< POSIÇÃO COMPRADO >>>                
                sg1 = preco_entr + 2;
                sl1 = preco_entr - 4;
                        
                entr2 = preco_entr - 2.5;
                slf   = preco_entr - 6;
                medio = (preco_entr+entr2)/2;
                sg2 = medio+1.75;
                sgf = medio + 5.25;
                sgprot = medio + 0.25;
            }
            else { // preço não é compatível para executar posição de compra
                JOptionPane.showMessageDialog(null,"Valor NÃO pode ser de entrada COMPRADO");
                return;
            }
                    
            
        } else { // Se vendido está selecionado
            if((preco_simp == 9.5)||(preco_simp == 7.0)||(preco_simp == 4.5)||(preco_simp == 2.0)) {// se o preço é permitido para entrada de VENDA
                jLabelCV.setText("VENDIDO a "+ txtPreco.getText());    
                
                // CÁLCULOS E SAÍDAS FINAIS DAS LABELS PARA : <<< POSIÇÃO COMPRADO >>>
                
                sg1 = preco_entr - 2;
                sl1 = preco_entr + 4;
                
                entr2  = preco_entr + 2.5;
                slf    = preco_entr + 6;
                medio  = (preco_entr+entr2)/2;
                sg2 = medio-1.75;
                sgf    = medio - 5.25;
                sgprot = medio - 0.25;
                
            }
            else { // preço não é compatível para executar posição de venda
                JOptionPane.showMessageDialog(null,"Valor NÃO pode ser de entrada VENDIDO");
                return;
            }            
        }
        
        // SAIDAS FINAIS DOS VALORES CALCULADOS
        
        jLabelSG1.setText("Primeiro Stop Gain: " + sg1.toString());
        jLabelSL1.setText("Primeiro Stop Loss: " + sl1.toString());
        jLabelEntr2.setText("Segunda Entrada: " + entr2.toString());
        jLabelMedio.setText("Preço Médio: " + medio.toString());
        jLabelSG2.setText("Segundo Stop Gain " + sg2.toString());
        jLabelSLFinal.setText("Stop Loss Final: " + slf.toString());
        jLabelSGFinal.setText("Stop Gain Final (valor inicial): " + sgf.toString());
        jLabelSGProt.setText("Stop Gain de Proteção (valor inicial): " + sgprot.toString());
        
        // RESULTADOS DO RISCO
        Double lc = 0.0,  // loss cheio
               vl = 0.0; // valor no loss 
        
        lc = medio - slf;
        if(lc < 0) lc*=-1; // corrige valor se resultado negativo; (C/V)
        
        vl = lc*ctr*2*10; // 10 é o valor por ponto do contrato , 2, indica posição dobrada
        
        
        jLabelLossCheio.setText("O prejuizo no Loss Cheio será de: R$ "+ vl.toString()+"0");
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCtr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCtr1ActionPerformed
        // TODO add your handling code here:
        ctr = 1;
        jLabelContratos.setText(Integer.toString(ctr) + " contrato");
    }//GEN-LAST:event_jButtonCtr1ActionPerformed

    private void jButtonCtr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCtr2ActionPerformed
        // TODO add your handling code here:
        ctr = 2;
        jLabelContratos.setText(Integer.toString(ctr) + " contratos");
    }//GEN-LAST:event_jButtonCtr2ActionPerformed

    private void jButtonCtr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCtr4ActionPerformed
        // TODO add your handling code here:
        ctr = 4;
        jLabelContratos.setText(Integer.toString(ctr) + " contratos");
    }//GEN-LAST:event_jButtonCtr4ActionPerformed

    private void jButtonCtr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCtr3ActionPerformed
        // TODO add your handling code here:
        ctr = 3;
        jLabelContratos.setText(Integer.toString(ctr) +  " contratos");
    }//GEN-LAST:event_jButtonCtr3ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBComprado;
    private javax.swing.JRadioButton RBVendido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCtr1;
    private javax.swing.JButton jButtonCtr2;
    private javax.swing.JButton jButtonCtr3;
    private javax.swing.JButton jButtonCtr4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCV;
    private javax.swing.JLabel jLabelContratos;
    private javax.swing.JLabel jLabelEntr2;
    private javax.swing.JLabel jLabelLossCheio;
    private javax.swing.JLabel jLabelMedio;
    private javax.swing.JLabel jLabelSG1;
    private javax.swing.JLabel jLabelSG2;
    private javax.swing.JLabel jLabelSGFinal;
    private javax.swing.JLabel jLabelSGProt;
    private javax.swing.JLabel jLabelSL1;
    private javax.swing.JLabel jLabelSLFinal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
