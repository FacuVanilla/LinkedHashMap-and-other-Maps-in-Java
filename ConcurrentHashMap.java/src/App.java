import java.util.concurrent.ConcurrentHashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        ConcurrentHashMap<String, Integer> stocks = new ConcurrentHashMap<>();
        
            stocks.put("Google", 123);
            stocks.put("Microsoft", 654);
            stocks.put("Apple", 345);
            stocks.put("Tesla", 999);
        
            System.out.println(stocks);
        
            // Since we are using putIfAbsent(), and Apple is already in the Map, the value will not be added.
            stocks.putIfAbsent("Apple", 1000);
        
            System.out.println(stocks);
    }
}
