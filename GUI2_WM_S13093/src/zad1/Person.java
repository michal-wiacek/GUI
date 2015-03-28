package zad1;

public class Person {
	String nazwisko;
	public Person(String n) {
		this.nazwisko = n;
	}
	@Override
	public String toString() {
		return "Klient: " + nazwisko + " stan konta "  ;
	}
	
	
	
}
