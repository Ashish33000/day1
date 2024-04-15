import java.util.*; 

 class Four{
	public static String  reverrseUsingString(String str){
       String rev="";
       for(int i=str.length()-1;i>=0;i--){
       	rev+=str.charAt(i);
       }
       return rev;
	}
	public static String  reverrseUsingStringBuffffer(String str){
		  StringBuffer rev = new StringBuffer(str);
        return rev.reverse().toString();
		
	}
	public static String  reverrseUsingStringBuilder(String str){
		  StringBuilder rev = new StringBuilder(str);
        return rev.reverse().toString();
		
	}
	public static void main(String[] args) {
		String string ="Ashish Kumar";
		String stringRev=reverrseUsingString(string);
		String bufferRev=reverrseUsingStringBuffffer(string);
		String builderRev=reverrseUsingStringBuilder(string);
		System.out.println("String Revers: "+stringRev);
		System.out.println("buffer Revers: "+bufferRev);
		System.out.println("Builder Revers: "+builderRev);
		
	}
}