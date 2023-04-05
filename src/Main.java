public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """ 
                    Filme Top Gun
                    Filme de aventura 
                    Muito bom!!!
                    Ano de lançamento
                """ + anoDeLancamento; /*Recurso apartir do Java 15*/
        System.out.println(sinopse);

    }
}