interface Ann{
    void annon();
}

public class TestAnnonymousClass {
    public static void main(String[] args) {
        Ann a1 = new Ann() {
            @Override
            public void annon() {
                System.out.println("lavanya");
            }
        };

        a1.annon();
    }
}

