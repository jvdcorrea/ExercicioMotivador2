import java.util.ArrayList;
package com.bcopstein.FuncoesST;

public class Trig{


    public static double cos(int x, int fim){
        ArrayList<Double> aux = new ArrayList<>();
        double e;
	    int i;
        for(i = 0;i<fim;i++){
            e = ((Math.pow(-1,i))/Util.fatorial(2*i) * Math.pow(x,2*i));
            aux.add(e);
        }
        return Util.somatorio(0,i,aux);
    }


    public static double sen(int x, int fim){
        ArrayList<Double> aux = new ArrayList<>();
        double e;
	    int i;
        for(i = 0;i<fim;i++){
            e = ((Math.pow(-1,i))/Util.fatorial((2*i)+1) * Math.pow(x,(2*i)+1));
            aux.add(e);
        }
        return Util.somatorio(0,i,aux);
    }


}
