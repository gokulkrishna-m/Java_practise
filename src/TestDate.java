import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date current_time = new Date();
        Date start_time = new Date();
        Date end_time = new Date();
        Date sample_time = new Date();

        sample_time.setHours(12);
        sample_time.setMinutes(00);
        sample_time.setSeconds(00);


        System.out.println("Current time :"+current_time.getHours());

        if(current_time.getTime() >= 18 || (current_time.getHours() >=0 && current_time.getHours() <=10)){
            start_time.setHours(10);
            start_time.setMinutes(00);
            start_time.setSeconds(00);
            end_time.setHours(06);
            end_time.setMinutes(00);
            end_time.setSeconds(00);
        }
        System.out.println("Start time :"+start_time.toString()+"|| End Time :"+end_time.toString());
    }
}
