public class CapDoVang implements ICapDoThanhVien {
    @Override
    public double getGioiHanRutTien() {
        return 200000000; 
    }
    @Override
    public double getGioiHanChuyenKhoan() {
            return 500000000; 
    }
    @Override
    public String toString() {
        return "Vang";
    }
}