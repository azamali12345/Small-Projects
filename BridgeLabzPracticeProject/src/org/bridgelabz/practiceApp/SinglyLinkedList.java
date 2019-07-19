package org.bridgelabz.practiceApp;
public class SinglyLinkedList 
{
	//PRINT ALL LINKED LIST ELEMENT DISPLAY METHOD()
	public void display(ListNode head)
	{
		if(head==null)
		{
			return;
		}
		ListNode current=head;
		//WHILE LOOP for TILL END OF THE LIST
		while(current!=null)
		{
			System.out.print(current.data+"--->");
			//MOVE TO NEXT ELEMENT
			current=current.next;
		}
		System.out.print(current);//HERE CURRENT WILL BE NULL
	}
	//COUNT LENGTH OF LINKED LIST LENGTH METHOD()
	public int length(ListNode head)
	{
		if(head==null)
		{
			return 0;
		}
		//CREATE A COUNT VARIABLE TO HOLD THE LENGTH
		int count=0;
		ListNode current=head;
		while(current!=null)
		{
			count++;
			//MOVE TO NEXT NODE
			current=current.next;
		}
		return count;
	}
	//INSERT A ELEMENT INTO A LINKED LIST AT BEGINING
	public ListNode insertAtFirst(ListNode head,int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			return newNode;
		}
		newNode.next=head;
		head=newNode;
		return head;//THIS HEAD WILL BE NEW HEAD, HAVING NEW NODE AT BEGINING
	}
	//INSERT A ELEMENT INTO A LINKED LIST AT ENDING
	public ListNode insertAtLast(ListNode head,int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null)
		{
			return newNode;
		}
		ListNode current=head;
		while(null!=current.next)
		{
			current=current.next;
		}
		current.next=newNode;
		return head;
	}
	//INSERT A ELEMENT INTO A LINKED LIST AT POSITION
	public ListNode insertAtPosition(ListNode head,int data,int position)
	{
		//PERFORM BOUNDARY CHECKS
			int size=length(head);
			if(position>size+1||position<1)
			{
				System.out.println("THIS IS INVALID POSITION...");
				return head;
			}
			ListNode newNode=new ListNode(data);
			if(position==1)
			{
				newNode.next=head;
				return newNode;
			}
			else
			{
				ListNode previous=head;
				int count =1;
				while(count<position-1)
				{
					previous=previous.next;
					count++;
				}
				ListNode current=previous.next;
				newNode.next=current;
				previous.next=newNode;
				return head;
			}
	}
	//DELETE A ELEMENT INTO A LINKED LIST AT BEGINING
	public ListNode deleteFirst(ListNode head)
	{
		if(head==null)
		{
			return head;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	
	//DELETE A ELEMENT INTO A LINKED LIST AT ENDING
	public ListNode deleteLast(ListNode head)
	{
		if(head==null)
		{
			return head;
		}
		ListNode last=head;
		ListNode previousToLast=null;
		while(last.next!=null)
		{
			previousToLast=last;
			last=last.next;
		}
		previousToLast.next=null;
		return last;
	}
	
	//DELETE A ELEMENT INTO A LINKED LIST AT POSITION
	public ListNode deleteAtPosition(ListNode head,int position)
	{
		int size=length(head);
		if(position>size||position<1)
		{
			System.out.println("THIS IS INVALID POSITION...");
			return head;
		}
		if(position==1)
		{
			ListNode temp=head;
			head=head.next;
			temp.next=null;
			return temp;
		}
		else
		{
			ListNode previous=head;
			int count=1;
			while(count<position-1)
			{
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=current.next;
			current.next=null;
			return current;
		}
	}
	
	//SEARCHING A ELEMENT INTO A LINKED LIST
	public boolean search(ListNode head,int searchKey)
	{
		if(head==null)
		{
			return false;
		}
		ListNode current=head;
		while(current!=null)
		{
			if(current.data==searchKey)
			{
				return true;
			}
			current=current.next;
		}
		return false;
	}
	private static class ListNode
	{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
			this.next=next;
		}
	}
	
	public static void main(String[] args) 
	{
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		head.next=second;//10--->20
		second.next=third;//10--->20--->30
		third.next=fourth;//10--->20--->30--->40--->null
		
		SinglyLinkedList slist=new SinglyLinkedList();
		slist.display(head);
		System.out.println();
		
		//CODE FOR INSERT A ELEMENT AT BEGINING
		//ListNode newHead=slist.insertAtFirst(head,5);
		//slist.display(newHead);
		//System.out.println();
		//System.out.print("Length Of Linked List Is--->"+slist.length(newHead));
		
		//CODE FOR INSERT A ELEMENT AT ENDING
		//ListNode newHead=slist.insertAtLast(head,45);
		//slist.display(newHead);
		//System.out.println();
		//System.out.print("Length Of Linked List Is--->"+slist.length(newHead));
		
		//CODE FOR INSERT A ELEMENT AT POSITION
		//ListNode newHead=slist.insertAtPosition(head,25,4);
		//slist.display(newHead);
		//System.out.println();
		//System.out.print("Length Of Linked List Is--->"+slist.length(newHead));
		
		
		//CODE FOR DELETE FIRST
		//ListNode first=slist.deleteFirst(head);
		//System.out.println();
		//System.out.println("Deleted First Element Is--->"+first.data);
		
		//CODE FOR DELETE LAST
		//ListNode last=slist.deleteLast(head);
		//System.out.println();
		//System.out.println("Deleted Last Element Is--->"+last.data);
		
		//CODE FOR DELETE AT POSITION
		//ListNode pos=slist.deleteAtPosition(head,2);
		//System.out.println();
		//System.out.println("Deleted Last Element Is--->"+pos.data);
		
		////SEARCH A ELEMENT INTO A LINKED LIST
		//if(slist.search(head,30))
		//{
		//	System.out.println("Search Key Is Found...");
		//}
		//else
		//{
		//	System.out.println("Search Key Is Not Found...");
		//}
		
		
		
		
		
		
		
		
		
		
		
	}

}
