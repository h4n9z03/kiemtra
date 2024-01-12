/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
abstract class CanBo {
    private String maCB;
    private String ten;
    private String chucVu;
    private double heSoLuong;
    
    //Hàm tạo không tham số
    public CanBo() {
    }
    
    //Hàm tạo có tham số
    public CanBo(String maCB, String ten, String chucVu, double heSoLuong) {
        this.maCB = maCB;
        this.ten = ten;
        this.chucVu = chucVu;
        this.heSoLuong = heSoLuong;
    }

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    abstract void tinhLuong();
    public void hienThi() {
        System.out.println("Ma cb la: "+ maCB);
        System.out.println("Ten: "+ten);
        System.out.println("Chuc vu "+chucVu);
        System.out.println("He so luong" + heSoLuong);
    }
}
