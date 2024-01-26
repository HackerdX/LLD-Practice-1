package Version_2;

public class Student {
    private int age;
    private String fname;
    private String lName;
    private String gender;
    private double psp;
    private double weight;

//    public Student(Builder builder) {
//        this.age = builder.getAge();
//        this.fname = builder.getFname();
//        this.lName = builder.getlName();
//        this.gender = builder.getGender();
//        this.psp = builder.getPsp();
//        this.weight = builder.getPsp();
//    }
    private Student(Builder builder) {
        this.age = builder.getAge();
        this.fname = builder.getFname();
        this.lName = builder.getlName();
        this.gender = builder.getGender();
        this.psp = builder.getPsp();
        this.weight = builder.getPsp();
    }

    public static Builder createBuilder() {
        return new Builder();
    }
}
