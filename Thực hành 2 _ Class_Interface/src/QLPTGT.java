import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLPTGT implements IChucNang {
    private List<PTGT> list;
    private Scanner in=new Scanner(System.in);

    public QLPTGT() {
        list=new ArrayList<>();
        list.add(new Oto("AB01C", "Toyota", "10/2021", 3000000, 4, 180));
        list.add(new Oto("AB03C", "Lexus", "8/2021", 5000000, 4, 200));
        list.add(new Oto("AB02C", "VinFast", "7/2020", 2500000, 7, 185));
        list.add(new XeTai("AB01C", "Huyndai", "6/2019", 6000000, 1000, true));
        list.add(new XeTai("AB01C", "Thaco", "1/2018", 7000000, 1100, false));

    }
    private int tontai(String soKhung){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSoKhungXe().equalsIgnoreCase(soKhung)){
                return i;
            }
        }
        return -1;
    }

    private PTGT nhap(){
        String soKhungXe;
        String hang;
        String ngayLanBanh;
        double giaBan;
        String reg="^AB\\d{2}C$";
        while(true){
            System.out.print("Nhập số khung xe: ");
            soKhungXe = in.nextLine().toUpperCase();
            if(tontai(soKhungXe) != -1){
                System.err.println("Số khung đã tồn tại");
            }
            else if((soKhungXe.matches(reg)) && (tontai(soKhungXe))==-1){
                break;
            }
            System.err.println("Số khung sai định dạng vui lòng nhập lại!");
        }
        System.out.print("Nhập tên hãng: ");
        hang=in.nextLine();
        System.out.print("Nhập ngày lăn bánh (MM/yyyy): ");
        ngayLanBanh=in.nextLine();
        System.out.print("Gia:");
        giaBan=Double.parseDouble(in.nextLine());

        return new PTGT(soKhungXe, hang, ngayLanBanh, giaBan);
    }

    @Override
    public void nhapOto() {
        PTGT t = nhap();
        System.out.print("Nhập vào số chỗ: ");
        int sc = Integer.parseInt(in.nextLine());
        System.out.print("Nhập vào tốc độ: ");
        int tocDo = Integer.parseInt(in.nextLine());
        list.add(new Oto(t.getSoKhungXe(), t.getHang(), t.getNgayLanBanh(), t.getGiaBan(), sc, tocDo));
    }

    @Override
    public void nhapXeTai() {
        PTGT t = nhap();
        System.out.print("Nhập vào tải trọng: ");
        double taiTrong = Double.parseDouble(in.nextLine());
        System.out.print("Xe có thùng xe hay không? (y/N): ");
        String temp = in.nextLine();
        boolean thung;
        thung = temp.equalsIgnoreCase("y");
        list.add(new XeTai(t.getSoKhungXe(), t.getHang(), t.getNgayLanBanh(), t.getGiaBan(), taiTrong, thung));
    }

    @Override
    public void danhSachPhuongTien() {
        System.out.println("Danh sách phương tiện giao thông: ");
        for (PTGT p : list){
            System.out.println(p);
        }
        System.out.println();
        System.out.print("Tổng số phương tiện: " + list.size());
        System.out.println();
    }

    @Override
    public void suaPhuongTien() {
        System.out.println("Nhập số khung phương tiện cần sửa: ");
        String soKhung = in.nextLine();
        int vt = tontai(soKhung);
        if(vt==-1){
            System.out.println("Không tìm thấy phương tiện!");
        }else{
            PTGT p = list.get(vt);
            System.out.print("Tên hãng: ");
            String hang=in.nextLine();
            System.out.print("Ngày lăn bánh: ");
            String ngayLanBanh = in.nextLine();
            System.out.print("Giá bán: ");
            double gia=Double.parseDouble(in.nextLine());

            p.setHang(hang);
            p.setNgayLanBanh(ngayLanBanh);
            p.setGiaBan(gia);

            System.out.println("Sửa thành công");
        }
    }

    @Override
    public void sapXepGiamDan() {
        list.sort(Comparator.comparing(PTGT::getGiaBan).reversed());
        for(PTGT i : list){
            System.out.println(i);
        }
    }

    @Override
    public void datNhatTungHang() {
        System.out.println("Tính năng đang phát triển!");
    }
}
