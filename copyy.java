public class copyy {
    public static void main(String[] args) {
        // Create a new Student object and set its attributes
        Student s1 = new Student();
        s1.name = "Aashish";
        s1.roll = 123;

        // Create a copy of the first Student object using the copy constructor
        Student s2 = new Student(s1);

        // Print details of the copied student to verify
        System.out.println("Original Student: Name=" + s1.name + ", Roll=" + s1.roll);
        System.out.println("Copied Student: Name=" + s2.name + ", Roll=" + s2.roll);
    }
}

class Student {
    String name;
    int roll;

    // Default constructor
    Student() {
        // Initialize with default values
        name = "";
        roll = 0;
    }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
    }
}

