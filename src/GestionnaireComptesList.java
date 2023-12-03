import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestionnaireComptesList {

    private List<CompteBancaire> listeComptes;

    public GestionnaireComptesList() {
        this.listeComptes = new ArrayList<>();
    }

    public void alimenterListe(List<CompteBancaire> comptes) {
        listeComptes.addAll(comptes);
    }

    public void afficherListe() {
        for (CompteBancaire compte : listeComptes) {
            System.out.println(compte);
        }
    }

    public void parcourirListe() {
        Iterator<CompteBancaire> iterator = listeComptes.iterator();
        while (iterator.hasNext()) {
            CompteBancaire compte = iterator.next();
        }
    }

    public void insererElement(CompteBancaire compte) {
        listeComptes.add(compte);
    }

    public CompteBancaire recupererElement(int index) {
        if (index >= 0 && index < listeComptes.size()) {
            return listeComptes.get(index);
        }
        return null;
    }

    public void supprimerElement(CompteBancaire compte) {
        listeComptes.remove(compte);
    }

    public boolean rechercherElement(CompteBancaire compte) {
        return listeComptes.contains(compte);
    }

    public void trierListe() {
        Collections.sort(listeComptes);
    }

    public List<CompteBancaire> copierListe() {
        return new ArrayList<>(listeComptes);
    }

    public void melangerListe() {
        Collections.shuffle(listeComptes);
    }

    public void inverserListe() {
        Collections.reverse(listeComptes);
    }

    public List<CompteBancaire> extrairePartieListe(int debut, int fin) {
        if (debut >= 0 && fin < listeComptes.size() && debut <= fin) {
            return new ArrayList<>(listeComptes.subList(debut, fin + 1));
        }
        return null;
    }

    public boolean comparerListes(List<CompteBancaire> autreListe) {
        return listeComptes.equals(autreListe);
    }

    public void echangerElements(int index1, int index2) {
        if (index1 >= 0 && index1 < listeComptes.size() && index2 >= 0 && index2 < listeComptes.size()) {
            Collections.swap(listeComptes, index1, index2);
        }
    }

    public void viderListe() {
        listeComptes.clear();
    }

    public boolean estVide() {
        return listeComptes.isEmpty();
    }
}
