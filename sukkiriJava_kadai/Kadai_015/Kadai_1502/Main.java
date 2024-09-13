package Kadai_1502;

public class Main {
	public String concatPath(String folder, String file) {
		if (!folder.endsWith("¥¥")) {
			folder += "¥¥";
		}
		return folder + file;
	}
}