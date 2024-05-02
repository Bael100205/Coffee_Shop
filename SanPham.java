
import java.util.Scanner;

public class SanPham {
    private String id;
    private String tensanpham;
    private int[] dongia = new int[3];
    public SanPham() {
    }
    public SanPham(String id, String tensanpham, int[] dongia) {
        this.id = id;
        this.tensanpham = tensanpham;
        this.dongia = dongia;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTensanpham() {
        return tensanpham;
    }
    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }
    public int[] getDongia() {
        return dongia;
    }
    public void setDongia(int[] dongia) {
        this.dongia = dongia;
    }
    
    public void setInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        setId(scan.nextLine());
        System.out.print("Nhap ten san pham: ");
        setTensanpham(scan.nextLine());
        System.out.println("Nhap gia:");
        int[] gia = new int[3];
        System.out.print("Nhap gia size S: ");
        gia[0] = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap gia size M: ");
        gia[1] = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap gia size L: ");
        gia[2] = Integer.parseInt(scan.nextLine());
        this.setDongia(gia);
    }
    
    public String toString(){
        return this.getId() + "\t" + this.getTensanpham() + "\t" + this.getDongia()[0] 
        + "\t" + this.getDongia()[1] + "\t" + this.getDongia()[2];
    }

}
