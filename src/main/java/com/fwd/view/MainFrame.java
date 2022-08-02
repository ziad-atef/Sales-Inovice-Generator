/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fwd.view;

import com.fwd.model.InoviceHeader;
import com.fwd.model.InoviceLine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ziada
 */
public class MainFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener{

    ArrayList<InoviceHeader> FileData;
    InoviceHeader SelectedRow;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        FileData = new ArrayList<>();
        SelectedRow = null;
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
        HeaderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        InoviceNumber = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InoviceTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DateTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        NameTextPane = new javax.swing.JTextPane();
        CreateNewInoviceButton = new javax.swing.JButton();
        DeleteInoviceButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        LineTable = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        LoadMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SaveMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Inovice Generator");
        setFocusTraversalPolicyProvider(true);

        HeaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Costumer", "Total"
            }
        ));
        HeaderTable.setName("HeaderTable"); // NOI18N
        HeaderTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        HeaderTable.getSelectionModel().addListSelectionListener(this);
        jScrollPane1.setViewportView(HeaderTable);

        jLabel1.setText("Inovice Number");

        InoviceNumber.setText("N/A");

        jLabel3.setText("Inovice Date");

        jLabel4.setText("Customer name");

        jLabel5.setText("Inovice total");

        InoviceTotal.setText("N/A");

        jScrollPane2.setViewportView(DateTextPane);

        jScrollPane3.setViewportView(NameTextPane);

        CreateNewInoviceButton.setText("Create new inovice");

        DeleteInoviceButton.setText("Delete inovice");
        DeleteInoviceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInoviceButtonActionPerformed(evt);
            }
        });

        LineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item name", "Item price", "Count", "Item total"
            }
        ));
        LineTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(LineTable);

        SaveButton.setText("Save");

        CancelButton.setText("Cancel");

        jLabel7.setText("Inovice table:");

        jLabel8.setText("Inovice items:");

        FileMenu.setText("File");

        LoadMenuItem.setText("Load File");
        FileMenu.add(LoadMenuItem);
        LoadMenuItem.addActionListener(this);
        FileMenu.add(jSeparator1);

        SaveMenuItem.setText("Save File");
        FileMenu.add(SaveMenuItem);

        jMenuBar1.add(FileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(CreateNewInoviceButton)
                                .addGap(58, 58, 58)
                                .addComponent(DeleteInoviceButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(42, 42, 42)
                                        .addComponent(InoviceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(InoviceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addContainerGap(23, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SaveButton)
                                .addGap(79, 79, 79)
                                .addComponent(CancelButton)
                                .addGap(69, 69, 69))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(InoviceNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InoviceTotal)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteInoviceButton)
                    .addComponent(CreateNewInoviceButton)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        SaveButton.addActionListener(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteInoviceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInoviceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteInoviceButtonActionPerformed


    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CreateNewInoviceButton;
    private javax.swing.JTextPane DateTextPane;
    private javax.swing.JButton DeleteInoviceButton;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JTable HeaderTable;
    private javax.swing.JLabel InoviceNumber;
    private javax.swing.JLabel InoviceTotal;
    private javax.swing.JTable LineTable;
    private javax.swing.JMenuItem LoadMenuItem;
    private javax.swing.JTextPane NameTextPane;
    private javax.swing.JButton SaveButton;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getActionCommand().equals("Load File") )
        {
            try{
                loadFile();
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
        }
        else if( e.getActionCommand().equals("Save File") ){}
        else if( e.getActionCommand().equals("Create new inovic") ){}
        else if( e.getActionCommand().equals("Delete inovice") ){
            if( SelectedRow != null){
                for(InoviceHeader Header : FileData){
                    if(Header.getInoviceNumber() == SelectedRow.getInoviceNumber()){
                        FileData.remove(Header);
                        break;
                    }
                }
                updateHeaderTable(FileData);
            }
        }
        else if( e.getActionCommand().equals("Save") ){
            Date InoviceDate = null;
            try{
            InoviceDate = new SimpleDateFormat("dd-MM-yyyy").parse( DateTextPane.getText() );
            JOptionPane.showMessageDialog(this, InoviceDate, "Test", JOptionPane.INFORMATION_MESSAGE); 

            }catch(Exception ex){}
            String CustomerName = NameTextPane.getText();
            
            if(SelectedRow != null){
                SelectedRow.setCustomerName(CustomerName);
                SelectedRow.setDate(InoviceDate);
            }
            
            updateHeaderTable(FileData);
            JOptionPane.showMessageDialog(this, "Save", "Test", JOptionPane.INFORMATION_MESSAGE);
        }
        else if( e.getActionCommand().equals("Cancel") ){}
        else
            JOptionPane.showMessageDialog(this, "Test", "Test", JOptionPane.INFORMATION_MESSAGE);   
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int RowNum = HeaderTable.getSelectedRow();
        int InvNum = (Integer)HeaderTable.getModel().getValueAt(RowNum, 0);
        
        for(InoviceHeader Header : FileData){
            if(Header.getInoviceNumber() == InvNum)
            {
                SelectedRow = Header;
                break;
            }
        }
        
        updateHeaderLabels(SelectedRow);
        updateLineTable(SelectedRow.getLines());
        JOptionPane.showMessageDialog(this, InvNum, "Header File", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void loadFile() throws Exception{
        FileData.clear();
        JFileChooser window = new JFileChooser();
        JOptionPane.showMessageDialog(this, "Please choose header file", "Header File", JOptionPane.INFORMATION_MESSAGE);
        int option = window.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            File ChoosenFile = window.getSelectedFile();
            FileReader Reader = new FileReader(ChoosenFile);
            BufferedReader Buffer = new BufferedReader(Reader);
            String Line = Buffer.readLine();
            
            while(Line != null){
                String [] Content = Line.split(",");
    
                int invNum = Integer.parseInt(Content[0]);
                Date invDate = new SimpleDateFormat("dd-MM-yyyy").parse(Content[1]);
                String CostumerName = Content[2];
                
                InoviceHeader Header = new InoviceHeader(invNum, invDate, CostumerName);
                FileData.add(Header);
                Line = Buffer.readLine();
            }
            Buffer.close();
            Reader.close();
            
            JOptionPane.showMessageDialog(this, "Please choose line file", "Header File", JOptionPane.INFORMATION_MESSAGE);
            option = window.showOpenDialog(this);
            if(option == JFileChooser.APPROVE_OPTION){
                ChoosenFile = window.getSelectedFile();
                Reader = new FileReader(ChoosenFile);
                Buffer = new BufferedReader(Reader);
                Line = Buffer.readLine();
                
                while(Line != null){
                    String [] Content = Line.split(",");

                    int InvNum = Integer.parseInt(Content[0]);
                    String ItemName = Content[1];
                    float ItemPrice = Integer.parseInt(Content[2]);
                    int ItemCount = Integer.parseInt(Content[3]);

                    InoviceLine InvLine = new InoviceLine(InvNum, ItemName, ItemPrice, ItemCount);
                    for(InoviceHeader Header: FileData){
                        if(Header.getInoviceNumber() == InvNum)
                        {
                            Header.addLine(InvLine);
                        }
                    }
                    
                    Line = Buffer.readLine();
                }
                Buffer.close();
                Reader.close();
            }
        }
        updateHeaderTable(FileData);
    }

    private void updateHeaderTable(ArrayList<InoviceHeader> Headers){
        String[] col = {"No.", "Date", "Costumer", "Total"};
        //String[] col = new String [] {"No.", "Date", "Costumer", "Total"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        
        for(InoviceHeader Header: FileData){
            Object[] obj = {Header.getInoviceNumber(), Header.getInoviceDate(), Header.getCustomerName(), Header.getTotal()};
            tableModel.addRow(obj);
            HeaderTable.setModel(tableModel);
        }
    }
    
    private void updateLineTable(ArrayList<InoviceLine> Lines){
        String[] col = {"No.", "Item name", "Item price", "Count", "Item total"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        for(InoviceLine Line: Lines){
            
            Object[] obj = {Line.getInoviceNumber(), Line.getItemName(), Line.getItemPrice(), Line.getItemCount(), Line.getItemTotal()};
            tableModel.addRow(obj);
            LineTable.setModel(tableModel);
        }
    }

    private void updateHeaderLabels(InoviceHeader SelectedHeader) {
        InoviceNumber.setText(Integer.toString(SelectedHeader.getInoviceNumber()));
        InoviceTotal.setText(Float.toString(SelectedHeader.getTotal()));
    }
}
