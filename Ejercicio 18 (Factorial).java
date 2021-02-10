public class Excercise {
    public static int fact(int n) {
        // La variable result almacenará el resultado del factorial
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = i * result;
        }

        return result;
    }
}