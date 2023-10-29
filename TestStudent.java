public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        double avgScore = 0;
        stu1.setStudentId(310567);
        stu1.setName("Cheung Siu Ming");
        stu1.setScore(87.1);

        stu2.setStudentId(451267);
        stu2.setName("Ng Wai Man");
        stu2.setScore(77.5);

        stu3.setStudentId(789014);
        stu3.setName("Wong Sui Kai");
        stu3.setScore(83.4);

        avgScore += stu3.getScore();
        avgScore += stu2.getScore();
        avgScore += stu1.getScore();
        avgScore = avgScore / 3;

        System.out.println("Student 1: name=" + stu1.getName() + " id =" + stu1.getStudentId() + " score=" + stu1.getScore());
        System.out.println("Student 2: name=" + stu2.getName() + " id =" + stu2.getStudentId() + " score=" + stu2.getScore());
        System.out.println("Student 3: name=" + stu3.getName() + " id =" + stu3.getStudentId() + " score=" + stu3.getScore());
        System.out.println("Average Score =" + avgScore);
    }
}
