package practice;

public class Employee {
	String name,dept,Add;
	int id,salary,age;
	static String cname="rythy";//static
	
	//methods
	void insertInfo(String name,int salary,String cname,int age,String dept,String Add, int id){
		
		this.name=name;
		this.id=id;
		this.age=age;
		this.dept=dept;
		this.Add=Add;
		this.salary=salary;
		
		
		}
	
	void displayInfo() {
		System.out.println(name+"\t"+id+"\t"+salary+"\t"+cname+"\t"+dept+"\t"+Add+"\t"+age);
	}

	public static void main(String[] args) {
		
		Employee em=new Employee();
		Employee em1=new Employee();
		em.insertInfo("sadhana", 500000, cname, 20, "IT", "dombivali", 101);
		em1.insertInfo("reena", 500000, cname, 19, "IT", "vidyavihar", 102);
		
		
		em.displayInfo();
		em1.displayInfo();
		
	

	}

}
