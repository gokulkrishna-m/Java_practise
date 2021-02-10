public class TestStringAnagram
{
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        boolean result = true;

        if(c1.length != c2.length){
            result = false;
        }

        for(int i = 0;i<c1.length;i++){
            if (c1[i] == c2[i]){
                result = true;
            }else {
                result = false;
            }
        }

        return result;
    }
}