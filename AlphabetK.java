class AlphabetK{
public static void main(String[]args){
int x = 5 / 2 + 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 / 2 + 1; j++) {
				if ((j == 1 || j == x)) {
					System.out.print("** ");
				} else {
					System.out.print("   ");
				}
			}
			if (i <= 5 / 2) {
				x--;
			} else {
				x++;
			}
			System.out.println();
		}
	}

}

