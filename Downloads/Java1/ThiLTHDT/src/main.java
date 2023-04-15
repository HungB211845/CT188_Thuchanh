import java.util.Scanner;

public abstract class main {

      public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhap so luong nhan vien:");
            n = sc.nextInt();
            sc.nextLine(); // đọc bỏ dòng trống còn lại trong bộ đệm
            Employee[] Employee = new Employee[n];
            for (int i = 0; i < n; i++) {
                  System.out.println("Nhap nhan vien thu " + (i + 1));
                  System.out.print("Nhap loai nhan vien Fulltime/Parttime: ");
                  String nhanvien = sc.nextLine();
                  if (nhanvien.equalsIgnoreCase("Fulltime")) {
                        Employee[i] = new FullTimeEmployee();

                  } else if (nhanvien.equalsIgnoreCase("Parttime")) {
                        Employee[i] = new PartTimeEmployee();
                  } else {
                        System.out.print("Vui long nhap lai");
                        i--; // giảm số lượng nhân viên đã nhập về lại trước đó để nhập lại
                  }
                  Employee[i].nhap();
                  System.out.println("Luong thuc lanh " + Employee[i].luongThucLanh());
                  if (Employee[i].getNamKinhNghiem() > 3 && Employee[i].luongToiThieu() < 8000000) {
                        Employee[i].inThongTin();
                  }
            }
      }
}
