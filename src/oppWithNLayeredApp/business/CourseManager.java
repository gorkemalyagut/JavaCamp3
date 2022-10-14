package oppWithNLayeredApp.business;

import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.CommonDao;
import oppWithNLayeredApp.entites.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final CommonDao commonDao;

    private final List<Logger> loggers;

    public CourseManager(CommonDao commonDao, List<Logger> loggers) {
        this.commonDao = commonDao;
        this.loggers = loggers;
    }

    List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) throws Exception {
        for (Course course1 : courses) {
            if (course1.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Kurs ismi tekrar edemez");
            }
        }
        if (course.getCoursePrice() < 0) {
            throw new Exception("Bir kursun fiyatı sıfırdan küçük olamaz");
        }
        courses.add(course);
        commonDao.addCourse(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }

    }
}
