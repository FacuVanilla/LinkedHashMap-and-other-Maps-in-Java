import java.util.HashMap;
import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        HashMap<String, Integer> stocks = new LinkedHashMap<>();
    
            stocks.put("Apple", 123);
            stocks.put("BMW", 54);
            stocks.put("Google", 87);
            stocks.put("Microsoft", 232);
            stocks.put("Oracle", 76);
        
            System.out.println(stocks); 
    }
}
