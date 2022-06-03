package interviewCodingQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

public class Q3_Find_all_subsets_of_given_set {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(3);
		set.add(4);
		
		Set<Object> sets = new HashSet<Object>();
		
		Set<Integer> tempSet = new HashSet<Integer>();
		
		Spliterator<Integer> setSplit = set.spliterator();
		
		for(int i = 0; i < (set.size()*set.size()); i++) {
			
			
		}
	}

}
