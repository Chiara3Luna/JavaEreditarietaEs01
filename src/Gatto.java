//definizione della sottoclasse Gatto che eredita da Animale
class Gatto extends Animale {
    //Override del metodo faiIlVerso
    @Override
    public void faiIlVerso() {
        System.out.println("Il gatto fa: Miao!");
    }
}