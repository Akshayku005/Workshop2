public class Linky {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> Linky=new LinkedList<Integer>();
		Linky.add(6);
		Linky.add(8);
		Linky.add(9);
		Linky.add(10);
		Linky.addFirst(20);
		Linky.addLast(21);
		System.out.println("Before swap of elements>>>>>"+Linky);
		System.out.println("First element before swap >>>>" +Linky.get(0));
		Linky.removeLast();
		Linky.add(0,8);
		Linky.remove(1);
		Linky.remove(0);
		Linky.add(1,20);
System.out.println("after swap of 2 elements and removing last element>>>");
		for (int i=0; i<Linky.size(); i++) {
			System.out.print(Linky.get(i));
			System.out.print(",");
		}
	}

}//WAP to insert elements into the linked list at the first and last position.remove first element from list and  
//swap two elements in a linked list.
