public class TaiKhoanTietKiem extends TaiKhoan {
    private double laiSuat = 0.05;

    public TaiKhoanTietKiem() {}
    public TaiKhoanTietKiem(String soTK, double soDu, KhachHang khachHang) {
        super(soTK, soDu, khachHang);
    }

    @Override
    public double tinhLaiSuat() {
        return getSoDu() * laiSuat;
    }
    
    @Override 
    public boolean rutTien(double soTien) {
        System.out.printf("Loi: TK Tiet kiem %s khong cho phep rut tien thuong xuyen.%n", getSoTK());
        return false;
    }
}