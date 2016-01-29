
/**
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said alla keskmise iga grupi kohta?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(allaKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaKeskmise(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int allaKeskmise(int[] ints) {
        int tudengiteArv = ints.length;
        int summa = 0;
        int keskmine;
        int allaKeskmise = 0;
        for (int i = 0; i < tudengiteArv ; i++) {
            int hinne = ints[i];
            if (hinne > 60) {
                hinne = 60;
            }
            summa += hinne;
        }
        keskmine = summa / tudengiteArv;
        System.out.println("Keskmine " + keskmine);
        for (int i = 0; i < tudengiteArv ; i++) {
            int hinne = ints[i];
            if (hinne < keskmine) {
                allaKeskmise++;
            }
        }
        return allaKeskmise;
    }

}
