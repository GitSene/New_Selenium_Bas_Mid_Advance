package MediumJava;

public class Array {

	public static void main(String[] args) {
		// 
		String[] name  = {"Babek", "Sevda", "Sonil"};
		int[] age = new int[3]; // fixed size
		age[1] = 32; // using index
		age[0] = 24;
		age[2] = 28;
		age[1] = 28;  // the second [1] will change the first data (age[1])
		
		
		String[][] st = new String[3][2];
		st[0][0] = "Babek";
		st[0][1] = "Sevda";
		st[1][0] = "Sonil";
		st[1][1] = "Piter";
		st[2][1] = "Ayjan";
		
		for (int i=0; i <= 2; i++) {
			System.out.println(name[i] + "----" + age[i]);
		}
		
		
		for (int i=0; i <= 2; i++) {
			for(int j=0; j<=1; j++) {
			System.out.print(st[i] [j]);
			}
		
          System.out.println("");
	  }
	}
}

