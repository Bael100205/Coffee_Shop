
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachTinhThanh {
    private ArrayList<TinhThanh> dstinhthanh;
    public DanhSachTinhThanh(){
        this.dstinhthanh = new ArrayList<>();
    }
    public DanhSachTinhThanh(ArrayList<TinhThanh> dstinhthanh){
        this.dstinhthanh = dstinhthanh;
    }
    public ArrayList<TinhThanh> getDstinhthanh() {
        return dstinhthanh;
    }
    public void setDstinhthanh(ArrayList<TinhThanh> dstinhthanh) {
        this.dstinhthanh = dstinhthanh;
    }

    public void docFileVaoArrayList(String filepath){
        File file = new File(filepath);
        try(Scanner scan = new Scanner(file)){
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split("#");
                TinhThanh tinhthanh = new TinhThanh();
                tinhthanh.setMatinh(Integer.parseInt(parts[0].trim()));
                tinhthanh.setTentinh(parts[1].trim());
                this.dstinhthanh.add(tinhthanh);
            }
        } catch (FileNotFoundException err) {
            System.out.println(err.getMessage());
        }
    }
    public TinhThanh timKiemTheoMaTinh(int matinh){
        for(TinhThanh tinhthanh : this.dstinhthanh){
            if(tinhthanh.getMatinh() == matinh)
                return tinhthanh;
        }
        return null;
    }

    public void hienThiDanhSachTinhThanh(){
        int i = 0;
        for(TinhThanh tinhthanh : this.dstinhthanh){
            System.out.println((i + 1) + ". " + tinhthanh.toString());
            i++;
        }
    }

    public TinhThanh luaChonTinhThanhTuDanhSach(){
        if(this.dstinhthanh.isEmpty()){
            System.out.println("Khong co du lieu trong danh sach");
            return null;
        }
        Scanner scan = new Scanner(System.in);
        hienThiDanhSachTinhThanh();
        int choice = -1;
        do {
            try{
                System.out.print("Nhap lua chon (1-" + dstinhthanh.size() + "): ");
                choice = Integer.parseInt(scan.nextLine());
                if(choice < 1 || choice > this.dstinhthanh.size())
                    System.out.println("Tinh thanh khong hop le");
            } catch (NumberFormatException err) {
                System.out.println("Nhap so");
            }
        } while (choice < 1 || choice > this.dstinhthanh.size());
        return this.dstinhthanh.get(choice - 1);
    }
}
