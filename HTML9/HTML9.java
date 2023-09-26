package HTML9;
import java.util.Date;
public class HTML9 {
    public static void main(String[] args) {
        Date praeguneaeg = new Date();

        soitjad s1 = new soitjad("mirkolaineahi", 180, 1.5);
        tsiklid t1 = new tsiklid("lada", 180, praeguneaeg);
        treeningrajad tr1 = new treeningrajad("tartu", 10, 1.5);

        s1.info();
        t1.info();
        tr1.info();
    }
}
