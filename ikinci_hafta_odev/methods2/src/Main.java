public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        mesaj.substring(0,2);
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);

        int sayi = topla(28,78);
        System.out.println(sayi);

        int hesapla=topla2(1,2,4,8,9,7,6);
        System.out.println(hesapla);
    }

    public static void ekle(){
        System.out.println("Eklendi..");
    }


    public static void sil(){
        System.out.println("Silindi..");
    }

    public static void guncelle(){
        System.out.println("Güncellendi..");
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam =0;
        for (int sayi : sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "ankara";
    }

}