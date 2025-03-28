package entity;

public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    
    public Rectangle() {
        name = FigureName.Rectangle;;
    }
    public double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return "Rectangle  [Id ="+id+ " Name="+ name +" Longueur=" + longueur +" Largeur=" + largeur+ "]";
    }

    @Override
    public double perimetre() {
        return (longueur+largeur)*2;
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }

}
