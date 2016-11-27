package testderive;

/*コンストラクターチェーンp203*/

public class SubClass2 extends SuperClass2 {

//	public SubClass2() {  //コンパイル時にデフォルトコンストラクターとsuper()が追加される。しかし、
//		super();		  //super()はスーパークラスのコンストラクターの引数に対応していないので
//	}					  //エラーとなる。

//	public SubClass2() {  //super()に対応する引数を入れるとエラーにならない。
//		super(null);	  //それかスーパークラスに引数無しのコンストラクターを定義する。
//	}
		public void test() {
			System.out.println("test");
		}
}
