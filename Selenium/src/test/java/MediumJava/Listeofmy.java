package MediumJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Listeofmy {

	public static void main(String[] args) {
	
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Babek");
		name.add("Sara");
		name.add("Aylin");
		name.add("Anar");
		name.add("Aynaz");
		name.add("Elnaz");
		name.add("Sevda");
		name.add("Solma");
		name.add("Selin");
		
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		}

	}

}
