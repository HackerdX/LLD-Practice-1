package Version_5;

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

    public static class Builder {
        private int age;
        private String fname;
        private String lName;
        private String gender;
        private double psp;
        private double weight;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getFname() {
            return fname;
        }

        public Builder setFname(String fname) {
            this.fname = fname;
            return this;
        }

        public String getlName() {
            return lName;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public double getWeight() {
            return weight;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    public static Builder createBuilder() {
        return new Builder();
    }

}
