package Kadai_1401;

public class Account {
	String accountNumber; // 口座番号
	int balance; // 残額
	
	public String toString() {
		return "¥¥" + this.balance + "（口座番号：" + this.accountNumber + "）";
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account a) {
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
