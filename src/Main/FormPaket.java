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
public class FormPaket extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Form
     */
    public FormPaket() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtHP = new javax.swing.JTextField();
        cWaktu = new javax.swing.JComboBox<>();
        cJenis = new javax.swing.JComboBox<>();
        cbilling = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpaket = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PESAN PAKET");

        jLabel2.setText("Nama");

        jLabel3.setText("No.Hp");

        jLabel4.setText("Waktu");

        jLabel5.setText("Jenis");

        jLabel6.setText("Billing");

        jLabel7.setText("Total");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        cWaktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Jam", "2 Jam", "3 Jam", "4 Jam", "5 Jam", " " }));
        cWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cWaktuActionPerformed(evt);
            }
        });

        cJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ps 1", "Ps 2", "Ps 3", "Ps 4" }));
        cJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cJenisActionPerformed(evt);
            }
        });

        cbilling.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Billing 1", "Billing 2", "Billing 3", "Billing 4", "Billing 5", "Billing 6", "Billing 7", "Billing 8" }));

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblpaket.setModel(new javax.swing.table.DefaultTableModel(
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
        tblpaket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpaketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpaket);

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProses)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtHP)
                                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbilling, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbilling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProses))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
       // TODO add your handling code here:
       
     
       
       
       
      ambil(cWaktu.getSelectedIndex(), cJenis.getSelectedIndex());
      hitungTotal(harga, waktu);
      txtTotal.setText("Rp. " + Integer.toString(total));
      notif();

try {
    inputData();
} catch (SQLException | ClassNotFoundException ex) {
    Logger.getLogger(FormPaket.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_btnProsesActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void cWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cWaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cWaktuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          MainMenu mnu = new MainMenu();
                mnu.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cJenisActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void tblpaketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpaketMouseClicked
        int baris = tblpaket.getSelectedRow();
        if (baris != -1) {
            txtnama.setText(tblpaket.getValueAt(baris, 0).toString());
            txtHP.setText(tblpaket.getValueAt(baris, 1).toString());
            cWaktu.setSelectedItem(tblpaket.getValueAt(baris, 2).toString());
            cJenis.setSelectedItem(tblpaket.getValueAt(baris, 3).toString());
            cbilling.setSelectedItem(tblpaket.getValueAt(baris, 4).toString()); 
            txtTotal.setText(tblpaket.getValueAt(baris, 5).toString());
    }//GEN-LAST:event_tblpaketMouseClicked
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        {
        int ok = JOptionPane.showConfirmDialog(null, "Yakin mau menghapus data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "DELETE FROM tb_paket WHERE nama='" + txtnama.getText().trim() + "'";
            try {
                st = (Statement) koneksi().createStatement();
                st.executeUpdate(sql);
                

                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
                st.close();
                txtnama.setText("");
                txtHP.setText("");
                cWaktu.setSelectedIndex(-0);
                cJenis.setSelectedIndex(-0);
                cbilling.setSelectedIndex(-0);
                txtTotal.setText("");
                txtnama.requestFocus();
                TampilData();
            } catch (SQLException exc) {
                System.err.println(sql);
                System.err.println("Error : " + exc);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormPaket.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtnama.setText("");
        txtHP.setText("");
        cWaktu.setSelectedIndex(-0); 
        cJenis.setSelectedIndex(-0); 
        cbilling.setSelectedIndex(-0);  
        txtTotal.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JComboBox<String> cJenis;
    private javax.swing.JComboBox<String> cWaktu;
    private javax.swing.JComboBox<String> cbilling;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblpaket;
    private javax.swing.JTextField txtHP;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtnama;
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
    } catch (SQLException e) {
        return null;
    }
    return con;
}


    // Method inputData
    
    protected void inputData() throws SQLException, ClassNotFoundException {
    st = (Statement) koneksi().createStatement();
    st.executeUpdate("INSERT INTO tb_paket VALUES(null,'"
                        + txtnama.getText().trim() + "','"
                        + txtHP.getText().trim() + "','"
                        + cWaktu.getSelectedItem().toString() + "','"
                        + cJenis.getSelectedItem().toString().substring(0, 4) + "','"
                        + cbilling.getSelectedItem().toString() + "','"
                        + txtTotal.getText() + "')"
            
                    );
    TampilData();
    }


// Method hitungTotal
protected int hitungTotal(int harga, int waktu) {
    total = harga * waktu;
    return total;
}

// Method ambil
    protected void ambil(int cWaktu, int cJenis) {
    switch (cWaktu) {
        case 0:
            waktu = 1;
            break;
        case 1:
            waktu = 2;
            break;
        case 2:
            waktu = 3;
            break;
        case 3:
            waktu = 4;
            break;
        case 4:
            waktu = 5;
            break;
        default:
            System.err.println("Kesalahan");
            break;
    }
    
    switch (cJenis) {
        case 0:
            harga = 2000;
            break;
        case 1:
            harga = 3000;
            break;
        case 2:
            harga = 5000;
            break;
        case 3:
            harga = 8000;
            break;
        default:
            System.err.println("Kesalahan");
            break;
    }
}

// Method notif
protected void notif() {
    nama = txtnama.getText();
    String billing = (String) cbilling.getSelectedItem();
    JOptionPane.showMessageDialog(null, nama + " telah terdaftar di " + billing );
}
 
    


    private void TampilData() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Nama");
    model.addColumn("Hp");
    model.addColumn("Waktu");
    model.addColumn("Jenis");
    model.addColumn("billing");
    model.addColumn("Total");
    tblpaket.setModel(model);

//menampilkan data database kedalam tabel
try {
    st = (Statement) koneksi().createStatement();
    ResultSet data = st.executeQuery("SELECT * FROM tb_paket");
    while (data.next()) {
         model.addRow(new Object[]{
            data.getString("Nama"),
            data.getString("Hp"),
            data.getString("Waktu"),
            data.getString("Jenis"),
            data.getString("billing"),
            data.getString("Total"),
            
         });
         tblpaket.setModel(model);
    }
} catch (Exception e) {
    System.err.println("Terjadi Kesalahan :" + e);
}
    }
    }

