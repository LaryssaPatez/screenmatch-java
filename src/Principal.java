import br.com.java.screenmatch.modelos.Series;

public class Principal {
    public static void main(String[] args) {
        Series minhaSerie = new Series();

        //atributos setters
        minhaSerie.setNome("The 100");
        minhaSerie.setAnoDeLancamento(2014);
        minhaSerie.setTemporadas(7);
        minhaSerie.setNota(9);

        //exibe ficha técnica
        minhaSerie.exibeFichaTecnica();

        minhaSerie.avalia(10);
        minhaSerie.avalia(7);
        minhaSerie.avalia(8);
        System.out.println("Total de avaliações: " + minhaSerie.getTotalDeAvaliacoes());
        }
    }



