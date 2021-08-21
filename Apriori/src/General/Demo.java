package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		AprioriFrequentItemsetGenerator<String> generator = new AprioriFrequentItemsetGenerator<>();

		List<Set<String>> itemsetList = new ArrayList<>();

		itemsetList.add(new HashSet<>(Arrays.asList("M", "O", "N", "K", "E", "Y")));
		itemsetList.add(new HashSet<>(Arrays.asList("D", "O", "N", "K", "E", "Y")));
		itemsetList.add(new HashSet<>(Arrays.asList("M", "A", "K", "E")));
		itemsetList.add(new HashSet<>(Arrays.asList("M", "U", "C", "K", "Y")));
		itemsetList.add(new HashSet<>(Arrays.asList("C", "O", "O", "K", "I", "E")));

		FrequentItemsetData<String> data = generator.generate(itemsetList, 0.2);
		int i = 1;

		for (Set<String> itemset : data.getFrequentItemsetList()) {
			System.out.printf("%2d: %9s, support: %1.1f\n", i++, itemset, data.getSupport(itemset));
		}
	}

}
