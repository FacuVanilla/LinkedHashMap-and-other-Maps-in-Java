import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
            Employee emp1 = new Employee(123, "Saurav");
        
            Employee emp2 = new Employee(123, "Saurav");
        
            Map<Employee, String> hashMap = new HashMap<>();
            hashMap.put(emp1, "emp1");
            hashMap.put(emp2, "emp2");
        
            Map<Employee, String> identityHashMap = new IdentityHashMap<>();
            identityHashMap.put(emp1, "emp1");
            identityHashMap.put(emp2, "emp2");
        
            System.out.println("The employee objects in HashMap are:");
            System.out.println(hashMap);
        
            System.out.println();
            System.out.println("The employee objects in IdentityHashMap are:");
            System.out.println(identityHashMap);
    }
}
