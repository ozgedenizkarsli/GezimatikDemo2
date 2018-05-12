package ozgedenizkarsli.com.gezimatikdemo2;

/**
 * Created by DELL on 12.5.2018.
 */

public class GeziPojo {
    private String GeziAdi;
    private String YapmadanDonme;
    private String Uckelime;
    private String Yemek;
//    public GeziPojo(String GeziAdi,String YapmadanDonme,String Uckelime,String Yemek){
//        this.GeziAdi=GeziAdi;
//        this.Uckelime=Uckelime;
//        this.Yemek=Yemek;
//        this.YapmadanDonme=YapmadanDonme;
//    }

    public String getSehir() {
        return GeziAdi;
    }

    public void setSehir(String sehir) {
        this.GeziAdi = sehir;
    }

    public String getYapmadanDonme() {
        return YapmadanDonme;
    }

    public void setYapmadanDonme(String yapmadanDonme) {
        YapmadanDonme = yapmadanDonme;
    }

    public String getUckelime() {
        return Uckelime;
    }

    public void setUckelime(String uckelime) {
        Uckelime = uckelime;
    }

    public String getYemek() {
        return Yemek;
    }

    public void setYemek(String yemek) {
        Yemek = yemek;
    }
}
