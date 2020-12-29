package util;

import java.util.Scanner;

public class Input {
    private final Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return this.sc.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
        return yesNo("Please enter yes or no.");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String input = this.sc.next();
        return (input.trim().toLowerCase().equals("y") || input.trim().toLowerCase().equals("yes"));
    }

    public int getInt(){
        System.out.println("Please enter an int.");
        return this.sc.nextInt();
    }

    public int getInt(int min, int max){
        return getInt(min,max,"Please enter an int between "+min+" and "+max);
    }

    public int getInt(int min, int max, String prompt){
        int input;
        do{
            System.out.println(prompt);
            input = this.sc.nextInt();
        } while(input < min || input > max);

        return input;
    }

    public double getDouble(){
        System.out.println("Please enter a double");
        return this.sc.nextDouble();
    }

    public double getDouble(double min, double max){
        return getDouble(min, max, "Please enter a double between "+min+" and "+max);
    }

    public double getDouble(double min, double max, String prompt){
        double input;
        do{
            System.out.println(prompt);
            input = this.sc.nextDouble();
        } while(input < min || input > max);

        return input;
    }

    public int getInt(String s) {
        return 0;
    }
}
