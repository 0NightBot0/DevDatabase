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
public class DevDatabaseM extends javax.swing.JFrame {
    Integer e_bsn; String e_name; String e_surname; String building_name; // employee
    String street; String postal_code; String country; String house_nr; String city; // address
    String course; String school; String level; Integer degreeID; // degree
    String p_name; String p_description; Integer hourse_fee; // position
    Integer pr_id; Integer pr_budget; Integer pr_total_hours; // project
    
    /**
     * Creates new form DevDatabaseM
     */
    public DevDatabaseM() {
        initComponents();
        for(int i = 0 ; i < Connection.returnrs("SELECT building_name FROM headquarters").size() ; i++)
        {
            building_box.addItem(Connection.returnrs("SELECT building_name FROM headquarters").get(i));
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

        AddB = new javax.swing.JButton();
        DeleteB = new javax.swing.JButton();
        ModifyB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bsn_tf = new javax.swing.JTextField();
        e_name_tf = new javax.swing.JTextField();
        e_surname_tf = new javax.swing.JTextField();
        street_tf = new javax.swing.JTextField();
        postal_code_tf = new javax.swing.JTextField();
        country_tf = new javax.swing.JTextField();
        house_nr_tf = new javax.swing.JTextField();
        city_tf = new javax.swing.JTextField();
        course_tf = new javax.swing.JTextField();
        school_tf = new javax.swing.JTextField();
        level_tf = new javax.swing.JTextField();
        goto_employee = new javax.swing.JButton();
        goto_project = new javax.swing.JButton();
        OverView = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        building_box = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        work_position = new javax.swing.JTextField();
        work_hours = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddB.setText("Add");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });

