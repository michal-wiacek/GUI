/**
 *
 *  @author Wiącek Michał S13093
 *
 */

package zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Finder {
		List<String> lista = new ArrayList<String>();
		
		private StringBuffer str = new StringBuffer() ;
	//	private String word;
	public Finder(String fname) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner(new File(fname));
		while (sc.hasNext()) {
			str.append(sc.nextLine());
		}
		sc.close();}
		
	
	public int getIfCount() {
		int ilosc = 0;
		Pattern pat = Pattern.compile("if");
		Matcher mat = pat.matcher(str);
		while(mat.find()){
			ilosc++;
		}
		return ilosc;
	}

	public int getStringCount(String string) {
		int ilosc = 0;
		Pattern pat = Pattern.compile(string);
		Matcher mat = pat.matcher(str);
		while(mat.find()){
			ilosc++;
			}
		return ilosc;
	}

}    
