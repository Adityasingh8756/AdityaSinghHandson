package Seventh_DayHandson;

public class MathOperation {

	public static void main(String hg[]) {
		
		int size = hg.length;
		int[] arr = new int[size];

		int sum = 0;
		double avg = 0;
		
		try {
			for (int i = 0; i < size; i++)
				arr[i] = Integer.parseInt(hg[i]);
			
			for (int i = 0; i < size; i++)
				sum =sum+ arr[i];
			
			avg = sum / size;
			System.out.println(sum+"   "+avg);
		}
		catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());
		}

	}

}
