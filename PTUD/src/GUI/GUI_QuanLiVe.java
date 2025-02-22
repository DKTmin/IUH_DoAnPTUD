/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import javax.swing.table.DefaultTableModel;

import DAO.DAO_VeMayBay;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author HONG_PHUC
 */
public class GUI_QuanLiVe extends javax.swing.JPanel {

    /**
     * Creates new form GUI_NhapVe
     */
	 private DAO_VeMayBay daoVeMayBay = new DAO_VeMayBay();
    public GUI_QuanLiVe() {
        initComponents();
        loadVeMayBayData();
         // Thêm DocumentListener cho jTextField1
        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // Khi người dùng nhập vào, tự động cập nhật bảng
                updateTableData();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // Khi người dùng xóa, tự động cập nhật bảng
                updateTableData();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Khi có sự thay đổi khác (có thể không cần thiết trong trường hợp này)
                updateTableData();
            }
        });
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 115, 135));
        jLabel1.setText("QUẢN LÝ VÉ");
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Tìm Kiếm Vé Theo Số Điện Thoại");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(25, 145, 166));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MaVe", "MaHangBay", "MaLichBay", "MaHạngVe", "TenKhachHang", "SoDienThoai", "Gia"
            }
        ));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Hủy vé");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   // Lấy giá trị số điện thoại từ TextField (giả sử tên là jTextField1)
    String phoneNumber = jTextField1.getText().trim();  // Lấy giá trị nhập vào và loại bỏ khoảng trắng

    if (!phoneNumber.isEmpty()) {
        // Nếu số điện thoại không rỗng, gọi phương thức tìm kiếm trong DAO
        DefaultTableModel model = daoVeMayBay.searchByPhone(phoneNumber);  // Giả sử daoVeMayBay là đối tượng của DAO_VeMayBay
        // Cập nhật kết quả vào JTable (giả sử JTable là jTable1)
        jTable1.setModel(model);  // Sử dụng model đã tìm được để cập nhật vào JTable
    } else {
        // Nếu ô nhập số điện thoại trống (đã xóa số điện thoại), cập nhật lại bảng bằng cách lấy tất cả dữ liệu
        DefaultTableModel model = daoVeMayBay.loadDataToTable();  // Lấy tất cả dữ liệu từ DAO
        jTable1.setModel(model);  // Cập nhật lại JTable với dữ liệu gốc
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         // Kiểm tra xem có dòng nào được chọn trong bảng không
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        // Giả sử cột đầu tiên chứa mã vé (hoặc có thể là số điện thoại, tùy thuộc vào bảng của bạn)
        String ticketId = jTable1.getValueAt(selectedRow, 0).toString(); 

        // Xác nhận hành động hủy vé
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn hủy vé này?", "Xác nhận hủy vé", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            // Gọi phương thức hủy vé từ lớp DAO
            boolean success = daoVeMayBay.cancelTicket(ticketId); // Giả sử phương thức cancelTicket thực hiện hủy vé
            
            if (success) {
                // Cập nhật lại bảng sau khi hủy vé
                DefaultTableModel model = daoVeMayBay.loadDataToTable(); // Lấy lại tất cả dữ liệu sau khi hủy
                jTable1.setModel(model); // Cập nhật bảng
                JOptionPane.showMessageDialog(this, "Hủy vé thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Không thể hủy vé. Vui lòng thử lại.");
            }
        }
    } else {
        // Nếu không có dòng nào được chọn
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một vé để hủy.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed
     private void updateTableData() {
        // Lấy giá trị số điện thoại từ TextField
        String phoneNumber = jTextField1.getText().trim();  // Lấy giá trị nhập vào và loại bỏ khoảng trắng

        if (!phoneNumber.isEmpty()) {
            // Nếu số điện thoại không rỗng, gọi phương thức tìm kiếm trong DAO
//            DefaultTableModel model = daoVeMayBay.searchByPhone(phoneNumber);  // Giả sử daoVeMayBay là đối tượng của DAO_VeMayBay
//            jTable1.setModel(model);  // Cập nhật kết quả vào JTable
        } else {
            // Nếu ô nhập số điện thoại trống, cập nhật lại bảng với tất cả dữ liệu
            DefaultTableModel model = daoVeMayBay.loadDataToTable();  // Lấy tất cả dữ liệu từ DAO
            jTable1.setModel(model);  // Cập nhật lại JTable với dữ liệu gốc
        }
    }
    private void loadVeMayBayData() {
        // Gọi hàm loadDataToTable từ DAO_VeMayBay và cập nhật dữ liệu vào JTable
        DefaultTableModel model = daoVeMayBay.loadDataToTable();
        jTable1.setModel(model);  // Cập nhật model cho JTable
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
