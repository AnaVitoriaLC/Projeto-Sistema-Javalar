package planetas;

import matriz.MatrizPlanetaria;

public abstract class Planeta {
    protected String nome;
    protected int posicaoX;
    protected int posicaoY;

    public Planeta(String nome, int posicaoX, int posicaoY) {
        this.nome = nome;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        MatrizPlanetaria.definirElementoMatriz(posicaoX, posicaoY, 1.0); // Define a posição inicial na matriz
    }

    public abstract void executarMovimento();

    // Método para atualizar a posição do planeta
    protected void atualizarPosicao(int novaPosX, int novaPosY) {
        MatrizPlanetaria.definirElementoMatriz(posicaoX, posicaoY, 0.0); // Remove a posição anterior
        MatrizPlanetaria.definirElementoMatriz(novaPosX, novaPosY, 1.0); // Define a nova posição
        posicaoX = novaPosX;
        posicaoY = novaPosY;
    }
}
