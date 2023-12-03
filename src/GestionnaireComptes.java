import java.util.Arrays;
import java.util.Collections;

public class GestionnaireComptes extends CompteBancaire {

    private CompteBancaire[] tableauComptes;

    public GestionnaireComptes(int taille) {
        super("", "", 0, 0.0);
        this.tableauComptes = new CompteBancaire[taille];
    }

    public GestionnaireComptes(CompteBancaire[] comptes) {
        super("", "", 0, 0.0);
        this.tableauComptes = Arrays.copyOf(comptes, comptes.length);
    }

    public void trierTableau() {
        Arrays.sort(tableauComptes);
    }

    public void ajouterElement(CompteBancaire compte) {

        for (int i = 0; i < tableauComptes.length; i++) {
            if (tableauComptes[i] == null) {
                tableauComptes[i] = compte;
                break;
            }
        }
    }

    public void supprimerElement(CompteBancaire compte) {
        for (int i = 0; i < tableauComptes.length; i++) {
            if (tableauComptes[i] != null && tableauComptes[i].equals(compte)) {
                tableauComptes[i] = null;
                break;
            }
        }
    }

    public int nombreElements() {
        int count = 0;
        for (CompteBancaire compte : tableauComptes) {
            if (compte != null) {
                count++;
            }
        }
        return count;
    }

    public void inverserOrdreTableau() {
        Collections.reverse(Arrays.asList(tableauComptes));
    }

    public void afficherTableau() {
        for (CompteBancaire compte : tableauComptes) {
            if (compte != null) {
                System.out.println(compte);
            }
        }
    }

    public CompteBancaire elementLePlusGrand() {
        CompteBancaire maxCompte = null;
        for (CompteBancaire compte : tableauComptes) {
            if (compte != null && (maxCompte == null || compte.compareTo(maxCompte) > 0)) {
                maxCompte = compte;
            }
        }
        return maxCompte;
    }

    public boolean testerEgalite(GestionnaireComptes autreGestionnaire) {
        return Arrays.equals(this.tableauComptes, autreGestionnaire.tableauComptes);
    }
}
