import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //FILMES
        Filme filme1 = new Filme("A procura da Felicidade", 2006);
        filme1.setDuracaoEmMinutos(180);
        filme1.setGenero("Apenas uma coisa para mim é mais importante que todas as outras: meu compromisso com meu filho. E essa é a nossa história.");
        System.out.println("Duração em minutos: " + filme1.getDuracaoEmMinutos());
        filme1.exibeFichaTecnica();

        filme1.avalia(9);
        filme1.avalia(8);
        filme1.avalia(5);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Filme filme2 = new Filme("Matilda", 1996);
        filme2.setDuracaoEmMinutos(98);
        filme2.avalia(9);

        Filme filme3 = new Filme("Ponte para Terabítia", 2007);
        filme3.setDuracaoEmMinutos(96);
        filme3.avalia(10);

        //SERIES
        Serie serie1 = new Serie("Lost", 2004);
        serie1.setGenero("Drama");
        serie1.setTemporadas(6);
        serie1.setEpisodiosPorTemporada(15);
        serie1.setMinutosPorTemporada(45);
        serie1.exibeFichaTecnica();
        System.out.println("Duração em minutos: " + serie1.getDuracaoEmMinutos());

            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
            calculadora.inclui(filme1);
            calculadora.inclui(serie1);
            System.out.println(calculadora.getTempoTotal());

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(filme1);

        //EPISODIOS
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);
    }
}
