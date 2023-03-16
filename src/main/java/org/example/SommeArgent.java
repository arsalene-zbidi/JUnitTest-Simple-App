package org.example;
public class SommeArgent {
    private int quantite;
    private String unite;
    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }
    public int getQuantite() {
        return quantite;
    }
    public String getUnite() {
        return unite;
    }
    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
        if (!m.getUnite().equals(this.getUnite())) {
            throw new UniteDistincteException(this, m);
        }
        else return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
    }
    public boolean equals (SommeArgent m1){
        return  ((this.getQuantite()== m1.getQuantite())&& this.getUnite().equals(m1.getUnite()));
    }

}
