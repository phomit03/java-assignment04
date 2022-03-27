package assignment4;

public class Main {
    public static void main(String[] args) {
        MonHocDaiCuong mhdc = new MonHocDaiCuong();

        //thêm lớp học
        mhdc.themLopHoc("A1",6);
        mhdc.themLopHoc("A2",2);
        mhdc.themLopHoc("A3",1);
        mhdc.themLopHoc("A4",3);
        mhdc.themLopHoc("A5",5);
        mhdc.themLopHoc("A6",4);
        System.out.println("\nDanh sách các lớp học:");
        for(LopHoc lh : mhdc.danhSachLopHoc){
            System.out.println("Lớp: " + lh.tenLop + ", sĩ số: " + lh.siso);
        }

        //xoá lớp
        System.out.println("\nDanh sách lớp học sau khi được xoá: ");
        mhdc.xoaLopHoc("A1");
        mhdc.xoaLopHoc("A5");
        for(LopHoc lh : mhdc.danhSachLopHoc){
            System.out.println("Lớp: " + lh.tenLop + ", sĩ số: " + lh.siso);
        }

        //sắp xếp lớp theo sĩ số
        System.out.println("\nDanh sách lớp học sau khi được sắp xếp theo sĩ số: ");
        mhdc.sapXep();
        for(LopHoc lh : mhdc.danhSachLopHoc){
            System.out.println("Lớp: " + lh.tenLop + ", sĩ số: " + lh.siso);
        }

        //thêm học sinh vào các lớp để in ra danh sách học sinh tham gia
        //Thêm học sinh vào các lớp
        LopHoc A2 = new LopHoc("A2",2);
        A2.themHocSinh("A");
        A2.themHocSinh("B");
        mhdc.danhSachLopHoc.get(1).danhSachHocSinh = A2.danhSachHocSinh;

        LopHoc A3 = new LopHoc("A3",1);
        A3.themHocSinh("C");
        mhdc.danhSachLopHoc.get(0).danhSachHocSinh = A3.danhSachHocSinh;

        LopHoc A4 = new LopHoc("A4",3);
        A4.themHocSinh("E");
        A4.themHocSinh("G");
        A4.themHocSinh("F");
        mhdc.danhSachLopHoc.get(2).danhSachHocSinh = A4.danhSachHocSinh;

        LopHoc A6 = new LopHoc("A5",4);
        A6.themHocSinh("I");
        A6.themHocSinh("K");
        A6.themHocSinh("L");
        A6.themHocSinh("M");
        mhdc.danhSachLopHoc.get(3).danhSachHocSinh = A6.danhSachHocSinh;

        //in danh sách
        System.out.println("\nDanh sách các lớp học đang học các môn:");
        mhdc.inDanhSach();
    }
}
