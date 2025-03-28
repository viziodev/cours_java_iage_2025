package entity;

public abstract class Figure {
    private static int nbreFigures;
    protected int id;
    protected FigureName name;

    public int getId() {
        return id;
    }
    public FigureName getName() {
        return name;
    }

    public void setName(FigureName name) {
        this.name = name;
    }

    public Figure() {
        id=++nbreFigures;
    }

    public abstract double surface();
    public abstract double perimetre();

    @Override
    public String toString() {
        return "Figure [name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        Figure other = (Figure) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
