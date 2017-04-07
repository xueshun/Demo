package Demo;

import java.text.DecimalFormat;

public class Demo1 {
	public static void main(String[] args) {
	    String mbmc1 = "MB_FS2";
	    String mbmc2 = "MB_FSAB21";
	    String mbmc3 = "MB_F22SABC202";
	     
	    String[] array1 = mbmc1.split("[\\D]+");
	    System.out.println(array1[array1.length-1]);
	     
	    String[] array2 = mbmc2.split("[\\D]+");
	    System.out.println(array2[array2.length-1]);
	     
	    String[] array3 = mbmc3.split("[\\D]+");
	    System.out.println(array3[array3.length-1]);
	    
	    DecimalFormat df = new DecimalFormat("#.##");
	    
	    Double number = 4416.17;
	    System.out.println(df.format((100000+6000)/24.00));
	    
	    String str = df.format((100000+6000)/24.00);
	    System.out.println(str);
	    String substring = str.substring(str.length()-2,str.length());
	    System.out.println(substring);
	}

	private static double convert(double d) {
		long l1 = Math.round(d*100); //四舍五入
		double ret = l1/100.0; //注意:使用 100.0 而不是 100
		return ret;
	}
}
