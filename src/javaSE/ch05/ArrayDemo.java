package javaSE.ch05;

public class ArrayDemo {

	public static void main(String[] args) {
		int[]arr={100,77,90,88,99,39,91};
		int max =arr[0];
		int min=arr[0];
		int sum = 0;
		int avg=0;
		for(int n =0;n<arr.length;n++){
			sum+=arr[n];
			avg=sum/arr.length;
			if(arr[n]>max){
				max=arr[n];
			}
			if(arr[n]<min){
				min=arr[n];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
		
		

	}

}
