

/**
 * Prindi konsooli 27x27 maatriks, kus on täidetud eesti tähestiku sudoku.
 * https://et.wikipedia.org/wiki/Eesti_t%C3%A4hestik
 */
public class Maatriks {
    public static void main(String[] args) {


   String alfastring = "Aa, Bb, Dd, Ee, Ff, Gg, Hh, Ii, Jj, Kk, Ll, Mm, Nn, Oo, Pp, Rr, Ss, Šš, Zz, Žž, Tt, Uu, Vv, Õõ, Ää, Öö, Üü";
    String[] alfa = alfastring.split(", ");

    int pikkus = alfa.length;
        for (int i = 0; i < pikkus; i++) {
            String first = alfa[0];
            for (int j = 1; j < pikkus; j++) {
                System.out.print(alfa[j]);
                alfa[j-1] = alfa[j];
            }
            alfa[pikkus-1] = first;
            System.out.println("");
        }
    }
}
