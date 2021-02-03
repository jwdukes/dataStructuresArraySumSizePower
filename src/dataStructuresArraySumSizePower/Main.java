package dataStructuresArraySumSizePower;

public class Main {

	public static void main(String[] args) {
		Integer[] examples = {1,4,6,3,9};
		Integer addedUp = 0;
		for (Integer example : examples) {
//			addedUp += example;
			addedUp = addedUp + example;
		}
		System.out.printf("the sume is %d\n", addedUp);
		
		
		
		
        double[ ] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){
             if (exampleArray[ i ] > maximum) {
                  maximum = exampleArray[ i ];
                  index = i;
             }
        }
		System.out.println(index);
                  
                  
		
		int base = 4;
		int exp = 2;
		System.out.println(toPower(base, exp));
	}
	public static double[] toPower(double size, double power){
		double[] result = null;
		for(double i=0; i < size; i++) {
			frog[(int)i] = Math.pow(i,  power);
			}
			result[i] = i^power;
				
		return frog;
		
		
		
		
//		int[] ArrayList = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for ( int num : ArrayList) {
//			sum = sum+num;
//		}
//		System.out.println("Sum of array elements is:"+sum);
		
		
		
	}

}



