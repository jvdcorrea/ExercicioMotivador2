package com.grupo;
import java.util.List;
import java.lang.Math;
import java.lang.IllegalArgumentException;

/**
 * 
 *
 */
public class Lambert
{
	int infinito = 99999;
	Throwable causa = new Throwable(
	IllegalArgumentException excep = new IllegalArgumentException("Insira um double cujo modulo seja menor que (1/e)");
	
	
	/*
	List<Double> lista = new List<Double>();
	public static void preenche(double x)
	{
		for (int i; i < x; i++){
			lista.add(i);
		}
	}
	*/
	
    /*
	@requires x.type == Double;
	*/
	public static double Lambert(double x){
		
		double soma = 0;
		
		if (!(modulo(x) < (1/Math.exp(1)))){
			System.out.println("Erro placeholder hah")
			return "Erro";
		}
			for(int n; n < infinito; n++){
				soma = soma + ((Math.pow((n*-1),n-1))/Util.fatorial(n))*(Math.pow(x,n));
			}
		
		return soma;
    }
	
	public static double modulo(double x){
		if(x < 0){
			return x*-1;
		}
		return x;
	}
}
