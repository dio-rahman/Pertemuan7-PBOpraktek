// Abstract Class: Superhero

public abstract class Superhero {
    String NamaHero;
    public Superhero(String NamaHero) {
        this.NamaHero = NamaHero;
    }

    abstract void Bentuk();
    public void info() {
        System.out.println("Bentuk wujud Superhero : " + NamaHero);
    }
}