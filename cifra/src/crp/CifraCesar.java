package crp;

public class CifraCesar {
	public static String crpt (String plain, int n) {
		char[] encrypted= new char [plain.length()];
		encrypted=plain.toUpperCase().toCharArray();
			
		for (int i=0;i< encrypted.length;i++) {
			if (encrypted[i]>='A' && encrypted[i]<+'Z') {
				encrypted[i] = (char) ((encrypted[i] - 'A' + n)%26 + 'A');
			}
		}
		
		
		return new String (encrypted);
	}
	
	public static String dcrpt (String cypher, int n) {
		char[] plain= new char [cypher.length()];
		plain=cypher.toUpperCase().toCharArray();
				
		for (int i=0;i<plain.length;i++) {
			if (plain[i]>='A' && plain[i]<='Z') {
				plain[i] = (char) ('Z' + (plain[i] - 'Z' - n)%26);
			}
		}
		return new String(plain);
	}
	
}