        DeleteB.setText("Delete");
        DeleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBActionPerformed(evt);
            }
        });

        ModifyB.setText("Modify");
        ModifyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyBActionPerformed(evt);
            }
        });

        jLabel1.setText("Bsn:");

        jLabel2.setText("Name:");

        jLabel3.setText("Surname:");

        jLabel4.setText("Work location:");

        jLabel5.setText("Adress employee");

        jLabel6.setText("Street:");

        jLabel7.setText("Employee info");

        jLabel8.setText("nr:");

        jLabel9.setText("Postal code:");

        jLabel10.setText("City:");

        jLabel11.setText("Country:");

        jLabel12.setText("Employee degree");

        jLabel13.setText("Course:");

        jLabel14.setText("School:");

        jLabel15.setText("Level:");

        bsn_tf.setText("bsn number");
        bsn_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsn_tfActionPerformed(evt);
            }
        });

        e_name_tf.setText("first name");
        e_name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_name_tfActionPerformed(evt);
            }
        });

        e_surname_tf.setText("last name");
        e_surname_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_surname_tfActionPerformed(evt);
            }
        });

        street_tf.setText("street name");
        street_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street_tfActionPerformed(evt);
            }
        });

        postal_code_tf.setText("1111AA");
        postal_code_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postal_code_tfActionPerformed(evt);
            }
        });

        country_tf.setText("Netherlands");
        country_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country_tfActionPerformed(evt);
            }
        });

        house_nr_tf.setText("1a");
        house_nr_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                house_nr_tfActionPerformed(evt);
            }
        });

        city_tf.setText("New York");
        city_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_tfActionPerformed(evt);
            }
        });

        course_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_tfActionPerformed(evt);
            }
        });

        school_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                school_tfActionPerformed(evt);
            }
        });

        level_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level_tfActionPerformed(evt);
            }
        });

        goto_employee.setText("Employee");

        goto_project.setText("Project");

        OverView.setText("View Tabels");
        OverView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverViewActionPerformed(evt);
            }
        });

        jLabel18.setText("Go to:");

        jLabel16.setText("assign employee to project");

        jLabel17.setText("check what projects cannot pay there rent (rent higher than 10% budget)");

        building_box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select location" }));
        building_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                building_boxActionPerformed(evt);
            }
        });

        jLabel19.setText("Work position:");

        work_position.setText("position");
        work_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                work_positionActionPerformed(evt);
            }
        });

        work_hours.setText("hours");
        work_hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                work_hoursActionPerformed(evt);
            }
        });

        jLabel20.setText("Work hours:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(e_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bsn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(e_surname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel9))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(city_tf)
                                                    .addComponent(country_tf)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(postal_code_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(house_nr_tf))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(street_tf))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(175, 175, 175)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(204, 204, 204))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(building_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel12)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel20)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(663, 663, 663)
                                        .addComponent(course_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(school_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(level_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(335, 335, 335)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel13)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ModifyB)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(goto_project))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(AddB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OverView)))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(goto_employee))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(work_hours, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(work_position, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(course_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(school_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(bsn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(e_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(e_surname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(building_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(street_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(postal_code_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(house_nr_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(city_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel20))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(work_position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(work_hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel14)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DeleteB)
                                    .addComponent(ModifyB))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goto_employee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OverView)
                            .addComponent(AddB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goto_project)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBActionPerformed
         if(!bsn_tf.getText().isEmpty() && Connection.returnrs("SELECT e_bsn FROM employee").contains(bsn_tf.getText()))
             {Connection.insertrs("DELETE FROM employee WHERE e_bsn = '"+this.bsn_tf.getText()+"';");}
       
    }//GEN-LAST:event_DeleteBActionPerformed

    private void ModifyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyBActionPerformed
        if(!bsn_tf.getText().isEmpty() && Connection.returnrs("SELECT e_bsn FROM employee").contains(bsn_tf.getText()))
             {Connection.insertrs("update employee set e_name = '"+this.e_name_tf.getText()+"', e_surname = '"+this.e_surname_tf.getText()+"' , building_name = '"+this.building_box.getSelectedItem()+"' where e_bsn = "+bsn_tf.getText()+";");}
        
// 
    }//GEN-LAST:event_ModifyBActionPerformed

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
       if(!bsn_tf.getText().isEmpty() && !Connection.returnrs("SELECT e_bsn FROM employee").contains(bsn_tf.getText()))
            {Connection.insertrs("INSERT INTO employee " + "VALUES ("+bsn_tf.getText()+", '"+this.e_name_tf.getText()+"', '"+this.e_surname_tf.getText()+"', '"+this.building_box.getSelectedItem()+"');"
                     +"INSERT INTO address VALUES ('"+country_tf.getText()+"','"+postal_code_tf.getText()+"','"+house_nr_tf.getText()+"','"+street_tf.getText()+"','"+city_tf.getText()+"');" 
                     +"INSERT INTO degree VALUES ('"+course_tf.getText()+"','"+school_tf.getText()+"','"+level_tf.getText()+"');"
                     +"INSERT INTO address_employee VALUES('"+bsn_tf.getText()+"','"+country_tf.getText()+"','"+postal_code_tf.getText()+"','"+house_nr_tf.getText()+"');"
                     +"INSERT INTO degree_employee VALUES('" + bsn_tf.getText()+ "','" + course_tf.getText()+"','"+school_tf.getText()+"','"+level_tf.getText()+"');");
            }
        //Connection.returnrs("Select e_bsn from employee;");
// hier moet een add to database query komen waar alle variable van employee
        // adress en degree worden toegevoegd aan database
        
    }//GEN-LAST:event_AddBActionPerformed

    private void bsn_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsn_tfActionPerformed
        
    }//GEN-LAST:event_bsn_tfActionPerformed

    private void house_nr_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_house_nr_tfActionPerformed
        
    }//GEN-LAST:event_house_nr_tfActionPerformed

    private void OverViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OverViewActionPerformed

    private void e_name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_name_tfActionPerformed

    }//GEN-LAST:event_e_name_tfActionPerformed

    private void e_surname_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_surname_tfActionPerformed
        
    }//GEN-LAST:event_e_surname_tfActionPerformed

    private void street_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street_tfActionPerformed
        
    }//GEN-LAST:event_street_tfActionPerformed

    private void postal_code_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postal_code_tfActionPerformed
        
    }//GEN-LAST:event_postal_code_tfActionPerformed

    private void county_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_county_tfActionPerformed
        
    }//GEN-LAST:event_county_tfActionPerformed

    private void city_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_tfActionPerformed
        
    }//GEN-LAST:event_city_tfActionPerformed

    private void course_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_tfActionPerformed
        
    }//GEN-LAST:event_course_tfActionPerformed

    private void school_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_school_tfActionPerformed
        
    }//GEN-LAST:event_school_tfActionPerformed

    private void level_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level_tfActionPerformed
        
    }//GEN-LAST:event_level_tfActionPerformed

    private void building_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_building_boxActionPerformed
        
    }//GEN-LAST:event_building_boxActionPerformed
    private void work_positionActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }        
    private void work_hoursActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }
    private void country_tfActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }    
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
            java.util.logging.Logger.getLogger(DevDatabaseM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevDatabaseM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevDatabaseM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevDatabaseM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevDatabaseM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JButton DeleteB;
    private javax.swing.JButton ModifyB;
    private javax.swing.JButton OverView;
    private javax.swing.JTextField bsn_tf;
    private javax.swing.JComboBox building_box;
    private javax.swing.JTextField city_tf;
    private javax.swing.JTextField country_tf;
    private javax.swing.JTextField course_tf;
    private javax.swing.JTextField e_name_tf;
    private javax.swing.JTextField e_surname_tf;
    private javax.swing.JButton goto_employee;
    private javax.swing.JButton goto_project;
    private javax.swing.JTextField house_nr_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField level_tf;
    private javax.swing.JTextField postal_code_tf;
    private javax.swing.JTextField school_tf;
    private javax.swing.JTextField street_tf;
    private javax.swing.JTextField work_hours;
    private javax.swing.JTextField work_position;
    // End of variables declaration//GEN-END:variables
}
