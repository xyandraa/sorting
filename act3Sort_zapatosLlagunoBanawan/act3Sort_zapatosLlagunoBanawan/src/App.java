import java.util.Scanner;

class Students{
    String name;
    double grade;

    public Students(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
}

public class App{

    public static void bubbleSort(Students[] student){

        int n = student.length;

        for(int i=0; i<n-1;i++){
            for(int j = 0; j<n-1-i;j++){
                if(student[j].grade > student[j+1].grade){
                    Students temp = student[j];
                    student[j] = student[j+1];
                    student[j+1] = temp;
                }
            }
        }
    }
    

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students?:");
        int numStud = sc.nextInt();
        sc.nextLine();
        Students[] student = new Students[numStud];

        for(int i = 0; i<numStud;i++){
            System.out.println("Enter details for student #" +(i+1));

            System.out.println("Name:");
            String name = sc.nextLine();

            System.out.println("Grade:");
            double grade = sc.nextDouble();
            sc.nextLine();

          student[i] = new Students(name, grade);

        }
        bubbleSort(student);

        System.out.println("\nSorted students by grade in ascending order:");
        for(Students students: student){
            System.out.println(students.name + "-" + students.grade);
        }
    }
}
