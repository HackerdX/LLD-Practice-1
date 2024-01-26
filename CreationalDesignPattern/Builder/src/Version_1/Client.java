package Version_1;


public class Client {
    public static void main(String[] args) {
//        Student st = new Student(12, "Anmol", null, null, 90.67, 100);

        /* More readable than Version_0 */
        Builder builder = new Builder();
        builder.setAge(12);
        builder.setFname("Anmol");
        builder.setPsp(90.67);
        builder.setWeight(100);

        Student st = new Student(builder);
        /* But I can still pass null into Student like,
        * Student st1 = new Student(null)
        * Now this is a very problematic hack! What to do?
        * and also
        * Client has to know that first he needs to create object of builder
        * then only he can create object of Student which he will not
        * remember everytime. What to Do? => See Version_2
        * */
    }
}