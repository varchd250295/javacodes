import java.io.*;

class HeapSortArray

{
	static int heapSize;

	int left(int i)
	{
		return 2*i+1;
	}

	int right(int i)
	{
		return 2*i + 2;
	}

	int parent(int i)
	{
		return (i-1)/2;

	}



	void maxHeapify(int[] A,int i)
	{
		int l=left(i);
		int r=right(i);

		int largest,temp;

		if(l<heapSize && A[l]>A[i])
			largest=l;

		else
			largest=i;

		if(r<heapSize && A[r]>A[largest])
			largest=r;

		if(largest!=i)
		{
			temp=A[largest];
			A[largest]=A[i];
			A[i]=temp;

			maxHeapify(A,largest);
		}

	}


	void buildMaxHeap(int [] A)
	{
		heapSize=A.length;

		for(int i=(A.length/2)-1;i>=0;i--)
			maxHeapify(A,i);

	}


	void heapSort(int [] A)
	{
		buildMaxHeap(A);

		for(int i=A.length-1;i>=1;i--)
		{
			int temp=A[i];
			A[i]=A[0];
			A[0]=temp;

			heapSize--;

			maxHeapify(A,0);
		}

	}

	public static void main(String args[])throws IOException
	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		/*
		int A[];

				System.out.println("Enter the array(use space as a separator)");

				String s[]=xx.readLine().split(" ");
				A=new int[s.length];
				for(int i=0;i<s.length;i++)
				A[i]=Integer.parseInt(s[i]);

		*/

		int A[]={20,2,8,9,1,4,23,42,15,17,19,51,4};
		int n=A.length;

		new HeapSortArray().heapSort(A);

		System.out.println("The sorted array is :");


		for(int i=0;i<n;i++)
			System.out.print(A[i]+" \t");

	}

}
