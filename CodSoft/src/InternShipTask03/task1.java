package InternShipTask03;

import java.util.Scanner;

class Student{
    private  String id;
    private String name;
    private String FatherName;
    private  int totalMarks=500;
    private char grad;
    private float avgPerc;
    private int totalObtMarks;

    public Student(String id, String name, String fatherName) {
        this.id = id;
        this.name = name;
        FatherName = fatherName;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public  void CalculateGrade(int subject1, int subject2, int subject3, int subject4, int subject5) throws Exception {
        if (subject1>100 || subject2>100 || subject3>100 || subject4>100 || subject5>100)
            throw new Exception("Attempt Marks should be less then 100");
        this.totalObtMarks=(subject1 + subject2 + subject3 + subject4 + subject5);

        if (totalObtMarks>=400 && totalObtMarks<=500)
            grad='A';
        else if(totalObtMarks>=300 && totalObtMarks<=399)
            grad='B';
        else if(totalObtMarks>=250 && totalObtMarks<=299)
            grad='C';
        else if(totalObtMarks >=200 && totalObtMarks<299);
        else
            grad='F';

        this.avgPerc=totalObtMarks/5;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", totalMarks=" + totalMarks +
                ", grad=" + grad +
                ", avgPerc=" + avgPerc +
                ", totalObtMarks=" + totalObtMarks +
                '}';
    }
}


public class task1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Student Name: ");
        String name=scanner.nextLine();

        System.out.println("Enter Student Id");
        String id = scanner.nextLine();
        System.out.println("Enter Student Father Name: ");
        String fname=scanner.nextLine();


        System.out.println("Enter subject1 marks: ");
        int sub1= scanner.nextInt();

        System.out.println("Enter subject2 marks: ");
        int sub2= scanner.nextInt();

        System.out.println("Enter subject3 marks: ");
        int sub3= scanner.nextInt();

        System.out.println("Enter subject4 marks: ");
        int sub4= scanner.nextInt();

        System.out.println("Enter subject5 marks: ");
        int sub5= scanner.nextInt();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setFatherName(fname);
        student.CalculateGrade(sub1, sub2, sub3, sub4, sub5);
        System.out.println(student.toString());


    }
}
