package com.example.javadersleri.nesne_tabanli;

public class Odev2 {

    public Double kmCevir(double km){
        double mil = km * 0.621;
        return mil;
    }

    public void dikdortgenAlanHesapla(int kenar1, int kenar2){
        int alan = kenar1*kenar2;
        System.out.println("Alan : " + alan);
    }

    public int faktoriyelHesapla(int sayi){
        if(sayi==0){
            return 1;
        }else {
            return sayi*faktoriyelHesapla(sayi-1);
        }
    }


    public void eHarfiSay(String kelime) {
        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'e' || kelime.charAt(i) == 'E') {
                sayac++;
            }
        }
        System.out.println("E harfi sayısı : " + sayac + " TL");
    }


    public int hesaplaIcAci(int kenarSayisi){
        int icAci = ((kenarSayisi-2) * 180) / kenarSayisi;
        return icAci;
    }

    public void maasHesapla(int gunSayisi){
        int calismaSaati = 8 * gunSayisi;
        double normalUcret = 40 * calismaSaati;
        double mesaiUcreti = 0;

        if(calismaSaati > 150){
            int mesaiSaati = calismaSaati - 150;
            mesaiUcreti = 80 * mesaiSaati;
        }
        System.out.println("Toplam maaş bilgisi : " + normalUcret + mesaiUcreti + "TL");
    }



    public int otoparkUcretiHesapla(int otoparkSuresi){
        if(otoparkSuresi<=1){
            return 50;
        }
        else {
            int ekUcret = (otoparkSuresi-1) * 10;
            return  50 + ekUcret;
        }
    }


}
