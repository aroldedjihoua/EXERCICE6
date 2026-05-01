public class Personne {

    // compteur global (toutes les personnes)
    public static int nbInstances = 0;

    // compteur propre à chaque personne
    public int nbLocal = 0;

    public Personne() {
        nbInstances++; // +1 à chaque nouvelle personne
        nbLocal++;     // +1 pour cette personne
    }
}