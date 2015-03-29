/**
 *
 *  @author Wiącek Michał S13093
 *
 */

package zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

public static void main(String[] args) {
    String fname = System.getProperty("user.home") + "/tab.txt";            
    try {
		if (fname == null)
			throw new FileNotFoundException();
    	
    	Scanner sc = new Scanner(new File(fname));
    	if (sc.equals(args) || sc.next().equals(args)){
			throw new NoSuchElementException();
    	}
			int nextInt = sc.nextInt();
			List<Integer> a = new ArrayList<Integer>();
			a.add(nextInt);
			while(sc.hasNext()){
				a.add(sc.nextInt());
			}
			Integer [] nums = a.toArray(new Integer[a.size()]);
			String lista = Arrays.toString(nums);
			System.out.println(lista);
			int max = Integer.MIN_VALUE;
			for(int i = 0; i<nums.length; i++)
			{
				if(nums[i] > max){
					max = nums[i];
				}
			}
			System.out.println(max);
			int largest = nums[0], index = 0;
			for (int i = 1; i < nums.length; i++) {
			  if ( nums[i] >= largest ) {
			      largest = nums[i];
			      index = i;
			   }
			}
			System.out.println(index);
			
    }
    
     catch (FileNotFoundException|NoSuchElementException e) {
		System.out.println("***");
		//e.printStackTrace();
	}  
}
}
