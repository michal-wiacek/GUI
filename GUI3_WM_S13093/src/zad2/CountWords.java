/**
 *
 *  @author Wiącek Michał S13093
 *
 */

package zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
	
	private List<String> result;
		List<String> listaSlow = new ArrayList<String>();
		
	public CountWords(String path) throws Exception {
		File file = new File(path);
		Scanner sc = new Scanner(file);
		String slowo = sc.next();
		listaSlow.add(slowo);
		while (sc.hasNext()) {
			listaSlow.add(sc.next());
		}
	//	String[] slowa = listaSlow.toArray(new String[listaSlow.size()]);
		
		sc.close();
	}

	public List<String> getResult() {
		Set<String> u = new HashSet<String>(listaSlow);

		for (String temp : u) {
			System.out.println(temp + " "
					+ Collections.frequency(listaSlow, temp));
		}
		return result;
		
	}
}