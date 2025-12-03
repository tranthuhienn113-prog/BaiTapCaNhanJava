public class Test {
    public static void main(String[] args) {
        
        QuanLyNganHang nganHang = new QuanLyNganHang();
        QuanLyLuuTru luuTru = new QuanLyLuuTru(nganHang); 
        
        luuTru.ReadData();
        
        ICapDoThanhVien vang = new CapDoVang();
        ICapDoThanhVien bac = new CapDoBac();

        KhachHang khachA = new KhachHang("KH001", "Tran Thi Thu Hien", vang); 
        KhachHang khachB = new KhachHang("KH002", "Le Nguyen Viet Nhat", bac); 

        nganHang.themKhachHang(khachA);
        nganHang.themKhachHang(khachB);

        TaiKhoan tkTT_A = new TaiKhoanThanhToan("1103", 50000000, khachA, 50000); 
        TaiKhoan tkTK_A = new TaiKhoanTietKiem("2006", 100000000, khachA); 
        TaiKhoan tkTT_B = new TaiKhoanThanhToan("0712", 10000000, khachB, 20000);

        khachA.themTaiKhoan(tkTT_A);
        khachA.themTaiKhoan(tkTK_A);
        khachB.themTaiKhoan(tkTT_B);

        System.out.println("\n---Phuong Thuc Nghiep Vu---");
        
        tkTT_A.rutTien(1000000); 
        tkTK_A.rutTien(500000); 
        tkTT_B.rutTien(60000000); 

        nganHang.hienThiTatCaKhachHang();
        
        luuTru.WriteData();
    }
}