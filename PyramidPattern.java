
public class PyramidPattern {
	public static void main (String args[]){
		 System.out.println(" Printing the pattern... **");
		 	for (int i =0; i<=3;i++) {
		 		int alphabet =65;
		 		for (int j =3; j>i;j--) {
		 			System.out.print(" ");
		 		}
		 		for(int k =0; k <=i; k++) {
		 			System.out.print((char)(alphabet+k));
		 		}
		 		for(int  l =i-1; l>=0; l--) {
		 			System.out.print((char)(alphabet+l));
		 		}
		 		
		 		System.out.println();
		 	}
	}
}
		 	
		 	
	