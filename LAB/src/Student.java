public class Student {

        String name;
        static String collegeName ="Tokyo University";

        Student(String newStudentName) {
            name = newStudentName;
        }
        void display (){
            System.out.println(name+" "+collegeName);
        }
}
