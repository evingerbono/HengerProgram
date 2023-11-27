package hengerprogram;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<Henger> hengerek;
    private int hengerSzam;

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }

    public double atlagTerfogat() {
        double osszTerfogat = 0;
        for (int i = 0; i < hengerek.size(); i++) {
            osszTerfogat += hengerek.get(i).terfogat();
        }
        return osszTerfogat / hengerek.size();
    }

    public double csokvekSulya() {
        double osszSuly = 0;
        for (int i = 0; i < hengerek.size(); i++) {
            Henger tipus = hengerek.get(i);
            if (tipus instanceof LyukasHenger) {
                osszSuly += ((LyukasHenger) tipus).suly();
            }
        }
        return osszSuly;
    }

    public void run() {

    }

    public static void main(String[] args) {
        HengerProgram heng = new HengerProgram();
        heng.hengerek.add(new Henger(1,1) {});
        heng.hengerek.add(new TomorHenger(1.0, 1.0, 1.0));
        heng.hengerek.add(new LyukasHenger(1.0, 1.0, 1.0, 0.5));
        heng.hengerek.add(new LyukasHenger(1.0, 1.0, 1.0, 0.1));

        for (Henger henger : heng.hengerek) {
            System.out.println(henger.toString());
        }
        System.out.println("Létrehozott hengerek száma: " + Henger.getHengerDarab());
        System.out.println("Az összes henger átlagtérfogata: " + heng.atlagTerfogat());
        System.out.println("A csövek összsúlya: " + heng.csokvekSulya());
    }

}
