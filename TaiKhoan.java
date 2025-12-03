public abstract class TaiKhoan {
    protected String soTK;
    protected double soDu;
    private KhachHang khachHang; 

    public TaiKhoan() {}
    public TaiKhoan(String soTK, double soDu, KhachHang khachHang) {
        this.soTK = soTK;
        this.soDu = soDu;
        this.khachHang = khachHang;
    }

    public String getSoTK() { return soTK; }
    public double getSoDu() { return soDu; }
    public KhachHang getKhachHang() { return khachHang; }
    
    public void naptien(double soTien) {
        this.soDu += soTien;
        System.out.printf("Nap tien thanh cong %,.0f VND vao TK %s. So Du moi: %,.0f VND%n", soTien, soTK, soDu);
    }

    public boolean rutTien(double soTien) {
        double gioiHanRut = khachHang.getCapDoThanhVien().getGioiHanRutTien();
        if (soTien > gioiHanRut) {
            System.out.printf("Loi: Rut %,.0f VND vuot qua gioi han (%,.0f VND) cua cap do %s.%n", soTien, gioiHanRut, khachHang.getCapDoThanhVien().toString());
            return false;
        }
        if (soDu >= soTien) {
            soDu -= soTien;
            System.out.printf("Rut tien thanh cong %,.0f VND tu TK %s. So Du moi: %,.0f VND%n", soTien, soTK, soDu);
            return true;
        }
        System.out.printf("Loi: So du %,.0f VND khong du de rut %,.0f VND.%n", soDu, soTien);
        return false;
    }

    public abstract double tinhLaiSuat(); 

    public void hienThiThongTin() {
        System.out.println("\t[TK] So TK: " + soTK + ", Loai: " + this.getClass().getSimpleName());
        System.out.printf("\t   So du: %,.0f VND | Lai du kien: %,.0f VND%n", soDu, tinhLaiSuat());
    }
}