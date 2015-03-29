/**
 *
 * @author Wiącek Michał S13093
 *
 */
package zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String fname = System.getProperty("user.home") + "/tab.txt";

		try {

			Scanner sc = new Scanner(new File(fname));

			int nextInt = sc.nextInt();
			// System.out.println(nextInt);

			List<Integer> a = new ArrayList<Integer>();
			a.add(nextInt);

			while (sc.hasNext()) {
				a.add(sc.nextInt());

			}
			// System.out.println(a);
			sc.close();

			Integer[] nums = a.toArray(new Integer[a.size()]);
			// String lista = Arrays.toString(nums);
			// System.out.println("lista: " + lista);

			int max = Integer.MIN_VALUE;
			// int element;
			for (int i = 0; i < nums.length; i++) {
				// element = nums[i];

				System.out.print(nums[i] + " ");

				if (nums[i] > max) {
					max = nums[i];

				}

			}
			System.out.println("");
			System.out.println(max);

			List<Integer> listaIndexow = new ArrayList();
			int index = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == max) {
					index = i;
					listaIndexow.add(index);
				}
			}
				Integer[] ind = listaIndexow.toArray(new Integer[listaIndexow.size()]);
				for (int x=0; x<ind.length;x++){
				System.out.print(ind[x] + " ");
				}
			

		} catch (FileNotFoundException e) {
			System.out.println("***");
}}}