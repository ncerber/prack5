public class Test3 {
    public static String exec(String param1){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(param1);
        stringBuffer.append("_");

        for (char ch = 'a'; ch < 'z'; ch++) {
            stringBuffer.append(ch);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(exec("test1"));
    }
}
