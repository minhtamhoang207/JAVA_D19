package view;

import controller.EmptyValueException;
import controller.IOFile;
import controller.MonthException;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.BaseModel1;
import model.BaseModel2;
import model.BaseModel3;

public class BaseForm3 extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    private String filePath;
    private List<BaseModel3> listData;
    
    String path1;
    String path2;
        
    private List<BaseModel1> listM1;
    private List<BaseModel2> listM2;
    
    public BaseForm3() {
        initComponents();
        String[] cols = {"Mã khách hàng", "Họ tên", "Mã ngân hàng", "Tên ngân hàng", "Tháng gửi", "Số tiền gửi", "Thời gian"};
        tableModel = new DefaultTableModel(cols, 0);
        jTable1.setModel(tableModel);
        filePath = "src/controller/STK.DAT";
        path1 = "src/controller/KH.DAT";
        path2 = "src/controller/NH.DAT";
        initData();
        loadIdtoBox();
    }
    
    private void initData(){ 
        File file = new File(filePath);
        if(file.exists()){
           listData = IOFile.doc(filePath);
        } else{
            listData = new ArrayList<>();
        }
        
        File fileM1 = new File(path1);
        if(fileM1.exists()){
           listM1 = IOFile.doc(path1);
        } else{
           listM1 = new ArrayList<>();
        }
        
        File fileM2 = new File(path2);
        if(fileM2.exists()){
           listM2 = IOFile.doc(path2);
        } else{
            listM2 = new ArrayList<>();
        }
    }
    
    private void loadIdtoBox(){
        cbBoxId1.removeAllItems();
        cbBoxId2.removeAllItems();
       
        for(BaseModel1 i : listM1){
            cbBoxId1.addItem(i.getId()+ "");
        }
        
        for(BaseModel2 i : listM2){
           cbBoxId2.addItem(i.getId()+ "");
        }
    }
    
//    private boolean duplicateId(int personID, int thingsID ){
//        for(BaseModel3 i: listData){
//                if(i.getReader().getId() == personID && i.getBook().getMa() == thingsID){
//                    return true;
//                }
//        }
//        return false;
//    }
    
//    private int countBook(int thingsID){
//        int count = 0;
//        for(BaseModel3 i : listData){
////            if(i.getReader().getId() == thingsID){
////                count++;
////            }
//        }
//        return count;
//    }
            
    private BaseModel1 getPersonByID(int id){
        for(BaseModel1 i: listM1){
                if(i.getId()== id){
                    return i;
                }
            }
        return null;
    }
    
    private BaseModel2 getThingsByID(int id){
        for(BaseModel2 i: listM2){
                if(i.getId()== id){
                    return i;
                }
            }
        return null;
    }
    
    private void showData(List<BaseModel3> list){
        tableModel.setRowCount(0);
        for(BaseModel3 i : list){
            tableModel.addRow(i.toObjects());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldSearch = new javax.swing.JTextField();
        cbBoxId1 = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        cbBoxId2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaShowFinalResult = new javax.swing.JTextArea();
        txtFieldMonth = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSaveToFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbBoxSortType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFieldMoney = new javax.swing.JTextField();

        txtFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldSearchKeyTyped(evt);
            }
        });

        cbBoxId1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cbBoxId2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtAreaShowFinalResult.setColumns(20);
        txtAreaShowFinalResult.setRows(5);
        jScrollPane2.setViewportView(txtAreaShowFinalResult);

        txtFieldMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldMonthActionPerformed(evt);
            }
        });

        btnCalculate.setText("Thống kê");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTable1);

        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnShow.setText("HIển thị");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã khách hàng");

        btnSaveToFile.setText("Lưu vào file");
        btnSaveToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToFileActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã ngân hàng");

        cbBoxSortType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Lựa chọn sắp xếp ---", "Sắp xếp theo tên", "Sắp xếp theo số tiền gửi" }));
        cbBoxSortType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBoxSortTypeItemStateChanged(evt);
            }
        });

        jLabel3.setText("Tháng gửi");

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel4.setText("Tiền gửi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFieldSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbBoxId1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbBoxId2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbBoxSortType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFieldMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtFieldMoney))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbBoxId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbBoxId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFieldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFieldMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnShow))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveToFile)
                            .addComponent(btnDelete))
                        .addGap(10, 10, 10)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cbBoxSortType, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keySearch = txtFieldSearch.getText().trim().toLowerCase();
        List<BaseModel3> listResult = new ArrayList<>();
        for(BaseModel3 i : listData){
            if((i.getCustomer().getName().toLowerCase().contains(keySearch))
                || (i.getBank().getName().toLowerCase().contains(keySearch))){
                listResult.add(i);
            }
        }
        showData(listResult);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtFieldMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldMonthActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
