package entity;

public class Paiement {
    private String date;
    private double montant;
    public Paiement() {
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    @Override
    public String toString() {
        return "Paiement [date=" + date + ", montant=" + montant + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        long temp;
        temp = Double.doubleToLongBits(montant);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paiement other = (Paiement) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (Double.doubleToLongBits(montant) != Double.doubleToLongBits(other.montant))
            return false;
        return true;
    }

    
}
