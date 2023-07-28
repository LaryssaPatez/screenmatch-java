package br.com.java.screenmatch.modelos;

// atributos
public class Series {
    private String nome;
    private int temporadas;
    private int anoDeLancamento;
    private int nota;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;

    //atributos getters
    public int getTotalDeAvaliacoes () {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getNota() {
        return nota;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    //atributos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    //exibe ficha técnica
    String tipoPlano;

    public void exibeFichaTecnica() {
        System.out.println("Série: " + nome);
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nota: " + nota);
    }

    //registra nota
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //retorna média
    public double retornaMedia() { // double = tipo/valor que irá receber -- retornoMedia = nome variável
        return somaDasAvaliacoes / totalDeAvaliacoes; //retorn indica que algo será retornado
    }
}
