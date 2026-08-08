public class Task8{

	public static void main(String[] args) {
	    Task8 total = new Task8();
        System.out.println("Output:");
		System.out.println("Total Sum: " + total.sumOfSums(4,5,10));
	}
	
	public int sumOfSums(int... numbers) {
    int cumulativeSum = 0;
    for (int num : numbers) {
        int individualSum = 0;
        for (int a = 1; a <= num; a++) {
            individualSum += a;
        }
        cumulativeSum += individualSum;
        
        System.out.println("Parameter " + num
            + ": Sum = " + individualSum
            + ", Cumulative Sum = " + cumulativeSum);
    }

    return cumulativeSum;
    }
}