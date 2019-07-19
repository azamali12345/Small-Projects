package org.btm.practiceApp;
import java.util.*;
class Node
{
	private int data;
	private Node next;
	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int d,Node n)
	{
		data=d;
		next=n;
	}
	public void setData(int d)
	{
		data=d;
	}
	public void setNext(Node n)
	{
		next=n;
	}
	public int getData()
	{
		return (data);
	}
	public Node getNext()
	{
		return (next);
	}
}

class LinkedList
{
	private int size;
	private Node start;
	public LinkedList()
	{
		size=0;
		start=null;
	}
	public void insertAtFirst(int val)
	{
		Node n;
		n=new Node();
		n.setData(val);
		n.setNext(start);
		start=n;
		size++;
	}
	public void insertAtLast(int val)
	{
		Node n,t;
		n=new Node();
		n.setData(val);
		t=start;
		if(t==null)
			start=n;
		else
		{
			while(t.getNext()!=null)
				t=t.getNext();
			t.setNext(n);		
		}
		size++;
	}
	public void insertAtPos(int val,int pos)
	{
		if(pos==1)
			insertAtFirst(val);
		else if(pos==size+1)
			insertAtLast(val);
		else if(pos>1&&pos<=size)
		{
			Node n,t;
			n=new Node(val,null);
			t=start;
			for(int i=1;i<pos-1;i++)
				t=t.getNext();
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		else
			System.out.println("INSERTION NOT POSSIBLE AT POSITION..."+pos);
	}
	public void deleteFirst()
	{
		if(start==null)
			System.out.println("LIST IS ALREADY EMPLTY...");
		else
		{
			start=start.getNext();
			size--;
		}
	}
	public void deleteLast()
	{
		if(start==null)
			System.out.println("LIST IS ALREADY EMPTY...");
		else if(size==1)
			start=null;
		else
		{
			Node t;
			t=start;
			for(int i=1;i<size-1;i++)
				t=t.getNext();
			t.setNext(null);
			size--;
		}
	}
	public void deleteAtPos(int pos)
	{
		if(start==null)
			System.out.println("LIST IS ALREADY EMPTY...");
		else if(pos<1||pos>size)
			System.out.println("INVALID POSITION...");
		else if(pos==1)
			deleteFirst();
		else if(pos==size)
			deleteLast();
		else
		{
			Node t,t1;
			t=start;
			for(int i=1;i<pos-1;i++)
				t=t.getNext();
			t1=t.getNext();
			t.setNext(t1.getNext());
			size--;
		}
		
	}
	public boolean isEmpty()
	{
		if(start==null)
			return(true);
		else
			return(false);
	}
	public int getListSize()
	{
		return(size);
	}
	public void viewList()
	{
		Node t;
		if(isEmpty())
			System.out.println("LIST IS EMPTY...");
		else
		{
			t=start;
			for(int i=1;i<size;i++)
			{
				System.out.println(" "+t.getData());
				t=t.getNext();
			}
		}
	}
}

public class MainLinkedList
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		list.insertAtFirst(10);
		list.insertAtFirst(20);
		list.insertAtLast(70);
		list.insertAtFirst(30);
		list.insertAtPos(90,2);
		list.insertAtFirst(40);
		list.deleteLast();
		list.deleteAtPos(1);
		list.insertAtFirst(50);
		list.isEmpty();
		list.insertAtFirst(60);
		list.deleteFirst();
		list.getListSize();
		list.viewList();
	}
}
