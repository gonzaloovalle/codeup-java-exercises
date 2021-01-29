package practice;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        for (String element : list_Strings) {
            System.out.println(element);
        }

        System.out.println(list_Strings);

        list_Strings.add(0, "Pink");
        list_Strings.add(5, "Yellow");
        System.out.println(list_Strings);

        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        element = list_Strings.get(2);
        System.out.println("Third element: "+element);

        System.out.println(list_Strings);
        list_Strings.set(2, "Yellow");
        System.out.println(list_Strings);
    }
}
