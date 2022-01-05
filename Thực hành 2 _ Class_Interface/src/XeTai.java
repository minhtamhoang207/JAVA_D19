public class XeTai extends PTGT implements IHangXe {
    double taiTrong;
    boolean thungXe;

    public XeTai(String soKhungXe, String hang, String ngayLanBanh, double giaBan, double taiTrong, boolean thungXe) {
        super(soKhungXe, hang, ngayLanBanh, giaBan);
        this.taiTrong = taiTrong;
        this.thungXe = thungXe;
    }

    public double getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(double taiTrong) {
        this.taiTrong = taiTrong;
    }

    public boolean isThungXe() {
        return thungXe;
    }

    public void setThungXe(boolean thungXe) {
        this.thungXe = thungXe;
    }

    @Override
    public String tenHang() {
        return "TAI " + super.getHang().toUpperCase();
    }

    @Override
    public String toString() {
        return super.soKhungXe + "\t" +
                super.hang + "\t" +
                super.ngayLanBanh + "\t" +
                super.giaBan + "\t" +
                taiTrong + "\t" +
                (thungXe?"Có thùng":"Không thùng");
    }
}
