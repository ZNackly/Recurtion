public class Recursion {
    static int fuct(int n) {
        if (n == 0) { // точка останова
            return 1; // если дошли до точки останова (n = 0), возвращаем 1
        } else {
            return n * fuct(n - 1); // шаг рекурсии
        }
    }

    public static void main(String[] args) {
        System.out.println(fuct(5)); // --> 120
    }
}
