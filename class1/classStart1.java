package class1;

public class classStart1 {
    public static void main(String[] args) {

        Student[] Students = {new Student("학생1",15,90), new Student("학생2",16,80)};


        for (Student student : Students) {
            System.out.println("이름: " + student.name + " 나이: " + student.Age + " 성적: " + student.Grade);
        }

        System.out.println(Students);
    }
}
