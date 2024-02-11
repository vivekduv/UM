package myfirstproject;

public class Movies {
	
	private String director;
	private String moviename;
	private int x1=4;
	private int x2=3;

	
	public void setDirector(String dir) {
		director=dir;
		
	}
	public void setMovieName(String m)
	{
		moviename=m;
	}
	
	public String getDirector() {
		return director;
	}
	public String getMovieName()
	{
		return moviename;
	}
	
	
	public int getSumOfValues(int a, int b) {
		return a+b-x1-x2;
		
	}
	public void setX1(int abc)
	{
		x1=abc;
	}

}
