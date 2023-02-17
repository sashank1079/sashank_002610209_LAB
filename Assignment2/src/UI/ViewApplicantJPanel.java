/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Applicant;
import Model.ApplicantDirectory;
import Model.Business;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sashank Machiraju
 */
public class ViewApplicantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewApplicantJPanel
     */
    public ViewApplicantJPanel() {
        initComponents();
    }
    private Business business;
    ApplicantDirectory applicants;
    DefaultTableModel viewAppTableModel;
    
    public ViewApplicantJPanel(Business business) {
        initComponents();
        
        this.business = new Business();
         this.viewAppTableModel = (DefaultTableModel)viewAppTable.getModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        fieldSearchID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewAppTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        addVaccineBtn = new javax.swing.JButton();
        deleteAppBtn = new javax.swing.JButton();
        selectPetBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("View Applicant Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        fieldSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSearchIDActionPerformed(evt);
            }
        });
        jPanel1.add(fieldSearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 205, -1));

        viewAppTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "App. ID", "First Name", "Last Name", "Pet Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewAppTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 430, 150));

        jLabel2.setText("Enter Application ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        addVaccineBtn.setText("Add Vaccine");
        jPanel1.add(addVaccineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, -1, -1));

        deleteAppBtn.setText("Delete Application");
        jPanel1.add(deleteAppBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        selectPetBtn.setText("Select Pet");
        selectPetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(selectPetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 70, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 100, -1));

        jLabel3.setText("Pet Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 20));

        jLabel4.setText("Vaccination Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jLabel5.setText("Course Completed?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pet Name", "Vaccine Name", "Couse completed?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 330, 210));

        jLabel6.setText("Add Vaccination Details");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:

        String appEntry = fieldSearchID.getText();

        //Applicant a = appDirectory.searchApplicantName(appEntry);

        for(Applicant a: this.applicants.getApplicants()){

            int x = Integer.parseInt(appEntry);

            if((a.getFirstName().equals(appEntry)) || (a.getApplicationId().equals(x))){
                dispApplicant();
            }

        }

    }//GEN-LAST:event_searchBtnActionPerformed
     public void dispApplicant(){
        ApplicantDirectory applicant = this.business.getDirectory();
        
        if(!applicant.getApplicants().isEmpty()){
            
            viewAppTableModel.setRowCount(0);
            
            for(Applicant ap: applicant.getApplicants()){
                
                Object row[] = new Object[4];
                row[0] = ap;
                row[1] = ap.getFirstName();
                row[2] = ap.getLastName();
                row[3] = ap.getPetName();
                
                viewAppTableModel.addRow(row);
            }
            
        }
    }
    private void fieldSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSearchIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSearchIDActionPerformed

    private void selectPetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPetBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVaccineBtn;
    private javax.swing.JButton deleteAppBtn;
    private javax.swing.JTextField fieldSearchID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton selectPetBtn;
    private javax.swing.JTable viewAppTable;
    // End of variables declaration//GEN-END:variables
}
