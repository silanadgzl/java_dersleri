package com.example.javadersleri.degiskenler;

public class DegiskenOlusturma {
    public static void main(String[] args) {
        String ogrenciAdi = "Silan";
        int ogrenciYas = 23;
        double ogrenciBoy = 1.78;
        char ogrenciBasHarf = 'S';
        boolean ogrenciDevamEdiyorMu = true;

        System.out.println(ogrenciAdi);
        System.out.println(ogrenciYas);
        System.out.println(ogrenciBoy);
        System.out.println(ogrenciBasHarf);
        System.out.println(ogrenciDevamEdiyorMu);

        int urun_id = 3416;
        String urun_adi = "Kol Saati";
        int urun_adet = 100;
        double urun_fiyat = 149.99;
        String urun_tedarikci = "Rolex";

        System.out.println("Ürün id: " +urun_id);
        System.out.println("Ürün id: " +urun_adi);
        System.out.println("Ürün id: " +urun_adet);
        System.out.println("Ürün id: " +urun_fiyat);
        System.out.println("Ürün id: " +urun_tedarikci + " $");


        //sabit : Constant
        //final(java) ,let(swift), val(kotlin), dart(final-const)

        int sayi = 10;
        System.out.println(sayi);
        sayi = 100;
        System.out.println(sayi);

        final int numara = 40;
        System.out.println(numara);
        //numara = 100;



        //Tür Dönüşümü - Type Costing
        //1.Sayısaldan sayısala
        int i = 67;
        double d = 35.98;
        int sonuc1 = (int) d; //explicit
        double sonuc2 = i;//explicit

        System.out.println(sonuc1);
        System.out.println(sonuc2);

        //2.Sayısaldan Metine
        String sonuc3 = String.valueOf(d); //"35.98"
        String sonuc4 = String.valueOf(i);//67
        System.out.println(d);
        System.out.println(i);


        //3.Metinden Sayısala
        String yazi1 = "89";
        String yazi2 = "43.91";

        int sonuc5 = Integer.parseInt(yazi1);
        double sonuc6 = Double.parseDouble(yazi2);
        System.out.println(sonuc5);
        System.out.println(sonuc6);
    }
}
