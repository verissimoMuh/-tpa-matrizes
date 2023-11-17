package tpa;
public class Matriz3 {
    public static void main(String[] args) 
    {
    	
    	
    	int[][] matriz = {
                {1, 2, 3, 0},
                {4, 5, 6, 0},
                {7, 8, 9, 0}
    };
 
   
    
    	
    	for (int i=0; i<3; i++) {
            int conta = 0;
            for (int j = 0; j < 3; j++) {
                conta += matriz[i][j];
            }
          
            matriz[i][2] = conta;
        }
 
      
    
    	for (int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
        
            System.out.println();
        }
    }
}