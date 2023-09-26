package HTML82;
public class kiss {
    // omadused
    public String nimi;
    public int vanus;
    public String toug;
    // konstruktor
    public kiss(String x, int y, String z) {
        this.nimi = x;
        this.vanus = y;
        this.toug = z;
    }
    // tutvustamine
    public void meetod() {
        System.out.println("kassi nimi on " + this.nimi + ", ta on " + this.vanus + " aastat vana ja ta toug on " + this.toug);
    }
}
