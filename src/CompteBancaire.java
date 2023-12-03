import java.util.Objects;

public class CompteBancaire implements Comparable<CompteBancaire> {

    private String nomUser;
    private String prenomUser;
    private int numComp;

    private double solde;

    public CompteBancaire(String nomUser, String prenomUser, int numComp, double solde) {
        this.nomUser = nomUser;
        this.prenomUser = prenomUser;
        this.numComp = numComp;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "nomUser='" + nomUser + '\'' +
                ", prenomUser='" + prenomUser + '\'' +
                ", numComp=" + numComp +
                ", solde=" + solde +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompteBancaire that = (CompteBancaire) o;
        return numComp == that.numComp && Double.compare(solde, that.solde) == 0 && Objects.equals(nomUser, that.nomUser) && Objects.equals(prenomUser, that.prenomUser);
    }


    @Override
    public CompteBancaire clone() {
        try {
            return (CompteBancaire) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("erreur");
            return null;
        }

    }




    @Override
    public int compareTo(CompteBancaire o) {
        return (int)(this.solde-o.solde);
    }
}





