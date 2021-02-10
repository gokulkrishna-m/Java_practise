package PractiseOne;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Dummy{
    private void foo(){
        System.out.println("foo method");
    }
}
public class TestPrivateMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Dummy d = new Dummy();
        Method m = Dummy.class.getDeclaredMethod("foo");
        m.setAccessible(true);
        m.invoke(d);
    }
}
