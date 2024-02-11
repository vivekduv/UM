package myfirstproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyFirstProgram {

	public static void main(String[] args) {
		
		//System.out.print("Hello");
		
		Movies m=new Movies();
		Movies m1= new Movies();
		m1.setDirector("GGGG");
		m.setDirector("ABC");
		m.setMovieName("HHHHHHH");
		System.out.println(m.getSumOfValues(5, 10));
		m.setX1(10);
		System.out.println(m.getSumOfValues(5, 10));
		
		System.out.println("Movie Director Name: " + m.getDirector());
		System.out.println("Movie Director Name: " + m1.getDirector());
		
		List <String> ishikaWishList = new ArrayList();
		
		ishikaWishList.add("Sencond Sem");
		ishikaWishList.add("Football");
		ishikaWishList.add("Footballxxxxx");
		ishikaWishList.add("Footballyyyy");
		
		for (String ishikaWish : ishikaWishList) {
			System.out.println("WIsh :" + ishikaWish);
			
		}
			
	
		Map<String, Integer>  RankBySchool = new HashMap();
		RankBySchool.put("UMD", 10);
		
		RankBySchool.put("Rutgers", 100);
		RankBySchool.get("UMD");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
