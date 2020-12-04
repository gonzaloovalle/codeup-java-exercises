public class ControlFlowExercises {

    public static void main(String[] arg) {

        int i = 5;

        while(i <= 15) {
            System.out.print(i);
            System.out.print(" ");
            i += 1;
        }

//        int counter = 0;
//
//        do{
//            System.out.println(counter);
//            counter += 2;
//        }while(counter <= 100);

//        int counter = 100;
//
//        do{
//            System.out.println(counter);
//            counter -= 5;
//        }while(counter >= -10);

        long start = 2L;
        do{
            System.out.println(start);
            start *= start;
        }while(start < 1000000L);

//        for (int i = 100; i >= 0; i -= 2) {
//            System.out.println(i);
//        }
//
//        long i;
//
//        for (i = 2L; i < 1000000L; i *= i) {
//            System.out.println(i);
//        }
    }

}
