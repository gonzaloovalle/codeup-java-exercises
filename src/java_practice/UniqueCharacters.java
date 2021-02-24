package java_practice;

public class UniqueCharacters {
    boolean uniqueCharacters(String str) {
        for (int i = 0; i < str.length(); i++ ) {
            for (int j = i + 1; j< str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueCharacters obj = new UniqueCharacters();
        String input = "Hello World";

        if (obj.uniqueCharacters(input)) {
            System.out.println("The String " + input + " has all unique characters");
        } else {
            System.out.println("The String " + input + " does not have all unique characters");
        }
    }
}
