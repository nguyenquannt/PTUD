package dao;

import connectDB.ConnectDB;
import entity.Staff;
import entity.Staff_Statistics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Staff_Statistics_DAO {

    //    sum number staff
    public int calculateTotalQuantityStaff() {
        int totalQuantity = 0;
        String sql = "SELECT COUNT(*) AS employeeCount FROM Staff";
        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                totalQuantity = resultSet.getInt("employeeCount");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalQuantity;
    }

    //    sum number staff working
    public int calculateTotalQuantityStaffWithStatus(String status) {
        int totalQuantity = 0;
        String sql = "SELECT COUNT(*) AS employeeCount FROM Staff WHERE status = ?";
        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, status);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                totalQuantity = resultSet.getInt("employeeCount");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalQuantity;
    }

//    get top 10 staff revenue year now
    public List<Staff_Statistics> getTop10RevenueYear() {
        List<Staff_Statistics> listTop10RevenueYear = new ArrayList<>();

        String sql = "SELECT TOP 10 "
                + "s.idStaff, "
                + "s.name, "
                + "COUNT(i.idInvoice) AS numberOfInvoices, "
                + "SUM(i.totalAmount) AS totalRevenue "
                + "FROM Staff s "
                + "JOIN Invoice i ON s.idStaff = i.staff "
                + "WHERE YEAR(i.dateCreated) = YEAR(GETDATE()) "
                + "GROUP BY s.idStaff, s.name "
                + "ORDER BY totalRevenue DESC";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String idStaff = resultSet.getString("idStaff");
                String name = resultSet.getString("name");
                int numberOfInvoices = resultSet.getInt("numberOfInvoices");
                double totalRevenue = resultSet.getDouble("totalRevenue");

                Staff_Statistics staff_Statistics = new Staff_Statistics(idStaff, name, numberOfInvoices, totalRevenue);
                listTop10RevenueYear.add(staff_Statistics);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listTop10RevenueYear;
    }

//    Get the top 10 lowest revenue of the year
    public List<Staff_Statistics> getTop10LowestRevenueYear() {
        List<Staff_Statistics> listBottom10RevenueYear = new ArrayList<>();

        String sql = "SELECT TOP 10 "
                + "s.idStaff, "
                + "s.name, "
                + "COUNT(i.idInvoice) AS numberOfInvoices, "
                + "SUM(i.totalAmount) AS totalRevenue "
                + "FROM Staff s "
                + "JOIN Invoice i ON s.idStaff = i.staff "
                + "WHERE YEAR(i.dateCreated) = YEAR(GETDATE()) "
                + "GROUP BY s.idStaff, s.name "
                + "ORDER BY totalRevenue ASC"; // Sắp xếp tăng dần

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String idStaff = resultSet.getString("idStaff");
                String name = resultSet.getString("name");
                int numberOfInvoices = resultSet.getInt("numberOfInvoices");
                double totalRevenue = resultSet.getDouble("totalRevenue");

                Staff_Statistics staff_Statistics = new Staff_Statistics(idStaff, name, numberOfInvoices, totalRevenue);
                listBottom10RevenueYear.add(staff_Statistics);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listBottom10RevenueYear;
    }

//  get top 10 staff revenue month_year now
    public List<Staff_Statistics> getTop10RevenueCurrentMonth() {
        List<Staff_Statistics> listTop10RevenueCurrentMonth = new ArrayList<>();

        String sql = "SELECT TOP 10 "
                + "s.idStaff, "
                + "s.name, "
                + "COUNT(i.idInvoice) AS numberOfInvoices, "
                + "SUM(i.totalAmount) AS totalRevenue "
                + "FROM Staff s "
                + "JOIN Invoice i ON s.idStaff = i.staff "
                + "WHERE YEAR(i.dateCreated) = YEAR(GETDATE()) "
                + "AND MONTH(i.dateCreated) = MONTH(GETDATE()) "
                + "GROUP BY s.idStaff, s.name "
                + "ORDER BY totalRevenue DESC";

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String idStaff = resultSet.getString("idStaff");
                String name = resultSet.getString("name");
                int numberOfInvoices = resultSet.getInt("numberOfInvoices");
                double totalRevenue = resultSet.getDouble("totalRevenue");

                Staff_Statistics staff_Statistics = new Staff_Statistics(idStaff, name, numberOfInvoices, totalRevenue);
                listTop10RevenueCurrentMonth.add(staff_Statistics);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listTop10RevenueCurrentMonth;
    }
//  get top 10 staff revenue month_year now

    public List<Staff_Statistics> getTop10LowestRevenueMonth() {
        List<Staff_Statistics> listBottom10RevenueCurrentMonth = new ArrayList<>();

        String sql = "SELECT TOP 10 "
                + "s.idStaff, "
                + "s.name, "
                + "COUNT(i.idInvoice) AS numberOfInvoices, "
                + "SUM(i.totalAmount) AS totalRevenue "
                + "FROM Staff s "
                + "JOIN Invoice i ON s.idStaff = i.staff "
                + "WHERE YEAR(i.dateCreated) = YEAR(GETDATE()) "
                + "AND MONTH(i.dateCreated) = MONTH(GETDATE()) " // Lọc theo tháng hiện tại
                + "GROUP BY s.idStaff, s.name "
                + "ORDER BY totalRevenue ASC"; // Sắp xếp tăng dần

        try {
            Connection connection = ConnectDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String idStaff = resultSet.getString("idStaff");
                String name = resultSet.getString("name");
                int numberOfInvoices = resultSet.getInt("numberOfInvoices");
                double totalRevenue = resultSet.getDouble("totalRevenue");

                Staff_Statistics staff_Statistics = new Staff_Statistics(idStaff, name, numberOfInvoices, totalRevenue);
                listBottom10RevenueCurrentMonth.add(staff_Statistics);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listBottom10RevenueCurrentMonth;
    }

}
