
public class DiaChi {
    private String sonha;
    private String phuong;
    private String quan;
    private TinhThanh tinhthanh;
    public DiaChi() {
    }
    public DiaChi(String sonha, String phuong, String quan, TinhThanh tinhthanh) {
        this.sonha = sonha;
        this.phuong = phuong;
        this.quan = quan;
        this.tinhthanh = tinhthanh;
    }
    public String getSonha() {
        return sonha;
    }
    public void setSonha(String sonha) {
        this.sonha = sonha;
    }
    public String getPhuong() {
        return phuong;
    }
    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }
    public String getQuan() {
        return quan;
    }
    public void setQuan(String quan) {
        this.quan = quan;
    }
    public TinhThanh getTinhthanh() {
        return tinhthanh;
    }
    public void setTinhthanh(TinhThanh tinhthanh) {
        this.tinhthanh = tinhthanh;
    }
    public void nhapThongTin(){
        
    }
}
