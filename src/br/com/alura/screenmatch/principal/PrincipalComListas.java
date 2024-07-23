package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("A procura da Felicidade", 2006);
        filme1.avalia(9);
        Filme filme2 = new Filme("Matilda", 1996);
        filme2.avalia(7);
        Filme filme3 = new Filme("Ponte para Terabítia", 2007);
        filme3.avalia(10);
        Serie serie1 = new Serie("Lost", 2004);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //verifica se item é uma instância de Filme e já conseguimos declarar o filme na linha do if
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
