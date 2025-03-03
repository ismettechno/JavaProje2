package Gun01;

public class Ogrenci {
    private int okulNo;
    private String ad;
    private String soyad;

    public Ogrenci(String ad, String soyad, int okulNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.okulNo = okulNo;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNo=" + okulNo +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
