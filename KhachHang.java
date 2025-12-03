import java.util.ArrayList;

public class KhachHang {
    private String maKH;
    private String hoTen;
    private ICapDoThanhVien capDoThanhVien; 

    private ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>(); 

    public KhachHang() {}
    public KhachHang(String maKH, String hoTen, ICapDoThanhVien capDo) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.capDoThanhVien = capDo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public ICapDoThanhVien getCapDoThanhVien() {
        return capDoThanhVien;
    }
    
    public void themTaiKhoan(TaiKhoan tk) {
        danhSachTaiKhoan.add(tk);
    }
    
    public void hienThiThongTin() {
        System.out.println("\n=========================================");
        System.out.println("Khach Hang: " + hoTen + " (Ma: " + maKH + ")");
        System.out.println("Cap Do: " + capDoThanhVien.toString());
        System.out.println("--- TTai khoan ---");
        for (TaiKhoan tk : danhSachTaiKhoan) {
            tk.hienThiThongTin();
        }
        System.out.println("=========================================");
    }
}