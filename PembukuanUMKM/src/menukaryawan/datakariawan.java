/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menukaryawan;

import pembukuanumkm.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class datakariawan extends javax.swing.JFrame {
public void kode_karyawann() {
        try {
            String sql = "SELECT kode_karyawan FROM data_karyawan order by kode_karyawan desc";
            Connection conn = (Connection) Koneksi.koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);

            if (rs.next()) {
                String Idno = rs.getString("kode_karyawan").substring(2);
                String AN = "" + (Integer.parseInt(Idno) + 1);
                String Nol = "";
                if (AN.length() == 1) {
                    Nol = "00";
                } else if (AN.length() == 2) {
                    Nol = "0";
                } else if (AN.length() == 3) {
                    Nol = "";

                }

                txtKKaryawan.setText("K" + Nol + AN);
            } else {
                txtKKaryawan.setText("K001");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public datakariawan() {
        initComponents();
        loadtable111();
        kode_karyawann();
        ImageIcon icon = new ImageIcon("C:\\Users\\laptophp\\Downloads\\CIRCLE.png");
this.setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loadtable111 = new javax.swing.JTable();
        txtKKaryawan = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        backtomenu = new javax.swing.JButton();
        txtNotelp = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        txtNKaryawan = new javax.swing.JTextField();
        Keluarbtn = new javax.swing.JButton();
        btnTPenjualan = new javax.swing.JButton();
        btnTPembelian = new javax.swing.JButton();
        btnLapBKeluar = new javax.swing.JButton();
        btnLapBMasuk = new javax.swing.JButton();
        btnDataBarang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 0));

        loadtable111.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        loadtable111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadtable111.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Karyawan", "Nama Karyawan", "No Telpon", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        loadtable111.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        loadtable111.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadtable111.setEnabled(false);
        loadtable111.setMinimumSize(new java.awt.Dimension(60, 500));
        loadtable111.setPreferredSize(new java.awt.Dimension(300, 1020));
        loadtable111.setRowHeight(30);
        loadtable111.setRowMargin(2);
        loadtable111.setShowGrid(false);
        loadtable111.setUpdateSelectionOnSort(false);
        loadtable111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadtable111MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(loadtable111);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 850, 330));

        txtKKaryawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtKKaryawan.setBorder(null);
        txtKKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtKKaryawanMouseClicked(evt);
            }
        });
        txtKKaryawan.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtKKaryawanInputMethodTextChanged(evt);
            }
        });
        txtKKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKKaryawanActionPerformed(evt);
            }
        });
        txtKKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKKaryawanKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKKaryawanKeyTyped(evt);
            }
        });
        jPanel1.add(txtKKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 160, 30));

        txtAlamat.setBorder(null);
        jPanel1.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 170, 30));

        backtomenu.setBackground(new java.awt.Color(255, 0, 0));
        backtomenu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        backtomenu.setForeground(new java.awt.Color(255, 255, 255));
        backtomenu.setContentAreaFilled(false);
        backtomenu.setFocusable(false);
        backtomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtomenuActionPerformed(evt);
            }
        });
        jPanel1.add(backtomenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 50));

        txtNotelp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNotelp.setBorder(null);
        txtNotelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNotelpKeyPressed(evt);
            }
        });
        jPanel1.add(txtNotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 180, 160, 30));

        btnSimpan.setBackground(new java.awt.Color(255, 255, 0));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSimpan.setContentAreaFilled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 140, 50));

        txtNKaryawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNKaryawan.setBorder(null);
        txtNKaryawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNKaryawanKeyPressed(evt);
            }
        });
        jPanel1.add(txtNKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 170, 30));

        Keluarbtn.setBackground(java.awt.Color.red);
        Keluarbtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Keluarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Keluarbtn.setContentAreaFilled(false);
        Keluarbtn.setHideActionText(true);
        Keluarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Keluarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 60, 60));

        btnTPenjualan.setBackground(new java.awt.Color(51, 51, 51));
        btnTPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        btnTPenjualan.setContentAreaFilled(false);
        btnTPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTPenjualanActionPerformed(evt);
            }
        });
        jPanel1.add(btnTPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 300, 60));

        btnTPembelian.setBackground(new java.awt.Color(51, 51, 51));
        btnTPembelian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTPembelian.setForeground(new java.awt.Color(255, 255, 255));
        btnTPembelian.setContentAreaFilled(false);
        btnTPembelian.setFocusable(false);
        btnTPembelian.setInheritsPopupMenu(true);
        btnTPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTPembelianActionPerformed(evt);
            }
        });
        jPanel1.add(btnTPembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 60));

        btnLapBKeluar.setBackground(new java.awt.Color(51, 51, 51));
        btnLapBKeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLapBKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnLapBKeluar.setContentAreaFilled(false);
        btnLapBKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapBKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLapBKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 300, 60));

        btnLapBMasuk.setBackground(new java.awt.Color(51, 51, 51));
        btnLapBMasuk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLapBMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btnLapBMasuk.setContentAreaFilled(false);
        btnLapBMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapBMasukActionPerformed(evt);
            }
        });
        jPanel1.add(btnLapBMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 300, 60));

        btnDataBarang.setBackground(new java.awt.Color(51, 51, 51));
        btnDataBarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDataBarang.setForeground(new java.awt.Color(255, 255, 255));
        btnDataBarang.setContentAreaFilled(false);
        btnDataBarang.setFocusPainted(false);
        btnDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataBarangActionPerformed(evt);
            }
        });
        jPanel1.add(btnDataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 300, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\KAMPUS\\TUGAS\\gambar untuk gui\\Background menu\\Data KaryawanK.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1375, 767));
        jLabel1.setMinimumSize(new java.awt.Dimension(1375, 767));
        jLabel1.setPreferredSize(new java.awt.Dimension(1375, 767));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void loadtable111() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("nama_Karyawan");
        tbl.addColumn("no _Telp");
        tbl.addColumn("alamat");
        loadtable111.setModel(tbl);

        try {

            java.sql.Statement statement = Koneksi.koneksi.getKoneksi().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM data_karyawan");

            while (res.next()) {
                tbl.addRow(new Object[]{
                    res.getString("nama_karyawan"),
                    res.getString("no_Telp"),
                    res.getString("alamat")
                });
                loadtable111.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Salah");
        }
    }

    private void showData111() {
        try {
            String kode_karyawan = loadtable111.getValueAt(this.loadtable111.getSelectedRow(), 0).toString();
            Connection conn = (Connection) Koneksi.koneksi.getKoneksi();
            Statement s = conn.createStatement();
            ResultSet r = s.executeQuery("SELECT kode_karyawan, nama_karyawan, no_telp, alamat FROM data_karyawan WHERE kode_karyawan = '" + kode_karyawan + "'");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private void loadtable111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadtable111MouseClicked
        this.showData111();
    }//GEN-LAST:event_loadtable111MouseClicked

    private void txtKKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtKKaryawanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKKaryawanMouseClicked

    private void txtKKaryawanInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtKKaryawanInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKKaryawanInputMethodTextChanged

    private void txtKKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKKaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKKaryawanActionPerformed

    private void txtKKaryawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKKaryawanKeyPressed
        this.kode_karyawann();
    }//GEN-LAST:event_txtKKaryawanKeyPressed

    private void txtKKaryawanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKKaryawanKeyTyped
        this.kode_karyawann();        // TODO add your handling code here:
    }//GEN-LAST:event_txtKKaryawanKeyTyped

    private void backtomenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtomenuActionPerformed
        this.setVisible(false);
        new MenuUtamaKaryawan().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_backtomenuActionPerformed

    private void txtNotelpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotelpKeyPressed

    }//GEN-LAST:event_txtNotelpKeyPressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String kode = txtKKaryawan.getText();
        String nama = txtNKaryawan.getText();
        String notelp = txtNotelp.getText();
        String alamat = txtAlamat.getText();

        try {
            java.sql.Statement statement = Koneksi.koneksi.getKoneksi().createStatement();
            statement.executeUpdate("insert into data_karyawan VALUES ('" + kode + "','" + nama + "','" + notelp + "','" + alamat + "');");
            statement.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");

            txtNKaryawan.setText("");
            txtNotelp.setText("");
            txtAlamat.setText("");
            txtKKaryawan.requestFocus();
            kode_karyawann();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan\n"
                + "Jangan iseng dong -_-");
        }
        loadtable111();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtNKaryawanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNKaryawanKeyPressed

    }//GEN-LAST:event_txtNKaryawanKeyPressed

    private void KeluarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarbtnActionPerformed
               int dialogBtn = JOptionPane.YES_NO_OPTION;
