public class QuanLyLuuTru implements IReadWrite {
    private QuanLyNganHang nganHang; 
    private final String fileName = "QuanLyHeThongTaiKhoanNganHang.txt";
    
    public QuanLyLuuTru(QuanLyNganHang nganHang) {
        this.nganHang = nganHang;
    }

    @Override
    public void ReadData() {
        System.out.println(" [Luu Tru]: Dang doc du lieu he thong tu " + fileName + "...");
    }

    @Override
    public void WriteData() {
        int soKH = nganHang.getDanhSachKhachHang().size();
        System.out.println(" [Luu Tru]: Dang ghi du lieu he thong vao " + fileName + "...");
        System.out.println("   ( Da ghi thanh cong " + soKH + " khach hang)");
    }
}