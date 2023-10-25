package com.cg.stringexamples;

public class StringBufferDemo {

	public static void main(String[] args) {
	   //String s1 = new String ("Hello");
	   //System.out.println(s1.concat("World"));
	   //System.out.println(s1); //Hello World
		
		//StringBuffer sb = new StringBuffer("Study");
		//System.out.println(sb.append("Night"));
		//System.out.println(sb); //NightStudy ,StudyNight
		
		//StringBuffer sb1=new StringBuffer();
		//System.out.println(sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Study");
        System.out.println(sb.capacity());		
		sb.append("Night");
		System.out.println(sb.capacity());
		// index = 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
		//         S T U D Y N I G H T
		//StringBuffer sb2 = new StringBuffer(100);
		//System.out.println(sb2.capacity()); 
		
		StringBuffer sb1= new StringBuffer("Hello");
		System.out.println(sb1.capacity());	//(21 *2) +2	
		sb1.append("How are you? I am fine, What about you!!! How is your health");
		// index = 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25...43
				// H E L L O
		System.out.println(sb1.capacity());

		

		
		
	}

}
