public class practice {
    public static boolean equal(String s1,String s2){
        if(s1.compareTo(s2)==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="ab";
        System.out.println(equal(s1,s2));
    }
}
