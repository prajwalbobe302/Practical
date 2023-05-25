package Super;
class Student {//parent cls
	int stu_id;
	String name;
	Student(int stu_id,String name) {
		this.stu_id=stu_id;
		this.name=name;
	}
}
class Course extends Student{//child cls
	float cou_fees;//child cls data mamber
	Course(int stu_id,String name,float cou_fees){
		super(stu_id,name);
		this.cou_fees=cou_fees;
		
	}
	void show() {
		System.out.println(stu_id+" "+name+" "+cou_fees);
	}
}

public class Solapur_Batch {
	public static void main(String[] args) {
		Course obj = new Course(2," Prajwal Bobe",3000f);
		obj.show();
	}
}
