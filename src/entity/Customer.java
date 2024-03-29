package entity;

import java.util.Objects;

public class Customer {

    public static enum TypeRank {
        KhachHangBac, KhachHangVang, KhachHangKimCuong
    }

    public static String convertTypeRankToString(TypeRank rank) {
        if (rank.equals(rank.KhachHangBac)) {
            return "Khách hàng bạc";
        } else if (rank.equals(rank.KhachHangVang)) {
            return "Khách hàng vàng";
        }
        return "Khách hàng kim cương";
    }

    public static TypeRank convertStringToTypeRank(String rank) {
        if (rank.equals("Khách hàng bạc")) {
            return TypeRank.KhachHangBac;
        } else if (rank.equals("Khách hàng vàng")) {
            return TypeRank.KhachHangVang;
        }
        return TypeRank.KhachHangKimCuong;
    }

    private String idCustomer;
    private String name;
    private String phone;
    private String email;
    private Province province;
    private District district;
    private Ward ward;
    private String address;
    private int rewardPoints;
    private TypeRank typeRank;
    private double totalAmount6months;
    private boolean receivePromotions;

//    get set
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isReceivePromotions() {
        return receivePromotions;
    }

    public void setReceivePromotions(boolean receivePromotions) {
        this.receivePromotions = receivePromotions;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public TypeRank getTypeRank() {
        return typeRank;
    }

    public void setTypeRank(TypeRank typeRank) {
        this.typeRank = typeRank;
    }

    public double getTotalAmount6months() {
        return totalAmount6months;
    }

    public void setTotalAmount6months(double totalAmount6months) {
        this.totalAmount6months = totalAmount6months;
    }

//    Constructor
    public Customer() {
        super();
    }

    public Customer(String idCustomer) {
        super();
        this.idCustomer = idCustomer;
    }

    public Customer(String idCustomer, String name, String phone, String email, Province province, District district, Ward ward, String address, boolean receivePromotions) {
        super();
        this.idCustomer = idCustomer;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.receivePromotions = receivePromotions;
    } // tạo khách hàng mới không cần rank + tổng tiêu 6 tháng gần nhất (dùng cho chức năng cập nhập)

    public Customer(String idCustomer, String name, String phone, String email, Province province, District district, Ward ward, String address, int rewardPoints, TypeRank typeRank, double totalAmount6months, boolean receivePromotions) {
        super();
        this.idCustomer = idCustomer;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.rewardPoints = rewardPoints;
        this.typeRank = typeRank;
        this.totalAmount6months = totalAmount6months;
        this.receivePromotions = receivePromotions;
    } //full thuộc tính

//    Hascode equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idCustomer);
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
        final Customer other = (Customer) obj;
        return Objects.equals(this.idCustomer, other.idCustomer);
    }

//    toString
    @Override
    public String toString() {
        return "Customer{" + "idCustomer=" + idCustomer + ", name=" + name + ", phone=" + phone + ", email=" + email + ", province=" + province + ", district=" + district + ", ward=" + ward + ", address=" + address + ", rewardPoints=" + rewardPoints + ", typeRank=" + typeRank + ", totalAmount6months=" + totalAmount6months + ", receivePromotions=" + receivePromotions + '}';
    }

}
