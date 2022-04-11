package workshop;

import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> Linky=new LinkedList<Integer>();
Linky.add(6);
Linky.add(8);
Linky.add(9);
Linky.add(10);
Linky.addFirst(20);
Linky.removeLast();
Linky.add(0,8);
Linky.add(1,20);
for (int i=0; i<Linky.size(); i++) {
	System.out.print(Linky.get(i));
	System.out.print(",");
}
	}

}
//WAP to insert elements into the linked list at the first and last position.remove first element from list and  
//swap two elements in a linked list.
