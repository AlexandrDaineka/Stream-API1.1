public class Main {
    public static void main(String[] args) {

            Calculator calc = Calculator.instance.get();
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);

    }
}
// причина возникновения ошибки, в чем заключается ошибка и способы ее решения.
// Причина возникновения ошибки в том , что программа не расчинана что пользователь будет делить на нуль.
// Способы ее решения:
// - не делить на нуль,
// - при попытке деления на ноль выводить пользователю, что он пытается делить на нуль
// - при делении на нуль возвращать 0.