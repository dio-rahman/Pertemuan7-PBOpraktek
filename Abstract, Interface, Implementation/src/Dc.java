// Subclass: Dc

public class Dc extends Superhero implements CaraTerbang, CaraSerang {
    public Dc(String NamaHero) {
        super(NamaHero);
    }
    @Override
    public void Bentuk() {
        System.out.println("Superhero DC : " + NamaHero + " Terwujud karena ia berasal dari 'Fisik Manusia Super'.");
    }
    @Override
    public void Terbang() {
        System.out.println("Superhero Dc : " + NamaHero + " Bisa Terbang dari 'Cahaya Matahari'.");
    }
    @Override
    public void Serang() {
        System.out.println("Superhero Dc : " + NamaHero + " Menyerang dengan kekuatan 'Peningkatan fisik'.");
    }
}