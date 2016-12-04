/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 番人を使ってある値よりも大きい(小さい)要素の検索アルゴリズム
 * @author takasiyamada
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.Clock;

public class SentinelMinMax {
    final static int N = 10;
    final static int MAX = 9999;
    final static int MIN = -9999;
    static int m;
    static int[] array = { 20, 29, 76, 51, 49, 80, 10, 69, 55, 90, 0 };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int low, high;
        System.out.print("数値M(0-100)を指定して下さい。");
        m = Integer.valueOf(reader.readLine()).intValue();
        low = lower();
        high = heigher();
        System.out.printf("%dより大きい値は", m);
        
        if(high == MAX) {
            System.out.println("ありませんでした。");
        } else {
            System.out.printf("%dです%n", high);
        }
        System.err.println("");
        System.err.print(low + "より小さい値は");
        if(low == MIN) {
            System.out.println("ありませんでした。");
        } else {
            System.out.print(low);
        }
    }
    
    //mより大きい値を求めるメソッド
    private static int heigher() {
        int i;
        array[N] = MAX;
        i = 0;
        while(array[i] <= m) {
            i++;
        }
        return array[i];
    }
    
    //mより小さい値を求めるメソッド
    private static int lower() {
        int i;
        array[N] = MIN;
        i = 0;
        while(array[i] >= m) {
            i++;
        }
        return array[i];
    }
    
}
