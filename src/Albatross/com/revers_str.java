package Albatross.com;

public class revers_str {

	public static void main(String[] args) {
		String str="Hello World",nstr=" ";
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Revers String:"+nstr);
	}

	}


