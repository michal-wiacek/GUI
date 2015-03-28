/**
 *
 *  @author Wiącek Michał S13093
 *
 */

package zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
			ArrayList<Integer> a = new ArrayList<Integer>();
			//a.add(0, nextInt);
			while(sc.hasNextInt()){
			
				a.add(0, nextInt);
				a.add(sc.nextInt());
			}
		System.out.println(a);
	/*	Integer [] nums = a.toArray(new Integer[0]);
	    for(int i = 0; i < nums.length; i++){
	       System.out.println(nums[i]);
	    }
		*/

    }
    
     catch (FileNotFoundException|NoSuchElementException e) {
		System.out.println("***");
		//e.printStackTrace();
	}  
    
  }
}
