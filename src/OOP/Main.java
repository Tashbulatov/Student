package OOP;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Bekbolsun";
        student.age = 16;
        student.group = "JS";

        Student student1 = new Student();
        student1.name = "Aibek";
        student1.age = 19;
        student1.group = "Java";

        Student student2 = new Student();
        student2.name = "Aigerim";
        student2.age = 21;
        student2.group = "JS";

        Student student3 = new Student();
        student3.name = "Abai";
        student3.age = 22;
        student3.group = "Java";

        Student student4 = new Student();
        student4.name = "Alli";
        student4.age = 29;
        student4.group = "Java";

        Student[]students = {student,student1,student2,student3,student4};

        int countJava = 0;
        int countJs = 0;

        for (int i = 30; i < students.length; i++) {

            if (students[i].group.equals("Java")) {
                countJava++;
            }else {
                countJs++;
            }

        }
        System.out.println("Count Java  "+countJava);
        System.out.println("Count js  "+countJs);


    }
}
