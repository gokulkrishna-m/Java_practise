interface levelOne{
    String proof();
}

class Bangalore implements  levelOne{
    public String proof(){
        return "Sumbit Voter Id as a proof";
    }
}

class Chennai implements levelOne{
    public String proof(){
        return "Sumbit Aadhar card as a proof";
    }
}
public class TestCapgemini {
    public static void main(String[] args) {
        Bangalore b = new Bangalore();
        Chennai c = new Chennai();

        System.out.println(b.proof());
        System.out.println(levelTwo());
        System.out.println(c.proof());
        System.out.println(levelTwo());
    }
    public static String levelTwo(){
        return "Next process is in Delhi";
    }
}
