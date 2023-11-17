package tpa;
import java.util.Scanner;
public class Matriz1 {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		int matriz[][], i, j, d = 1;
		matriz = new int [4][4];
		matriz [0][0] = 2;
	
		for (i=0; i<4; i++) {
			for (j=0; j<4; j++) {
				d = d*2;
				matriz[i][j]= d;
	 }
	}
	
		System.out.println("o dobro dos numeros é igual a:");	
	for (i=0; i<4; i++) {
		for (j=0; j<4; j++) {
				System.out.print("["+matriz[i][j]+"]");
   
				if(matriz[i][j] == matriz[i][3] ) {
 
                    System.out.println(" ");
		}
		}
	}
}
}