/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devdatabase;

/**
 *
 * @author Alex
 */
public class PrjForm extends javax.swing.JFrame {
    int projectBudget; int projectHours; 
    
    /**
     * Creates new form PrjForm
     */
    public PrjForm() {
        initComponents();
        for(int i = 0 ; i < Connection.returnrs("SELECT building_name FROM headquarters").size() ; i++)
        {   
            HQName.addItem((String) Connection.returnrs("SELECT building_name FROM headquarters").get(i));
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

        addB = new javax.swing.JButton();
        modifyB = new javax.swing.JButton();
        deleteB = new javax.swing.JButton();
        prj_id = new javax.swing.JTextField();
        prj_budget = new javax.swing.JTextField();
        prj_hours = new javax.swing.JTextField();
        HQName = new javax.swing.JComboBox<String>();
        goto_employee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addB.setText("Add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        modifyB.setText("Modify");
        modifyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBActionPerformed(evt);
            }
        });

        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        prj_id.setText("id");
        prj_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prj_idActionPerformed(evt);
            }
        });

        prj_budget.setText("budget");
        prj_budget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prj_budgetActionPerformed(evt);
            }
        });

        prj_hours.setText("hours");
        prj_hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prj_hoursActionPerformed(evt);
            }
        });

        HQName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select headquarters" }));
        HQName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HQNameActionPerformed(evt);
            }
        });

        goto_employee.setText("Employee");
        goto_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto_employeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HQName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addB)
                        .addGap(35, 35, 35)
                        .addComponent(modifyB)
                        .addGap(39, 39, 39)
                        .addComponent(deleteB))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(prj_hours, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(prj_id, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(prj_budget, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goto_employee)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(prj_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prj_budget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prj_hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HQName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addB)
                    .addComponent(modifyB)
                    .addComponent(deleteB))
                .addGap(36, 36, 36)
                .addComponent(goto_employee)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        if(!prj_id.getText().isEmpty() && !Connection.returnrs("SELECT p_id FROM project").contains(prj_id.getText())){
            Connection.insertrs("INSERT INTO project VALUES('"+ prj_id.getText() +"'," + projectBudget + ","+ projectHours + ");");
        }
    }//GEN-LAST:event_addBActionPerformed

    private void prj_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prj_idActionPerformed
        
    }//GEN-LAST:event_prj_idActionPerformed

    private void prj_budgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prj_budgetActionPerformed
        projectBudget = Integer.parseInt(prj_budget.getText());
    }//GEN-LAST:event_prj_budgetActionPerformed

    private void prj_hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prj_hoursActionPerformed
        projectHours = Integer.parseInt(prj_hours.getText());
    }//GEN-LAST:event_prj_hoursActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        if(!prj_id.getText().isEmpty() && !Connection.returnrs("SELECT p_id FROM project").contains(prj_id.getText())){
            Connection.insertrs("DELETE FROM project WHERE p_id = '"+ prj_id.getText()+"';"); 
    // also needs to remove the location
        }
    }//GEN-LAST:event_deleteBActionPerformed

    private void modifyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBActionPerformed
        if(!prj_id.getText().isEmpty() && !Connection.returnrs("SELECT p_id FROM project").contains(prj_id.getText())){
            //Connection.insertrs("update project set 
        }
    }//GEN-LAST:event_modifyBActionPerformed

    private void HQNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HQNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HQNameActionPerformed

    private void goto_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto_employeeActionPerformed
            this.setVisible(false);
            new DevDatabaseM().setVisible(true);
    }//GEN-LAST:event_goto_employeeActionPerformed

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
            java.util.logging.Logger.getLogger(PrjForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrjForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrjForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrjForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrjForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> HQName;
    private javax.swing.JButton addB;
    private javax.swing.JButton deleteB;
    private javax.swing.JButton goto_employee;
    private javax.swing.JButton modifyB;
    private javax.swing.JTextField prj_budget;
    private javax.swing.JTextField prj_hours;
    private javax.swing.JTextField prj_id;
    // End of variables declaration//GEN-END:variables
}
