package MediumJava;

public class StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str =  "I Love You";
        System.out.println(str);
        
        // passing string from Array
        char[] HelloArray = {'H', 'e', 'l', 'l','o'};
        String str2 = new String(HelloArray);
        System.out.println(str2);
        
        int len = str2.length();
        char charAt = str2.charAt(3);
        
        System.out.println(charAt);
        System.out.println(len);
        
        String str3 = str2.concat("Honey");
        System.out.println(str3);
        
        if (str3.contains("Honey")) {
        	System.out.println("variable contain my string");
        }else {
        	System.out.println("vaiable not contains Hello");
        }
        
	}
	

}
