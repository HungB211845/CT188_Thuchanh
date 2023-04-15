import java.util.Scanner;

public abstract class Employee {

	private String maSo;
	private String ten;
	private String cmnd;
	private String diaChi;
	private int namKinhNghiem;
	private double luongcoBan;
      //constructor co tham so truyen vao
	public Employee(String maSo, String ten, String cmnd, String diaChi, int namKinhNghiem, double luongcoBan) {
		this.maSo = maSo;
		this.ten = ten;
		this.cmnd = cmnd;
		this.diaChi = diaChi;
		this.namKinhNghiem = namKinhNghiem;
		this.luongcoBan = luongcoBan;
	}
	//constructor k truyen tham so = default trong java
	public Employee() {
		this.maSo = "";
		this.ten = "";
		this.cmnd = "";
		this.diaChi = "";
		this.namKinhNghiem = 0;
		this.luongcoBan = 0.0;
	}

	public String toString() {
		return "[" + maSo + "," + ten + "," + cmnd + "," + diaChi + "," + namKinhNghiem + "," + luongcoBan + "]";
	}

	public double getLuongCoBan() {
		return luongcoBan;
	}

	public int getNamKinhNghiem() {
		return namKinhNghiem;
	}

	public abstract double luongToiThieu();

	public abstract double luongThucLanh();

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		// IntellJ
		System.out.println("Nhap ma so: ");
		maSo = sc.nextLine();
		System.out.print("Nhap ten: ");
		ten = sc.nextLine();
		System.out.print("Nhap cmnd: ");
		cmnd = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("Nhap nam kinh nghiem: ");
		namKinhNghiem = sc.nextInt();
		System.out.println("Nhap luong co ban: ");
		luongcoBan = sc.nextDouble();

	}
}
