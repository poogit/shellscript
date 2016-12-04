/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 文字列長を調べるアルゴリズム
 * @author takasiyamada
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CheckStringAlgorithm {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] buf = new char[256];
        int len = 0;
        int i = 0;
        
        System.out.print("文字列を入力してください。\n>>");
        String line = reader.readLine();
        
        //文字列の長さ分iにインクリメントされる。
        for(i = 0; i < line.length(); i++) {
            buf[i] = line.charAt(i);
        }
        
        //変数iの評価が終わった後の値。つまり入力された文字列の後ろに代入される。
        buf[i] = '\0';
        
        while(buf[len] != '\0') {
            len++;
        }
        
        System.out.printf("%d%n", len);
    }
}
