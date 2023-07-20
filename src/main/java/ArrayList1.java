import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1 {

public static void main(String[] args) throws Exception
{
	ArrayList arr = new ArrayList();
	LinkedList<String>L1 = new LinkedList<String>();  //declaring LinkedList
	ArrayList<Integer> a1 = new ArrayList<Integer>(11); //declaring LinkedList
	
	LinkedList linkedList = new LinkedList();
//	linkedList.add(78);
	L1.peek();
//	L1.offer(56);
	arr.add(54000);
	a1.add(100);
	a1.add(200);
	a1.add(600);
	a1.stream();
//	a1.addAll(a1);
	
	try {
	a1.set(-1, 100000);
	}
	catch (Exception e) 
	{
	      System.out.println("Something went wrong with -1 index");
	}
	finally {
		int Sum = 1000 +1000;
		System.out.println(Sum);
	}
//	a1.add(0, a1);
	
	ArrayList<Serializable> a2 = new ArrayList<Serializable>(90);
	a2.add(400);
	a2.add(500);
	a2.add(0,a1);
//	a2.addAll(2, a1);
//	a2.clear();
//	a2.equals(null)
//    a2.isEmpty();
	a2.size();
	a2.toString();
	a2.parallelStream();
//	a2.trimToSize();
	System.out.println(L1);
	System.out.println(a2.isEmpty());
	System.out.println(a2.size());
	
}
}
