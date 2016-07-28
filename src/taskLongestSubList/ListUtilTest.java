package taskLongestSubList;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

public class ListUtilTest {

	@Test
	public void testFindLongestSubList() {
		List<Pair> list = new ArrayList<>();
		list.add(new Pair<Integer>(new Integer(1), new Integer(4)));
		list.add(new Pair<Integer>(new Integer(2), new Integer(5)));
		list.add(new Pair<Integer>(new Integer(7), new Integer(3)));
		list.add(new Pair<Integer>(new Integer(4), new Integer(6)));
		list.add(new Pair<Integer>(new Integer(7), new Integer(7)));

		assertEquals(list.subList(1, 3), ListUtil.findLongestSubList(list));
	}
	
	@Test
	public void testFindLongestSubListForNullList() {
		assertEquals(new ArrayList<Pair>(), ListUtil.findLongestSubList(null));
	}
	
	@Test
	public void testFindLongestSubListForEmptyList() {
		assertEquals(new ArrayList<Pair>(), ListUtil.findLongestSubList(new LinkedList<Pair>()));
	}
	
	@Test
	public void testFindLongestSubListForOneElementList() {
		List<Pair> list = new ArrayList<>();
		list.add(new Pair<Integer>(new Integer(1), new Integer(4)));

		assertEquals(list.subList(0, 1), ListUtil.findLongestSubList(list));
	}

	@Test
	public void testFindLongestSubListForOneElementResult() {
		List<Pair> list = new ArrayList<>();
		list.add(new Pair<Integer>(new Integer(1), new Integer(4)));
		list.add(new Pair<Integer>(new Integer(2), new Integer(5)));
		list.add(new Pair<Integer>(new Integer(7), new Integer(8)));

		assertEquals(list.subList(0, 1), ListUtil.findLongestSubList(list));
	}

	@Test
	public void testFindLongestSubListForListWithNegativeDoubleElements() {
		List<Pair> list = new ArrayList<>();
		list.add(new Pair<Double>(new Double(-1.3), new Double(4.8)));
		list.add(new Pair<Double>(new Double(-3.234), new Double(-5.1)));
		list.add(new Pair<Double>(new Double(-2.4), new Double(-6.1)));
		list.add(new Pair<Double>(new Double(0), new Double(-7.1)));
		list.add(new Pair<Double>(new Double(1.4), new Double(-8.2)));
		list.add(new Pair<Double>(new Double(1.4), new Double(-8.2)));
		list.add(new Pair<Double>(new Double(3.44), new Double(0.3)));

		assertEquals(list.subList(1, 6), ListUtil.findLongestSubList(list));
	}
}
