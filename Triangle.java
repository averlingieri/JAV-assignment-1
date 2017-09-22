
public class Triangle {
			
	public static void main(String[] argument) {
				
		int N;
					
		if (argument.length==0){
			System.out.println("Error: no argument");
			return;
		}
			
		try {
			N = Integer.parseInt(argument[0]);
		}
		catch (NumberFormatException e) {
			System.out.println("Argument " + argument[0] + " must be an integer.");
			return;
		}
					
		for(int i=0; i<2*N+1; i++){
			for(int j=0; j<2*N+1; j++) {
													
				if (j<=2*i+1 && j<= 2*(2*N-i)+1){
					System.out.print("*");
				}
			}
												
			System.out.print("\n");
		
		}			
	}
}