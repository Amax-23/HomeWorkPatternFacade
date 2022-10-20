import ru.netology.BinOps;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Результат суммы в двоичной системе: " + bins.sum("5", "5") + "." +
                " Результат суммы в десятичной системе: " + (5 + 5));
        System.out.println("Результат умножения в двоичной системе: " + bins.mult("5", "5") + "." +
                " Результат умножения в десятичной системе: " + (5 * 5));
    }
}