import java.io.*;

class InsertionSort
{

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		//int arr[]={20,2,8,9,1,4,23,42,15,17,19,51,4};

		int arr[];

		System.out.println("Enter the array(use space as a separator)");

		String s[]=xx.readLine().split(" ");
		arr=new int[s.length];

		for(int i=0;i<s.length;i++)
			arr[i]=Integer.parseInt(s[i]);



		int n=arr.length;
		int j;
		int temp;

		for(int i=1;i<n;i++)
		{
			j=i-1;

			temp=arr[i];

			while(j>=0 && temp<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}

			arr[j+1]=temp;

		}

		System.out.println("The sorted array is : ");

		for(int i=0;i<n;i++)
			System.out.print(arr[i]+"\t");

	}

}


