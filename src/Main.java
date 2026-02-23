public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);        // a = 3
        int b = calc.minus.apply(1, 1);       // b = 0
        //int c = calc.devide.apply(a, b);       // Здесь возникает ошибка: деление на ноль!

        //calc.println.accept(c);

        // Проверяем, что знаменатель не равен нулю
        if (b != 0) {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } else {
            System.out.println("Ошибка: деление на ноль невозможно!");
        }

    }
}