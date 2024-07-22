package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private int duracaoEmMinutos;

    //construtor - nome do filme
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    //sobrescrever o método toString da classe Super Mãe
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
