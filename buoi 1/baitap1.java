package baitap;

public class baitap1 {

		public static void fix(String s)
		{
			String []arr =s.split(" ");
			String chuoi="";
			for (String a:arr)
			{	
				
				if(a.length()>0)		
				{
					a = a.replace(a.charAt(0),Character.toUpperCase((a.charAt(0))));
					chuoi = chuoi + a +" ";
				}			
			}
			chuoi.trim();
			System.out.println(chuoi);
		}

		


		public static void main(String[] args) {
			
			fix("lop  hoc        java.  bat  dau  luc  muoi  hai  gio");
			
		}


	}


