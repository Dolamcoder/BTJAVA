package btoop2;

public class bt5 {

	public static void main(String[] args) {
		 Customer c1 = new Customer(88, "Tan Ah Teck", 10);
         Account acc=new Account(11122, c1, 999);
         System.out.println("ID is:"+acc.getId());
         System.out.println("Customer is:"+acc.getCustomer().tostring());
         System.out.println("balance is:"+acc.getBalance());
         System.out.println("Account is:"+acc.tostring());
         System.out.println("Account Name is:"+acc.getCustomerName());
         acc.deposit(1000);
         System.out.println("balance is:"+acc.getBalance());
         acc.withdraw(100);
         System.out.println("balance is:"+acc.getBalance());
         acc.withdraw(2000);
	}

}
