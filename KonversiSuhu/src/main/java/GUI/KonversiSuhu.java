/*
 * Nama : Della Novia Ramadhan
 * NIM : 11200930000018
 * Kelas : 2A Sistem Informasi
 */
package GUI;
/**
 *
 * Kamis, 8 April 2021
 */
public class KonversiSuhu extends javax.swing.JFrame {
    double celcius;
    double fahrenheit;
    double kelvin;
    double reamur;
    
    public KonversiSuhu() {
        initComponents();
    }
    
    private void Celcius(){
        celcius = Double.parseDouble(txtSuhu.getText());
        fahrenheit = celcius * 1.8 + 32;
        kelvin = celcius +273.15;
        reamur = celcius * 0.8;
        lbCelcius.setText(celcius+" Celcius");
        lbFahrenheit.setText(fahrenheit + " Fahrenheit");
        lbKelvin.setText(kelvin+" Kelvin");
        lbReamur.setText(reamur+" Reamur");
    }
    
    private void Fahrenheit(){
        fahrenheit = Double.parseDouble(txtSuhu.getText());
        
        celcius = (fahrenheit - 32)/ 1.8;
        reamur = (fahrenheit - 32) / 2.25;
        kelvin = (fahrenheit + 459.67) / 1.8;
        lbCelcius.setText(celcius+" celcius");
        lbFahrenheit.setText(fahrenheit + " Fahrenheit");
        lbKelvin.setText(kelvin+" Kelvin");
        lbReamur.setText(reamur+" Reamur");
    }
    
    private void Kelvin(){
        kelvin = Double.parseDouble(txtSuhu.getText());
        fahrenheit = kelvin * 1.8 - 459.67;
        celcius = kelvin - 273.15;
        reamur = (kelvin - 273.15) * 0.8;
        lbCelcius.setText(celcius+" celcius");
        lbFahrenheit.setText(fahrenheit + " Fahrenheit");
        lbKelvin.setText(kelvin+" Kelvin");
        lbReamur.setText(reamur+" Reamur");
    }
    
    private void Reamur(){
        reamur = Double.parseDouble(txtSuhu.getText());
        fahrenheit = (reamur *2.25)+32;
        kelvin = (reamur / 0.8) + 273.15;
        celcius = reamur / 0.8;
        lbCelcius.setText(celcius+ " Celcius");
        lbFahrenheit.setText(fahrenheit + " Fahrenheit");
        lbKelvin.setText(kelvin+" Kelvin");
        lbReamur.setText(reamur+" Reamur");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        btnConvert = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbCelcius = new javax.swing.JLabel();
        lbFahrenheit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbKelvin = new javax.swing.JLabel();
        lbReamur = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Lithos Pro Regular", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Temperature Converter");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Input Temperature :");

        txtSuhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuhuActionPerformed(evt);
            }
        });

        rbCelcius.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        rbCelcius.setText("Celcius");

        rbFahrenheit.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        rbFahrenheit.setText("Fahrenheit");
        rbFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFahrenheitActionPerformed(evt);
            }
        });

        rbKelvin.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        rbKelvin.setText("Kelvin");
        rbKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKelvinActionPerformed(evt);
            }
        });

        rbReamur.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        rbReamur.setText("Reamur");
        rbReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReamurActionPerformed(evt);
            }
        });

        btnConvert.setBackground(new java.awt.Color(255, 102, 102));
        btnConvert.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 0, 102));
        btnReset.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lbCelcius.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lbCelcius.setText("Celcius");

        lbFahrenheit.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lbFahrenheit.setText("Fahrenheit");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("RESULT");

        lbKelvin.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lbKelvin.setText("Kelvin");

        lbReamur.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        lbReamur.setText("Reamur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFahrenheit)
                            .addComponent(lbCelcius)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbKelvin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbReamur)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCelcius)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFahrenheit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbKelvin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbReamur)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel4.setText("by Della Novia Ramadhan | 2021");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConvert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSuhu))
                        .addContainerGap(266, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbCelcius)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFahrenheit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbKelvin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbReamur)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCelcius)
                    .addComponent(rbFahrenheit)
                    .addComponent(rbKelvin)
                    .addComponent(rbReamur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert)
                    .addComponent(btnReset))
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuhuActionPerformed

    private void rbFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFahrenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFahrenheitActionPerformed

    private void rbKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbKelvinActionPerformed

    private void rbReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbReamurActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        if(rbCelcius.isSelected()) {
            Celcius();
        }else if(rbFahrenheit.isSelected()){
            Fahrenheit();
        }else if(rbKelvin.isSelected()){
            Kelvin();
        }else if(rbReamur.isSelected()){
            Reamur();
        }        
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSuhu.setText("");
        lbCelcius.setText("Celcius");
        lbFahrenheit.setText("Fahrenheit");
        lbKelvin.setText("Kelvin");
        lbReamur.setText("Reamur");
        rbCelcius.setSelected(false);
        rbFahrenheit.setSelected(false);
        rbKelvin.setSelected(false);
        rbReamur.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCelcius;
    private javax.swing.JLabel lbFahrenheit;
    private javax.swing.JLabel lbKelvin;
    private javax.swing.JLabel lbReamur;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
