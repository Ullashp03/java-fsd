package assisted_project8;

public class Polymorphism {
	static class Sum 
	{
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Sum s = new Sum(); 
	        System.out.println(s.sum(150, 564)); 
	        System.out.println(s.sum(946, 851, 154)); 
	        System.out.println(s.sum(794.5, 84.56)); 
	    } 
	}

}
