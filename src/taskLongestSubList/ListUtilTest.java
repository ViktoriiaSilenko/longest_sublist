package taskLongestSubList;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class ListUtilTest {

	@Test
	public void testFindLongestSubList() {
		Pair[] model = { 
				pairOf(1, 4),
				pairOf(2, 5),
				pairOf(7, 3),
				pairOf(4, 9),
				pairOf(7, 7),
				pairOf(8, 6),
				pairOf(9, 4),
				pairOf(3, 4)
		};
		List<Pair> pairs = Arrays.asList(model);
		assertEquals(pairs.subList(3, 7), ListUtil.findLongestSubList(pairs));
	}
	
	@Test
	public void testFindLongestSubListForNullList() {
		assertEquals(null, ListUtil.findLongestSubList(null));
	}
	
	@Test
	public void testFindLongestSubListForEmptyList() {
		List <Pair> list = Collections.emptyList();
		assertEquals(list, ListUtil.findLongestSubList(list));
	}
	
	@Test
	public void testFindLongestSubListForOneElementList() {
		Pair[] model = { 
				pairOf(1, 4)
		};
		List<Pair> list = Arrays.asList(model);
		assertEquals(list, ListUtil.findLongestSubList(list));
	}

	@Test
	public void testFindLongestSubListForOneElementResult() {	
		Pair[] model = { 
				pairOf(1, 4),
				pairOf(2, 5),
				pairOf(7, 8)
		};
		List<Pair> list = Arrays.asList(model);
		assertEquals(list.subList(0, 1), ListUtil.findLongestSubList(list));
	}

	@Test
	public void testFindLongestSubListForListWithNegativeDoubleElements() {
		Pair[] model = { 
				pairOf(-1.3, 4.8),
				pairOf(-3.234, -5.1),
				pairOf(-2.4, -6.1),
				pairOf(0, -7.1),
				pairOf(new Double(1.4), new Double(-8.2)),
				pairOf(new Double(1.4), new Double(-8.2)),
				pairOf(new Double(3.44), new Double(0.3))
		};
		List<Pair> list = Arrays.asList(model);
		assertEquals(list.subList(1, 6), ListUtil.findLongestSubList(list));
	}
	
	private Pair<Integer> pairOf(int left, int right) {
		return new Pair<Integer>(Integer.valueOf(left), Integer.valueOf(right));
	}
	
	private Pair<Double> pairOf(double left, double right) {
		return new Pair<Double>(Double.valueOf(left), Double.valueOf(right));
	}
}
