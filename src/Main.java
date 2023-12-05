public class Main {
    public static void main(String[] args) {
        //creo oggetto generico Animale
        Animale animaleGenerico = new Animale();

        //richiamo il metodo
        animaleGenerico.faiIlVerso();  //stampami il verso dell'animale

        //mi creo un oggetto gatto
        Gatto gatto = new Gatto();

        //richiamo il metodo faiIlVerso della classe Gatto
        gatto.faiIlVerso();  // stampa il gatto fa miao
    }
}