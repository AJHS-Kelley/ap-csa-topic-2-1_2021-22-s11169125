import java.util.Scanner;

// Unit 2, 12/06/21, version 0.5 


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

        // Parameters and Arguments
    public static void assignLunch(int gradeLevel) {
        String lunchPeriod;

        if (gradeLevel ==9) {
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11) {
            lunchPeriod ="Thrid Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else {
            lunchPeriod = "Off-Campus Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }
    