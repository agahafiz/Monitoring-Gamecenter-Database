/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aga
 */
public class ViewFoodOrder extends javax.swing.JFrame {
    
    private Connection koneksi;
    public String harga;

    /**
     * Creates new form ViewFoodOrder
     */
    public ViewFoodOrder() {
        initComponents();
        KoneksiDatabase();
        TampilData();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bcari = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbbilling = new javax.swing.JComboBox<>();
        cbjenismakanan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblviewfood = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TABEL VIEW FOOD ORDER");

        bcari.setText("Find");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        ubah.setText("Update");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        bkeluar.setText("Exit");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        bbatal.setText("Cancel");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        jLabel2.setText("makanan");

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        jLabel3.setText("nama");

        jLabel4.setText("harga");

        jLabel5.setText("jumlah");

        jLabel6.setText("billing");

        cbbilling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Billing 1", "Billing 2", "Billing 3", "Billing 4" }));

        cbjenismakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mie Goreng", "Mie Rebus", "Es Teh", "Es Jeruk" }));
        cbjenismakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjenismakananActionPerformed(evt);
            }
        });

        tblviewfood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblviewfood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblviewfoodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblviewfood);

        jLabel7.setText("find");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnama)
                                .addComponent(txtharga)
                                .addComponent(txtjumlah)
                                .addComponent(cbbilling, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbjenismakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ubah))
                        .addGap(18, 18, 18)
                        .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbjenismakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbbilling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcari)
                    .addComponent(ubah)
                    .addComponent(bkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bbatal))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        try {
            java.sql.Statement stat = koneksi.createStatement();
            ResultSet data = stat.executeQuery("SELECT * FROM view_foodorder WHERE nama like '%" + txtcari.getText() + "%'" + "or nama like '%" + txtcari.getText() + "%'");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("nama");
            model.addColumn("nama_makanan");
            model.addColumn("harga");
            model.addColumn("jumlah");
            model.addColumn("billing");
            tblviewfood.setModel(model);

            if (data.next()) {
                model.addRow(new Object[]{
                    data.getString("nama"),
                    data.getString("nama_makanan"),
                    data.getString("harga"),
                    data.getString("jumlah"),
                    data.getString("billing")
                });
                tblviewfood.setModel(model);
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
            stat.close();
        } catch (Exception e) {
            System.err.println("Terjadi Kesalahan :" + e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bcariActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed

        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "update view_foodorder set nama='" + txtnama.getText()
            + "',nama_makanan='" + cbjenismakanan.getSelectedItem()
            + "',harga='" + txtharga.getText()
            + "',jumlah='" + txtjumlah.getText()
            + "',billing='" + cbbilling.getSelectedItem()
            + "'where nama='" + txtnama.getText().trim() + "'";
            if (txtnama.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Data Masih Kosong!", "Ubah Data", JOptionPane.WARNING_MESSAGE);
                txtnama.requestFocus();
            } else {
                try {
                    Statement stat = koneksi.createStatement();
                    stat.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
                    stat.close();
                    txtnama.requestFocus();
                    TampilData();
                } catch (Exception exc) {
                    System.err.println("Error :" + exc);
                }
            }
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Terima Kasih Atas Perhatiannya", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        txtnama.setText("");
        cbjenismakanan.setSelectedIndex(-0);
        txtharga.setText("");
        txtjumlah.setText("");
        cbbilling.setSelectedIndex(-0);        // TODO add your handling code here:
    }//GEN-LAST:event_bbatalActionPerformed

    private void tblviewfoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblviewfoodMouseClicked
        int baris = tblviewfood.getSelectedRow();
        if (baris != -1) {
            txtnama.setText(tblviewfood.getValueAt(baris, 0).toString());
            cbjenismakanan.setSelectedItem(tblviewfood.getValueAt(baris, 1).toString());
            txtharga.setText(tblviewfood.getValueAt(baris, 2).toString());
            txtjumlah.setText(tblviewfood.getValueAt(baris, 3).toString());
            cbbilling.setSelectedItem(tblviewfood.getValueAt(baris, 4).toString());
            
    }//GEN-LAST:event_tblviewfoodMouseClicked
    }
    
    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void cbjenismakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjenismakananActionPerformed
        if (cbjenismakanan.getSelectedIndex()==0) {
       
        harga="2000";
        }
        else if (cbjenismakanan.getSelectedIndex()==1){
               
                harga="1500";
                }
        else if (cbjenismakanan.getSelectedIndex()==2){
           
                harga="1000";
                }
               
     
        txtharga.setText(harga);
    }//GEN-LAST:event_cbjenismakananActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Admin mnu = new Admin();
                mnu.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFoodOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFoodOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFoodOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFoodOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFoodOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bkeluar;
    private javax.swing.JComboBox<String> cbbilling;
    private javax.swing.JComboBox<String> cbjenismakanan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblviewfood;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtnama;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables

    private void KoneksiDatabase() {
        try {
 Class.forName("com.mysql.jdbc.Driver");
 } catch (ClassNotFoundException cnf) {
 }
  try {
      koneksi = DriverManager.getConnection("jdbc:mysql://localhost/gamecenterdb", "root", "");
      JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
 } catch (SQLException se) {
      JOptionPane.showMessageDialog(null, "Koneksi Database Tidak Berhasil");
 } catch (Exception e) {
 }
    }

    private void TampilData() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Nama");
    model.addColumn("Nama_Makanan");
    model.addColumn("Harga");
    model.addColumn("Jumlah");
    model.addColumn("Billing");
    tblviewfood.setModel(model);

//menampilkan data database kedalam tabel
try {
    java.sql.Statement stat = koneksi.createStatement();
    ResultSet data = stat.executeQuery("SELECT * FROM view_foodorder");
    while (data.next()) {
         model.addRow(new Object[]{
            data.getString("Nama"),
            data.getString("Nama_Makanan"),
            data.getString("Harga"),
            data.getString("Jumlah"),
            data.getString("Billing"),
            
         });
         tblviewfood.setModel(model);
    }
} catch (Exception e) {
    System.err.println("Terjadi Kesalahan :" + e);
}
    }
    }


