import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RomArab s = new RomArab();
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        String calc = sc.nextLine();
        String[] symbol = calc.split(" ");

        if (symbol.length == 1){
            throw new UnsupportedOperationException("т.к. строка не является математической операцией.");
        }else if(symbol.length != 3){
            throw new UnsupportedOperationException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
        }


        if (s.isRoman(symbol[0]) && s.isRoman(symbol[2])){
            int a = s.romToArab(symbol[0]);
            int b = s.romToArab(symbol[2]);
            if (a > 10 || a < 1 || b > 10 || b < 1){throw new UnsupportedOperationException("т.к. числа должны быть от I до Хвключительно, не более.");}
            int rezult = c.operation(a, b, symbol[1]);
            if (rezult <= 0){
                throw new UnsupportedOperationException("т.к. в римской системе нет отрицательных чисел.");

            }else {
                System.out.println(s.arabToRom(rezult));
            }
        }else if(s.isRoman(symbol[0]) || s.isRoman(symbol[2])){
            throw new UnsupportedOperationException("т.к. используются одновременно разные системы счисления.");
        }

        else{
            int a = Integer.parseInt(symbol[0]);
            int b = Integer.parseInt(symbol[2]);
            if (a > 10 || a < 1 || b > 10 || b < 1){throw new UnsupportedOperationException("т.к. числа должны быть от 1 до 10 включительно, не более.");}

            System.out.println(c.operation(a, b, symbol[1]));
        }


    }


}