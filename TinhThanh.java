package Coffee_Shop;
public class TinhThanh {
    private int matinh;
    private String tentinh;

    public TinhThanh(){
    }
    public TinhThanh(int matinh, String tentinh) {
        this.matinh = matinh;
        this.tentinh = tentinh;
    }
    public int getMatinh() {
        return matinh;
    }
    public void setMatinh(int matinh) {
        this.matinh = matinh;
    }
    public String getTentinh() {
        return tentinh;
    }
    public void setTentinh(String tentinh) {
        this.tentinh = tentinh;
    }
    public String toString(){
        return this.getMatinh() + " - " + this.getTentinh();
    }
}
