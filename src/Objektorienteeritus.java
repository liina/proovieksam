import java.util.ArrayList;

/**
 * Siin failis kasutatakse objekti Laev, aga Laev klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta! Arvad, et ei jää vahele? :)
 */

public class Objektorienteeritus {

    public static void main(String[] args) {

        String laevaNimi = "Laineraidur";
        Laev raidur = new Laev(laevaNimi);

        raidur.lisaReisija("Teet Kalluste");
        raidur.lisaReisija("Peeter Kaan");
        raidur.lisaReisija("Maire Kaunaste");
        raidur.eemaldaReisija("Peeter Kaan");

        System.out.println("Pardal on järgmised isikud: " + raidur.votaReisijad());
        System.out.println("Pardal on nii mitu inimest: " + raidur.reisijateArv());
        System.out.println("Laeva nimi on " + raidur.misNimi());

        raidur.kalaHammustasKummipaatiAugu(); // Paanika!! mis nüüd saab?

        System.out.println("Pardal on järgmised isikud: " + raidur.votaReisijad());
        System.out.println("Pardal on nii mitu inimest: " + raidur.reisijateArv());
        System.out.println("Laeva nimi on " + raidur.misNimi());
    }

    private static class Laev {
        private String laevaNimi;
        private ArrayList<String> reisijad = new ArrayList<String>();

        public Laev (String laevaNimi) {

            this.laevaNimi=laevaNimi;
        }
        public void lisaReisija(String s) {

            reisijad.add(s);
        }

        public String misNimi() {

            return laevaNimi;
        }

        public void eemaldaReisija(String s) {
            reisijad.remove(s);
        }

        public String votaReisijad() {
            if(reisijad.size() > 0) {
                return reisijad.toString();
            }
            return "";
        }

        public String reisijateArv() {

            return Integer.toString(reisijad.size());
        }

        public void kalaHammustasKummipaatiAugu() {
            reisijad.clear();
        }
    }
}


