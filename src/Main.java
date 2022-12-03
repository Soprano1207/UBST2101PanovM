import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("---- LIST 1 ----");
        System.out.println("--Task 1:  \n" + remainder(1, 3) + "\n" + remainder(3, 4) + "\n" + remainder(-9, -45) + "\n" + remainder(5, 5));
        System.out.println("--Task 2:  \n" + triArea(3, 2) + "\n" + triArea(7, 4) + "\n" + triArea(10, 10));
        System.out.println("--Task 3:  \n" + animals(2, 3, 5) + "\n" + animals(1, 2, 3) + "\n" + animals(5, 2, 8));
        System.out.println("--Task 4:  \n" + profitableGamble(0.2, 50, 9) + "\n" + profitableGamble(0.9, 1, 2) + "\n" + profitableGamble(0.9, 3, 2));
        System.out.println("--Task 5:  \n" + operation(24, 15, 9) + "\n" + operation(24, 26, 2) + "\n" + operation(15, 11, 11));
        System.out.println("--Task 6:  \n" + ctoa('A') + "\n" + ctoa('m') + "\n" + ctoa('[') + "\n" + ctoa('\\')); // для символа \ написать: '\\'
        System.out.println("--Task 7:  \n" + addUpTo(3) + "\n" + addUpTo(10) + "\n" + addUpTo(7));
        System.out.println("--Task 8:  \n" + nextEdge(8, 10) + "\n" + nextEdge(5, 7) + "\n" + nextEdge(9, 2));
        System.out.println("--Task 9:  \n" + sumOfCubes(new int[]{1, 5, 9}) + "\n" + sumOfCubes(new int[]{3, 4, 5}) + "\n" + sumOfCubes(new int[]{2}) + "\n" + sumOfCubes(new int[]{}));
        System.out.println("--Task 10:  \n" + abcmath(42, 5, 10) + "\n" + abcmath(5, 2, 1) + "\n" + abcmath(1, 2, 3));
        System.out.println("---- LIST 2 ----");
        System.out.println("--Task 1:  \n" + repeat("mice", 5) + "\n" + repeat("hello", 3) + "\n" + repeat("stop", 1));
        System.out.println("--Task 2:  \n" + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}) + "\n" + differenceMaxMin(new int[]{44, 32, 86, 19}));
        System.out.println("--Task 3:  \n" + isAvgWhole(new int[]{1, 3}) + "\n" + isAvgWhole(new int[]{1, 2, 3, 4}) + "\n" + isAvgWhole(new int[]{1, 5, 6}) + "\n" + isAvgWhole(new int[]{1, 1, 1}) + "\n" + isAvgWhole(new int[]{9, 2, 2, 5}));
        System.out.println("--Task 4:  \n" + cumulativeSum(new int[]{1, 2, 3}) + "\n" + cumulativeSum(new int[]{1, -2, 3}) + "\n" + cumulativeSum(new int[]{3, 3, -2, 408, 3, 3}));
        System.out.println("--Task 5:  \n" + getDecimalPlaces("43.20") + "\n" + getDecimalPlaces("400") + "\n" + getDecimalPlaces("3.1"));
        System.out.println("--Task 6:  \n" + fibonacci(3) + "\n" + fibonacci(7) + "\n" + fibonacci(12));
        System.out.println("--Task 7:  \n" + isValid("59001") + "\n" + isValid("853a7") + "\n" + isValid("732 32") + "\n" + isValid("393939"));
        System.out.println("--Task 8:  \n" + isStrangePair("ratio", "orator") + "\n" + isStrangePair("sparkling", "groups")  + "\n" + isStrangePair("bush", "hubris") + "\n" + isStrangePair("", ""));
        System.out.println("--Task 9_isPrefix:  " + isPrefix("automation", "auto-"));
        System.out.println("--Task 9_isSuffix:  " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("--Task 10:  \n" + hexLattice(1) + "\n" + hexLattice(7) + "\n" + hexLattice(19) + "\n" + hexLattice(37) + "\n" + hexLattice(22));
    }

    //---------- LIST 1 -----------
    //Task 1
    public static int remainder(int a, int b) {
        return a % b;
    }

    //Task 2
    public static int triArea(int a, int b) {
        return (a * b) / 2;
    }

    //Task 3
    public static int animals(int chickens, int cows, int pigs) {
        return (chickens * 2) + ((cows + pigs) * 4);
    }

    //Task 4
    public static boolean profitableGamble(double prob, int prize, int pay) {
        return (prob * prize) > pay;
    }

    //Task 5
    public static String operation(int n, int a, int b) {
        if (a + b == n) {
            return "added";
        }

        if (a - b == n) {
            return "subtracted";
        }

        if (a * b == n) {
            return "multiplied";
        }

        if (a / b == n) {
            return "divided";
        }

        return "none";
    }

    //Task 6
    public static int ctoa(char value) {
        return (int) value;
    }

    //Task 7
    public static int addUpTo(int n) {
        return n * (n + 1) / 2;
    }

    //Task 8
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    //Task 9
    public static int sumOfCubes(int[] arr) {
        int sum = 0;
        //возводим каждое число в куб и прибавляем к sum
        for (int val : arr) {
            sum += Math.pow(val, 3);
        }
        return sum;
    }

    //Task 10
    public static boolean abcmath(int a, int b, int c) {
        int sum = a;
        for (int i = 1; i <= b; i++) {
            sum += sum;
        }

        return sum % c == 0;
    }


    //---------- LIST 2 -----------

    //Task 1
    public static String repeat(String str, int count) {
        char[] chars = str.toCharArray();
        String endStr = "";
        //перебираем каждый символ
        for (char value : chars) {
            //определенное кол-во раз повторяем этот символ
            for (int i = 0; i < count; i++) {
                endStr += String.valueOf(value);
            }
        }
        return endStr;
    }

    //Task 2
    public static int differenceMaxMin(int[] arr) {
        int min = 0;
        int max = 0;

        //сравниваем каждое перебираемое сисло, если оно меньше текущего min, то min = этому числу
        for (int value : arr) {
            if (value < min) min = value;
        }
        //сравниваем каждое перебираемое сисло, если оно больше текущего max, то max = этому числу
        for (int value : arr) {
            if (value > max) max = value;
        }

        return max - min;
    }

    //Task 3
    public static boolean isAvgWhole(int[] arr) {
        float sum = 0;

        for (float value : arr) sum += value;

        return (sum / arr.length) % 1 == 0;
    }

    //Task 4
    public static ArrayList<Integer> cumulativeSum(int[] arr) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            myNumbers.add(arr[i] + myNumbers.get(i - 1)); //к текущему числу прибавляем прошлое число

        }

        return myNumbers;
    }
    //Task 5
    public  static String getDecimalPlaces(String str) {
        //избавляемся от 0 в числе после . 41.20 -> 42.2
        double dNum = Double.valueOf(str);
        //преобразуем dNum в String, чтобы в дальнейшем избавить от целой части и точки
        String strNum = String.valueOf(dNum);
        //substring выводит новую строку. Параметром выставляем индекс расположения точки (indexOf(".")). replace(".", "") - избавляемся от точки
        String newStr = strNum.substring(strNum.indexOf(".")).replace(".", "");
        return newStr;

    }

    //Task 6
    public static int fibonacci(int n) {
        /*
            0  1  2  3  4  5  6  7
            0, 1, 1, 2, 3, 5, 8, 13
                  a  b  c->
        */

        int a = 1;
        int b = 1;

        for (int i = 2; i <= n; ++i) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    //Task:7
    public static boolean isValid(String str) {
        return str.matches("\\d{5}"); //должны содержаться только числа и их должно быть 5
    }

    //Task:8
    public static boolean isStrangePair(String str1, String str2) { return str1 != "" && str2 != "" ? (str1.charAt(0) == str2.toCharArray()[str2.length() - 1]) && (str1.toCharArray()[str1.length() - 1] == str2.charAt(0)) : true; }
    //                                                                          пустые поля         1-я буква 1-я - строка   послед. буква 2-я строка                послед. буква 1-я - строка         1-я буква 2-я строка

    //Task:9_isPrefix
    public static Boolean isPrefix(String val1, String val2) {
        String val2_2 = val2.replace("-", ""); //удаляем -
        return val1.startsWith(val2_2); //проверяем вхождение заданной строки в начале

    }

    //Task:9_isSuffix
    public static Boolean isSuffix(String val1, String val2) {
        String val2_2 = val2.replace("-", ""); //удаляем -
        return val1.endsWith(val2_2); //проверяем вхождение заданной строки в конце

    }

    public static String hexLattice(int n) {
        if (n == 1) return " o ";

        if (n % 2 == 1) {
            int countCells = (int)Math.sqrt(n) + 1; //количество строк
            int countFirstChar = (countCells / 2) + 1; //количество символов в первой строке

            String row = "o ".repeat(countFirstChar); //формируем 1ую строку

            StringBuilder str = new StringBuilder(); //класс для работы со строками

            str.append(" ".repeat(countFirstChar - 1) + (row + "\n")); //добавляем первую строку

            //в цикле формируем row и добавляем в str
            for (int i = 0; i < countFirstChar - 1; i++) {
                row += "o ";
                str.append(" ".repeat(countFirstChar - i - 2) + (row + "\n")); //кол-во пробелов = кол-во символов в 1ой строке - кол-во итерраций - 2
            }

            //в цикле формируем row и добавляем в str
            for (int i = 0; i < countFirstChar - 1; i++) {
                row = row.substring(0, row.length() - 2); //удаляем последние два символа (это o и " ")
                str.append(" ".repeat(i + 1) + (row + "\n")); //кол-во пробелов = кол-во итерраций + 1
            }

            return str.toString();
        }

        return "invalid";
    }
}