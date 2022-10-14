package oppWithNLayeredApp.entites;

public class Instructor {
    private int instructorID;
    private String instructorName;
    private String instructorLastname;
    private String instructorImage;
    private String instructorDescription;


    public Instructor(
            int instructorID,
            String instructorName,
            String instructorLastname,
            String instructorImage,
            String instructorDescription) {

        this.instructorID = instructorID;
        this.instructorName = instructorName;
        this.instructorLastname = instructorLastname;
        this.instructorImage = instructorImage;
        this.instructorDescription = instructorDescription;

    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorLastname() {
        return instructorLastname;
    }

    public void setInstructorLastname(String instructorLastname) {
        this.instructorLastname = instructorLastname;
    }

    public String getInstructorImage() {
        return instructorImage;
    }

    public void setInstructorImage(String instructorImage) {
        this.instructorImage = instructorImage;
    }

    public String getInstructorDescription() {
        return instructorDescription;
    }

    public void setInstructorDescription(String instructorDescription) {
        this.instructorDescription = instructorDescription;
    }
}
