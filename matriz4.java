package tpa;

import java.util.Random;

public class matriz4 {
    public static void main(String[] args) {
        int[][] cartela = gerarCartela();
        imprimirCartela(cartela);
        
        
 
        int[] numerosCantados = simularNumerosCantados();
        verificarNumeros(cartela, numerosCantados);
    }
 
    private static int[][] gerarCartela() {
        int[][] cartela = new int[4][4];
        Random random = new Random();
 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int numero;
                do {
                    numero = random.nextInt(75) + 1;
                } while (contemNaCartela(cartela, numero));
 
                cartela[i][j] = numero;
            }
        }
        return cartela;
    }
    private static boolean contemNaCartela(int[][] cartela, int numero) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (cartela[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }
    private static void imprimirCartela(int[][] cartela) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(cartela[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
 
    private static int[] simularNumerosCantados() {
        return new int[]{2, 15, 30, 45, 60, 3, 17, 33, 50, 65, 4, 20, 35, 48, 72};
    }
 
    private static void verificarNumeros(int[][] cartela, int[] numerosCantados) {
        int acertos = 0;
        int rodadas = 0;
 
        for (int numero : numerosCantados) {
            rodadas++;
 
            if (contemNaCartela(cartela, numero)) {
                acertos++;
                System.out.println("Número " + numero + " está na cartela");
            } else {
                System.out.println("Número " + numero + " não está na cartela");
            }
 
            if (acertos == 16) {
                System.out.println("bingo! Você acertou todos os números em " + rodadas + " rodadas.");
                break;
            }
        }
    }
}
