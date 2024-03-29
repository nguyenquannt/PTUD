package entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Invoice {

    // enum
    public static enum Status {
        DaThanhToan, DonCho
    }

    public static Status convertStringToStatus(String status) {
        if (status.equals("Đã thanh toán")) {
            return Status.DaThanhToan;
        }
        return Status.DonCho;
    }

    public static String convertStatusToString(Status status) {
        if (status.equals(Status.DaThanhToan)) {
            return "Đã thanh toán";
        }
        return "Đơn chờ";
    }
//    
    private String idInvoice;
    private Staff staff;
    private Customer customer;
    private double amountReceived;
    private double changeAmount;
    private double totalAmount;
    private LocalDateTime dateCreated;
    private Status status;

//    get set
    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(double amountReceived) {
        this.amountReceived = amountReceived;
    }

    public double getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(double changeAmount) {
        this.changeAmount = changeAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

   

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

//    constructor
    public Invoice() {
    }

    public Invoice(String idInvoice) {
        super();
        this.idInvoice = idInvoice;
    }

    public Invoice(String idInvoice, Staff staff, Customer customer, double amountReceived, double changeAmount, double totalAmount, LocalDateTime dateCreated, Status status) {
        super();
        this.idInvoice = idInvoice;
        this.staff = staff;
        this.customer = customer;
        this.amountReceived = amountReceived;
        this.changeAmount = changeAmount;
        this.totalAmount = totalAmount;
        this.dateCreated = dateCreated;
        this.status = status;
    }

//    Hashcode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idInvoice);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Invoice other = (Invoice) obj;
        return Objects.equals(this.idInvoice, other.idInvoice);
    }

//    toString

    @Override
    public String toString() {
        return "Invoice{" + "idInvoice=" + idInvoice + ", staff=" + staff + ", customer=" + customer + ", amountReceived=" + amountReceived + ", changeAmount=" + changeAmount + ", totalAmount=" + totalAmount + ", dateCreated=" + dateCreated + ", status=" + status + '}';
    }

    
}
