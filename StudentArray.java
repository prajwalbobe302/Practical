package Array;

class StudentArray {//main class
	//declaring instance variables
	int studentNo;
	String Name,Mail,Address;
	double fees;
	//static member for incrrasefees method
static double increasedFees;
/*Creating constructor for accessing the details to student passing values through overload
 through overloaded contructors*/
 StudentArray(int sn,String name,String mail,String address) {
	 this.studentNo=sn;
	 this.Name=name;
	 this.Mail=mail;
	 this.Address=address;
 }
 //method for initializing fees to student
 void fees(double f) {
	 fees=f;//assigning passing value
 }
//method for printing output
 //for concatenation and SOP the output
 void display() {
	 //updating fees before prinnting
	 this.fees=this.fees+increasedFees;
	 System.out.println("Id-"+this.studentNo+"      "+"Name-" +this.Name+ "     " +"Mail-"+this.Mail+"    "+"Address-" +this.Address + " Fees-"+fees);
 }
 //increasing fees method
 static void increaseFees(int n,double f) {
	 if(f<2000)  {//condition
		 f=10*f/100;//logic for increasing fees
increasedFees=f;//assigning the vlaue to static instance
	 }
 }
 //main method
 public static void main(String[] args) {
	StudentArray[] student = new StudentArray[5];
	//Instatiating student type of array and declaring
	 student[0]=new StudentArray(101,"Prajwal","prajwal@gmail.com","Solapur,Maharashtra");
	 student[1]=new StudentArray(102,"Pranita","pranita@gmail.com","Solapur,Maharashtra");
	 student[2]=new StudentArray(103,"PPB",    "ppb@gmail.com",    "Pune,Maharashtra");			 
	 student[3]=new StudentArray(104,"Ravi",   "ravi@gmail.com",   "Mumbai,Maharashtra");
	 student[4]=new StudentArray(105,"Sanket", "sanket@gmail.com", "Dhanori,Maharashtra");
	 //addressing feesvalues
	 student[0].fees(2000);
	 student[1].fees(2128);
	 student[2].fees(2046);
	 student[3].fees(4780);
	 student[4].fees(2460);
	 //increasing fees whose fees is less than 2000
	 increaseFees(100,1064);
	 increaseFees(102,957);
	 increaseFees(103,1999);
	 //travlling the array of student objects
	 System.out.println("___________________________________Details of Students__________________________________");
	 for(StudentArray i:student)  {
		 i.display();//traversing with invocation of display
	 }
 }
 
}
