import java.util.Scanner;

public class PartTimeEmployee extends Employee {

  private int soNgaylamViec;

  public PartTimeEmployee(String maSo, String ten, String cmnd, String diaChi, int namKinhNghiem, double luongcoBan,
      int soNgayLamViec) {
    super(maSo, ten, cmnd, diaChi, namKinhNghiem, luongcoBan);

    this.soNgaylamViec = soNgayLamViec;
  }

  public PartTimeEmployee() {
    super();
  }

  public String toString() {
    return super.toString() + "[" + soNgaylamViec + "]";
  }

  public int getSoNgayLamViec() {
    return soNgaylamViec;
  }
  @Override
  public double luongThucLanh() {
    return luongToiThieu() + (getLuongCoBan() * getNamKinhNghiem());
  }

  public void nhapSoNgayLamViec() {
    Scanner sc = new Scanner(System.in);
    soNgaylamViec = sc.nextInt();
  }

  @Override
  public double luongToiThieu() {
    return getLuongCoBan() + (getLuongCoBan() * getSoNgayLamViec()) / 30;
  }
}