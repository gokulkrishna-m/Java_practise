import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TestSimpleDateFormat {
    public static void main(String[] args) {

        String date1 = "29/05/2021";
        //Date date = new Date();
        //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
        //String strDate= formatter.format("29/05/2021");
        try{
            System.out.println("Before Parsing :"+date1);
            Date date = formatter.parse(date1);
            System.out.println("After Parsing :"+date);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
