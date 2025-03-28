package services;

import java.util.ArrayList;
import java.util.List;

import entity.Figure;

public class FigureService {
   private static List<Figure> figures = new ArrayList<>();
   public static void add(Figure figure) {
        figures.add(figure);
   }
   public static List<Figure> getFigures() {
    return figures;
   }
   

   
}
