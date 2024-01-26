package Version_0;

public class Student {
    private int age;
    private String fname;
    private String lName;
    private String gender;
    private double psp;
    private double weight;

    public Student(int age, String fname,
                   String lName, String gender,
                   double psp, double weight) {
        this.age = age;
        this.fname = fname;
        this.lName = lName;
        this.gender = gender;
        this.psp = psp;
        this.weight = weight;
    }

    /* To make objects immutable, don't use getters and setters */


    /* Problem with above parameterised constructor
    * 1) Makes code unreadable in client side
    * 2) Mistakes can happen (like any wrong value sent from client side, as it doesnt know what to enter)
    * 3) Client had to juggle between constructor and Main to create a meaningful object
    * */
}
