
package HTML9;
import java.util.Date;

public class tsiklid {
    // varid
    public String nimi;
    public int pikkus;
    public Date viimane_soit;
    // konstruktor
    public tsiklid(String x, int y, Date z) {
        this.nimi = x;
        this.pikkus = y;
        this.viimane_soit = z;
    }

    public void info() {
        System.out.println("Motikas: " + this.nimi + " pikkusega " + this.pikkus + "cm" + " viimane soit oli " + this.viimane_soit + ".");

    }
}
