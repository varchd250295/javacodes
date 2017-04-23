import java.io.*;

class SelectionSort

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


		int temp;
		int len=arr.length;

		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}

		}



		System.out.println("The sorted array is: ");

		for(int i=0;i<len;i++)
		System.out.print(arr[i]+"\t");

	}

}
