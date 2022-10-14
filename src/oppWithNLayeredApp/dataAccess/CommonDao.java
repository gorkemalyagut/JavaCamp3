package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entites.Category;
import oppWithNLayeredApp.entites.Course;
import oppWithNLayeredApp.entites.Instructor;

public interface CommonDao {
    void addCategory(Category category);
    void addCourse(Course course);
    void addInstructor(Instructor instructor);
}
