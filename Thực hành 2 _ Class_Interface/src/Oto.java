public class Oto extends PTGT implements IHangXe {
    int soCho;
    int tocDo;

    public Oto(String soKhungXe, String hang, String ngayLanBanh, double giaBan, int soCho, int tocDo) {
        super(soKhungXe, hang, ngayLanBanh, giaBan);
        this.soCho = soCho;
        this.tocDo = tocDo;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public int getTocDo() {
        return tocDo;
    }

    public void setTocDo(int tocDo) {
        this.tocDo = tocDo;
    }

    @Override
    public String tenHang() {
        return "OTO " + super.getHang().toUpperCase();
    }

    @Override
    public String toString() {
        return super.soKhungXe + "\t" +
                super.hang + "\t" +
                super.ngayLanBanh + "\t" +
                super.giaBan + "\t" +
                soCho + "\t" +
                tocDo;
    }
}
