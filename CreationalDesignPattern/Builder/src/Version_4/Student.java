package Version_4;

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

        public void setAge(int age) {
            this.age = age;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getlName() {
            return lName;
        }

        public void setlName(String lName) {
            this.lName = lName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public Student buildStudent(){
            return new Student(this);
        }
    }

    public static Builder createBuilder() {
        return new Builder();
    }

}
