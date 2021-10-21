package baitap;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
class big_caculator {
	public static BigDecimal conghaiso(BigDecimal a, BigDecimal b)
	{
		BigDecimal c= a.add(b);
		return c;
	}
	
	public static BigDecimal truhaiso(BigDecimal a, BigDecimal b)
	{
		BigDecimal c= a.subtract(b);
		return c;
	}
	
	public static BigDecimal nhanhaiso(BigDecimal a, BigDecimal b)
	{
		BigDecimal c= a.multiply(b);
		return c;
	}
	
	public static BigDecimal chiahaiso(BigDecimal a, BigDecimal b)
	{
		BigDecimal c= a.divide(b, 5, RoundingMode.HALF_UP);
		return c;
	}
	
	public static void main(String[] args)
	{
		 	BigDecimal num1, num2;
		 	String pheptinh;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập vào số thứ nhất: ");
	        num1 = sc.nextBigDecimal();
	 
	        System.out.println("Nhập vào số thứ hai: ");
	        num2 = sc.nextBigDecimal();
	        
	        sc.nextLine();
	        do 
	        {
	        System.out.println("Nhập vào phép tính(cong or tru or nhan or chia): "); 
	        pheptinh= sc.nextLine();
	        pheptinh.trim();
	        }while (pheptinh.compareTo("cong")!=0 && pheptinh.compareTo("tru")!=0 &&
	        		pheptinh.compareTo("nhan")!=0 && pheptinh.compareTo("chia")!=0 ) ;
	        
	        sc.close();
	      
	        if (pheptinh.compareTo("cong")==0) 
	        {
	        	System.out.println(num1 +" "+ pheptinh +" " + num2 + " bằng: "+ conghaiso(num1,num2));
	        }
	        else if (pheptinh.compareTo("tru")==0)
	        {
	        	System.out.println(num1 +" "+ pheptinh +" "+ num2 + " bằng: "+ truhaiso(num1,num2));
	        }
	        else if (pheptinh.compareTo("nhan")==0)
	        {
	        	System.out.println(num1 +" "+ pheptinh +" "+ num2 + " bằng: "+ nhanhaiso(num1,num2));
	        }
	        else if (pheptinh.compareTo("chia")==0)
	        {
	        	System.out.println(num1 +" "+ pheptinh +" " + num2 + " bằng: "+ chiahaiso(num1,num2));
	        }
	        
	        
	}

	

}
