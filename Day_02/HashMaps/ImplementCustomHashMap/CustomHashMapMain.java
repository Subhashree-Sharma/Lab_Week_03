package HashMaps.ImplementCustomHashMap;

//main class
public class CustomHashMapMain {
    public static void main(String[] args) {

        //map object
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println("Value for 'One': " + map.get("One"));
        map.remove("One");
        System.out.println("Value for 'One' after removal: " + map.get("One"));
    }
}

