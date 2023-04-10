import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RomArab s = new RomArab();
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        String calc = sc.nextLine();
        String[] symbol = calc.split(" ");
        if (symbol.length != 3){
            throw new UnsupportedOperationException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }


        if (s.isRoman(symbol[0]) && s.isRoman(symbol[2])){
            int a = s.romToArab(symbol[0]);
            int b = s.romToArab(symbol[2]);
            int rezult = c.operation(a, b, symbol[1]);
            if (rezult <= 0){
                throw new UnsupportedOperationException("т.к. в римской системе нет отрицательных чисел");

            }else {
                System.out.println(s.arabToRom(rezult));
            }
        }else if(s.isRoman(symbol[0]) || s.isRoman(symbol[2])){
            throw new UnsupportedOperationException("т.к. используются одновременно разные системы счисления");
        }

        else{
            System.out.println(c.operation(Integer.parseInt(symbol[0]), Integer.parseInt(symbol[2]), symbol[1]));
        }


    }


}