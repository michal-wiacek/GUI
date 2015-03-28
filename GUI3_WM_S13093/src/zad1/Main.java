/**
 *
 *  @author Wiącek Michał S13093
 *
 */

package zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    String fname = System.getProperty("user.home") + "/tab.txt";            
    try {
    	
    	Scanner sc = new Scanner(new File(fname));
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
  }
}
