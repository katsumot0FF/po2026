package agh.po.lab3;

public class Codingbat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;

        }
        return result;
    }

    public String withoutX2(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < 2 && str.charAt(i) == 'x') {
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];

        for (int i = 0; i < result.length; i++) {
            int number = start + i;
            if (number % 15 == 0) {
                result[i] = "FizzBuzz";
            } else if (number % 3 == 0) {
                result[i] = "Fizz";
            } else if (number % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(number);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Codingbat testobject = new Codingbat();
        testobject.sleepIn(false,false);
        testobject.stringTimes("orlen",98);
        testobject.withoutX2("xxxorlenxxxx");
        testobject.fizzBuzz(10000,912321372);
    }
}


