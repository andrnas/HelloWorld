
public class HelloWorld {

    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println(getTheValue(args));
        System.exit(0);

    }

    private static String getTheValue(String[] args){
        if(args.length>0){
            return args[0];
        }else{
            MyTestClass test = new MyTestClass();
            test.addToMap("Key1", "Hello world");
            return test.gatValueFromMap("Key1");
        }
    }

}