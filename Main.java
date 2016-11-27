package testderive;

public class Main extends SubClass {

	public static void main(String[] args) {
		SubClass sub = new SubClass();

		//この場合スーパークラスのフィールドに代入される。getメソッドを使ってもサブクラスには
		//代入されていないので0になる。
		sub.setNum(10);

		System.out.println(sub.getNum());
	}

}
