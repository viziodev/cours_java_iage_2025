package entity;

public class Carre extends Figure {
    private double cote;

    public Carre() {
        name =FigureName.Carre;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "Carre  [Id ="+id+ "Name="+ name +"cote=" + cote + "]";
    }

    @Override
    public double perimetre() {
        return cote*4;
    }

    @Override
    public double surface() {
        return cote*cote;
    }
    
}
