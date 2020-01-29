package com.company;

/**
 * Created by MM on 11/29/2019.
 */
public class Moshakhasat {


    public int sen;
    public String meliat;
    public String tahsilat;

    public static String a="irani";
    public static String b="lisans";


    public Moshakhasat(int s , String m , String t){
        this.sen=s;
        this.meliat=m;
        this.tahsilat=t;
    }

    public void Sen1()throws SenExp {

        if(sen< 23){
            throw new SenExp(" sen<23!!");
        }
    }

    public void Meliat1()throws MeliatExp{

        if(meliat!= null && meliat.equals(a)){
            throw  new MeliatExp("irani");
        }
    }

    public void Tahsilat1() throws TahsilatExp {

        if (tahsilat != null && tahsilat.equals(b)) {
            throw  new TahsilatExp("lisans");
        }
    }



}
