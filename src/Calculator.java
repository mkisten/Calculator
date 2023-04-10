public class Calculator {
    public  int operation(int a, int b, String symbol){
        int rezult = 10000;

            switch (symbol) {
                case "+":
                    rezult = a + b;
                    break;
                case "-":
                    rezult = a - b;
                    break;
                case "*":
                    rezult =  a * b;
                    break;
                case "/":
                    rezult =  a / b;
                    break;
            }
            if (rezult == 10000){
                throw new UnsupportedOperationException("т.к. строка не является математической операцией");
            }
            return rezult;

    }



}
