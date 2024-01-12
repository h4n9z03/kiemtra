/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChuyenVien cv1 = new ChuyenVien();
        cv1.setTen("Ronaldo");
        cv1.setChucVu("Nhan vien");
        cv1.setMaCB("a123");
        cv1.setHeSoLuong(1.5);
        cv1.tinhLuong();
        cv1.setPhuCap(100.50);
         cv1.hienThi();
        
        ChuyenVien cv2 = new ChuyenVien(100.50, "a234", "Messi", "Lao cong", 1.7);
        cv2.tinhLuong();
        cv2.hienThi();
    }
    
}
