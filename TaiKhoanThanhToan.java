public class TaiKhoanThanhToan extends TaiKhoan {
    private double phiGiaoDich;

    public TaiKhoanThanhToan() {}
    public TaiKhoanThanhToan(String soTK, double soDu, KhachHang khachHang, double phiGiaoDich) {
        super(soTK, soDu, khachHang);
        this.phiGiaoDich = phiGiaoDich;
    }

    @Override
    public double tinhLaiSuat() {
        return getSoDu() * 0.001; 
    }

    @Override
    public boolean rutTien(double soTien) {
        double tongTienCanRut = soTien + phiGiaoDich;
        
        if (soTien > getKhachHang().getCapDoThanhVien().getGioiHanRutTien()) {
            return super.rutTien(soTien);
        }
        
        if (getSoDu() >= tongTienCanRut) {
            this.soDu -= tongTienCanRut;
            System.out.printf("Rut tien thanh cong %,.0f VND (Phi GD: %,.0f VND) tu TK %s. So Du moi: %,.0f VND%n", soTien, phiGiaoDich, getSoTK(), this.soDu);
            return true;
        }
        System.out.printf("Loi: So du %,.0f VND khong du de rut %,.0f VND (bao gom phi %,.0f VND).%n", getSoDu(), soTien, phiGiaoDich);
        return false;
    }
}