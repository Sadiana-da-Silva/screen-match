import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("A procura da Felicidade");
        filme1.setAnoDeLancamento(2006);
        filme1.setDuracaoEmMinutos(180);
        filme1.setGenero("Apenas uma coisa para mim é mais importante que todas as outras: meu compromisso com meu filho. E essa é a nossa história.");
        System.out.println("Duração em minutos: " + filme1.getDuracaoEmMinutos());
        filme1.exibeFichaTecnica();

        filme1.avalia(9);
        filme1.avalia(8);
        filme1.avalia(5);
        System.out.println("Total de avaliações: " + filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoDeLancamento(2004);
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
    }
}
