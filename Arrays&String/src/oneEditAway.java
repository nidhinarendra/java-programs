/*
 * There are three types of edits that can be performed on strings: 
 * insert a character, remove a character, or replace a character. 
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 */
public class oneEditAway {

	public static boolean isOneEdit(String first, String second){
		boolean result;
		int str1len = first.length();
		int str2len = second.length();
		if(str1len == str2len){
			result = editReplace(first, second);
		}
		else if(str1len > str2len){
			result = editDelIns(first, second);
		}
		else{
			result = editDelIns(second, first);
		}
		return result;
	}

	public static boolean editReplace(String first, String second){
		int count = 0;
		for(int i = 0; i<first.length(); i++){
			if(first.charAt(i) == second.charAt(i)){
				continue;
			}
			else{
				if(count == 0) {
					count = 1;
				}
				else return false;
			}
		}
		return true;
	}

	public static boolean editDelIns(String first, String second){
		if(first.length() - second.length() > 1){
			return false;
		}
		
		for(int i = 0; i < first.length() - 1; i++ ){
			
		}
		

		return true;
	}

	public static void main(String[] args) {
		String first = "ABCD";
		String second = "ABEE";
		boolean result = isOneEdit(first, second);
		System.out.println(result);

	}

}
