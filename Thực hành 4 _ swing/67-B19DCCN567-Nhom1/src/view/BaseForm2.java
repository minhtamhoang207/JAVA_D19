package view;

import controller.EmptyValueException;
import controller.IOFile;
import controller.NegativeNumException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.BaseModel1;
import model.BaseModel2;

public class BaseForm2 extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    private boolean adding, editting;
    private String filePath;
    private List<BaseModel2> listData;
    public BaseForm2() {
        initComponents();
        String[] cols = {"Mã ngân hàng", "Tên ngân hàng", "Lãi xuất (theo năm)"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable1.setModel(tableModel);
        txtFieldId.setEditable(false);
        buttonState(true);
        adding = false;
        editting = false;
        filePath = "src/controller/NH.DAT";
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
    
    private void showData(List<BaseModel2> list){
        tableModel.setRowCount(0);
        for(BaseModel2 i : list){
            tableModel.addRow(i.toObjects());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtFieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAddNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSkip = new javax.swing.JButton();
        btnShowFromFile = new javax.swing.JButton();
        txtFieldId = new javax.swing.JTextField();
        btnSaveToFile = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFieldLaiXuat = new javax.swing.JTextField();

        txtFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNameActionPerformed(evt);
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

        txtFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldSearchKeyTyped(evt);
            }
        });

        jLabel1.setText("Mã");

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên");

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

        btnSkip.setText("Bỏ qua");
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipActionPerformed(evt);
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

        jLabel3.setText("Lãi suất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFieldSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
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
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnShowFromFile, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFieldLaiXuat, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFieldName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
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
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldLaiXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int currentRow = jTable1.getSelectedRow();
        if(currentRow<0 || currentRow > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngân hàng");
        } else{
            txtFieldId.setText(tableModel.getValueAt(currentRow, 0).toString());

            txtFieldName.setText(tableModel.getValueAt(currentRow, 1).toString());

            txtFieldLaiXuat.setText(tableModel.getValueAt(currentRow, 2).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keySearch = txtFieldSearch.getText().trim().toLowerCase();
        List<BaseModel2> listResult = new ArrayList<>();
        for(BaseModel2 i : listData){
            if(
                (i.getName().toLowerCase().contains(keySearch))
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
            BaseModel2.setSma(listData.get(listData.size()-1).getId()+1);
        } else{
            listData = new ArrayList<>();
        }
        txtFieldId.setText(BaseModel2.getSma()+"");
        txtFieldName.requestFocus();
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int row = jTable1.getSelectedRow();
        if( row < 0 || row > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Chọn ngân hàng để sửa");
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

    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
        if(adding){
            adding = false;
        }
        buttonState(true);
    }//GEN-LAST:event_btnSkipActionPerformed

    private void btnShowFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFromFileActionPerformed
        try{
            initData();
            tableModel.setRowCount(0);
            for(BaseModel2 bm: listData){
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
                
                int laiXuat = Integer.parseInt(txtFieldLaiXuat.getText());

                if(name.isEmpty()){
                    throw new EmptyValueException();
                }
                if(laiXuat <= 0){
                    throw new NegativeNumException();
                }

                BaseModel2 data = new BaseModel2(
                   id,
                   name,
                   laiXuat
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
            } catch (NegativeNumException ex) {
                JOptionPane.showMessageDialog(this, "Lãi xuất bao gồm số và > 0");
                txtFieldLaiXuat.requestFocus();
            }  catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Lãi xuất bao gồm số và > 0");
                txtFieldLaiXuat.requestFocus();
            }
        }
        if(editting){
            try{
                int row = jTable1.getSelectedRow();

                int id = Integer.parseInt(txtFieldId.getText());
                
                String name = txtFieldName.getText();
                
                int laiXuat = Integer.parseInt(txtFieldLaiXuat.getText());

                if(name.isEmpty()){
                    throw new EmptyValueException();
                }
                if(laiXuat <= 0){
                    throw new NegativeNumException();
                }

                BaseModel2 data = new BaseModel2(
                   id,
                   name,
                   laiXuat
                );
                tableModel.setValueAt(id, row, 0);
                tableModel.setValueAt(name, row, 1);
                tableModel.setValueAt(laiXuat, row, 2);
                listData.set(row, data);
                editting = false;
                buttonState(true);
                jTable1.clearSelection();
            } catch (EmptyValueException ex) {
                JOptionPane.showMessageDialog(this, "Không để trống thông tin");
                txtFieldName.requestFocus();
            } catch (NegativeNumException ex) {
                JOptionPane.showMessageDialog(this, "Lãi xuất bao gồm số và > 0");
                txtFieldLaiXuat.requestFocus();
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Lãi xuất bao gồm số và > 0");
                txtFieldLaiXuat.requestFocus();
            }

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            List<BaseModel2> listResult = new ArrayList<>();
            for(BaseModel2 i : listData){
                if(
                    (i.getName().toLowerCase().contains(keySearch)) 
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFieldId;
    private javax.swing.JTextField txtFieldLaiXuat;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldSearch;
    // End of variables declaration//GEN-END:variables
}
