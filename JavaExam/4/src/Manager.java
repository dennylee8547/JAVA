

public class Manager extends Employee {

	private long bonus;


	public Manager(int empno, String name, long salary, long bonus) {
		super(empno, name, salary);
		this.bonus = bonus;
	}

	
	public long getBonus() {
		return bonus;
	}


	@Override
	public long getSalary() {
		
		long salary_true=bonus+super.getSalary();
		return salary_true;
	}
    public String toString() {
    	return "經理名字:"+getName()+" "+"經理編號:"+ getEmpno()+" "+"經理薪水:"+" "+ getSalary();
    }

}
