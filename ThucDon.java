import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ThucDon {
    private ArrayList<SanPham> dssanpham;

    public ThucDon() {
        this.dssanpham = new ArrayList<>();
    }

    public ThucDon(ArrayList<SanPham> dssanpham) {
        this.dssanpham = dssanpham;
    }

    public ArrayList<SanPham> getDssanpham() {
        return dssanpham;
    }

    public void setDssanpham(ArrayList<SanPham> dssanpham) {
        this.dssanpham = dssanpham;
    }
    
    public void themMotSanPham(){
        Scanner scan = new Scanner(System.in);
        SanPham sanpham = null;
        System.out.println("Chon loai san pham can them:");
        System.out.println("1. Tra sua");
        System.out.println("2. Ca phe");
        System.out.print("Lua chon cua ban: ");
        int choice = Integer.parseInt(scan.nextLine());
        switch (choice) {
            case 1:
                sanpham = new TraSua();
                break;
            case 2:
                sanpham = new CaPhe();
                break;
        }
        if (sanpham != null){
            sanpham.setInfo();
            this.dssanpham.add(sanpham);
            System.out.println("Da them san pham!");
        }
    }

    public void xoaMotSanPham(String id){
        for(Iterator<SanPham> it = dssanpham.iterator(); it.hasNext();){
            SanPham sp = it.next();
            if(sp.getId().equals(id)){
                it.remove();
            }
        }
    }
}
