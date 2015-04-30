package Dados;

import java.util.ArrayList;

public class tela {
	
	public int[] visor = new int[240];
	private ArrayList<Integer> memoria = new ArrayList<Integer>(); 
	
	public tela(){
		for (int i=0;i<240;i++) this.visor[i]=0;
	}
	
	public void add(int a){
		for (int i=0;i<239;i++) visor[i]=visor[i+1];
		visor[239]=a;
		System.out.println(a);
		memoria.add(a);
	}

}
