package BackendEngineering.src.DS;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> necessity= new ArrayList<String>();
        necessity.add("Laptop");
        necessity.add("mobile");
        necessity.add("Money");
        necessity.set(2,"khabar");
        for (String i:necessity
             ) {
            System.out.println(i);
        }
        ArrayList<ArrayList<String>> arrayLists2d= new ArrayList<>();

    }
}
