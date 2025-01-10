package pre_interview_questions_AON_Afza_Lodi;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class FindSubArrayTest {

	private static FindSubArray findSubArray = new FindSubArray();

	@Test
	public void testSubArray_existsWithOneIndex() {
		int[] mainArray = { 4, 9, 3, 7, 8 };
		int[] subArray = { 3, 7 };
		List<Integer> result = findSubArray.searchSubArray(mainArray, subArray);
		assertEquals(1, result.size());
		assertEquals(2, result.get(0).intValue());
	}

	@Test
	public void testSubArray_existsWithMultipleIndices() {
		int[] mainArray = { 1, 3, 7, 35, 53, 75, 62, 68, 35, 67, 89, 35, 53, 7, 9, 35, 53, 45 };
		int[] subArray = { 35, 53 };
		List<Integer> result = findSubArray.searchSubArray(mainArray, subArray);
		assertEquals(3, result.size());
		assertEquals(3, result.get(0).intValue());
		assertEquals(11, result.get(1).intValue());
		assertEquals(15, result.get(2).intValue());
	}

	@Test
	public void testSubArray_NoneExists() {
		int[] mainArray = { 1, 2, 3, 0, 8, 4, 5 };
		int[] subArray = { 2, 4, 6 };
		assertEquals(0, findSubArray.searchSubArray(mainArray, subArray).size());
	}

	@Test
	public void testSubArray_MainArray_Empty() {
		int[] mainArray = {};
		int[] subArray = { 2, 4, 6 };
		assertEquals(0, findSubArray.searchSubArray(mainArray, subArray).size());
	}

	@Test
	public void testSubArray_SubArray_Empty() {
		int[] mainArray = { 1, 2, 3, 4, 5 };
		int[] subArray = {};
		assertEquals(0, findSubArray.searchSubArray(mainArray, subArray).size());
	}

	@Test
	public void testSubArray_existsWithSameValues() {
		int[] mainArray = { 4, 4, 4, 4, 4 };
		int[] subArray = { 4, 4 };
		List<Integer> result = findSubArray.searchSubArray(mainArray, subArray);
		assertEquals(4, result.size());
		assertEquals(0, result.get(0).intValue());
		assertEquals(1, result.get(1).intValue());
		assertEquals(2, result.get(2).intValue());
		assertEquals(3, result.get(3).intValue());
	}

	@Test
	public void testSubArray_existsWithNegativeValues() {
		int[] mainArray = { 14, -6, 8, -2, -1, 0, 10, -2, -1 };
		int[] subArray = { -2, -1 };
		List<Integer> result = findSubArray.searchSubArray(mainArray, subArray);
		assertEquals(2, result.size());
		assertEquals(3, result.get(0).intValue());
		assertEquals(7, result.get(1).intValue());
	}
}
