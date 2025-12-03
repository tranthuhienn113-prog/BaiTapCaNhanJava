public class GiaoDich {
    private String maGD;
    private String ngayGD;
    private String loaiGD;
    private double soTien;

    public GiaoDich () {}
    public GiaoDich(String maGD, String ngayGD, String loaiGD, double soTien) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.loaiGD = loaiGD;
        this.soTien = soTien;
    }

    public String getMaGD() { return maGD; }
    public String getNgayGD() { return ngayGD; }
    public String getLoaiGD() { return loaiGD; }
    public double getSoTien() { return soTien; }

    public void hienThiThongTin() {
        System.out.printf("- GD %s: %s, Ngay: %s, So Tien: %,.0f VND%n", loaiGD, maGD, ngayGD, soTien);
    }
}