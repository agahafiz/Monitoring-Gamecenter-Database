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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aga
 */
public class ViewOrder extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrder
     */
    public ViewOrder() {
        initComponents();
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
        tblorder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        cbwaktu = new javax.swing.JComboBox<>();
        cbbilling = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        ubah = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bcari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblorder.setModel(new javax.swing.table.DefaultTableModel(
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
        tblorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblorderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblorder);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ORDER PAKET");

        cbwaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Jam", "2 Jam", "3 Jam", "4 Jam", "5 Jam" }));

        cbbilling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Billing 1", "Billing 2", "Billing 3", "Billing 4", "Billing 5", "Billing 6", "Billing 7", "Billing 8" }));

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ps 1", "Ps 2", "Ps 3", "Ps 4" }));

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

        bcari.setText("Find");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        jLabel2.setText("nama");

        jLabel3.setText("waktu");

        jLabel4.setText("jenis");

        jLabel5.setText("billing");

        jLabel6.setText("cari");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cbwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cbbilling, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ubah)
                    .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbilling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ubah)
                            .addComponent(bcari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bkeluar)
                            .addComponent(bbatal))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblorderMouseClicked
        int baris = tblorder.getSelectedRow();
        if (baris != -1) {
        txtnama.setText(tblorder.getValueAt(baris, 0).toString());
        cbwaktu.setSelectedItem(tblorder.getValueAt(baris, 1).toString());
        cbjenis.setSelectedItem(tblorder.getValueAt(baris, 2).toString());
        cbbilling.setSelectedItem(tblorder.getValueAt(baris, 3).toString());

    }//GEN-LAST:event_tblorderMouseClicked
    }
    
    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed

        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "update view_order set nama='" + txtnama.getText()
            + "',waktu='" + cbwaktu.getSelectedItem()
            + "',jenis='" + cbjenis.getSelectedItem()
            + "',billing='" + cbbilling.getSelectedItem()
            
            + "'where nama='" + txtnama.getText().trim() + "'";
            if (txtnama.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Data Masih Kosong!", "Ubah Data", JOptionPane.WARNING_MESSAGE);
                txtnama.requestFocus();
            } else {
                try {
                    st = (Statement) koneksi().createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
                    st.close();
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
        cbwaktu.setSelectedIndex(-0);
        cbjenis.setSelectedIndex(-0);
        cbbilling.setSelectedIndex(-0);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_bbatalActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        try {
            st = (Statement) koneksi().createStatement();
            ResultSet data = st.executeQuery("SELECT * FROM view_order WHERE nama like '%" + txtcari.getText() + "%'" + "or nama like '%" + txtcari.getText() + "%'");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("nama");
            model.addColumn("waktu");
            model.addColumn("jenis");
            model.addColumn("billing");
            
            tblorder.setModel(model);

            if (data.next()) {
                model.addRow(new Object[]{
                    data.getString("nama"),
                    data.getString("waktu"),
                    data.getString("jenis"),
                    data.getString("billing")
                   
                });
                tblorder.setModel(model);
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
            st.close();
        } catch (Exception e) {
            System.err.println("Terjadi Kesalahan :" + e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bcariActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bkeluar;
    private javax.swing.JComboBox<String> cbbilling;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JComboBox<String> cbwaktu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblorder;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
     // Variabel coding
    private static Connection con;
    private Statement st;
    private String nama;
    private int harga;
    private int waktu;
    private int total;
    
    

    // Koneksi database
    protected static Connection koneksi() throws ClassNotFoundException {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gamecenterdb", "root", "");
  JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
 } catch (SQLException se) {
      JOptionPane.showMessageDialog(null, "Koneksi Database Tidak Berhasil");
 } catch (Exception e) {
 }
        return con;
    }




    private void TampilData() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Nama");
    model.addColumn("Waktu");
    model.addColumn("Jenis");
    model.addColumn("Billing");
    tblorder.setModel(model);

//menampilkan data database kedalam tabel
try {
    st = (Statement) koneksi().createStatement();
    ResultSet data = st.executeQuery("SELECT * FROM view_order");
    while (data.next()) {
         model.addRow(new Object[]{
            data.getString("Nama"),
            data.getString("Waktu"),
            data.getString("Jenis"),
            data.getString("Billing")
            
         });
         tblorder.setModel(model);
    }
} catch (Exception e) {
    System.err.println("Terjadi Kesalahan :" + e);
}
    }
    }


