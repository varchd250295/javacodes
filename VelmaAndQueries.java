import java.io.*;
import java.util.*;

class VelmaAndQueries

{

	static class Reader
	    {
	        final private int BUFFER_SIZE = 1 << 16;
	        private DataInputStream din;
	        private byte[] buffer;
	        private int bufferPointer, bytesRead;

	        public Reader()
	        {
	            din = new DataInputStream(System.in);
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }

	        public Reader(String file_name) throws IOException
	        {
	            din = new DataInputStream(new FileInputStream(file_name));
	            buffer = new byte[BUFFER_SIZE];
	            bufferPointer = bytesRead = 0;
	        }

	        public String readLine() throws IOException
	        {
	            byte[] buf = new byte[64]; // line length
	            int cnt = 0, c;
	            while ((c = read()) != -1)
	            {
	                if (c == '\n')
	                    break;
	                buf[cnt++] = (byte) c;
	            }
	            return new String(buf, 0, cnt);
	        }

	        public int nextInt() throws IOException
	        {
	            int ret = 0;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	            do
	            {
	                ret = ret * 10 + c - '0';
	            }  while ((c = read()) >= '0' && c <= '9');

	            if (neg)
	                return -ret;
	            return ret;
	        }

	        public long nextLong() throws IOException
	        {
	            long ret = 0;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();
	            do {
	                ret = ret * 10 + c - '0';
	            }
	            while ((c = read()) >= '0' && c <= '9');
	            if (neg)
	                return -ret;
	            return ret;
	        }

	        public double nextDouble() throws IOException
	        {
	            double ret = 0, div = 1;
	            byte c = read();
	            while (c <= ' ')
	                c = read();
	            boolean neg = (c == '-');
	            if (neg)
	                c = read();

	            do {
	                ret = ret * 10 + c - '0';
	            }
	            while ((c = read()) >= '0' && c <= '9');

	            if (c == '.')
	            {
	                while ((c = read()) >= '0' && c <= '9')
	                {
	                    ret += (c - '0') / (div *= 10);
	                }
	            }

	            if (neg)
	                return -ret;
	            return ret;
	        }

	        private void fillBuffer() throws IOException
	        {
	            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
	            if (bytesRead == -1)
	                buffer[0] = -1;
	        }

	        private byte read() throws IOException
	        {
	            if (bufferPointer == bytesRead)
	                fillBuffer();
	            return buffer[bufferPointer++];
	        }

	        public void close() throws IOException
	        {
	            if (din == null)
	                return;
	            din.close();
	        }
    }


	public static void main(String args[])throws IOException

	{
		//BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		Reader s=new Reader();

		final int size=1001;

		int t=s.nextInt();

		int n,q;


		for(int i=0;i<t;i++)
		{


			n=s.nextInt();
			q=s.nextInt();
			int tt,d;
			int u,l;
			int sum=0;
			int node;

			int temp[]=new int[size];

			int tree[]=new int[size];

			int depth[][]=new int[size][size];

			for(int j=1;j<=n;j++)
				temp[j]=s.nextInt();   // temp[j] refers to the value stored at the j'th node



			for(int j=1;j<n;j++)
			{
				tt=s.nextInt();
				d=s.nextInt();

				tree[d]=tt;
			}


			for(int j=1;j<=n;j++)
			{
				tt=j;
				d=1;

				while(tree[tt]!=0)
				{
					d++;
					tt=tree[tt];
				}

				depth[d][0]++;  // the 0'th column of the row corresponding to the depth 'd' gives the no. of nodes at that depth
				depth[d][depth[d][0]]=j;

			}


			for(int j=1;j<=q;j++)
			{

				u=s.nextInt();
				l=s.nextInt();

				int num=depth[l][0];

				for(int k=1;k<=num;k++)
				{
					node=depth[l][k];

					while(tree[node]!=0 && tree[node]!=u)
					node=tree[node];

					if(tree[node]==u)
					sum+=depth[l][k];
				}

			}

			System.out.println(sum);

		}

	}
}



