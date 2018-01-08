package pagefactoryproject;

import java.util.ArrayList;
import java.util.List;

import org.seleniumhq.jetty9.util.LazyList;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List arrayList = new ArrayList();
		
		arrayList.add(1);
		arrayList.add("text");
		arrayList.add(1.2);
		System.out.println(arrayList);
		
		List <Integer> arrayList1 = new ArrayList<Integer>();
		
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		System.out.println(arrayList1);
		arrayList1.add(1, 4);
		System.out.println(arrayList1);
		arrayList1.remove(3);
		System.out.println(arrayList1);
		}

}
