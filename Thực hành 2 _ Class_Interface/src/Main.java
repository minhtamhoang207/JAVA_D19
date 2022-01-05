import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLPTGT q=new QLPTGT();
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1.Nhập Oto: ");
            System.out.println("2. Nhập xe tải: ");
            System.out.println("3. Danh sách phương tiện: ");

            System.out.println("4. Sửa thông tin phương tiện: ");
            System.out.println("5. Sắp xếp giảm dần theo giá: ");
            System.out.println("6. Đắt nhất từng hãng");
            System.out.println("0. Thoát");
            System.out.println("-----------------");
            System.out.print("Bạn chọn (0->6):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 0:System.out.println("BYE!!!");
                    System.exit(0);//safe exit
                case 1:
                    q.nhapOto();
                    break;
                case 2:
                    q.nhapXeTai();
                    break;
                case 3:
                    q.danhSachPhuongTien();
                    break;
                case 4:
                    q.suaPhuongTien();
                    break;
                case 5:
                    q.sapXepGiamDan();
                    break;
                case 6:
                    q.datNhatTungHang();
                    break;

                default:System.out.println("Chỉ chọn 0 -> 6");
                    break;
            }
        }

    }

}