// Subclass: ImageT

public class ImageT extends Superhero implements CaraTerbang, CaraSerang {
    public ImageT(String NamaHero) {
        super(NamaHero);
    }
    @Override
    public void Bentuk() {
        System.out.println("Superhero ImageT : " + NamaHero + " Terwujud karena ia berasal dari 'Necroplasm'.");
    }
    @Override
    public void Terbang() {
        System.out.println("Superhero ImageT : " + NamaHero + " Bisa Terbang dari 'Energi Necro'.");
    }
    @Override
    public void Serang() {
        System.out.println("Superhero ImageT : " + NamaHero + " Menyerang dengan kekuatan 'Manipulasi Energi Mistis'.");
    }
}