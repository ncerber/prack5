public class Test1 {
    public static String exec(String param1){
        String resString = param1+"_";
        for (char ch = 'a'; ch < 'z'; ch++) {
            resString+=ch;
        }
        return resString;
    }

    public static void main(String[] args) {
        System.out.println(exec("test1"));
    }
}
