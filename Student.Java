import java.util.Scanner;

// Unit 2, 11/05/21, version 0.4 


public class student {
    // These arae INSTANCE VARIABLES.
    private int studentID;
    private int gradeLevel;
    private double gradePointAvg;
    private String studentName;
    //i have this 

    // Creating a Constructor 
    public Student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradePointAvg = 0.0;
        this.studentName = "";
    }

    //Value Constructor 
    public Student(int studentID, int gradeLevel, double GPA, String studentName ) {
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.gradePointAvg = GPA;
        this.studentName = studentName;
    }

    public Student(int studentID, int gradeLevel, double GPA, String studentName ) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gradeLevel = 9;
        this.gradePointAvg = 4.0;
    }
    // More than one constructor is known as OVERLOADING.    






    // Creating Methods 

    public static void calcGPA() {
        int garde0;
        int grade1;
        int grade2;
        int grade3;
        double newGPA;


        Scanner myScanner = new Scanner (System.in);

        System.out.println("What is the first grade?")
        garde0 = myScanner.nextInt();
        System.out.println("What is the first grade?")
        grade1 = myScanner.nextInt();
        System.out.println("What is the first grade?")
        grade2 = myScanner.nextInt();
        System.out.println("What is the first grade?")
        grade3 = myscanner.nextInt();


        newGPA = (garde0 + grade1 + grade + grade3) / 4;
        system.out.print("The new GPA is");
        system.out.println(newGPA);
    }

        //i need assign lunch/ assign luch multiply /math practice 

