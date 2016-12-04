/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 最大値を求めるアルゴリズム
 * @author takasiyamada
 */
public class MaxAlgorithm {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int[] array = { 1, 51, 13, 89, 29, 31, 48};
        int i = 0;
        int max = 0;
        
        max = array[0];
        //最初にインデックス0をmaxに代入しインデックス1からすべ手の要素を比較する。
        for(i = 1; i < array.length; i++) {
            if(max < array[i]) {
                //array[i]がmaxより大きい場合maxに代入する。
                max = array[i];
            }
        }
        System.err.printf("最大値 = %d", max);
    }
    
}
