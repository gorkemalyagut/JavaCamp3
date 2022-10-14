package oppWithNLayeredApp.dataAccess;

import oppWithNLayeredApp.entites.Category;
import oppWithNLayeredApp.entites.Course;
import oppWithNLayeredApp.entites.Instructor;

public class HibernateDao implements CommonDao{
    @Override
    public void addCategory(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi: " + category.getCategoryName());
    }

    @Override
    public void addCourse(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi: " + course.getCourseName());
    }

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi: " + instructor.getInstructorName());

    }
}
