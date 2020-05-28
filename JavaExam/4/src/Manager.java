

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
    	return "�g�z�W�r:"+getName()+" "+"�g�z�s��:"+ getEmpno()+" "+"�g�z�~��:"+" "+ getSalary();
    }

}
