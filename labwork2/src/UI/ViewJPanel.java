/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Customer;
import Model.DeliveryPackage;

/**
 *
 * @author Sashank Machiraju
 */
public class ViewJPanel extends javax.swing.JPanel {

    private DeliveryPackage delPackage;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel() {
        initComponents();
        
    }

    public ViewJPanel(DeliveryPackage deliveryPackage) {
        initComponents();
        
        this.delPackage = deliveryPackage;
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageId = new javax.swing.JTextField();
        packageWt = new javax.swing.JTextField();
        custId = new javax.swing.JTextField();
        productId1 = new javax.swing.JTextField();
        productName1 = new javax.swing.JTextField();
        productPrice1 = new javax.swing.JTextField();
        custName1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(packageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 30));
        add(packageWt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, 30));
        add(custId, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 100, 40));
        add(productId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 110, 30));
        add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 110, 30));
        add(productPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 110, 30));
        add(custName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 100, 40));

        jLabel1.setText("Customer ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 20));

        jLabel2.setText("Package Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setText("Weight");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setText("Product ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel5.setText("Product Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jLabel6.setText("Product Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 20));

        jLabel7.setText("Customer name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 20));
    }// </editor-fold>//GEN-END:initComponents
    
    public void display() {
        packageId.setText(String.valueOf(this.delPackage.getPackageId()));
        packageWt.setText(String.valueOf(this.delPackage.getPackageWeight()));
        
        Customer customer = this.delPackage.getCustomer();
        custId.setText(String.valueOf(customer.getCustId()));
        custName1.setText(customer.getfName());
        
//        Product product = this.delPackage.getProduct();
//        productId1.setText(String.valueOf(product.getProductId()));
//        productName1.setText(product.getProductName());
//        productPrice1.setText(String.valueOf(product.getPrice()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custId;
    private javax.swing.JTextField custName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageId;
    private javax.swing.JTextField packageWt;
    private javax.swing.JTextField productId1;
    private javax.swing.JTextField productName1;
    private javax.swing.JTextField productPrice1;
    // End of variables declaration//GEN-END:variables
}