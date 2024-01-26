package Version_2;


public class Client {
    public static void main(String[] args) {
//        Student st = new Student(12, "Anmol", null, null, 90.67, 100); Version_0

        /* More readable than Version_0 */
        /* Builder builder = new Builder();
        builder.setAge(12);
        builder.setFname("Anmol");
        builder.setPsp(90.67);
        builder.setWeight(100);

        Student st = new Student(builder); */
        /* But I can still pass null into Student like,
         * Student st1 = new Student(null)
         * Now this is a very problematic hack! What to do?
         * and also
         * Client has to know that first he needs to create object of builder
         * then only he can create object of Student which he will not
         * remember everytime. What to Do?
         * */ // Version_1


        // Version_2
        /* There is a builder in student class (Student.createBuilder())
        from which I will be able to build my student object
        Therefore create a createBuilder() method in Student class
        which will be a static method
        */

        Builder builder1 = Student.createBuilder();
        builder1.setAge(12);
        builder1.setFname("Anmol");
        builder1.setPsp(90.67);
        builder1.setWeight(100);

//        Student st = new Student(builder1);
        /* But we can still pass null here..! What to Do?
        * Ans=> Make Student constructor private
        *
        * Now, If we make student constructor private,
        * how to create object of Student class?
        * Ans=> We can use method in Builder class which will build the
        * same object of student class with same attribute values as builder's
        * */
    }
}