int dialogResult = JOptionPane.showConfirmDialog(this,"ANDA YAKIN AKAN KELUAR?", "PERINGATAN!",dialogBtn);
  if (dialogResult == 0 ){
      System.exit(0);
  }else{
      
  }
 // TODO add your handling code here:
    }//GEN-LAST:event_KeluarbtnActionPerformed

    private void btnTPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTPenjualanActionPerformed
        this.setVisible( false);
        new TransaksiPenjualanKaryawan().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnTPenjualanActionPerformed

    private void btnTPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTPembelianActionPerformed
        this.setVisible(false);
        new TransaksiPembelianKaryawan().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnTPembelianActionPerformed

    private void btnLapBKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapBKeluarActionPerformed
        JOptionPane.showMessageDialog(null, "MAAF\n"
            + "HANYA ADMIN YANG BISA MELIHAT MENU LAPORAN!");         // TODO add your handling code here:
    }//GEN-LAST:event_btnLapBKeluarActionPerformed

    private void btnLapBMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapBMasukActionPerformed
        JOptionPane.showMessageDialog(null, "MAAF\n"
            + "HANYA ADMIN YANG BISA MELIHAT MENU LAPORAN!");  // TODO add your handling code here:
    }//GEN-LAST:event_btnLapBMasukActionPerformed

    private void btnDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataBarangActionPerformed

        new DataBarangKaryawan().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDataBarangActionPerformed

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
            java.util.logging.Logger.getLogger(datakariawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datakariawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datakariawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datakariawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datakariawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluarbtn;
    private javax.swing.JButton backtomenu;
    private javax.swing.JButton btnDataBarang;
    private javax.swing.JButton btnLapBKeluar;
    private javax.swing.JButton btnLapBMasuk;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTPembelian;
    private javax.swing.JButton btnTPenjualan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable loadtable111;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKKaryawan;
    private javax.swing.JTextField txtNKaryawan;
    private javax.swing.JTextField txtNotelp;
    // End of variables declaration//GEN-END:variables
}
