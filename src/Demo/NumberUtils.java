package Demo;

/**
 * 数字转化
 * @author Administrator
 *
 */
public class NumberUtils {
	
	public static String Division(String number){
		String substring = number.substring(number.length()-4, number.length());
		String newSubString;
		int j = 0;
		char doString;
		for (int i = 3; i >=0; i--) {
			doString = substring.charAt(i);
			if(doString == '0'){
				j = j+1;
			}else if(doString != '0'){
				break;
			}
			System.out.println(doString);
		}
		newSubString = substring.substring(0,substring.length()-j);
		String substring2 = number.substring(0, number.length()-4);
		String newStr; 
		if(j<4){
			newStr = substring2+"."+newSubString;
			return newStr;
		}
	    if(j == 4){
	    	newStr = substring2+".00";
	    	return newStr;
	    }
		return null;
	}
	
	public static void main(String[] args) {
		Division("178080");
	}
	
}
