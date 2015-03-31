package zad1;

class BankCustomer {
	private String name="";
	private Account konto=new Account(0);
	public BankCustomer(Person p) {
		name=p.nazwisko;
	}
	public Account getAccount() {
  		return konto;
  	}
  	public String toString()  {                 
    return "Klient: "+name+" stan konta "+konto.balance;
 	}
 	public void show() {
		System.out.println(toString());
 	}
} 