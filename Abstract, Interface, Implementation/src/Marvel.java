// Subclass: Marvel

public class Marvel extends Superhero implements CaraTerbang, CaraSerang {
    public Marvel(String NamaHero) {
        super(NamaHero);
    }
    @Override
    public void Bentuk() {
        System.out.println("Superhero Marvel : " + NamaHero +  " Terwujud karena ia berasal dari 'Nanotechnology'. ");
    }
    @Override
    public void Terbang() {
        System.out.println("Superhero Marvel : " + NamaHero + " Bisa Terbang dari 'Teknologi'.");
    }
    @Override
    public void Serang() {
        System.out.println("Superhero Marvel : " + NamaHero + " Menyerang dengan kekuatan 'Daya Ledak dan Nuklir'.");
    }
}
