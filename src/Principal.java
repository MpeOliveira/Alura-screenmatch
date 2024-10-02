import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Rating;
import br.com.alura.screenmatch.modelos.Episodes;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.services.FilterRecomendation;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The GodFather", 1972);

        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(5.7);
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(8);
        System.out.println("Total de Avaliacões: " + meuFilme.getTotalDeAvaliacoes());
        System.out.printf("Media das Avaliações: %.2f", meuFilme.getMedia());

        Serie sonsOfAnarchy = new Serie("Sons of Anarchy", 2008);

        sonsOfAnarchy.exibeFichaTecnica();
        sonsOfAnarchy.setTemporadas(7);
        sonsOfAnarchy.setEpisodiosPorTemporadas(13);
        sonsOfAnarchy.setMinutosPorEpisodio(50);
        System.out.println("Duração total em minutos: " + sonsOfAnarchy.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Schindler's List", 1993);

        outroFilme.setDuracaoEmMinutos(195);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(sonsOfAnarchy);
        System.out.println(calculadora.getTempoTotal());


        FilterRecomendation filter = new FilterRecomendation();
        filter.filters(meuFilme);


        Episodes episode = new Episodes();
        episode.setNumberEpisode(1);
        episode.setSerie(sonsOfAnarchy);
        episode.setTotalViews(300);
        filter.filters(episode);

        ArrayList<Filme> filmeArrayList = new ArrayList<>();
        filmeArrayList.add(meuFilme);
        filmeArrayList.add(outroFilme);
        System.out.println("Tamanho do Array: " + filmeArrayList.size());
        System.out.println(filmeArrayList);
        System.out.println(filmeArrayList.get(0).toString());

    }
}
