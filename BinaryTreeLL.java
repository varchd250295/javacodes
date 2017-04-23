import java.io.*;

class Node   //In this implementation, every node also contains the address of it's parent node, for quick travel between kindred nodes
{

	int index;
	String data;

	Node lchild,rchild,parent;


	Node(int index,String data,Node parent)
	{
		this.index=index;

		this.data=data;

		lchild=rchild=null;

		this.parent=parent;

	}


}


class BinaryTreeLL
{


	static Node root=null;
	static int lastindex=-1;  //stores the index/id of the last node created. So, total nodes in the tree=value of lastindex+1(index of root node is 0, and tis incremented left to right, top to botton, level-wise)

	void create(Node parent)
	{
		Node temp=null;

		if(parent!=0)


	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));



