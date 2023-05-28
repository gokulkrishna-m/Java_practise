class access
{
    static int x;
    void increament()
    {
        ++x ;
    }
}
class MainClass
{
    public static void main (String arg[])
    {
        access obj1 = new access();
        access obj2 = new access();
        System.out.println(obj1.x +"||" +obj2.x);
        obj1.x = 0;
        System.out.println(obj1.x +"||" +obj2.x);
        obj1.increament();
        System.out.println(obj1.x +"||" +obj2.x);
        obj2.increament();
        System.out.println(obj1.x +"||" +obj2.x);
        System.out.println(obj1.x + obj2.x);
        System.out.println();
    }
}