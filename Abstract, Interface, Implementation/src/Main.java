// Main

public class Main {
    public static void main(String[] args) {
        Superhero Marvel = new Marvel("Ironman");
        Superhero Dc = new Dc("Superman");
        Superhero ImageT = new ImageT("Spawn");

        Marvel.info();
        Marvel.Bentuk();
        ((CaraTerbang) Marvel).Terbang();
        ((CaraSerang) Marvel). Serang();

        Dc.info();
        Dc.Bentuk();
        ((CaraTerbang) Dc).Terbang();
        ((CaraSerang) Dc). Serang();

        ImageT.info();
        ImageT.Bentuk();
        ((CaraTerbang) ImageT).Terbang();
        ((CaraSerang) ImageT). Serang();
        System.out.println();
    }
}