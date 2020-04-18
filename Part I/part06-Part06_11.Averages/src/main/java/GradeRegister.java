
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> exampoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.exampoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.exampoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        } else {
            int sum = 0;
            for (int grade:grades) {
                sum += grade;
            }
            return 1.0*sum/grades.size();
        }
    }
    
    public double averageOfPoints(){
        if (exampoints.isEmpty()) {
            return -1;
        } else {
            int sum = 0;
            for (int points:exampoints) {
                sum += points;
            }
            return 1.0*sum/exampoints.size();
        }
    }
    
    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
