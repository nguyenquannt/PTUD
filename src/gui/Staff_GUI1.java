package gui;

import com.raven.datechooser.DateChooser;
import dao.District_DAO;
import dao.Province_DAO;
import dao.Ward_DAO;
import lib2.TableCustom;
import entity.Flag;
import javax.swing.table.DefaultTableModel;
import entity.Staff;
import dao.Staff_DAO;
import entity.District;
import entity.Province;
import entity.Staff.Rights;
import entity.Staff.Status;
import entity.Ward;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utils.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import jxl.CellView;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Staff_GUI1 extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    private Staff_DAO staff_DAO = new Staff_DAO();
    private Province_DAO province_DAO = new Province_DAO();
    private District_DAO district_DAO = new District_DAO();
    private Ward_DAO ward_DAO = new Ward_DAO();
    private Sell_GUI sell_GUI;
    private Staff_InfoStaff_GUI_1 staff_InfoStaff_GUI;
    private Province province;
    private District district;
    private Ward ward;

    public Staff_GUI1() {
        initComponents();
        TableCustom.apply(jspTable, TableCustom.TableType.DEFAULT);
        defaultTableModel = (DefaultTableModel) jTable.getModel();
        if (Flag.isFlagStaffGUI() == false) {
            loadData("SELECT * FROM Staff WHERE status = N'Nghỉ làm'");
            defaultTableModel.fireTableDataChanged(); // reload data
        } else {
            loadData("SELECT * FROM Staff WHERE status = N'Đang làm'");
            defaultTableModel.fireTableDataChanged(); // reload data
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpTop = new javax.swing.JPanel();
        jpTop1 = new javax.swing.JPanel();
        jpTop1Left = new javax.swing.JPanel();
        jlSearch = new javax.swing.JLabel();
        jtfInputID = new javax.swing.JTextField();
        btnSearch = new lib2.Button();
        jpTop1Right = new javax.swing.JPanel();
        jpTopBottom = new javax.swing.JPanel();
        btnAdd = new lib2.Button();
        btnEdit = new lib2.Button();
        btnInputFile = new lib2.Button();
        btnOutputFile = new lib2.Button();
        jPTable = new javax.swing.JPanel();
        jspTable = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jpMain.setBackground(new java.awt.Color(255, 255, 255));
        jpMain.setLayout(new javax.swing.BoxLayout(jpMain, javax.swing.BoxLayout.Y_AXIS));

        jpTop.setBackground(new java.awt.Color(255, 255, 255));
        jpTop.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản lý nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N
        jpTop.setLayout(new java.awt.GridLayout(2, 0));

        jpTop1.setBackground(new java.awt.Color(255, 255, 255));
        jpTop1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jpTop1.setLayout(new java.awt.GridLayout(1, 0));

        jpTop1Left.setBackground(new java.awt.Color(255, 255, 255));

        jlSearch.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jlSearch.setText("Tìm nhân viên :");

        jtfInputID.setText("Nhập mã nhân viên");

        btnSearch.setBackground(new java.awt.Color(135, 206, 235));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/search24.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.setToolTipText("");
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jpTop1LeftLayout = new javax.swing.GroupLayout(jpTop1Left);
        jpTop1Left.setLayout(jpTop1LeftLayout);
        jpTop1LeftLayout.setHorizontalGroup(
            jpTop1LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTop1LeftLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlSearch)
                .addGap(18, 18, 18)
                .addComponent(jtfInputID, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jpTop1LeftLayout.setVerticalGroup(
            jpTop1LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTop1LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTop1LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfInputID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTop1.add(jpTop1Left);

        jpTop1Right.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpTop1RightLayout = new javax.swing.GroupLayout(jpTop1Right);
        jpTop1Right.setLayout(jpTop1RightLayout);
        jpTop1RightLayout.setHorizontalGroup(
            jpTop1RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jpTop1RightLayout.setVerticalGroup(
            jpTop1RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jpTop1.add(jpTop1Right);

        jpTop.add(jpTop1);

        jpTopBottom.setBackground(new java.awt.Color(255, 255, 255));
        jpTopBottom.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jpTopBottom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 15));

        btnAdd.setBackground(new java.awt.Color(135, 206, 235));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/add24.png"))); // NOI18N
        btnAdd.setText("Thêm NV ");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jpTopBottom.add(btnAdd);

        btnEdit.setBackground(new java.awt.Color(135, 206, 235));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/edit24.png"))); // NOI18N
        btnEdit.setText("Sủa thông tin NV ");
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jpTopBottom.add(btnEdit);

        btnInputFile.setBackground(new java.awt.Color(135, 206, 235));
        btnInputFile.setForeground(new java.awt.Color(255, 255, 255));
        btnInputFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/inputfile24.png"))); // NOI18N
        btnInputFile.setText("Nhập danh sách NV ");
        btnInputFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInputFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputFileActionPerformed(evt);
            }
        });
        jpTopBottom.add(btnInputFile);

        btnOutputFile.setBackground(new java.awt.Color(135, 206, 235));
        btnOutputFile.setForeground(new java.awt.Color(255, 255, 255));
        btnOutputFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/outputfile24.png"))); // NOI18N
        btnOutputFile.setText("Xuất danh sách NV ");
        btnOutputFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jpTopBottom.add(btnOutputFile);

        jpTop.add(jpTopBottom);

        jpMain.add(jpTop);

        jPTable.setBackground(new java.awt.Color(255, 255, 255));
        jPTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dánh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "CCCD", "SDT", "Email", "Ngày sinh", "Giới tính", "Địa chỉ", "Chức vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTable.setViewportView(jTable);

        javax.swing.GroupLayout jPTableLayout = new javax.swing.GroupLayout(jPTable);
        jPTable.setLayout(jPTableLayout);
        jPTableLayout.setHorizontalGroup(
            jPTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        jPTableLayout.setVerticalGroup(
            jPTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspTable, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
        );

        jpMain.add(jPTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Flag.setFlagStaffInfo(1);
        stopWebcam();
        jpMain.removeAll();
        staff_InfoStaff_GUI = new Staff_InfoStaff_GUI_1();
        addJPanel(staff_InfoStaff_GUI);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Flag.setFlagStaffInfo(2);
        int selectRow = jTable.getSelectedRow();
        if (selectRow == -1) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn nhân viên muốn cập nhập thông tin !");
        } else {
            Flag.setFlagIDStaff(defaultTableModel.getValueAt(selectRow, 0).toString()); // set ID nhân viên chơ cờ
            Flag.setFlagStaffInfo(2); // set trạng thái hiện tại là chức năng chỉnh sửa thông tin
            stopWebcam();
            jpMain.removeAll();
            staff_InfoStaff_GUI = new Staff_InfoStaff_GUI_1();
            addJPanel(staff_InfoStaff_GUI);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnInputFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputFileActionPerformed
        JFileChooser jFileChooser = new JFileChooser("D://");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xls", "xlsx");
        jFileChooser.setFileFilter(filter);
        int result = jFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = jFileChooser.getSelectedFile();
            String pathname = file.getPath();
            if (Pattern.matches(".*\\.xls", pathname) || Pattern.matches(".*\\.xlsx", pathname)) {
                List<Staff> listStaff = readExcel(pathname);
                boolean res = staff_DAO.addStaffList(listStaff);
                if (res) {
                    if (Flag.isFlagStaffGUI() == false) {
                        loadData("SELECT * FROM Staff WHERE status = N'Nghỉ làm'");
                        defaultTableModel.fireTableDataChanged(); // reload data
                    } else {
                        loadData("SELECT * FROM Staff WHERE status = N'Đang làm'");
                        defaultTableModel.fireTableDataChanged(); // reload data
                    }
                    JOptionPane.showMessageDialog(null, "Đã hoàn thành thêm nhân viên từ danh sách !");
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng kiểm tra lại định dạng file về: MSNV, Họ tên, CCCD, SDT, Email, V.V !");
                }
                readExcel(pathname);
            } else {
                JOptionPane.showMessageDialog(null, "File không hợp lệ, vui lòng kiểm tra lại!");
            }
        }
    }//GEN-LAST:event_btnInputFileActionPerformed

    public void loadData(String sql) {
        defaultTableModel.setRowCount(0);
        for (Staff staff : staff_DAO.getListStaffByStatus(sql)) {
            String sex = "";
            if (staff.isSex()) {
                sex = "Nam";
            } else {
                sex = "Nữ";
            }
            String province = province_DAO.getProvinceNameByID(staff.getProvince().getId().toString());
            String district = district_DAO.getDistrictNameByID(staff.getDistrict().getId().toString());
            String ward = ward_DAO.getWardNameByID(staff.getWard().getId().toString());
            String address = staff.getAddress();
            String addressDetails = province + ", " + district + ", " + ward + ", " + address;
            String[] rowData = {staff.getIdStaff(), staff.getName(), staff.getCic(), staff.getPhone(), staff.getEmail(), staff.getDayofbirth().toString(), sex, addressDetails, staff.convertRightsToString(staff.getRights())};
            defaultTableModel.addRow(rowData);
        }
    }

    public void stopWebcam() {
        if (sell_GUI != null) {
            sell_GUI.stopWebcam();
        }
    }

    public void addJPanel(JPanel jPanel) {
        jpMain.add(jPanel);
        jpMain.revalidate();
        jpMain.repaint();
    }

//    Đọc nhân viên từ file Excel
    public List<Staff> readExcel(String filePath) {
        List<Staff> listStaff = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath)); XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)) {
            XSSFSheet sheet = workbook.getSheetAt(0); // Sử dụng sheet đầu tiên (index 0)

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                String idStaff = row.getCell(0).getStringCellValue();
                String name = row.getCell(1).getStringCellValue();
                String cic = row.getCell(2).getStringCellValue();
                String phone = row.getCell(3).getStringCellValue();
                String email = row.getCell(4).getStringCellValue();
                String dayOfBirth = row.getCell(5).getStringCellValue();
                String sexTMP = row.getCell(6).getStringCellValue();
                boolean sex;
                if (sexTMP.equals("Nam")) {
                    sex = true;
                } else {
                    sex = false;
                }
                String provinceSTR = row.getCell(7).getStringCellValue();
                String districtSTR = row.getCell(8).getStringCellValue();
                String wardSTR = row.getCell(9).getStringCellValue();
                Province province = province_DAO.getProvinceByNameProvince(provinceSTR);
                District district = district_DAO.getDistrictByNameDistrict(province, districtSTR);
                Ward ward = ward_DAO.getWardByNameWard(district, wardSTR);

                String address = row.getCell(10).getStringCellValue();
                String rights = row.getCell(11).getStringCellValue();
                String status = row.getCell(12).getStringCellValue();

                Staff staff = new Staff(idStaff, name, cic, phone, email, Utils.getLocalDate(dayOfBirth), sex, province, district, ward, address, Staff.convertStringToRights(rights), Staff.convertStringToStatus(status), "1234Abc@");
                listStaff.add(staff);
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listStaff;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib2.Button btnAdd;
    private lib2.Button btnEdit;
    private lib2.Button btnInputFile;
    private lib2.Button btnOutputFile;
    private lib2.Button btnSearch;
    private javax.swing.JPanel jPTable;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel jlSearch;
    public static javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpTop;
    private javax.swing.JPanel jpTop1;
    private javax.swing.JPanel jpTop1Left;
    private javax.swing.JPanel jpTop1Right;
    private javax.swing.JPanel jpTopBottom;
    private javax.swing.JScrollPane jspTable;
    private javax.swing.JTextField jtfInputID;
    // End of variables declaration//GEN-END:variables
}
