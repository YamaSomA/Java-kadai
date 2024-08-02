package Kadai_009;

public class Kadai_902 {

	healメソッドの呼び出し
	
	int型のbaseHpを渡しても呼び出し元の値に影響はありません。
	Thiefインスタンスを渡すと呼び出し元でもhpが変化します。　
	
	引数がint型の場合、変数baseHpの値が引数hpにコピーされる値渡しにより、呼び出し元に影響しないです。
	
	引数がクラス型の場合、変数tが示すアドレスが引数thiefにコピーされる参照渡しにより、
	t.hpとthief.hpはメモリの同じ場所を指す→thief.hpへの代入がt.hpにも反映します。
	
}
