package linkedListProgs;

import java.util.Iterator;

public class basicLinkedListOperations {

	private static myNode head;

	private void addNewValue(Integer value){
		if(head == null){
			head = new myNode(value);
		}
		else{
			myNode temp = new myNode(value);
			myNode current = head;

			if(current!=null){
				while(current.next!= null){
					current = current.next;
				}
				current.next = temp;
			}
		}

	}

	public void insertAtIndex(Integer data, Integer index){
		myNode temp = new myNode(data);
		myNode current = head;
		if(index==0 && head == null){
			head = new myNode(data);
		}
		else if(index ==0 && head!=null){
			temp.next = current;
			head = temp;
		}
		else if(head == null && index > 0){
			System.out.println("There is no linked list to insert");
		}
		else{
			for(int i=0; i<index-1 ; i++){
				if(current.next!=null){
					current = current.next;
				}
				else{
					System.out.println("Index out of bound");
					return;
				}
			}
			temp.next= current.next;
			current.next = temp;

		}
	}

	public void deleteGivenElement(Integer value){ //delete all the nodes with that value.
		myNode current = head;
		myNode previous = null;
		if(head == null){
			System.out.println("No elements");
			return;
		}
		else{
			while(current!=null){
				if(current.data == value){
					if(current.next!=null){
						previous.next = current.next;
						if(current == head){
							head = current.next;
						}
						current = current.next;
					}
					else{
						head =null;
					}
				}
				else{
					previous = current;
					current = current.next;
				}
			}

		}

	}


	public void deleteElementAtIndex(Integer index){
		myNode current = head;
		myNode previous = null;

		if(head == null){
			System.out.println("No element to delete");
			return;
		}
		else if(index == 0){
			if(current.next!=null){
				head = current.next;
				current = current.next;
			}
		}
		else{
			for(int i = 0; i < index; i++){
				if(current.next!=null){
					previous = current;
					current = current.next;
				}
				else{
					System.out.println("Index out of bound");
					return;
				}
			}
			previous.next = current.next;
			current = current.next;
			
		}
	}



	public static String toString(myNode head){
		String result = "";
		myNode current = head;
		while(current!=null){
			result += (current.data + " ");
			current = current.next;
		}
		return result;
	}


	class myNode{
		myNode next;
		Integer data;

		public myNode(Integer givenData){
			data = givenData;
			next = null;
		}

		public myNode(Integer givenData, myNode nextValue){
			data = givenData;
			next = nextValue;
		}
	}
	public static void main(String[] args) {
		basicLinkedListOperations list = new basicLinkedListOperations();
		list.addNewValue(3);
		list.addNewValue(6);
		list.addNewValue(9);
		list.addNewValue(3);
		list.addNewValue(6);
		list.addNewValue(9);
		System.out.println(toString(head));
		list.insertAtIndex(55, 0);
		System.out.println(toString(head));
		list.deleteGivenElement(3);
		System.out.println(toString(head));
		list.deleteElementAtIndex(1);
		System.out.println(toString(head));

	}


}
