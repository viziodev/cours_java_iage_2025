package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDateService {

public static  String toFr(LocalDate dateEng){ 
       DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
       return formatter.format(dateEng);
}
public static  String toEng(LocalDate dateFr){ 
    DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return formatter.format(dateFr); 
}


}
