public class Test2 {
    public static String exec(String param1){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1);
        stringBuilder.append("_");

        for (char ch = 'a'; ch < 'z'; ch++) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(exec("test1"));
    }
}
