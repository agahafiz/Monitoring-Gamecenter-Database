/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.*;
import java.awt.Event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aga
 */
public class Food extends javax.swing.JFrame {
    
    

    /**
     *
     */
   
    private Connection koneksi;
    
    public String harga;
   
    
            
    /**
     * Creates new form NewJFramepenjualanSF
     */
         
        public Food() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblmakanan = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtjumlahbeli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbjenismakanan = new javax.swing.JComboBox<>();
        txtharga = new javax.swing.JTextField();
        pesan = new javax.swing.JButton();
        labelkode = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        cbbilling = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblmakanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblmakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmakananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblmakanan);

        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel4.setText("Jumlah ");

        jLabel3.setText("Harga");

        jLabel2.setText("Nama Makanan");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FOOD ORDER");

        cbjenismakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mie Goreng", "Mie Rebus", "Es Teh", "Es Jeruk" }));
        cbjenismakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjenismakananActionPerformed(evt);
            }
        });

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        labelkode.setText("Billing");

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nama");

        cbbilling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Billing 1", "Billing 2", "Billing 3", "Billing 4", "Billing 5", "Billing 6", "Billing 7", "Billing 8" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(pesan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(labelkode))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtjumlahbeli, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                            .addComponent(txtharga, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                            .addComponent(cbjenismakanan, 0, 138, Short.MAX_VALUE)
                                            .addComponent(txtnama)
                                            .addComponent(cbbilling, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton2))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelkode)
                            .addComponent(cbbilling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbjenismakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesan)
                            .addComponent(jButton1)
                            .addComponent(cancel))))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
String nama     = txtnama.getText();
String billing  = (String) cbbilling.getSelectedItem();
String nama_makanan  = (String) cbjenismakanan.getSelectedItem();
String harga    = txtharga.getText();
String jumlah   = txtjumlahbeli.getText();



       
if (txtnama.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(null, "Mohon Masukkan Data untuk di Input", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
} else {
     try {
         java.sql.Statement stat = koneksi.createStatement();
         ResultSet data = stat.executeQuery("SELECT * FROM makanan WHERE nama ='" + txtnama.getText() + "'");
         if (data.next()) {
             JOptionPane.showMessageDialog(null, "Kode sudah ada", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
             txtnama.requestFocus();
         } else {
            String sql = "INSERT INTO makanan VALUES('" + nama + "'"
                   + ",'" + nama_makanan + "'"
                   + ",'" + harga + "'"
                   + ",'" + jumlah + "'"
                   + ",'" + billing + "')";
                   
            
            stat.executeUpdate(sql);
            txtnama.setText("");
            cbbilling.setSelectedIndex(-0);
            cbjenismakanan.setSelectedIndex(-0);
            txtharga.setText("");
            txtjumlahbeli.setText("");
             
            txtnama.requestFocus();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);      
            TampilData();
         }
            stat.close();
        } catch (Exception exc) {
            System.err.println("Terjadi Kesalahan :" + exc);
     }
}    
    }//GEN-LAST:event_pesanActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
    txtnama.setText("");
    cbbilling.setSelectedIndex(-0);
    cbjenismakanan.setSelectedIndex(-0);
    txtharga.setText("");
    txtjumlahbeli.setText(""); 
    txtnama.requestFocus();
    }//GEN-LAST:event_cancelActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainMenu mnu = new MainMenu();
                mnu.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
if (ok == 0) {
    String sql = "DELETE FROM makanan WHERE nama='" + txtnama.getText().trim() + "'";
    try {
         Statement stat = koneksi.createStatement();
         stat.executeUpdate(sql);
         JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
         stat.close();
         txtnama.setText("");
         cbbilling.setSelectedIndex(-0);
         cbjenismakanan.setSelectedIndex(-0);
         txtharga.setText("");
         txtjumlahbeli.setText("");
         txtnama.requestFocus();
         TampilData();
      } catch (SQLException exc) {
          System.err.println(sql);
          System.err.println("Error : " + exc);
      }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblmakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmakananMouseClicked
        int baris = tblmakanan.getSelectedRow();
if (baris != -1) {
    txtnama.setText(tblmakanan.getValueAt(baris, 0).toString());
    cbbilling.setSelectedItem(tblmakanan.getValueAt(baris, 1).toString());
    cbjenismakanan.setSelectedItem(tblmakanan.getValueAt(baris, 2).toString());
    txtharga.setText(tblmakanan.getValueAt(baris, 3).toString());
    txtjumlahbeli.setText(tblmakanan.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tblmakananMouseClicked

    /**
     * @param args the command line arguments
     */
    }
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
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Food().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> cbbilling;
    private javax.swing.JComboBox<String> cbjenismakanan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelkode;
    private javax.swing.JButton pesan;
    private javax.swing.JTable tblmakanan;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlahbeli;
    private javax.swing.JTextField txtnama;
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
    model.addColumn("Billing");
    model.addColumn("Nama_Makanan");
    model.addColumn("Harga");
    model.addColumn("Jumlah");
    tblmakanan.setModel(model);

//menampilkan data database kedalam tabel
try {
    java.sql.Statement stat = koneksi.createStatement();
    ResultSet data = stat.executeQuery("SELECT * FROM makanan");
    while (data.next()) {
         model.addRow(new Object[]{
            data.getString("Nama"),
            data.getString("Billing"),
            data.getString("Nama_Makanan"),
            data.getString("Harga"),
            data.getString("jumlah"),
            
         });
         tblmakanan.setModel(model);
    }
} catch (Exception e) {
    System.err.println("Terjadi Kesalahan :" + e);
}
    }
}

