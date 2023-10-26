package com.example.javadersleri.nesne_tabanli;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 o2 = new Odev2();


        double kmCevir = o2.kmCevir(10);
        System.out.println("Mil : " + kmCevir);


        o2.dikdortgenAlanHesapla(4,6);


        int faktoriyel=o2.faktoriyelHesapla(7);
        System.out.println("Faktöriyel Değeri : " + faktoriyel);


        o2.eHarfiSay("Kaç tane E veya e harfi var?");


        int icAci = o2.hesaplaIcAci(4);
        System.out.println("İç açı : " + icAci);


        o2.maasHesapla(10);


        int otoparkUcreti = o2.otoparkUcretiHesapla(2);
        System.out.println(otoparkUcreti);
    }
}
