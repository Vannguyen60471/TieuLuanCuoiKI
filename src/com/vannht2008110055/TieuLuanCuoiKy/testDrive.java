/*
* ngày tạo: Dec 04, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.TieuLuanCuoiKy;
import java.text.ParseException;
import java.util.Scanner;

public class testDrive {
    public static void main(String[] args) throws ParseException {
        int luaChon = 0;
        Scanner input = new Scanner(System.in);
       
        DanhSachQuanLiHangHoa l = new DanhSachQuanLiHangHoa();
        
        HangHoa sp1 = new HangThucPham("100", "Hoa Qua", 50000 ,1231, "22/11/2021","25/11/2021");
        HangHoa sp2 = new HangThucPham("101", "Ca", 100000 ,893, "29/12/2021","01/01/2022");
        HangHoa sp3 = new HangThucPham("102", "Thit Heo", 80000 ,562, "26/01/2021","26/02/2021");
        HangHoa sp4 = new HangThucPham("103", "Thit Bo", 200000 ,747, "12/02/2020","19/02/2020");
        HangHoa sp5 = new HangThucPham("104", "Muc", 220000 ,903, "30/11/2019","10/12/2029");
        HangHoa sp6 = new HangThucPham("105", "Rau Muong", 5000 ,2041, "13/04/2018","20/04/2018");
 
        HangHoa sp7 = new HangSanhSu("100", "Ly", 25000, 235, "20/11/2021", "Gia Lam, Ha Noi");
        HangHoa sp8 = new HangSanhSu("101", "Chen", 15000, 940, "19/11/2021", "Hoi An, Quang Nam");
        HangHoa sp9 = new HangSanhSu("102", "Am Tra", 100000, 322, "20/02/2013", "Vinh Long");
        HangHoa sp10 = new HangSanhSu("103", "Muong", 10000, 446, "30/01/2011", "Bau Truc, Binh Thuan");
        HangHoa sp11 = new HangSanhSu("104", "Dia", 35000, 783, "21/12/2028", "Thua Thien Hue");
        HangHoa sp12 = new HangSanhSu("105", "Binh Hoa", 7000, 621, "30/04/2021", "Nam Sach, Hai Duong");
        HangHoa sp13 = new HangSanhSu("106", "Am Su", 200000, 1225, "20/12/2021", "Bat Trang");

        HangHoa sp14 = new HangDienMay("100", "May Lanh", 13000000, 55,"02/02/2021", 500);
        HangHoa sp15 = new HangDienMay("101", "May Giat", 15000000, 46,"23/03/2021", 700);
        HangHoa sp16 = new HangDienMay("102", "May Say", 899000, 23,"20/12/2021", 250);
        HangHoa sp17 = new HangDienMay("103", "May Xay Sinh To", 999000, 39,"04/11/2021", 1000);
        HangHoa sp18 = new HangDienMay("104", "TiVi", 5355000, 42,"01/01/2021", 1500);
        HangHoa sp19 = new HangDienMay("105", "May Quat", 300000, 50,"31/03/2021", 125);
        HangHoa sp20 = new HangDienMay("106", "May Loc Nuoc", 10000000, 66,"15/05/2021", 100);
        l.themHangHoaTrucTiep(sp1);
        l.themHangHoaTrucTiep(sp2);
        l.themHangHoaTrucTiep(sp3);
        l.themHangHoaTrucTiep(sp4);
        l.themHangHoaTrucTiep(sp5);
        l.themHangHoaTrucTiep(sp6);
        l.themHangHoaTrucTiep(sp7);
        l.themHangHoaTrucTiep(sp8);
        l.themHangHoaTrucTiep(sp9);
        l.themHangHoaTrucTiep(sp10);
        l.themHangHoaTrucTiep(sp11);
        l.themHangHoaTrucTiep(sp12);
        l.themHangHoaTrucTiep(sp13);
        l.themHangHoaTrucTiep(sp14);
        l.themHangHoaTrucTiep(sp15);
        l.themHangHoaTrucTiep(sp16);
        l.themHangHoaTrucTiep(sp17);
        l.themHangHoaTrucTiep(sp18);
        l.themHangHoaTrucTiep(sp19);
        l.themHangHoaTrucTiep(sp20);
        System.out.println("___________________________________________");
        System.out.println("   TEN SINH VIEN :NGUYEN HOANG TRONG VAN   ");
        System.out.println("   MSSV : 2008110055                       ");
        System.out.println("    LOP : K14DCLTIOT                       ");
        System.out.println("   MON : LAP TRINH HUONG DOI TUONG         ");
        System.out.println("   GIANG VIEN HUONG DAN : LE HUYNH PHUOC   ");
        System.out.println("        TRUONG DAI HOC GIA DINH            ");
        System.out.println("___________________________________________");
		while(luaChon != 6){
            System.out.println("  DANH SACH TAC VU             ");
            System.out.println("1.Them sua xoa hang hoa :    ");
            System.out.println(" 1.1 Them                     ");
            System.out.println(" 1.2 Sua                      ");
            System.out.println(" 1.3 Xoa                      ");
            System.out.println("2.Tim kiem theo :            ");
            System.out.println(" 2.1 Loai                     ");
            System.out.println(" 2.2 Gia                      ");
            System.out.println(" 2.3 Ngay nhap                ");
            System.out.println("3.Sap xep tang dan theo :        ");
            System.out.println(" 3.1 Gia nhap                 ");
            System.out.println(" 3.2 Ngay nhap                ");
            System.out.println(" 3.3 Loai va ngay nhap        ");
            System.out.println(" 3.4 Loai va gia nhap         ");
            System.out.println("4.Sap xep giam dan theo :        ");
            System.out.println(" 4.1 Gia nhap                 ");
            System.out.println(" 4.2 Ngay nhap                ");
            System.out.println(" 4.3 Loai va ngay nhap        ");
            System.out.println(" 4.4 Loai va gia nhap         ");
            System.out.println("5.Thong ke :                     ");
            System.out.println("0.Thoat chuong trinh             ");
            System.out.print(" Nhap lua chon cua ban : ");
            luaChon = input.nextInt();
            switch(luaChon){
                case 1 : {
                    System.out.println(" 1.1 Them hang hoa     ");
                    System.out.println(" 1.2 Sua hang hoa      ");
                    System.out.println(" 1.3 Xoa hang hoa      ");
                    System.out.println(" 0.  Thoat             ");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.themHangHoa();break;
                        case 2 : l.suaHangHoa();break;
                        case 3 : l.xoaHangHoa();break;
                        default : break;
                    }
                    break;
                }
                case 2 : {
                    System.out.println(" 2.1 Tim kiem theo loai      ");
                    System.out.println(" 2.2 Tim kiem theo ngay nhap ");
                    System.out.println(" 2.3 Tim kiem theo gia       ");
                    System.out.println(" 0.  Thoat                   ");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.timKiemTheoLoai();break;
                        case 2 : l.timKiemTheoNgay();break;
                        case 3 : l.timKiemTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 3 : {
                    System.out.println(" 3.Sap xep tang dan theo :                  ");
                    System.out.println("    3.1 Gia nhap                            ");
                    System.out.println("    3.2 Ngay nhap                           ");
                    System.out.println("    3.3 Loai va ngay nhap                   ");
                    System.out.println("    3.4 Loai va gia nhap                    ");
                    System.out.println("    0.  Thoat                               ");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.sapXepHangHoaTangDanTheoGia();break;
                        case 2 : l.sapXepHangHoaTangDanTheoNgay();break;
                        case 3 : l.SapXepTangDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : l.SapXepTangDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 4 : {
                    System.out.println(" 3.Sap xep giam dan theo :                  ");
                    System.out.println("    3.1 Gia nhap                            ");
                    System.out.println("    3.2 Ngay nhap                           ");
                    System.out.println("    3.3 Loai va ngay nhap                   ");
                    System.out.println("    3.4 Loai va gia nhap                    ");
                    System.out.println("    0.  Thoat                               ");
                    System.out.print("Nhap lua chon cua ban : ");
                    luaChon = input.nextInt();
                    switch(luaChon){
                        case 1 : l.sapXepHangHoaGiamDanTheoGia();break;
                        case 2 : l.sapXepHangHoaGiamDanTheoNgay();break;
                        case 3 : l.SapXepGiamDanTheoLoaiVaTheoNgayNhap();break;
                        case 4 : l.SapXepGiamDanTheoLoaiVaTheoGia();break;
                        default : break;
                    }
                    break;
                }
                case 5 : l.thongKeTongHangHoa();break;
                default : break;
                
            }
            
        }
    }
}
   