package cat2;

class Student implements Runnable {
    private String name;
    private int paper1Marks;
    private int paper2Marks;
    private double gpa;
    private String grade;

    public Student(String name, int paper1Marks, int paper2Marks) {
        this.name = name;
        this.paper1Marks = paper1Marks;
        this.paper2Marks = paper2Marks;
    }

    @Override
    public void run() {
        // Assign grade based on marks
        int totalMarks = paper1Marks + paper2Marks;
        if (totalMarks >= 80) {
            grade = "A";
            gpa = 10.0;
        } else if (totalMarks >= 60) {
            grade = "B";
            gpa = 8.0;
        } else {
            grade = "C";
            gpa = 0;
        }

        // Compute cumulative GPA
        gpa += (double)totalMarks / 20.0;

        synchronized (this) {
            // Notify other thread that grades are ready
            notify();
        }
    }

    public synchronized String getGrade() throws InterruptedException {
        // Wait for grades to be assigned
        wait();

        return name + " - " + grade;
    }

    public double getGPA() {
        return gpa;
    }
}


public class StudentGrade {
    public static void main(String[] args) {
        // Create an array of students
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 75, 85);
        students[1] = new Student("Bob", 90, 70);
        students[2] = new Student("Charlie", 65, 75);
        students[3] = new Student("David", 80, 60);
        students[4] = new Student("Eve", 70, 80);

        // Loop through each student and assign grades and compute GPA
        for (int i = 0; i < students.length; i++) {
            Thread gradeThread = new Thread(students[i]);
            gradeThread.start();

            try {
                // Wait for grades to be assigned
                gradeThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Display student name and grade
            try {
                System.out.println(students[i].getGrade());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Compute class average GPA
        double totalGPA = 0;
        for (int i = 0; i < students.length; i++) {
            totalGPA += students[i].getGPA();
        }
        double classAverageGPA = totalGPA / (double)students.length;
        System.out.println("Class average GPA: " + classAverageGPA);
    }
}

