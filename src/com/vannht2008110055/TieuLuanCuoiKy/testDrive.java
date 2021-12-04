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
        //TẠO DANH SÁCH L
        DanhSachQuanLiHangHoa l = new DanhSachQuanLiHangHoa();
        //TẠO ĐỐI TƯỢNG HÀNG THỰC PHẨM
        //HangHoa x = new HangThucPham(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, ngayHetHan) 
        HangHoa sp1 = new HangThucPham("100", "Rau Cai", 15000 ,1231, "22/11/2021","25/11/2021");
        HangHoa sp2 = new HangThucPham("101", "Ca thu", 150000 ,893, "29/12/2021","01/01/2022");
        HangHoa sp3 = new HangThucPham("102", "Thit Heo", 100000 ,562, "26/01/2021","26/02/2021");
        HangHoa sp4 = new HangThucPham("103", "Thit Bo", 200000 ,747, "12/02/2020","19/02/2020");
        HangHoa sp5 = new HangThucPham("104", "Ca ngu", 120000 ,903, "30/11/2019","10/12/2029");
        HangHoa sp6 = new HangThucPham("105", "Rau Muong", 12000 ,2041, "13/04/2018","20/04/2018");
        //************************************************************************************/
        //TẠO ĐỐI TƯỢNG HÀNG SÀNH SỨ
        //HangHoa x = new HangSanhSu(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, xuatXu)
        HangHoa sp7 = new HangSanhSu("100", "Chen Tra", 50000, 235, "20/11/2021", "Bat Trang");
        HangHoa sp8 = new HangSanhSu("101", "Chen Com", 55000, 940, "19/11/2021", "TP HCM");
        HangHoa sp9 = new HangSanhSu("102", "Am Tra", 70000, 322, "20/02/2013", "Ha Noi");
        HangHoa sp10 = new HangSanhSu("103", "Muong Su", 45000, 446, "30/01/2011", "Nghe An");
        HangHoa sp11 = new HangSanhSu("104", "Chen Su", 500000, 783, "21/12/2028", "Da Nang");
        HangHoa sp12 = new HangSanhSu("105", "To Su", 700000, 621, "30/04/2021", "Long An");
        HangHoa sp13 = new HangSanhSu("106", "Am Su", 800000, 1225, "20/12/2021", "Bat Trang");
        //************************************************************************************/
        //TẠO ĐỐI TƯỢNG HÀNG ĐIỆN MÁY
        //HangHoa x = new HangDienMay(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, congSuat)
        HangHoa sp14 = new HangDienMay("100", "May Lanh", 10000000, 55,"20/11/2021", 500);
        HangHoa sp15 = new HangDienMay("101", "May Giat", 15000000, 46,"23/03/2021", 700);
        HangHoa sp16 = new HangDienMay("102", "May Say", 899000, 23,"17/07/2021", 250);
        HangHoa sp17 = new HangDienMay("103", "May Xay Sinh To", 1299000, 39,"20/11/2021", 1000);
        HangHoa sp18 = new HangDienMay("104", "May Suoi", 2355000, 42,"16/12/2021", 1500);
        HangHoa sp19 = new HangDienMay("105", "May Quat", 490000, 15,"26/06/2021", 125);
        HangHoa sp20 = new HangDienMay("106", "May Loc Nuoc", 12500000, 66,"15/05/2021", 100);
        //************************************************************************************/
        //THÊM 20 SẢN PHẨM VÀO DANH SÁCH L SP1->SP20
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
        //l.xoaHangHoa();
        //l.xuatHangThucPham();
        //l.xuatHangSanhSu();
        //l.xuatHangDienMay();
        //l.suaHangHoa();
        //l.xuatHangDienMay();
        //l.timKiemTheoNgay();
        //l.timKiemTheoGia();
        //l.sapXepHangHoaGiamDanTheoGia();
        //l.xuatTatCa();
        //l.sapXepHangHoaTangDanTheoGia();
        //l.xuatTatCa();
        //l.sapXepHangHoaTangDanTheoNgay();
        //l.xuatTatCa();
        //l.sapXepHangHoaGiamDanTheoNgay();
        //l.xuatTatCa();
        //l.SapXepTangDanTheoLoaiVaTheoNgayNhap();
        //l.SapXepTangDanTheoLoaiVaTheoGia();
        //l.SapXepGiamDanTheoLoaiVaTheoNgayNhap();
        //l.SapXepGiamDanTheoLoaiVaTheoGia();
        //l.thongKeTongHangHoa();
        //************************************************************************************/
        //MENU TỔNG
        System.out.println("_______________________________________________");
        System.out.println("||                                           ||");
        System.out.println("||   TEN SINH VIEN : Nguyen Hoang Trong Van        ||");
        System.out.println("||   MSSV : 2008110055                       ||");
        System.out.println("||   MON : LAP TRINH HUONG DOI TUONG         ||");
        System.out.println("||   GIAO VIEN HUONG DAN : T.LE HUYNH PHUOC  ||");
        System.out.println("||        TRUONG DAI HOC GIA DINH            ||");
        System.out.println("||___________________________________________||");
		while(luaChon != 6){
            System.out.println("===================MENU======================");
            System.out.println("|          1.Thao tac voi hang hoa :        |");
            System.out.println("|               1a.Them                     |");
            System.out.println("|               1b.Sua                      |");
            System.out.println("|               1c.Xoa                      |");
            System.out.println("|          2.Tim kiem theo :                |");
            System.out.println("|               2a.Loai                     |");
            System.out.println("|               2b.Gia                      |");
            System.out.println("|               2c.Ngay nhap                |");
            System.out.println("|          3.Sap xep tang dan theo :        |");
            System.out.println("|               3a.Gia nhap                 |");
            System.out.println("|               3b.Ngay nhap                |");
            System.out.println("|               3c.Loai va ngay nhap        |");
            System.out.println("|               3d.Loai va gia nhap         |");
            System.out.println("|          4.Sap xep giam dan theo :        |");
            System.out.println("|               4a.Gia nhap                 |");
            System.out.println("|               4b.Ngay nhap                |");
            System.out.println("|               4c.Loai va ngay nhap        |");
            System.out.println("|               4d.Loai va gia nhap         |");
            System.out.println("|          5.Thong ke :                     |");
            System.out.println("|               + Tong so luong hang hoa    |");
            System.out.println("|               + Tong gia tri nhap kho     |");
            System.out.println("|               + So luong tung loai hang   |");
            System.out.println("|          0.Thoat chuong trinh             |");
            System.out.println("===================MENU======================\n\n\n");
            System.out.print("Nhap lua chon cua ban : ");
            luaChon = input.nextInt();
            switch(luaChon){
                case 1 : {
                    //MENU THÊM SỬ XÓA HÀNG HÓA (CÁC THÔNG TIN ĐƯỢC NHẬP TỪ BÀN PHÍM)
                    System.out.println("==========MENU===========");
                    System.out.println("| 1.1 Them hang hoa     |");
                    System.out.println("| 1.2 Sua hang hoa      |");
                    System.out.println("| 1.3 Xoa hang hoa      |");
                    System.out.println("| 0.  Thoat             |");
                    System.out.println("=========================");
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
                    //MENU TÌM KIẾM HÀNG HÓA THEO LOẠI , KHOẢNG NGÀY , KHOẢNG GIÁ
                    System.out.println("=============MENU==============");
                    System.out.println("| 2.1 Tim kiem theo loai      |");
                    System.out.println("| 2.2 Tim kiem theo ngay nhap |");
                    System.out.println("| 2.3 Tim kiem theo gia       |");
                    System.out.println("| 0.  Thoat                   |");
                    System.out.println("===============================");
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
                    //MENU SẮP XẾP HÀNG HÓA TĂNG DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP
                    System.out.println("===================MENU=======================");
                    System.out.println("| 3.Sap xep tang dan theo :                  |");
                    System.out.println("|    3.1 Gia nhap                            |");
                    System.out.println("|    3.2 Ngay nhap                           |");
                    System.out.println("|    3.3 Loai va ngay nhap                   |");
                    System.out.println("|    3.4 Loai va gia nhap                    |");
                    System.out.println("|    0.  Thoat                               |");
                    System.out.println("==============================================");
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
                    //MENU SẮP XẾP HÀNG HÓA GIẢM DẦN THEO GIÁ NHẬP , NGÀY NHẬP , THEO LOẠI VÀ NGÀY NHẬP , THEO LOẠI VÀ GIÁ NHẬP
                    System.out.println("====================MENU======================");
                    System.out.println("| 3.Sap xep giam dan theo :                  |");
                    System.out.println("|    3.1 Gia nhap                            |");
                    System.out.println("|    3.2 Ngay nhap                           |");
                    System.out.println("|    3.3 Loai va ngay nhap                   |");
                    System.out.println("|    3.4 Loai va gia nhap                    |");
                    System.out.println("|    0.  Thoat                               |");
                    System.out.println("==============================================");
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
   