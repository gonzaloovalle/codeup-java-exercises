package java_practice;

public class PowerOfThree {

    static boolean check(int x) {
        if (x <= 0) {
            return false;

        }
        return 1162261467 % x== 0;
    }
}
