import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class ExpLog{
    public static double exponencial(double x,double fim){
        ArrayList<Double> aux = new ArrayList<>();
        double e;
	int i;
        for(i = 0;i<fim;i++){
            e = (Math.pow(x,i))/Util.fatorial(i);
            aux.add(e);
        }
        return Util.somatorio(0,i,aux);
    }

    public static double logaritmo(double x,double fim){
        
        if(-1 > x || x < 1) throw new IllegalArgumentException();
        double ln;  
        ArrayList<Double> aux = new ArrayList<>();
	    int i;
        for(i = 0;i<fim;i++){
            ln = ((Math.pow(-1,i))/(i+1))*(Math.pow(x,i+1));
            aux.add(ln);
        }
        return  Util.somatorio(0,i,aux);
    }
}
