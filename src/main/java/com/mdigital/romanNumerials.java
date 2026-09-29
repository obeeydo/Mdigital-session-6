package com.mdigital;
import java.util.TreeMap;

public class romanNumerials {

    public final static TreeMap<Integer,String> map = new TreeMap<Integer, String>();

    static {
        map.put(1 ,"I");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
            }
    public final static String toRoman(int number){
        int l = map.floorKey(number);
        if (number == l){
            return map.get(number);
        }
        return map.get(l) + toRoman(number - l);
    }

    static void main() {
        System.out.println(toRoman(95));
    }



}





