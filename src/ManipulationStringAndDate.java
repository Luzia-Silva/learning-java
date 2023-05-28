import java.util.Locale;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
public class ManipulationStringAndDate {

    public static  void main(String[] args){
        // String manipulation
        String name = "Luzia";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.equals("luzia"));
        System.out.println(name.equalsIgnoreCase("luzia"));

        // ISO 8601 - Padrão de datas utilizadas pelo Java;
        LocalDate today = LocalDate.now();
        // coletando informação do país e tipo de data
        Locale brasil = new Locale("pt", "BR");
        String dayWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        //LocalTime e validação
        String salutation;
        LocalTime time = LocalTime.now();
        if (time.getHour() >= 0 && time.getHour() < 12){
            salutation = "Bom dia";
        }
        else if(time.getHour() >= 12 && time.getHour() < 18){
            salutation = "Boa Tarde";
        }
        else if(time.getHour() >= 18 && time.getHour() < 24){
            salutation = "Boa noite";
        }
        else {
            salutation = "Sorry baby, mas não sei qual planeta você é!";
        }

        System.out.printf("Olá %s,hoje é %s. %s. São  %shrs agora.", name, dayWeek, salutation.toUpperCase(), time.getHour());

    }
}
