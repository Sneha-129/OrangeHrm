package loop.java1;

public class p10 {

	public static void main(String[] args) {
		
       
		int i, j, row=5;
		
		for(i=0; i<row; i++) {
			
			for (j=2*(row-i); j>=0; j--)   {
				
				System.out.print(" ");       //using down pyramid 
			}
			
			for(j=0; j<=i; j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

}
