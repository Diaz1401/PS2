/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Transaksi;

import Koneksi.Koneksi;
import com.formdev.flatlaf.FlatClientProperties;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Diaz Nuraji
 */
public class FormKasirPanel extends javax.swing.JPanel {

    private static Connection cn;
    private static ResultSet rs;
    private static Statement st;
    private static PreparedStatement pst;
    public static String[] barang = new String[10];

    /**
     * Creates new form FormEventPanel
     */
    public FormKasirPanel() {
        initComponents();
        txtIDPegawai.setText(Login.FormLoginFrame.namaPegawai);
        txtTransaksi.setText(GenerateID()[0]);
        txtDTransaksi.setText(GenerateID()[1]);
        pnKasir.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:12;" // Sudut
                + "background:$Login.background");
        lbTitleKasir.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:+bold +20");
    }

    public String[] GenerateID() {
        String id[] = new String[2];
        Random random = new Random();
        // Random number 10000000 to 99999999
        int number = random.nextInt(89999999) + 10000000;
        id[0] = "TRX_" + number;
        id[1] = "DTRX_" + number;
        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnKasir = new javax.swing.JPanel();
        lbTitleKasir = new javax.swing.JLabel();
        txtIDPegawai = new javax.swing.JTextField();
        txtTransaksi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFinal = new javax.swing.JButton();
        txtDTransaksi = new javax.swing.JTextField();
        btnPilih = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(453, 453));

        lbTitleKasir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitleKasir.setText("Kasir");

        txtIDPegawai.setEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID Pegawai");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID Transaksi & Detail Transaksi");

        btnFinal.setText("Proses");
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        btnPilih.setText("Pilih Barang");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel3.setText("Keterangan");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane1.setViewportView(txtKeterangan);

        jLabel4.setText("Total");

        javax.swing.GroupLayout pnKasirLayout = new javax.swing.GroupLayout(pnKasir);
        pnKasir.setLayout(pnKasirLayout);
        pnKasirLayout.setHorizontalGroup(
            pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKasirLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKasirLayout.createSequentialGroup()
                        .addComponent(btnHitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTitleKasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKasirLayout.createSequentialGroup()
                        .addGroup(pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtIDPegawai, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTransaksi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(txtDTransaksi))
                            .addComponent(btnPilih))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        pnKasirLayout.setVerticalGroup(
            pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKasirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitleKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnKasirLayout.createSequentialGroup()
                        .addComponent(txtIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnPilih))
                    .addGroup(pnKasirLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnFinal))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        // Tanggal
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String datetime = LocalDateTime.now().format(formatter);

        // Insert into tabel transaksi
        try {
            cn = Koneksi.koneksiDB();
            String query = "INSERT INTO transaksi (id_transaksi, keterangan";

            // for id_barang_0 to id_barang_9
            for (int i = 0; i < 10; i++) {
                query += ", id_barang_" + i;
            }

            // id_transaksi, id_pegawai, keterangan, tanggal
            query += ") VALUES (?, ?";

            // for id_barang_0 to id_barang_9
            for (int i = 0; i < 10; i++) {
                query += ", ?";
            }

            query += ")";

            pst = cn.prepareStatement(query);
            pst.setString(1, txtTransaksi.getText()); // id_transaksi
            pst.setString(2, txtKeterangan.getText()); // keterangan

            // Add id_barang values from barang array
            for (int i = 0; i < 10; i++) {
                if (barang[i] != null) {
                    pst.setString(3 + i, barang[i]);
                } else {
                    pst.setNull(3 + i, Types.VARCHAR);
                }
            }

            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Transaksi gagal, " + e.getMessage());
        }

        // Insert into tabel transaksi_detail
        try {
            cn = Koneksi.koneksiDB();
            String query = "INSERT INTO detail_transaksi (id_detail_transaksi, id_transaksi, id_pegawai, tanggal, total) VALUES (?, ?, ?, ?, ?)";

            pst = cn.prepareStatement(query);
            pst.setString(1, txtDTransaksi.getText()); // id_detail_transaksi
            pst.setString(2, txtTransaksi.getText()); // id_transaksi
            pst.setString(3, txtIDPegawai.getText()); // id_pegawai
            pst.setString(4, datetime); // tanggal
            pst.setString(5, lbTotal.getText()); // total

            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Transaksi gagal, " + e.getMessage());
        }
        btnFinal.setEnabled(false);
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        new FormPilihBarangFrame().setVisible(true);
    }//GEN-LAST:event_btnPilihActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        int totalPrice = 0; // Total harga
        HashMap<String, Integer> itemCount = new HashMap<>(); // Map untuk menyimpan jumlah barang
        HashMap<String, String> namaMap = new HashMap<>(); // Map untuk menyimpan pemetaan id_barang -> nama

        // Hitung kemunculan setiap item dalam array barang dan ambil nama dari database
        for (String item : barang) {
            if (item != null) {
                // Periksa apakah item sudah ada dalam map itemCount
                if (itemCount.containsKey(item)) {
                    // Jika ya, tambahkan jumlahnya
                    itemCount.put(item, itemCount.get(item) + 1);
                } else {
                    // Jika tidak, inisialisasi jumlah dengan 1
                    itemCount.put(item, 1);
                    try {
                        // Ambil koneksi ke database
                        cn = Koneksi.koneksiDB();
                        String query = "SELECT * FROM barang WHERE id_barang = ?";
                        pst = cn.prepareStatement(query);
                        pst.setString(1, item);
                        rs = pst.executeQuery();
                        if (rs.next()) {
                            // Ambil nama dari hasil pencarian
                            String nama = rs.getString("nama");
                            // Simpan pemetaan id_barang -> nama dalam namaMap
                            namaMap.put(item, nama);
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                    }
                }
            }
        }

        // Buat StringBuilder untuk menyusun hasil akhir
        StringBuilder result = new StringBuilder();

        // Iterasi melalui array barang untuk menyisipkan item dengan jumlah
        Set<String> uniqueItems = new HashSet<>();
        for (String item : barang) {
            if (item != null && !uniqueItems.contains(item)) { // Jika item belum ditambahkan sebelumnya
                uniqueItems.add(item); // Tandai item sebagai sudah ditambahkan
                // Ambil nama dari namaMap menggunakan id_barang
                String nama = namaMap.get(item);
                // Periksa apakah jumlahnya lebih dari 1, tambahkan "x[jumlah]"
                if (itemCount.get(item) > 1) {
                    result.append(nama).append(" x").append(itemCount.get(item));
                } else {
                    result.append(nama);
                }
                result.append("\n"); // Tambahkan baris baru
            }
        }
        txtKeterangan.setText(result.toString());

        // Calculate the total price
        for (String barangs : barang) {
            if (barangs != null) {
                try {
                    cn = Koneksi.koneksiDB();
                    String query = "SELECT * FROM barang WHERE id_barang = ?";
                    pst = cn.prepareStatement(query);
                    pst.setString(1, barangs);
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        int harga = rs.getInt("harga");
                        // Ambil keuntungan 2000
                        totalPrice += harga + 2000;
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
                }
            }
        }

        lbTotal.setText(String.valueOf(totalPrice));
        btnFinal.setEnabled(true);
    }//GEN-LAST:event_btnHitungActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinal;
    public static javax.swing.JButton btnHitung;
    private javax.swing.JButton btnPilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitleKasir;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel pnKasir;
    private javax.swing.JTextField txtDTransaksi;
    private javax.swing.JTextField txtIDPegawai;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtTransaksi;
    // End of variables declaration//GEN-END:variables
}
