package view;

import controller.EmptyValueException;
import controller.IOFile;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.BaseModel1;

public class BaseForm1 extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    private boolean adding, editting;
    private String filePath;
    private List<BaseModel1> listData;
    public BaseForm1() {
        initComponents();
        String[] cols = {"Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Loại KH"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable1.setModel(tableModel);
        txtFieldId.setEditable(false);
        buttonState(true);
        adding = false;
        editting = false;
        filePath = "src/controller/KH.DAT";
        initData();
    }
    
    private void initData(){ 
        File file = new File(filePath);
        if(file.exists()){
           listData = IOFile.doc(filePath);
        } else{
           listData = new ArrayList<>();
        }
    }
    
    private void buttonState(boolean e){
        btnAddNew.setEnabled(e);
        btnEdit.setEnabled(e);
        btnUpdate.setEnabled(!e);
        btnSkip.setEnabled(!e);
    }
    
    private void showData(List<BaseModel1> list){
        tableModel.setRowCount(0);
        for(BaseModel1 i : list){
            tableModel.addRow(i.toObjects());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldName = new javax.swing.JTextField();
        txtFieldSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnShowFromFile = new javax.swing.JButton();
        btnSaveToFile = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSkip = new javax.swing.JButton();
        txtFieldId = new javax.swing.JTextField();
        cbBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtFieldAddress = new javax.swing.JTextField();

        txtFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNameActionPerformed(evt);
            }
        });

        txtFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldSearchKeyTyped(evt);
            }
        });

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddNew.setText("Thêm mới");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnShowFromFile.setText("Hiển thị");
        btnShowFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFromFileActionPerformed(evt);
            }
        });

        btnSaveToFile.setText("Lưu vào file");
        btnSaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToFileActionPerformed(evt);
            }
        });

        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Mã");

        jLabel2.setText("Tên");

        jLabel4.setText("Loại khách hàng");

        btnSkip.setText("Bỏ qua");
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipActionPerformed(evt);
            }
        });

        cbBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cá nhân", "Tập thể", "Doanh nghiệp" }));
        cbBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Địa chỉ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtFieldSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(cbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSkip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSaveToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(btnShowFromFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFieldAddress, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFieldName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cbBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowFromFile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSkip, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keySearch = txtFieldSearch.getText().trim().toLowerCase();
        List<BaseModel1> listResult = new ArrayList<>();
        for(BaseModel1 i : listData){
            if(
                (i.getName().toLowerCase().contains(keySearch)) || 
                (i.getAddress().toLowerCase().contains(keySearch))
            ){
                listResult.add(i);
            }
        }
        showData(listResult);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        buttonState(false);
        adding = true;
        jTable1.clearSelection();
        File file = new File(filePath);
        if(listData != null && listData.size() > 0){
            BaseModel1.setSma(listData.get(listData.size()-1).getId()+1);
        } else{
            listData = new ArrayList<>();
        }
        txtFieldId.setText(BaseModel1.getSma()+"");
        txtFieldName.requestFocus();
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int row = jTable1.getSelectedRow();
        if( row < 0 || row > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Chọn khách hàng để sửa");
        } else{
            editting = true;
            buttonState(false);
            txtFieldName.requestFocus();

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int currentRow = jTable1.getSelectedRow();
        if(currentRow<0 || currentRow > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng");
        } else{
            tableModel.removeRow(currentRow);
            listData.remove(currentRow);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnShowFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromFileActionPerformed
        try{
            initData();
            tableModel.setRowCount(0);
            for(BaseModel1 bm: listData){
                tableModel.addRow(bm.toObjects());
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Chưa có dữ liệu vui lòng nhập thêm");
        }
    }//GEN-LAST:event_btnShowFromFileActionPerformed

    private void btnSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToFileActionPerformed
        IOFile.viet(filePath, listData);
        JOptionPane.showMessageDialog(this, "đã lưu dữ liệu: " + filePath);
    }//GEN-LAST:event_btnSaveToFileActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(adding){
            try{
                int id = Integer.parseInt(txtFieldId.getText());
                
                String name = txtFieldName.getText();
                
                String address = txtFieldAddress.getText();
                
                String type = cbBox1.getSelectedItem().toString();

                if(name.isEmpty() || address.isEmpty()){
                    throw new EmptyValueException();
                }
                

                BaseModel1 data = new BaseModel1(
                    id,
                    name,
                    address,
                    type
                );
                tableModel.addRow(data.toObjects());
                listData.add(data);
                buttonState(true);
                adding = false;
                jTable1.clearSelection();
            } 
            catch (EmptyValueException e){
                JOptionPane.showMessageDialog(this, "Không để trống thông tin");
                txtFieldName.requestFocus();
            } 
        }
        if(editting){
            try{
                int row = jTable1.getSelectedRow();
                
                int id = Integer.parseInt(txtFieldId.getText());
                
                String name = txtFieldName.getText();
                
                String address = txtFieldAddress.getText();
                
                String type = cbBox1.getSelectedItem().toString();

                if(name.isEmpty() || address.isEmpty()){
                    throw new EmptyValueException();
                }

                BaseModel1 data = new BaseModel1(
                    id,
                    name,
                    address,
                    type
                );
                tableModel.setValueAt(id, row, 0);
                tableModel.setValueAt(name, row, 1);
                tableModel.setValueAt(address, row, 2);
                tableModel.setValueAt(type, row, 3);

                listData.set(row, data);
                editting = false;
                buttonState(true);
                jTable1.clearSelection();
            } catch (EmptyValueException ex) {
                JOptionPane.showMessageDialog(this, "Không để trống thông tin");
                txtFieldName.requestFocus();
            } 

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int currentRow = jTable1.getSelectedRow();
        if(currentRow<0 || currentRow > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng");
        } else{
            txtFieldId.setText(tableModel.getValueAt(currentRow, 0).toString());
            
            txtFieldName.setText(tableModel.getValueAt(currentRow, 1).toString());
            
            txtFieldAddress.setText(tableModel.getValueAt(currentRow, 2).toString());
            
            String type = tableModel.getValueAt(currentRow, 3).toString();
            
            for(int i=0;i<cbBox1.getItemCount(); i++){
                if(cbBox1.getItemAt(i).toString().equalsIgnoreCase(type)){
                    cbBox1.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
        if(adding){
            adding = false;
        }
        buttonState(true);

    }//GEN-LAST:event_btnSkipActionPerformed

    private void cbBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBox1ActionPerformed

    private void txtFieldSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldSearchKeyTyped
        txtFieldSearch.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) {
          search();
        }
        public void removeUpdate(DocumentEvent e) {
          search();
        }
        public void insertUpdate(DocumentEvent e) {
          search();
        }

        public void search() {
            String keySearch = txtFieldSearch.getText().trim().toLowerCase();
            List<BaseModel1> listResult = new ArrayList<>();
            for(BaseModel1 i : listData){
                if(
                    (i.getName().toLowerCase().contains(keySearch)) || 
                    (i.getAddress().toLowerCase().contains(keySearch))
                ){
                    listResult.add(i);
                }
            }
            showData(listResult);
        }
      });
    }//GEN-LAST:event_txtFieldSearchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSaveToFile;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowFromFile;
    private javax.swing.JButton btnSkip;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFieldAddress;
    private javax.swing.JTextField txtFieldId;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldSearch;
    // End of variables declaration//GEN-END:variables
}
