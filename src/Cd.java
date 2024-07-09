public class Cd {
    private int numeroMusicas;
    private int faixaAtual;
    private boolean tocando;

    public Cd(int numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
        this.faixaAtual = 1;
        this.tocando = false;
    }
    public void play() {
        this.tocando = true;
        System.out.println("Tocando faixa " + this.faixaAtual);
        imprimirEstadoAtual();
    }
    public void pause() {
        this.tocando = false;
        System.out.println("Pausado na faixa " + this.faixaAtual);
        imprimirEstadoAtual();
    }  public void stop() {
        this.tocando = false;
        this.faixaAtual = 1;
        System.out.println("CD parado. Voltou para a faixa 1.");
        imprimirEstadoAtual();
    }public void proximaFaixa() {
        this.faixaAtual++;
        if (this.faixaAtual > this.numeroMusicas) {
            this.faixaAtual = 1;
        }
        System.out.println("Avançou para a próxima faixa: " + this.faixaAtual);
        imprimirEstadoAtual();
    }public void faixaAnterior() {
        this.faixaAtual--;
        if (this.faixaAtual < 1) {
            this.faixaAtual = this.numeroMusicas;
        }
        System.out.println("Retrocedeu para a faixa anterior: " + this.faixaAtual);
        imprimirEstadoAtual();
    }


    private void imprimirEstadoAtual() {
        System.out.println("a faixa esta:");
        System.out.println("Faixa atual: " + this.faixaAtual);
        System.out.println("Tocando: " + (this.tocando ? "Sim" : "Não"));
        System.out.println();
    }










}
