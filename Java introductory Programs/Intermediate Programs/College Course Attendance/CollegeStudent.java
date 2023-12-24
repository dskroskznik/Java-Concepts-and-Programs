// Dylan Skroskznik - #U57843452
// COP2510.004 - Nov.13
public class CollegeStudent {
   private int studentNumber;
   private double gpa;

   // constructor - take 2 parameters
   public CollegeStudent(int studentNumber, double gpa) {
      this.studentNumber = studentNumber;
      this.gpa = gpa;
   }

   /*
    * /overloaded constructor
    * public CollegeStudent()
    * {
    * this.studentNumber = 999:
    * this.gpa = 0.0;
    * 
    * }
    */
   // overloaded constructor using 'this' reference \
   // to call on first constructor
   public CollegeStudent() {
      this(999, 0.0);
   }

   // overloaded constructor using 'this' reference \
   // to call on second constructor
   public CollegeStudent(int num) {
      this(num, 0.0);
   }

   // overloaded constructor using 'this' reference \
   // to call on third constructor
   public CollegeStudent(double gpa) {
      this(999, gpa);
   }

   // copy constructor - constructor accepts object of same class
   // object is stated as argument
   public CollegeStudent(CollegeStudent b) {
      this.studentNumber = b.studentNumber;
      this.gpa = b.gpa;
   }

   // toString
   public String toString() {
      return "Student Number: " + studentNumber + "\n"
            + "Student GPA: " + gpa + "\n";
   }

}// end class