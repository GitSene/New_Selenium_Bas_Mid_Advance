package MediumJava;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistpractice {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>(); // what is the diffrence between arrya and array list
		
		name.add("Babek");
		name.add("Balkan");
		name.add("Aral");
		name.add("Turkan");
		name.add("Araz");
		name.add("Elmar");
		name.add("Jack");
		name.add("Moller");
		name.add("Rayi");
		name.add("Sara");
		name.add("Elmar");
		name.add("Jack");
		name.add("Moller");
		name.add("Rayi");
		name.add("Sara");
		
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		}
		
	}

}
