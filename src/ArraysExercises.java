import java.util.Arrays;

public class ArraysExercises extends Person {

    public ArraysExercises(String name) {
        super(name);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] Person = {"Luke", "Han", "Leia"};

        for (int i = 0; i < Person.length; i += 1) {
            System.out.println(Person[i]);
        }
    }

//    public static addPerson()

}
