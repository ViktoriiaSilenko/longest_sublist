package taskLongestSubList;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<Pair> list = new ArrayList<>();
		list.add(new Pair<Integer>(new Integer(1), new Integer(4))); 
		list.add(new Pair<Integer>(new Integer(2), new Integer(5))); 
		list.add(new Pair<Integer>(new Integer(7), new Integer(3)));
		list.add(new Pair<Integer>(new Integer(4), new Integer(6))); 
		list.add(new Pair<Integer>(new Integer(7), new Integer(7))); 
		System.out.println(ListUtil.findLongestSubList(list));
	}

}
