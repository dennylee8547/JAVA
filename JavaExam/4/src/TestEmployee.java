
public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee(1,"john",25000); 
		Manager manager = new Manager(100, "Ben", 40000, 1500);
		
//		System.out.println("���u�W�r:"+employee.getName()+" "+"���u�s��:"+employee.getEmpno()+" "+"�~��"+
//		employee.getSalary());
		System.out.println(employee);
		System.out.println(manager);
	}

}
