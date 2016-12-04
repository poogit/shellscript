/**
 * 配列の平均値を求めるアルゴリズム
 * @author takasiyamada
 */
public class AverageAlgorithm {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        final int ENDDATA = -1;  //配列の最後に入れてこれ以上データがないことを示す。
        final int[] array = { 32, 61, 12, 99, 78,  ENDDATA};
        int sum = 0;
        int i = 0;
        double ave = 0;
        int count = 0;
        
        //配列を走査し変数ENDDATAが見つかったら終了する。
        while(array[i] != ENDDATA) {
            count++;
            i++;
            sum += array[i];
        }
        if(count == 0) {
            ave = 0;
        } else {
            ave = (double)sum / count;
        }
        System.out.printf("合計 = %d, 個数 = %d, 平均値 = %f%n", sum, count, ave);
    }
}
