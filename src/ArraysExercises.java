import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Luke");
        people[1] = new Person("Leia");
        people[2] = new Person("Han");

        for(Person person : people) {
            System.out.println(person.getName());
        }

        Person[] newArray = addPerson(people, new Person("Lando"));

        for(Person person : newArray) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] pplArray, Person personToAdd) {
        Person[] tempArray = Arrays.copyOf(pplArray, pplArray.length+1);
        tempArray[tempArray.length-1] = personToAdd;

        return tempArray;
    }

}
