package chapter01;

public class ContinueTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0; 
		while ( i < 10 ) { 
		    if ( i > 5 ) { 
		    	i++;
		        continue; 
		   } 
		   System.out.println( i ); 
		   i++; 
		} 
		 System.out.println( i ); 
	}

}
