package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

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


    public static Map<String, String> mapAB3(Map<String, String> map) {
        boolean keyA = map.containsKey("a");
        boolean keyB = map.containsKey("b");

        if (keyA && !keyB) {
            String valueA = map.get("a");
            map.put("b", valueA);
        } else if (keyB && !keyA) {
            String valueB = map.get("b");
            map.put("a", valueB);
        }

        return map;
    }



    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        for (String str : strings) {
            if (map.containsKey(str)) {
                map.put(str, true);
            } else {
                map.put(str, false);
            }
        }


        return map;
    }


    public static void main(String[] args) {
        Codingbat testobject = new Codingbat();
        testobject.sleepIn(false,false);
        testobject.stringTimes("orlen",98);
        testobject.withoutX2("xxxorlenxxxx");
        testobject.fizzBuzz(10,20);

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("a", "aaa");
        map1.put("c", "cake");
        System.out.println("Test 1 przed: " + map1);
        System.out.println("Test 1 po:    " + mapAB3(map1));
        System.out.println("-------------------------");


        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("b", "bbb");
        map2.put("c", "cake");
        System.out.println("Test 2 przed: " + map2);
        System.out.println("Test 2 po:    " + mapAB3(map2));
        System.out.println("-------------------------");


        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "cake");
        System.out.println("Test 3 przed: " + map3);
        System.out.println("Test 3 po:    " + mapAB3(map3));


        String[] test1 = {"a", "b", "a", "c", "b"};
        String[] test2 = {"c", "b", "a"};
        String[] test3 = {"c", "c", "c", "c"};

        System.out.println("wordMultiple Test 1: " + testobject.wordMultiple(test1));
        System.out.println("wordMultiple Test 2: " + testobject.wordMultiple(test2));
        System.out.println("wordMultiple Test 3: " + testobject.wordMultiple(test3));








    }
}


