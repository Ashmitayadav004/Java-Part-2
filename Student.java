package CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class Student implements Comparable {
    String name;
    int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + rollno;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (rollno != other.rollno)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Set<Student> student = new HashSet<>();
        student.add(new Student("Shubh", 1));
        student.add(new Student("Ash", 3));
        student.add(new Student("Zeel", 2));
        student.add(new Student("Ash", 3));
        System.out.println(student);

    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
