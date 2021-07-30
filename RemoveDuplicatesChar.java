import java.util.Scanner;
class RemoveDuplicatesChar{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		char[] s = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			s[i] = str.charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(s[i] == str.charAt(j)) {
					s[j] = '0';
				}
				else
					System.out.print("");
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (s[i] != '0')
				System.out.print(s[i]);
		}
	}
}