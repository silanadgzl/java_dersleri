package com.example.javadersleri.nesne_tabanli;

public class Araba {
    String renk;
    int hiz;
    boolean calisiyorMu;
    //this = Araba , bulunduğu class'ı temsil eder.
    //self(Swift) = this


    public Araba() {//Constructor = init function
        System.out.println("Nesne oluştu");
    }

    public Araba(String renk, int hiz, boolean calisiyorMu) {
        this.renk = renk;//Shadowing = Gölgeleme
        this.hiz = hiz;
        this.calisiyorMu = calisiyorMu;
    }

    public void calistir(){//Side effect : Bir metodun bulunduğu sınıfın çzelliğini değiştirmesi
        calisiyorMu = true;
        hiz = 5;
    }

    public void durdur(){
        calisiyorMu = false;
        hiz = 0;
    }

    public void hizlan(int miktar){
        hiz = hiz + miktar;
    }

    public void yavasla(int miktar){
        hiz = hiz - miktar;
    }

    public void bilgiAl(){
        System.out.println("-----------------------------------------------");
        System.out.println("Renk         : "+ renk);
        System.out.println("Hız          : "+ hiz);
        System.out.println("Çalışıyor Mu : "+ calisiyorMu);
    }
}


