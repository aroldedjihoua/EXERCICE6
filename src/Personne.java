public class Personne {

    // compteur global (toutes les instances)
    public static int nbInstances = 0;

    // compteur propre à chaque objet
    public int nbLocal = 0;

    // constructeur appelé à chaque création d'objet
    public Personne() {
        nbInstances++; // augmente le total
        nbLocal++;     // augmente pour cet objet
    }
}