package Array;
class Student {
    int studentNo;
    String name;
    String mailId;
    String address;
    int fees;
    
    public void fees(int fees) {
        this.fees = fees;
    }
    
    public void display() {
        System.out.println("Student No: " + studentNo);
        System.out.println("Name: " + name);
        System.out.println("Mail Id: " + mailId);
        System.out.println("Address: " + address);
        System.out.println("Fees: " + fees);
    }
}

public class Stud_Details {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student();
        students[0].studentNo = 1;
        students[0].name = "Pranita";
        students[0].mailId = "pranita@gmail.com";
        students[0].address = "302";
        students[0].fees(1000);
        
        students[1] = new Student();
        students[1].studentNo = 2;
        students[1].name = "Prajwal";
        students[1].mailId = "prajwal@example.com";
        students[1].address = "302";
        students[1].fees(1500);
        
        students[2] = new Student();
        students[2].studentNo = 3;
        students[2].name = "Bobe";
        students[2].mailId = "bobe@example.com";
        students[2].address = "789 Pine Rd";
        students[2].fees(2000);
        
        students[3] = new Student();
        students[3].studentNo = 4;
        students[3].name = "PPB";
        students[3].mailId = "ppb@example.com";
        students[3].address = "321 Elm St";
        students[3].fees(2500);
        
        students[4] = new Student();
        students[4].studentNo = 5;
        students[4].name = "Eva";
        students[4].mailId = "eva@example.com";
        students[4].address = "555 Fifth Ave";
        students[4].fees(3000);
        
        // update fees for students with fees less than 2000
        for (int i = 0; i < students.length; i++) {
            if (students[i].fees < 2000) {
                int newFees = (int) (students[i].fees * 1.1);
                students[i].fees(newFees);
            }
        }
        
        // display updated details of all students
        for (int i = 0; i < students.length; i++) {
            System.out.println("--------------------");
            students[i].display();
        }
    }
}

