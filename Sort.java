
public class Sort {

	public static void main(String[] argument) {
	
		int i;
		int j;
		int a;
		int [] values = {12, 2, 4, 15, 1, 3, 7, 6, 10, 11, 5, 8, 9, 13, 14};
		int size = values.length;
		
		for (i=0; i < size; i++){
			for (j= i+1; j < size; ++j){
				if (values[i] < values[j]){
					a = values[i];
					values[i] = values [j];
					values[j] = a;
				}
			}
		}
		
		for (i=0; i < size - 1; i++){
			System.out.print(values[i] + ", ");
		}
		
		System.out.print(values[size-1]);
		
	}
}
