package foreach;

public class foreach {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		int sum = 0 ;
		for(int i:num ) {
			sum+=i;
			System.out.println("sum:" + sum);
		}
	}
}
