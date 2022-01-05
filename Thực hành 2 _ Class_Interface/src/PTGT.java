public class PTGT {
    String soKhungXe;
    String hang;
    String ngayLanBanh;
    double giaBan;

    public PTGT(){}
    public PTGT(String soKhungXe, String hang, String ngayLanBanh, double giaBan) {
        this.soKhungXe = soKhungXe;
        this.hang = hang;
        this.ngayLanBanh = ngayLanBanh;
        this.giaBan = giaBan;
    }

    public String getSoKhungXe() {
        return soKhungXe;
    }

    public void setSoKhungXe(String soKhungXe) {
        this.soKhungXe = soKhungXe;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNgayLanBanh() {
        return ngayLanBanh;
    }

    public void setNgayLanBanh(String ngayLanBanh) {
        this.ngayLanBanh = ngayLanBanh;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
}
