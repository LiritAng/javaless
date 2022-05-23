public class HomeWork2 {
    public static void main(String[] args) {
        boolean res = CheckSum(1,3);
        System.out.println(res);
        CheckNeg(-6);
        boolean res2 = CheckNegBool(1);
        System.out.println(res2);
        PrintStr(3, "Out");
        boolean res3 = CheckYear(600);
        System.out.println(res3);
    }

    public static boolean CheckSum(int a, int b) {
        boolean result;
        if ((a+b) >= 10 && (a+b) <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void CheckNeg(int a) {
        if (a>=0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean CheckNegBool(int a) {
        boolean result;
        if (a<0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void PrintStr(int a, String Str) {
        for (int i=0; i<a; i++){
            System.out.println(Str);
        }
    }

    public static boolean CheckYear(int a) {
        boolean is_LeapYear;
        if ((a%4 == 0) && (a%100 > 0 | a%400 == 0 )) {
            is_LeapYear = true;
        } else {
            is_LeapYear = false;
        }
        return is_LeapYear;
    }
}
