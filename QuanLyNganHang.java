import java.util.ArrayList;

public class QuanLyNganHang {
    private ArrayList<KhachHang> danhSachKhachHang = new ArrayList<>();

    public QuanLyNganHang() {}

    public void themKhachHang(KhachHang kh) {
        danhSachKhachHang.add(kh);
        System.out.println("Da them khach hang " + kh.getHoTen());
    }

    public ArrayList<KhachHang> getDanhSachKhachHang() {
        return danhSachKhachHang;
    }

    public void hienThiTatCaKhachHang() {
        System.out.println("\n--- BAO CAO TONG QUAN KHACH HANG ---");
        if (danhSachKhachHang.isEmpty()) {
            System.out.println("He thong chua co khach hang nao.");
            return;
        }
        for (KhachHang kh : danhSachKhachHang) {
            kh.hienThiThongTin();
        }
    }
}