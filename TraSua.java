package Coffee_Shop;
import java.util.Scanner;

public class TraSua extends SanPham{
    private boolean cosua;
    public TraSua(){
        super();
    }
    public TraSua(String id, String tensanpham, int[] dongia, boolean cosua) {
        super(id, tensanpham, dongia);
        this.cosua = cosua;
    }
    public boolean isCosua() {
        return cosua;
    }
    public void setCosua(boolean cosua) {
        this.cosua = cosua;
    }


    public void setInfo(){
        super.setInfo();
        System.out.println("Co sua hay khong?");
        System.out.println("0. Khong sua");
        System.out.println("1. Co sua");
        System.out.print("Lua chon: ");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = Integer.parseInt(scan.nextLine());
        switch (choice) {
            case 0:
                this.setCosua(false);
                break;
            case 1:
                setCosua(true);
                break;
            default:
                setCosua(true);
                break;
        }
    }

    public String toString(){
        return super.toString();
    }
}
