import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        String calc = sc.nextLine();
        String[] symbol = calc.split(" ");

        if (symbol.length == 1){
            throw new UnsupportedOperationException("т.к. строка не является математической операцией.");
        }else if(symbol.length != 3){
            throw new UnsupportedOperationException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
        }
        if(symbol[0].matches("[0-9][0]?") && symbol[2].matches("[0-9][0]?")) {
            int a = Integer.parseInt(symbol[0]);
            int b = Integer.parseInt(symbol[2]);
            if (a > 10 || a < 1 || b > 10 || b < 1) {
                throw new UnsupportedOperationException("т.к. числа должны быть от 1 до 10 включительно, не более.");
            }
            System.out.println(c.operation(a, b, symbol[1]));
        }else {
            throw new UnsupportedOperationException("т.к. одно или оба символа математической операции не являются арабскими целыми числами.");
        }

    }


}