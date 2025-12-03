public class CapDoBac implements ICapDoThanhVien {
    @Override
    public double getGioiHanRutTien() {
        return 50000000; 
    }
    @Override
    public double getGioiHanChuyenKhoan() {
        return 100000000; 
    }
    @Override
    public String toString() {
        return "Bac";
    }
}