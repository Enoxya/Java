import java.util.Random;

public class GenerateurMotDePasse {
    public static void main(String[] args){
        int longueurMotDePasse = 10;
        System.out.println(genererMotDePasse(longueurMotDePasse));
    }

    private static char[] genererMotDePasse(int tailleMotDePasse) {
        String caracteresMajuscules = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracteresMinuscules = "abcdefghijklmnopqrstuvwxyz";
        String chiffres = "0123456789";
        String symboles="!@#$%^&*_=+-/�.?<>)";
        String caracteresMotDePasse = caracteresMajuscules + caracteresMinuscules + chiffres + symboles;
        Random aleatoire = new Random();

        char motDePasse[] = new char[tailleMotDePasse];

        System.out.println("Votre mot de passe généré aléatoirement :");

        for (int i = 0; i < tailleMotDePasse; i++) {
            motDePasse[i] = caracteresMotDePasse.charAt(aleatoire.nextInt(caracteresMotDePasse.length()));
        }

        return motDePasse;
    }
}
