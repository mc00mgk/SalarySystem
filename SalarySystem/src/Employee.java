

public class Employee {
	String name ; 
	double salary ; 
	int workHours ;
	int hireYear ; 
	
	Employee(String name,double salary,int workHours, int hireYear){
		this.name= name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear ;
	}
	
	public double tax(double salary) {
		double taxPay = 0;
		if(this.salary < 1000) {
			System.out.println(this.name + " maasi :" + this.salary + "yuzde 0 vergi oranı uygulandı.");
			
		}if(this.salary > 1000) {
			System.out.println(this.name + " maasi :" + this.salary * 0.03+  this.salary  );
			
			}
		return taxPay;
	}
	public int bonus(int workHours ) {
			if(this.workHours >40) {
				return (workHours -40) * 30;
				
			}
			return workHours;
		}
	public int raiseSalary(int hireYear2) {
		if ( 2021 - this.hireYear< 10) {
			return (int) (this.salary + this.salary * 0.05);
		}
		if(2021 - this.hireYear>9 && 2021- this.hireYear<20) {
			return (int) (this.salary + this.salary * 0.1);
		}
		if(2021 - this.hireYear >19 ) {
			return (int) (this.salary + this.salary * 0.15);
		}
		return hireYear;
	}
	
	
	
	public String toString() {
			System.out.println(" ADI : " + this.name);
			System.out.println(" MAASI  : " + this.salary);
			System.out.println(" CALISMA SAATI : " + this.workHours);
			System.out.println(" BASLANGIC YILI : " + this.hireYear);
			System.out.println(" VERGI  : " + tax(this.salary));
			System.out.println(" BONUS :  +" + bonus(this.workHours));
			System.out.println(" ZAM : " + raiseSalary(this.hireYear) );
			return null;
			
	
			
		}
	
}


