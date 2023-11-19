import java.util.HashMap;

public class MyTestClass{

    private HashMap<String,String> tMap =  new HashMap<String,String>();

    public MyTestClass(){
    }
        

        public void addToMap(String key, String value){
            tMap.put(key, value);
        }

        /**
         * @param key
         * @return
         */
        public String gatValueFromMap(String key){
            return (String)tMap.get(key);
        }

    }