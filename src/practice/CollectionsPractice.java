package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<String> colors_list = new ArrayList<String>();
        colors_list.add("Red");
        colors_list.add("Green");
        colors_list.add("Orange");
        colors_list.add("White");
        colors_list.add("Black");
        for (String color : colors_list) {
            System.out.println(color);
        }

        System.out.println(colors_list);

        colors_list.add(0, "Pink");
        colors_list.add(5, "Yellow");
        System.out.println("After adding two elements at first and last index:\n"+colors_list);

        String element = colors_list.get(0);
        System.out.println("First element: "+element);
        element = colors_list.get(2);
        System.out.println("Third element: "+element);

        System.out.println("Before replacing third element in the list:\n"+colors_list);
        colors_list.set(2, "Yellow");
        System.out.println("After replacing third element in the list:\n"+colors_list);

        System.out.println("Before removing third element from the list:\n"+colors_list);
        colors_list.remove(2);
        System.out.println("After removing third element from the list:\n"+colors_list);

        if (colors_list.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

        System.out.println("List before sort: "+colors_list);
        Collections.sort(colors_list);
        System.out.println("List after sort: "+colors_list);

        ArrayList<String> shapes_list = new ArrayList<String>();
        shapes_list.add("Square");
        shapes_list.add("Circle");
        shapes_list.add("Triangle");
        shapes_list.add("Rhombus");
        shapes_list.add("Star");
        for (String shape : shapes_list) {
            System.out.println(shape);
        }

        System.out.println(shapes_list);

        ArrayList list = (ArrayList)colors_list.clone();

        System.out.println(list);

        System.out.println("Original List: "+colors_list);
        Collections.shuffle(colors_list);
        System.out.println("Shuffled list: "+colors_list);

        System.out.println("Original List: "+shapes_list);
        Collections.shuffle(shapes_list);
        System.out.println("Shuffled List: "+shapes_list);

        System.out.println("Original List: "+list);
        Collections.shuffle(list);
        System.out.println("Shuffled List: "+list);

        System.out.println("Original List: "+colors_list);
        Collections.reverse(colors_list);
        System.out.println("Reversed list: "+colors_list);

        System.out.println("Original List: "+shapes_list);
        Collections.reverse(shapes_list);
        System.out.println("Reversed List: "+shapes_list);

        System.out.println("Original List: "+list);
        Collections.reverse(list);
        System.out.println("Reversed List: "+list);
    }
}
