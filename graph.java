/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Dell
 */
public class graph {
    int V;
    LinkedList <Integer> adj[];


    public graph(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<V;++i)
        {
            adj[i]=new LinkedList();
        }
    }


    void addEdge(int v,int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }


    void greedycoloring()
    {
        int result[]=new int[V];
        result[0]  = 0;

        for(int u=1;u<V;u++)
            result[u]=-1;

        boolean available[]=new boolean[V];

        for(int cr=0;cr<V;cr++)
            available[cr]=false;


        for(int u=1;u<V;u++)
        {
                Iterator <Integer> it=adj[u].iterator();

                while(it.hasNext())
                {
                    int i=it.next();
                    if(result[i]!=-1)
                        available[result[i]]=true;
                }


                int cr;

                for(cr=0;cr<V;cr++)
                    if(available[cr]==false)
                        break;



                result[u]=cr;

                it=adj[u].iterator();

                while(it.hasNext())
                {
                    int i=it.next();
                    if(result[i]!=-1)
                        available[result[i]]=false;
                }


        }

        for (int u = 0; u < V; u++)
            System.out.println("Vertex " + u + " --->  Color "
                                + result[u]);
    }


    public static void main(String args[]) throws IOException
    {
        graph g=new graph(5);
        LinkedList s1=new LinkedList();
        LinkedList s2=new LinkedList();
        LinkedList s3=new LinkedList();
        s1.add(0);
        s1.add(1);
        s1.add(2);
        s2.add(3);
        s2.add(1);
        s2.add(4);
        s3.add(4);
        //creating an edge between all subjects attended by each student
        if(s1.contains(0))
        {
            if(s1.contains(1))
                g.addEdge(0,1);
            if(s1.contains(2))
                g.addEdge(0,2);
            if(s1.contains(3))
                g.addEdge(0,3);
            if(s1.contains(4))
                g.addEdge(0,4);
        }
        if(s1.contains(1))
        {
            if(s1.contains(2))
                g.addEdge(1,2);
            if(s1.contains(3))
                g.addEdge(1,3);
            if(s1.contains(4))
                g.addEdge(1,4);
        }
        if(s1.contains(2))
        {
            if(s1.contains(3))
                g.addEdge(2,3);
            if(s1.contains(4))
                g.addEdge(2,4);
        }
        if(s1.contains(3))
        {
            if(s1.contains(4))
                g.addEdge(3,4);
        }
        if(s2.contains(0))
        {
            if(s2.contains(1))
                g.addEdge(0,1);
            if(s2.contains(2))
                g.addEdge(0,2);
            if(s2.contains(3))
                g.addEdge(0,3);
            if(s2.contains(4))
                g.addEdge(0,4);
        }
        if(s2.contains(1))
        {
            if(s2.contains(2))
                g.addEdge(1,2);
            if(s2.contains(3))
                g.addEdge(1,3);
            if(s2.contains(4))
                g.addEdge(1,4);
        }
        if(s2.contains(2))
        {
            if(s2.contains(3))
                g.addEdge(2,3);
            if(s2.contains(4))
                g.addEdge(2,4);
        }
        if(s2.contains(3))
        {
            if(s2.contains(4))
                g.addEdge(3,4);
        }
        if(s3.contains(0))
        {
            if(s3.contains(1))
                g.addEdge(0,1);
            if(s3.contains(2))
                g.addEdge(0,2);
            if(s3.contains(3))
                g.addEdge(0,3);
            if(s3.contains(4))
                g.addEdge(0,4);
        }
        if(s3.contains(1))
        {
            if(s3.contains(2))
                g.addEdge(1,2);
            if(s3.contains(3))
                g.addEdge(1,3);
            if(s3.contains(4))
                g.addEdge(1,4);
        }
        if(s3.contains(2))
        {
            if(s3.contains(3))
                g.addEdge(2,3);
            if(s3.contains(4))
                g.addEdge(2,4);
        }
        if(s3.contains(3))
            if(s3.contains(4))
                g.addEdge(3,4);

        /***************************************Dynamic Approach***************************************************/
        /*  int a,flag=1,k,n,ns;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter the number of students: ");
        n=Integer.parseInt(in.readLine());
        System.out.println("\nEnter the number of subjects: ");
        ns=Integer.parseInt(in.readLine());
        LinkedList <Integer> std[];
        std=new LinkedList[n];
        for(int i=0;i<n;i++)
            std[i]=new LinkedList();
        //----------------------------take inputs-----------------------------
        //System.out.println("\nEnter the rno of students: ");
        /*for(k=0;k<n;k++)
            std[k]=k+1;*/
        /*for(k=0;k<n;k++)
        {
            System.out.println("\nEnter subjects(numeric codes.0-4 only) for student "+(k+1));
            while(flag==1)
            {
                int s=Integer.parseInt(in.readLine());
                std[k].add(s);
                System.out.println("\nDo you want to enter more subjects? (1/0) ");
                int ch=Integer.parseInt(in.readLine());
                if(ch==0)
                    flag=0;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(std[i].contains(0))
        {
            if(std[i].contains(1))
                g.addEdge(0,1);
            if(std[i].contains(2))
                g.addEdge(0,2);
            if(std[i].contains(3))
                g.addEdge(0,3);
            if(std[i].contains(4))
                g.addEdge(0,4);
        }
        if(std[i].contains(1))
        {
            if(std[i].contains(2))
                g.addEdge(1,2);
            if(std[i].contains(3))
                g.addEdge(1,3);
            if(std[i].contains(4))
                g.addEdge(1,4);
        }
        if(std[i].contains(2))
        {
            if(std[i].contains(3))
                g.addEdge(2,3);
            if(std[i].contains(4))
                g.addEdge(2,4);
        }
        if(std[i].contains(3))
        {
            if(std[i].contains(4))
                g.addEdge(3,4);
        }
        */


        g.greedycoloring();

    }
}

