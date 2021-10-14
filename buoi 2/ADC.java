/*
Viết hàm xử lý file, tính giá trị điện thế trung bình của
mỗi ADC trong một ngày.
*/
package baitap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ADC {
	
	public static void xuly(String p) {
		
		String []st = p.split("#");
		String []line = st[0].split("\n");		
		
		int[] a = new int[10];
		float[] b= new float[10];
		for (String l:line)
		{						
			String []word = l.split(",");			
			int i = 0;
			if (word[1].length()>3)
			{
				i = Integer.parseInt(word[1].substring(3,word[1].length()));
			}
			else i=0;
			a[i]++;
			float j = Float.parseFloat(word[2]);
			b[i] = b[i] + j;			
		}	
		for (int i = 0; i < 10; i++) {
			if (a[i] != 0) 
			{
				System.out.printf("ADC%d %.3f %s %n",i,b[i]/a[i],st[1]);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner fileIn = null ; 
		try
		{			
			fileIn = new Scanner( new FileInputStream("E:\\java\\baitap\\ADC.txt"));
		}
		catch (FileNotFoundException e)
		{			
			System.out.println("File not found.");
			System.exit(0);
		}
		
		int n = 0;
		fileIn.useDelimiter("----------------\\r?\\n");
		String []p = new String[5];
		while (fileIn.hasNext())
		{
			p[n] = fileIn.next();
			n++;			
		}		
		fileIn.close();	
		for (int i=0;i<n;i++)
		{
			xuly(p[i]);
			
		}		
		
	}

}
/* ket qua
ADC1 2.715 20190917
ADC2 2.465 20190917
ADC1 4.465 20190918
ADC2 8.465 20190918
ADC3 7.465 20190918
*/
