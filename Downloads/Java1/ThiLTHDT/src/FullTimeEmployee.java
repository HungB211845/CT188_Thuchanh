import java.util.Scanner;

public class FullTimeEmployee extends Employee {

    private double phuCapChucVu;
    private double heSoLuong;

    public FullTimeEmployee(String maSo, String ten, String cmnd, String diaChi, int namKinhNghiem, double luongcoBan,
            double phuCapChucVu, double heSoLuong) {
        super(maSo, ten, cmnd, diaChi, namKinhNghiem, luongcoBan);
        this.phuCapChucVu = phuCapChucVu;
        this.heSoLuong = heSoLuong;
    }

    public FullTimeEmployee() {
        super();
    }

    public void nhapPhuCapChucVu() {
        Scanner sc = new Scanner(System.in);
        phuCapChucVu = sc.nextDouble();
    }

    public void nhapHeSoLuong() {
        Scanner sc = new Scanner(System.in);
        heSoLuong = sc.nextDouble();
    }

    public String toString() {
        return super.toString() + "[" + phuCapChucVu + "," + heSoLuong + "]";
    }

    public double luongToithieu() {
        return getLuongCoBan() * heSoLuong;
    }

    public double luongThucLanh() {
        return luongToiThieu() + (phuCapChucVu * luongToiThieu()) + getLuongCoBan();
    }

    @Override
    public double luongToiThieu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'luongToiThieu'");
    }
}