//        Map<String, Integer> map = listData.stream().
//        collect(Collectors.groupingBy(QLSModel::getIdAndName,
//            Collectors.summingInt(QLSModel::getAmount)));
//        
//        txtAreaShowFinalResult.setText("Ban doc\t\t Tong so sach muon");
//        
//        map.forEach((K,V)->{
//            txtAreaShowFinalResult.append("\n"+K+"\t\t"+V);
//        });
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        initData();
        loadIdtoBox();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            int personID = Integer.parseInt(cbBoxId1.getSelectedItem().toString());

            int thingsID = Integer.parseInt(cbBoxId2.getSelectedItem().toString());

            int month = Integer.parseInt(txtFieldMonth.getText());
            
            double money = Double.parseDouble(txtFieldMoney.getText());

            DateFormat dateFormat;
            dateFormat = new SimpleDateFormat("dd/MM/yyy");
            
            if(month < 1 || month>12){
                throw new MonthException();
            }

            BaseModel3 item = new BaseModel3(
                getPersonByID(personID),
                getThingsByID(thingsID),
                money,
                month,
                dateFormat.format(new Date())
            );

            tableModel.addRow(item.toObjects());

            listData.add(item);

            IOFile.viet(path1, listM1);

        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Số tiền phải >0 và là số thực");
            txtFieldMoney.requestFocus();
        } catch (MonthException ex) {
            JOptionPane.showMessageDialog(this, "Số tháng > 1 và < 12");
            txtFieldMonth.requestFocus();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        File file = new File(filePath);
        if(file.exists()){
            listData = IOFile.doc(filePath);
            tableModel.setRowCount(0);
            for(BaseModel3 i : listData){
                tableModel.addRow(i.toObjects());
            }
        } else{
            JOptionPane.showMessageDialog(this, "Chưa có dữ liệu vui lòng nhập thêm");
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSaveToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToFileActionPerformed
        IOFile.viet(filePath, listData);
        JOptionPane.showMessageDialog(this, "Đã lưu tại: " + filePath);
    }//GEN-LAST:event_btnSaveToFileActionPerformed

    private void cbBoxSortTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBoxSortTypeItemStateChanged
        if(cbBoxSortType.getSelectedIndex() == 1){
            listData.sort( new Comparator<BaseModel3>(){
                @Override
                public int compare(BaseModel3 o1, BaseModel3 o2) {
                    String[] name1 = o1.getCustomer().getName().split("\\s+");
                    String[] name2 = o2.getCustomer().getName().split("\\s+");
                    if(name1[name1.length-1].equalsIgnoreCase(name2[name2.length-1])){
                        return o1.getCustomer().getName().compareToIgnoreCase(o2.getCustomer().getName());
                    } else{
                        return name1[name1.length-1].compareToIgnoreCase(name2[name2.length-1]);
                    }
                }
            });
        }
        if(cbBoxSortType.getSelectedIndex() == 2){
            listData.sort(new Comparator<BaseModel3>(){
                @Override
                public int compare(BaseModel3 o1, BaseModel3 o2) {
                    return Double.compare(o1.getMoney(), o2.getMoney());
                }
            });
        }
        tableModel.setRowCount(0);
        for(BaseModel3 i : listData){
            tableModel.addRow(i.toObjects());
        }

    }//GEN-LAST:event_cbBoxSortTypeItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int currentRow = jTable1.getSelectedRow();
        if(currentRow<0 || currentRow > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn STK để xóa");
        } else{
            tableModel.removeRow(currentRow);
            listData.remove(currentRow);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            List<BaseModel3> listResult = new ArrayList<>();
            for(BaseModel3 i : listData){
                if((i.getCustomer().getName().toLowerCase().contains(keySearch))
                    || (i.getBank().getName().toLowerCase().contains(keySearch))){
                    listResult.add(i);
                }
            }
            showData(listResult);
        }
      });
    }//GEN-LAST:event_txtFieldSearchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSaveToFile;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cbBoxId1;
    private javax.swing.JComboBox<String> cbBoxId2;
    private javax.swing.JComboBox<String> cbBoxSortType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtAreaShowFinalResult;
    private javax.swing.JTextField txtFieldMoney;
    private javax.swing.JTextField txtFieldMonth;
    private javax.swing.JTextField txtFieldSearch;
    // End of variables declaration//GEN-END:variables
}
