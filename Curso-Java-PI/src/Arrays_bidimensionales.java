
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix= {
				
				{10, 15, 60, 70, 80},
				{20, 45, 67, 12, 54},
				{90, 56, 73, 23, 32},
				{87, 62, 55, 66, 77}
		};
		
		for(int[] fila:matrix) {
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z + " ");
				
			}
		}
	}

}
