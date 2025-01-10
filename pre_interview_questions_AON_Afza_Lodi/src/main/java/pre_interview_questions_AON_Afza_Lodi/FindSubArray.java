package pre_interview_questions_AON_Afza_Lodi;

import java.util.ArrayList;
import java.util.List;

public class FindSubArray {

	List<Integer> searchSubArray(int[] mainArray, int[] subArray) {
		int mainArrrayLength = mainArray.length, subArrrayLength = subArray.length;
		List<Integer> result = new ArrayList<>();

		if (mainArray.length == 0) {
			System.out.println("Main array is empty");
			return result;
		}

		if (subArray.length == 0) {
			System.out.println("Sub array is empty");
			return result;
		}

		// Iterate over main array
		for (int i = 0; i < mainArrrayLength - subArrrayLength + 1; i++) {
			boolean isSame = true;

			// Iterate over sub array and see if number is equal or not
			for (int j = 0; j < subArrrayLength; j++) {
				if (mainArray[i + j] != subArray[j]) {
					isSame = false;
					break;
				}
			}

			// If all numbers in sub array matched, store that starting index
			if (isSame)
				result.add(i);
		}
		return result;
	}

	public static void main(String[] args) {

		int[] mainArray = { 4, 9, 3, 7, 8 };
		int[] subArray = { 3, 7 };
		
		FindSubArray findSubArray = new FindSubArray();
		List<Integer> indices = findSubArray.searchSubArray(mainArray, subArray);
		if (indices.size() > 0) {
			for (int index : indices)
				System.out.print(index + " ");
		} else {
			System.out.print("No sub-array found in main-array.");
		}

	}
}
