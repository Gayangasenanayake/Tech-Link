/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supermarket;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class warrenty extends javax.swing.JFrame {

    java.util.Date date;
    /**
     * Creates new form Category
     */
    public warrenty() {
        initComponents();
        table_update();
    }
    
    Connection con1;
    PreparedStatement pdst;
    ResultSet rs;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        itmcod_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        datetxt = new com.toedter.calendar.JDateChooser();
        qtytxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        itmnme_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cat_table = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setForeground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Brand");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Item");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bill");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cashier");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EXIT");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Category");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Customer");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Repair");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Supplier");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Return warrenty");

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Item NO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Date");

        itmcod_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itmcod_txtKeyPressed(evt);
            }
        });

        add_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_btn.setText("Return Item");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_btn.setText("delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_btn.setText("update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        datetxt.setDateFormatString("yyyy-MM-dd");

        qtytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtytxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Quantity");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Item");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel8))
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(qtytxt)
                            .addComponent(itmcod_txt)
                            .addComponent(itmnme_txt))))
                .addGap(18, 18, 18)
                .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(itmcod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(itmnme_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cat_table.setBackground(new java.awt.Color(102, 153, 255));
        cat_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Item_NO", "Item", "Qty", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cat_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cat_table);

        jLabel19.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel19.setText("Tech Link");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void check(){
        itmcod_txt.setText("");
        
    }
    private void table_update(){
        
        try {
            int c;
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1=DriverManager.getConnection("jdbc:mysql://localhost/supermrket","root","531531");
                pdst=con1.prepareStatement("select * from supermrket.warrenty_return");
                ResultSet rs=pdst.executeQuery();
                ResultSetMetaData rsmd=rs.getMetaData();
                c=rsmd.getColumnCount();
                
                DefaultTableModel d1=(DefaultTableModel)cat_table.getModel();
                d1.setRowCount(0);
                
                while(rs.next()){
                    Vector v1=new Vector();
                    for(int i=1;i<=c;i++){ 
                        v1.add(rs.getString("id"));
                        v1.add(rs.getString("item_NO"));
                        v1.add(rs.getString("item_name"));
                        v1.add(rs.getString("qty"));
                        v1.add(rs.getString("date"));
                    }
                    d1.addRow(v1);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(warrenty.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(warrenty.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed

                
            DefaultTableModel d2=(DefaultTableModel)cat_table.getModel();
            int select_index=cat_table.getSelectedRow();
            int id=Integer.parseInt(d2.getValueAt(select_index,0).toString());   
            int msgresult=JOptionPane.showConfirmDialog(null,"Are you sure to delete!","warning",JOptionPane.YES_NO_OPTION);    
            if(msgresult == JOptionPane.YES_OPTION)
            {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    try {
                        con1=DriverManager.getConnection("jdbc:mysql://localhost/supermrket","root","531531");
                        pdst=con1.prepareStatement("delete from warrenty_return where id=?");
                        pdst.setInt(1,id);
                        pdst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"deleted!");
                        table_update();
                        itmcod_txt.setText("");
                        
                    
                    } catch (SQLException ex) {
                        Logger.getLogger(warrenty.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(warrenty.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_delete_btnActionPerformed
    
      
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        //stockUpdate();
        
        String itmcode=itmcod_txt.getText();
        String itm_name=itmnme_txt.getText();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String date1=sdf.format(datetxt.getDate());
        String qty=qtytxt.getText();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/supermrket","root","531531");
            pdst=con1.prepareStatement("insert into warrenty_return(item_NO,item_name,qty,date)values(?,?,?,?)");
            pdst.setString(1,itmcode);
            pdst.setString(2,itm_name);
            pdst.setString(3,qty);
            pdst.setString(4,date1);
            pdst.executeUpdate();
            JOptionPane.showMessageDialog(null,"added data!");
            table_update();
            itmcod_txt.setText("");
            itmnme_txt.setText("");
            qtytxt.setText("");
            datetxt.setDate(null);
            
                    } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(warrenty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void cat_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel d2=(DefaultTableModel)cat_table.getModel();
        int select_index=cat_table.getSelectedRow();
        
        itmcod_txt.setText(d2.getValueAt(select_index,1).toString());
        itmnme_txt.setText(d2.getValueAt(select_index,2).toString());
        qtytxt.setText(d2.getValueAt(select_index,3).toString());
        
        
        try {
         int raw = cat_table.getSelectedRow();
         date =  new SimpleDateFormat("yyyy-MM-dd").parse((String)d2.getValueAt(raw,4));
         datetxt.setDate(date);
     } catch (ParseException ex) {
         Logger.getLogger(item.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }//GEN-LAST:event_cat_tableMouseClicked

    
    
    
    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        
        try {                                         
            
            DefaultTableModel d2=(DefaultTableModel)cat_table.getModel();
            int select_index=cat_table.getSelectedRow();
            
            int id=Integer.parseInt(d2.getValueAt(select_index,0).toString());
            String itmno=itmcod_txt.getText();
            String itme=itmcod_txt.getText();
            String qty=itmcod_txt.getText();
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
            String date1=sdf.format(datetxt.getDate());
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1=DriverManager.getConnection("jdbc:mysql://localhost/supermrket","root","531531");
                pdst=con1.prepareStatement("update warrenty_return set item_NO=?,item_name=?,qty=?,date=? where id=?");
                pdst.setString(1,itmno);
                pdst.setString(2,itme);
                pdst.setString(3,qty);
                pdst.setString(4,date1);
                pdst.setInt(5,id);
                pdst.executeUpdate();
                JOptionPane.showMessageDialog(null,"updtaed data!");
                table_update();
                itmcod_txt.setText("");
                itmnme_txt.setText("");
                qtytxt.setText("");
                datetxt.setDate(null);
                
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(warrenty.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(warrenty.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_update_btnActionPerformed

    
    
    
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        warrenty c=new warrenty();
        this.hide();
        c.setVisible(true);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        brand b=new brand();
        this.hide();
        b.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        item i=new item();
        this.hide();
        i.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         bill bi=new bill();
        this.hide();
        bi.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        cashier c=new cashier();
        this.hide();
        c.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int msgresult=JOptionPane.showConfirmDialog(null,"Are you sure to exit!","warning",JOptionPane.YES_NO_OPTION);    
            if(msgresult == JOptionPane.YES_OPTION){
                System.exit(0);
            }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Customers cu=new Customers();
        this.hide();
        cu.setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        suppliers s=new suppliers();
        this.hide();
        s.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        repair r=new repair();
        this.hide();
        r.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void qtytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtytxtActionPerformed

    private void itmcod_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itmcod_txtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String itm_code=itmcod_txt.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1=DriverManager.getConnection("jdbc:mysql://localhost/supermrket","root","531531");
                pdst=con1.prepareStatement("select * from item  where barcode=? or item_code=?");
                pdst.setString(1,itm_code);
                pdst.setString(2,itm_code);
                rs=pdst.executeQuery();
                
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(this,"Not vlid Item Code");
                }
                else{
                    String itm_name=rs.getString("item");
                    
                    
                    itmnme_txt.setText(itm_name.trim());
                    
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
    }//GEN-LAST:event_itmcod_txtKeyPressed

    
    private void stockUpdate(){
    
        String bcode=itmcod_txt.getText();
        int qty2=Integer.parseInt(qtytxt.getText());
        int qty1=0;
        int qty=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/supermrket","root","531531");
                pdst=con1.prepareStatement("select * from item where barcode=?");
                pdst.setString(1,bcode);
                rs=pdst.executeQuery();
               
                while(rs.next()){
                    qty1=rs.getInt("qty");
                    qty=qty1-qty2;
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1=DriverManager.getConnection("jdbc:mysql://localhost/supermrket","root","531531");
                pdst=con1.prepareStatement("update item set qty=? where barcode=?");
                
                pdst.setInt(1,qty);
                pdst.setString(2,bcode);
                pdst.executeUpdate();
                
                } 
                //JOptionPane.showMessageDialog(null,"Stock updated!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }  
    

    
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
            java.util.logging.Logger.getLogger(warrenty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(warrenty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(warrenty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(warrenty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new warrenty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTable cat_table;
    private com.toedter.calendar.JDateChooser datetxt;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField itmcod_txt;
    private javax.swing.JTextField itmnme_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qtytxt;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}