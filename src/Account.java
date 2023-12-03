import java.util.Objects;

public class Account extends CompteBancaire {

    private int id;
    private boolean isActive;

    public Account(String nomUser, String prenomUser, int numComp, double solde,int id,boolean isActive) {
        super(nomUser, prenomUser, numComp, solde);
        this.id=id;
         this.isActive=isActive;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Account account = (Account) o;
        return id == account.id && isActive == account.isActive;
    }

    @Override
    public CompteBancaire clone() {
        return super.clone();
    }
}
