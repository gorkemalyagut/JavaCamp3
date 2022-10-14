package oppWithNLayeredApp.entites;

public class Course {
    private int courseID;
    private String courseName;
    private String courseDescription;
    private String courseInstructor;
    private double coursePrice;

    //parametreli constructor -- set
    public Course(
            int courseID,
            String courseName,
            String courseDescription,
            String courseInstructor,
            double coursePrice) {
            this.courseID = courseID;
            this.courseName = courseName;
            this.courseDescription = courseDescription;
            this.courseInstructor =courseInstructor;
            this.coursePrice = coursePrice;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
