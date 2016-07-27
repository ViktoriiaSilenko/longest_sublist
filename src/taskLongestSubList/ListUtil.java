package taskLongestSubList;

import java.math.BigDecimal;
import java.util.List;

public class ListUtil {

	/**
	 * @param list is a list of pairs of numbers, 
	 * e.g. [(1,4), (2,5), (7, 3), (4, 6), (7, 7)
	 * @return the longest sublist that has the pairs sorted by the first entry in ascending order by the second in descending order, 
	 * e.g. [(2,5), (7, 3)]
	 */
	public static List<Pair> findLongestSubList(List<Pair> list) {

		int tempCount = 1;
		int count = 1; // count of elements in longest sublist
		int indexFromTemp = -1;
		int indexFrom = -1; // first index in sublist

		for (int i = 1; i < list.size(); i++) {
			int sortByFirstNumber = new BigDecimal(list.get(i - 1).getFirstNumber().toString())
					.compareTo(new BigDecimal(list.get(i).getFirstNumber().toString()));
			int sortBySecondNumber = new BigDecimal(list.get(i - 1).getSecondNumber().toString())
					.compareTo(new BigDecimal(list.get(i).getSecondNumber().toString()));
			if ((sortByFirstNumber == -1 || sortByFirstNumber == 0)
					&& (sortBySecondNumber == 1 || sortBySecondNumber == 0)) {
				tempCount++;
				if (indexFromTemp == -1) { // to find first index in current sublist (candidate)
					indexFromTemp = i - 1;
				}
			} else {
				tempCount = 1;
				indexFromTemp = -1;
			}

			if (tempCount > count) {
				count = tempCount;
				indexFrom = indexFromTemp;
			}
		}

		if (indexFrom == -1) {
			indexFrom = 0; // if no such sublist, we return first element of input list
		}

		return list.subList(indexFrom, indexFrom + count);
	}

}
