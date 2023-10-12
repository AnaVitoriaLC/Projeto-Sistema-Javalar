package matriz;


public class MatrizPlanetaria {
    private static final int NUM_LINHAS = 18;
    private static final int NUM_COLUNAS = 18;

    private static double[][] matriz = new double[NUM_LINHAS][NUM_COLUNAS];

    public static double obterElementoMatriz(int linha, int coluna) {
        return matriz[linha][coluna];
    }

    public static void definirElementoMatriz(int linha, int coluna, double valor) {
        matriz[linha][coluna] = valor;
    }

    public static double obterTamanhoMatriz() {
        return NUM_LINHAS * NUM_COLUNAS;
    }

    public static void imprimirMatriz() {
        for (int linha = 0; linha < NUM_LINHAS; linha++) {
            for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
                System.out.print(obterElementoMatriz(linha, coluna) + " ");
            }
            System.out.println();
        }
    }

    public static void inicializarMatriz() {
        for (int linha = 0; linha < NUM_LINHAS; linha++) {
            for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
                definirElementoMatriz(linha, coluna, 0.0);
            }
        }
    }
}