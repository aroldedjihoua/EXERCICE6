public class Main {

    public static void main(String[] args) {

        // on crée des objets (sans les stocker inutilement)
        new Personne();
        new Personne();
        new Personne();

        // on crée une 4ème personne qu'on utilise pour affichage
        Personne personne4 = new Personne();

        // affichage du compteur local (toujours 1)
        System.out.println("Compteur local = " + personne4.nbLocal);

        // affichage du compteur global (total des objets créés)
        System.out.println("Compteur global = " + Personne.nbInstances);
    }
}