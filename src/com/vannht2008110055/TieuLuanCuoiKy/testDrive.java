/*
* ngày tạo: Dec 03, 2021
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
        HangHoa sp1 = new HangThucPham("100", "Rau Cải", 15000 ,1231, "22/11/2021");
        HangHoa sp2 = new HangThucPham("101", "Cá Thu", 150000 ,893, "29/12/2021");
        HangHoa sp3 = new HangThucPham("102", "Thịt Heo", 100000 ,562, "26/01/2021");
        HangHoa sp4 = new HangThucPham("103", "thịt Bò", 200000 ,747, "12/02/2020");
        HangHoa sp5 = new HangThucPham("104", "Cá Ngừ", 120000 ,903, "30/11/2019");
        HangHoa sp6 = new HangThucPham("105", "Rau Dền", 12000 ,2041, "13/04/2018");
        //************************************************************************************/
        //TẠO ĐỐI TƯỢNG HÀNG Quần Áo
        //HangHoa x = new HangQuanAo(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, xuatXu)
        HangHoa sp7 = new HangQuanAo("100", "Hoodie", 50000, 235, "20/11/2021","Tiền Giang" );
        HangHoa sp8 = new HangQuanAo("101","Sơ Mi", 55000, 940, "19/11/2021","Sài Gòn" );
        HangHoa sp9 = new HangQuanAo("102", "Quần Tây", 70000, 322, "20/02/2013", "Hà Nội");
        HangHoa sp10 = new HangQuanAo("103", "Áo Thun", 45000, 446, "30/01/2011", "Vĩnh Long");
        HangHoa sp11 = new HangQuanAo("104", "Đồ Đá Banh", 500000, 783, "21/12/2028", "Đà Nẵng ");
        HangHoa sp12 = new HangQuanAo("105", "Áo Gió", 700000, 621, "30/04/2021", "Long An");
        HangHoa sp13 = new HangQuanAo("106", "Đồ Ngủ", 800000, 1225, "20/12/2021", "Mỹ");
        //************************************************************************************/
        //TẠO ĐỐI TƯỢNG HÀNG ĐIỆN MÁY
        //HangHoa x = new HangDienMay(maHang, tenHangHoa, giaNhap, soLuongTonKho, ngayNhapKho, congSuat)
        HangHoa sp14 = new HangDienMay("100", "Máy Lạnh", 10000000, 55,"20/11/2021", 500);
        HangHoa sp15 = new HangDienMay("101", "Máy Giặt", 15000000, 46,"23/03/2021", 700);
        HangHoa sp16 = new HangDienMay("102", "Tivi", 899000, 23,"17/07/2021", 250);
        HangHoa sp17 = new HangDienMay("103", "Máy Nước Nóng", 1299000, 39,"20/11/2021", 1000);
        HangHoa sp18 = new HangDienMay("104", "Máy Sưởi", 2355000, 42,"16/12/2021", 1500);
        HangHoa sp19 = new HangDienMay("105", "Quạt Máy", 490000, 15,"26/06/2021", 125);
        HangHoa sp20 = new HangDienMay("106", "Ấm Siêu Tốc", 12500000, 66,"15/05/2021", 100);
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
        System.out.println("||   Tên Sinh Viên: Nguyễn Hoàng Trọng Văn        ||");
        System.out.println("||   MSSV : 2008110055                      ||");
        System.out.println("||   Môn: Lập Trình Hướng Đối Tượng       ||");
        System.out.println("||   Giảng Viên Hướng Dẫn: Lê Huỳnh Phước  ||");
        System.out.println("||  Trường Đại Học Gia Định                ||");
        System.out.println("||___________________________________________||");
		while(luaChon != 6){
            System.out.println("===================MENU======================");
            System.out.println("|          1.Chọn Mục Cần Thao Tác :        |");
            System.out.println("|               1a.Thêm                      |");
            System.out.println("|               1b.Sửa                       |");
            System.out.println("|               1c.Xóa                      |");
            System.out.println("|          2.Tìm Kiếm Theo :                |");
            System.out.println("|               2a.Loại                     |");
            System.out.println("|               2b.Giá                       |");
            System.out.println("|               2c.Ngày Nhập                |");
            System.out.println("|          3.Sắp Xếp Tăng Dần Theo :        |");
            System.out.println("|               3a.Giá Nhập                  |");
            System.out.println("|               3b.Ngày Nhập                |");
            System.out.println("|               3c.Loại Và Ngày Nhập        |");
            System.out.println("|               3d.Loại Và Giá Nhập        |");
            System.out.println("|          4.Sắp Xếp Giảm Dần Theo :        |");
            System.out.println("|               4a.Giá Nhập                 |");
            System.out.println("|               4b.Ngày Nhập               |");
            System.out.println("|               4c.Loại Và Ngày Nhập        |");
            System.out.println("|               4d.Loại VÀ Giá Nhập        |");
            System.out.println("|          5.Thống Kê :                     |");
            System.out.println("|               + Tổng Số Lượng Hàng Hóa Trong Kho    |");
            System.out.println("|               + Tổng Giá Trị Nhập Kho     |");
            System.out.println("|               + Số Lượng Từng Loại Hàng Hóa   |");
            System.out.println("|          0.Thoát            |");
            System.out.println("===================MENU======================\n\n\n");
            System.out.print("Nhập Lựa Chọn : ");
            luaChon = input.nextInt();
            switch(luaChon){
                case 1 : {
                    //MENU THÊM SỬ XÓA HÀNG HÓA (CÁC THÔNG TIN ĐƯỢC NHẬP TỪ BÀN PHÍM)
                    System.out.println("==========MENU===========");
                    System.out.println("| 1.1 Thêm      |");
                    System.out.println("| 1.2 Sửa       |");
                    System.out.println("| 1.3 Xóa       |");
                    System.out.println("| 0. Thoát      |");
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
