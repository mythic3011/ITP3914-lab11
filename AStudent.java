class AStudent {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int inAge) {
        if (inAge < 0) {
            System.out.println("Invalid Age! \nThe age will set to 18");
            inAge = 18;
        }
        age = inAge;
    }

    public void setName(String inName) {
        name = inName;
    }

    public String getName() {
        return name;
    }
}