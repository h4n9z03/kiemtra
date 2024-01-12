/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ChuyenVien extends CanBo {

    private double phuCap;
    private double Luong;
    //Hàm tạo có tham số
    public ChuyenVien(double phuCap, String maCB, String ten, String chucVu, double heSoLuong) {
        super(maCB, ten, chucVu, heSoLuong);
        this.phuCap = phuCap;
    }
    //Hàm tạo không tham số
    public ChuyenVien() {
    }
   
    @Override
    void tinhLuong() {
         if(getChucVu().equals("giang vien")) {
             Luong = phuCap*1.4+getHeSoLuong()*221794;
         } else {
             Luong = phuCap+getHeSoLuong()*221794;
         }
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }
    public void hienThi() {
        System.out.println("Ma cb" + getMaCB());
        System.out.println("Ten" + getTen());
        System.out.println("Chuc vu" + getChucVu());
        System.out.println("He so luong" + getHeSoLuong());
        System.out.println("Luong" + Luong);
    }
}
