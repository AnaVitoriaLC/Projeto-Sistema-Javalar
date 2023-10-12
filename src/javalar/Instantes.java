package javalar;

public class Instantes {

    private long numInstantes;
    private long numSegundos;

    public Instantes(long numInstantes, long numSegundos) {
        this.numInstantes = numInstantes;
        this.numSegundos = numSegundos;
    }

    public void executar() {
        long startTime = System.nanoTime();

        for (long i = 0; i < numInstantes; i++) {
            // Implemente os movimentos dos planetas aqui.
            // Atualize as posições e velocidades dos planetas.
        }

        long tempoDecorrido = System.nanoTime() - startTime;
        double segundosDecorridos = (double) tempoDecorrido / 1e9;

        System.out.format("Executou %d instantes em %.2f segundos.\n", numInstantes, segundosDecorridos);
    	}
	}
