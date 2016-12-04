/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *配列の要素数を求めるアルゴリズム
 * @author takasiyamada
 */
public class CountAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ENDDATE = -1;
        final int[] array = { 90, 34, 22, 15, 67, 76, 79, 11, 46, ENDDATE };
        int i = 0;
        int count = 0;
        
        while(array[i] != ENDDATE) {
            count++;
            i++;    
        }
        System.err.printf("有効データ数 = %d", count);
    }
    
}
