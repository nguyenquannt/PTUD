package gui;

import dao.Revenue_Statistics_DAO;
import entity.Product;
import entity.Revenue_Statistics;
import java.awt.Color;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import lib2.ModelChart;
import lib2.TableCustom;

public class Revenue_Statistics_GUI extends javax.swing.JPanel {

    private Revenue_Statistics_DAO revenue_Statistics_DAO = new Revenue_Statistics_DAO();
    private DefaultTableModel defaultTableModel;
    public Revenue_Statistics_GUI() {
        initComponents();
        
        TableCustom.apply(jspTable, TableCustom.TableType.DEFAULT);
        defaultTableModel = (DefaultTableModel) jTable.getModel();
        ListSelectionModel selectionModel = jTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

//        load data to panel
        loadDataToPanel();
        setAllYearToCBB();
        
        int year = Integer.parseInt(cbChooserTable.getSelectedItem().toString());
        loadDataToTable(year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTop = new javax.swing.JPanel();
        jpCard1 = new javax.swing.JPanel();
        jlCard1Title = new javax.swing.JLabel();
        jlNumOrder = new javax.swing.JLabel();
        jlCard1Unit = new javax.swing.JLabel();
        jlIconOrder = new javax.swing.JLabel();
        jpCard2 = new javax.swing.JPanel();
        jlIconMoneyDay = new javax.swing.JLabel();
        jlCard2Title = new javax.swing.JLabel();
        jlMoneyDay = new javax.swing.JLabel();
        jpCard3 = new javax.swing.JPanel();
        jlIconMoneyMonth = new javax.swing.JLabel();
        jlCard3Title = new javax.swing.JLabel();
        jlMoneyMonth = new javax.swing.JLabel();
        jpCard4 = new javax.swing.JPanel();
        jlIconMoneyYear = new javax.swing.JLabel();
        jlCard14Title = new javax.swing.JLabel();
        jlMoneyYear = new javax.swing.JLabel();
        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jlChooserYear = new javax.swing.JLabel();
        cbChooserChart = new lib2.ComboBoxSuggestion();
        jPanel4 = new javax.swing.JPanel();
        jpChart = new lib2.Chart();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        cbChooserTable = new lib2.ComboBoxSuggestion();
        jlChooserYear2 = new javax.swing.JLabel();
        jlTitle2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jspTable = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPTop.setLayout(new javax.swing.BoxLayout(jPTop, javax.swing.BoxLayout.LINE_AXIS));

        jpCard1.setBackground(new java.awt.Color(204, 204, 255));
        jpCard1.setForeground(new java.awt.Color(255, 255, 255));
        jpCard1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlCard1Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard1Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard1Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard1Title.setText("Tổng số đơn hàng hôm nay");

        jlNumOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlNumOrder.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlNumOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlNumOrder.setText("0");

        jlCard1Unit.setBackground(new java.awt.Color(255, 255, 255));
        jlCard1Unit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlCard1Unit.setForeground(new java.awt.Color(255, 255, 255));
        jlCard1Unit.setText("Đơn hàng");

        jlIconOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/market64.png"))); // NOI18N

        javax.swing.GroupLayout jpCard1Layout = new javax.swing.GroupLayout(jpCard1);
        jpCard1.setLayout(jpCard1Layout);
        jpCard1Layout.setHorizontalGroup(
            jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard1Layout.createSequentialGroup()
                        .addComponent(jlCard1Title)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jpCard1Layout.createSequentialGroup()
                        .addComponent(jlNumOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCard1Unit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlIconOrder)))
                .addContainerGap())
        );
        jpCard1Layout.setVerticalGroup(
            jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard1Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumOrder)
                    .addComponent(jlCard1Unit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jlIconOrder)
                .addContainerGap())
        );

        jPTop.add(jpCard1);

        jpCard2.setBackground(new java.awt.Color(255, 204, 255));

        jlIconMoneyDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/day64.png"))); // NOI18N

        jlCard2Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard2Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard2Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard2Title.setText("Tổng doanh thu hôm nay");

        jlMoneyDay.setBackground(new java.awt.Color(255, 255, 255));
        jlMoneyDay.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlMoneyDay.setForeground(new java.awt.Color(255, 255, 255));
        jlMoneyDay.setText("0");

        javax.swing.GroupLayout jpCard2Layout = new javax.swing.GroupLayout(jpCard2);
        jpCard2.setLayout(jpCard2Layout);
        jpCard2Layout.setHorizontalGroup(
            jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCard2Title, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addComponent(jlMoneyDay, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyDay)
                        .addContainerGap())))
        );
        jpCard2Layout.setVerticalGroup(
            jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard2Title)
                .addGroup(jpCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addComponent(jlMoneyDay)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpCard2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyDay)))
                .addContainerGap())
        );

        jPTop.add(jpCard2);

        jpCard3.setBackground(new java.awt.Color(153, 204, 255));

        jlIconMoneyMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/mounth64.png"))); // NOI18N

        jlCard3Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard3Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard3Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard3Title.setText("Tổng doanh thu tháng này");

        jlMoneyMonth.setBackground(new java.awt.Color(255, 255, 255));
        jlMoneyMonth.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlMoneyMonth.setForeground(new java.awt.Color(255, 255, 255));
        jlMoneyMonth.setText("0");

        javax.swing.GroupLayout jpCard3Layout = new javax.swing.GroupLayout(jpCard3);
        jpCard3.setLayout(jpCard3Layout);
        jpCard3Layout.setHorizontalGroup(
            jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addComponent(jlCard3Title)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addComponent(jlMoneyMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyMonth)))
                .addContainerGap())
        );
        jpCard3Layout.setVerticalGroup(
            jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard3Title)
                .addGroup(jpCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlMoneyMonth)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyMonth)
                        .addContainerGap())))
        );

        jPTop.add(jpCard3);

        jpCard4.setBackground(new java.awt.Color(0, 204, 204));

        jlIconMoneyYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/year64.png"))); // NOI18N

        jlCard14Title.setBackground(new java.awt.Color(255, 255, 255));
        jlCard14Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlCard14Title.setForeground(new java.awt.Color(255, 255, 255));
        jlCard14Title.setText("Tổng doanh thu năm nay");

        jlMoneyYear.setBackground(new java.awt.Color(255, 255, 255));
        jlMoneyYear.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlMoneyYear.setForeground(new java.awt.Color(255, 255, 255));
        jlMoneyYear.setText("0");

        javax.swing.GroupLayout jpCard4Layout = new javax.swing.GroupLayout(jpCard4);
        jpCard4.setLayout(jpCard4Layout);
        jpCard4Layout.setHorizontalGroup(
            jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCard4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCard4Layout.createSequentialGroup()
                        .addComponent(jlCard14Title)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jpCard4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlIconMoneyYear))
                    .addComponent(jlMoneyYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpCard4Layout.setVerticalGroup(
            jpCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCard4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCard14Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMoneyYear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconMoneyYear)
                .addContainerGap())
        );

        jPTop.add(jpCard4);

        add(jPTop, java.awt.BorderLayout.PAGE_START);

        jTabbedPaneMain.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlTitle.setText("Thống kê doanh thu");

        jlChooserYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlChooserYear.setText("Hãy chọn năm muốn thống kê");

        cbChooserChart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbChooserChart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooserChartItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(40, 40, 40))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbChooserChart, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlChooserYear))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jlTitle)
                .addGap(18, 18, 18)
                .addComponent(jlChooserYear)
                .addGap(18, 18, 18)
                .addComponent(cbChooserChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpChart, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpChart, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Dạng biểu đồ", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbChooserTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbChooserTable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooserTableItemStateChanged(evt);
            }
        });

        jlChooserYear2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlChooserYear2.setText("Hãy chọn năm muốn thống kê");

        jlTitle2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlTitle2.setText("Thống kê doanh thu");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle2)
                .addGap(40, 40, 40))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbChooserTable, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlChooserYear2))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jlTitle2)
                .addGap(18, 18, 18)
                .addComponent(jlChooserYear2)
                .addGap(18, 18, 18)
                .addComponent(cbChooserTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tháng", "Tổng giá bán", "Tổng giá gốc", "Doanh thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTable.setViewportView(jTable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Dạng bảng", jPanel5);

        add(jTabbedPaneMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cbChooserTableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooserTableItemStateChanged
        int year = Integer.parseInt(cbChooserTable.getSelectedItem().toString());
        loadDataToTable(year);
    }//GEN-LAST:event_cbChooserTableItemStateChanged

    private void cbChooserChartItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooserChartItemStateChanged
        int year = Integer.parseInt(cbChooserTable.getSelectedItem().toString());
        loadDataToChart(year);
    }//GEN-LAST:event_cbChooserChartItemStateChanged

//    load data to panel
    private void loadDataToPanel() {
        jlNumOrder.setText(revenue_Statistics_DAO.countInvoicesCreatedToday() + "");
        jlMoneyDay.setText(utils.Utils.formatMoney(revenue_Statistics_DAO.calculateRevenueToday()));
        jlMoneyMonth.setText(utils.Utils.formatMoney(revenue_Statistics_DAO.calculateRevenueThisMonth()));
        jlMoneyYear.setText(utils.Utils.formatMoney(revenue_Statistics_DAO.calculateRevenueThisYear()));
    }
    
    //    get all year invoice
    private void setAllYearToCBB() {
        for (Integer year : revenue_Statistics_DAO.getAllInvoiceYears()) {
            cbChooserTable.setSelectedItem(year);
            cbChooserChart.setSelectedItem(year);
        }
    }

//  load data to table
private void loadDataToTable(int year){
        defaultTableModel.setRowCount(0);
        for (Revenue_Statistics revenue_Statistics : revenue_Statistics_DAO.getListRevenueMonth(year)) {
            Object[] data = {revenue_Statistics.getMonth(), utils.Utils.formatMoney(revenue_Statistics.getTotalSales()), utils.Utils.formatMoney(revenue_Statistics.getTotalCost()), utils.Utils.formatMoney(revenue_Statistics.getRevenue())};
            defaultTableModel.addRow(data);
        }
}    

//    load data to chart
        private void loadDataToChart(int year) {
        jpChart.clearData();
        jpChart.addLegend("Doanh thu", new Color(139, 229, 222));
        for (Revenue_Statistics revenue_Statistics : revenue_Statistics_DAO.getListRevenueMonth(year)) {
            jpChart.addData(new ModelChart("Tháng " + revenue_Statistics.getMonth(), new double[]{revenue_Statistics.getRevenue()}));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.ComboBoxSuggestion cbChooserChart;
    private lib2.ComboBoxSuggestion cbChooserTable;
    private javax.swing.JPanel jPTop;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel jlCard14Title;
    private javax.swing.JLabel jlCard1Title;
    private javax.swing.JLabel jlCard1Unit;
    private javax.swing.JLabel jlCard2Title;
    private javax.swing.JLabel jlCard3Title;
    private javax.swing.JLabel jlChooserYear;
    private javax.swing.JLabel jlChooserYear2;
    private javax.swing.JLabel jlIconMoneyDay;
    private javax.swing.JLabel jlIconMoneyMonth;
    private javax.swing.JLabel jlIconMoneyYear;
    private javax.swing.JLabel jlIconOrder;
    private javax.swing.JLabel jlMoneyDay;
    private javax.swing.JLabel jlMoneyMonth;
    private javax.swing.JLabel jlMoneyYear;
    private javax.swing.JLabel jlNumOrder;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel jlTitle2;
    private javax.swing.JPanel jpCard1;
    private javax.swing.JPanel jpCard2;
    private javax.swing.JPanel jpCard3;
    private javax.swing.JPanel jpCard4;
    private lib2.Chart jpChart;
    private javax.swing.JScrollPane jspTable;
    // End of variables declaration//GEN-END:variables
}
