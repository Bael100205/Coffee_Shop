
import java.util.Scanner;

public class CaPhe extends SanPham {
    private boolean coda;
    public CaPhe(){
        super();
    }
    public CaPhe(String id, String tensanpham, int[] dongia, boolean coda) {
        super(id, tensanpham, dongia);
        this.coda = coda;
    }
    public boolean isCoda() {
        return coda;
    }
    public void setCoda(boolean coda) {
        this.coda = coda;
    }
    public void setInfo(){
        super.setInfo();
        System.out.println("Co da hay khong?");
        System.out.println("0. Khong da");
        System.out.println("1. Co da");
        System.out.print("Lua chon: ");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = Integer.parseInt(scan.nextLine());
        switch (choice) {
            case 0:
                this.setCoda(false);
                break;
            case 1:
                setCoda(true);
                break;
            default:
                setCoda(true);
                break;
        }
    }
    public String toString(){
        return super.toString();
    }
}
