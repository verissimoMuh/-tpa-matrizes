package tpa;
import java.util.Random;
public class Matriz2 {
	public static void main(String[] args) {
		Random in = new Random();
		int m[][] = new int [3][3];
		int i, j, menor=Integer.MAX_VALUE, maior=Integer.MIN_VALUE ;
		int linha = in.nextInt();
		int coluna= in.nextInt();
		int c= in.nextInt();
		int l = in.nextInt();
	
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				m[i][j] = in.nextInt(50);
				 if (m[i][j]>maior) {
					 maior = m[i][j];
					 linha = i;
					 coluna = j;
				
				 } else  if (m[i][j]<menor) {
						 menor = m[i][j];
						 l = i;
						 c = j;
					
				 }
			}
	
		}
		
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				if(j==0) {
					System.out.print("["+m[i][j]+" ");
				}else if(j==2) {
					System.out.print(m[i][j]+"]\n");
				} else {
						System.out.print(m[i][j]+" ");	
				}
			}
		}
			
				System.out.println("\no maior numero é: " + maior);
				System.out.println("\no menor numero é: " + menor);
			   System.out.println("\n o maior numero esta na posição: " +linha+ ", "+coluna);
			   
			   System.out.println("\n o menor numero esta na posição: " +l+ ", "+c);
			   
		}			
}
