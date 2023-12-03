public class Main {
    public static void main(String[] args) {

        CompteBancaire compte1 = new CompteBancaire("John", "Doe", 12345, 1000.0);
        CompteBancaire compte2 = new CompteBancaire("Jane", "Doe", 67890, 1500.0);

        System.out.println("Test de la classe CompteBancaire:");
        System.out.println(compte1);
        System.out.println(compte2);
        System.out.println("Comparaison de comptes : " + compte1.compareTo(compte2));

        // Test de la classe Account (classe fille)
        Account account1 = new Account("Alice", "Wonder", 111, 2000.0, 1, true);
        Account account2 = new Account("Bob", "Builder", 222, 2500.0, 2, false);

        System.out.println("\nTest de la classe Account:");
        System.out.println(account1);
        System.out.println(account2);

        // Test de la classe GestionnaireComptes
        CompteBancaire[] comptesArray = {compte1, compte2, account1, account2};
        GestionnaireComptes gestionnaireComptes = new GestionnaireComptes(comptesArray);

        System.out.println("\nTest de la classe GestionnaireComptes:");
        gestionnaireComptes.afficherTableau();
        System.out.println("Nombre d'éléments : " + gestionnaireComptes.nombreElements());
        gestionnaireComptes.trierTableau();
        System.out.println("Tableau trié :");
        gestionnaireComptes.afficherTableau();
        System.out.println("Element le plus grand : " + gestionnaireComptes.elementLePlusGrand());

        // Test de la classe GestionnaireComptesList
        GestionnaireComptesList gestionnaireComptesList = new GestionnaireComptesList();
        gestionnaireComptesList.insererElement(compte1);
        gestionnaireComptesList.insererElement(account1);

        System.out.println("\nTest de la classe GestionnaireComptesList:");
        gestionnaireComptesList.afficherListe();
        System.out.println("Trier la liste :");
        gestionnaireComptesList.trierListe();
        gestionnaireComptesList.afficherListe();
        System.out.println("Rechercher compte1 : " + gestionnaireComptesList.rechercherElement(compte1));
    }    }
