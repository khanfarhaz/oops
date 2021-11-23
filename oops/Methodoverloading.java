package oops;

public class Methodoverloading {
	
	  void multiply(int l, int b)
	  {
	    System.out.println("Result is"+(l*b)) ;
	  }
	  void multiply(int l, int b,int h)
	  {
	    System.out.println("Result is"+(l*b*h));
	  }
	  public static void main(String[] args)
	  {
	    Demo  ar = new Demo();
	    ar.multiply(8,5);   //multiply(int l, int b) is method is called
	    ar.multiply(4,6,2);   //multiply(int l, int b,int h) is called
	  }
	}