public class TestStudent2 {
    public static void main(String s[]) {
        AStudent stud1 = new AStudent();
        AStudent stud2 = new AStudent();
        stud1.setName("Chan Tai Man");
        stud1.setAge(18);
        stud2.setName("Ng Hing");
        stud2.setAge(-23);
        System.out.println("Student: name=" + stud1.getName() + ", age=" + stud1.getAge());
        System.out.println("Student: name=" + stud2.getName() + ", age=" + stud1.getAge());
    }
}