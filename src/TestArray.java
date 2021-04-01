public class TestArray {
    public static void main(String[] args) {
        String[] arr = new String[2];
        arr[0] = "gokul";
        arr[1] = "Krishna";

        sample(arr);
        int count=1;
        System.out.println("Count :"+count++);
        System.out.println("Count :"+count++);
        System.out.println("Count :"+count++);

        String name = "Gokul"+System.lineSeparator()+"Krishna"+System.lineSeparator()+"GokulKrishna";

        String[] na = name.split("[\r\n]+");
        //System.out.println(na.length);
        String n1 = name.split("[\r\n]+")[0];
        String n2 = name.split("[\r\n]+")[1];
        String n3 = name.split("[\r\n]+")[2];

        System.out.println("N1 :"+n1+" ||N2 :"+n2+" ||N3 :"+n3);

        double d2 = 0;
        System.out.println("sdf :"+(d2 == 0.0));

        String d = "0";
        String d1 = String.valueOf(Double.parseDouble(d));

        System.out.println("fsdf :"+d1);
        if(d1.trim().equals("0.0")){
            System.out.println("Gokul :"+d1.trim());
        }else{
            System.out.println("Krishna :"+d1.trim());
        }
    }

    public static void sample(String... args){
        System.out.println(args[0]);
        System.out.println(args[1]);
//        System.out.println(args);
    }
}
