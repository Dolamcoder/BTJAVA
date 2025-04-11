package baitap00p1;

public class bt14 {

	public static void main(String[] args) {
		Employee em1=new Employee(056, "Lam", "Do", 150);
		Employee em2=new Employee(054,"Linh", "Nguyen", 100);
        System.out.println(em1.tostring());
        System.out.println(em2.tostring());
        System.out.println("ID: "+em1.getId());
        System.out.println("Ten la: "+em1.getFirtname());
        System.out.println("Ho la: "+em1.getLastname());
        System.out.println("Luong la: "+em1.getSalary());
        System.out.println("Ten la: "+em1.getFirtname()+em1.getLastname());
        System.out.println("luong hang nam: "+em1.getAnnualSalary());
        System.out.println(em1.raiseSalar(10));
        System.out.println(em1.tostring());
	}

}
