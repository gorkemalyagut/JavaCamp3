package oppWithNLayeredApp;

import oppWithNLayeredApp.business.CategoryManager;
import oppWithNLayeredApp.business.CourseManager;
import oppWithNLayeredApp.core.logging.*;
import oppWithNLayeredApp.dataAccess.HibernateDao;
import oppWithNLayeredApp.dataAccess.JdbcDao;
import oppWithNLayeredApp.entites.Category;
import oppWithNLayeredApp.entites.Course;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Category category = new Category(1234567, "Programlama");
        //Category category1 = new Category(1234567, "Programlama"); //Exception error
        Category category1 = new Category(123456, "Design");

        Course course = new Course(
                1125,
                "Java",
                "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",
                "Engin Demirog",
                0
        );
        Course course1 = new Course(
                1125,
                "Java",
                "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",
                "Engin Demirog",
                -1
        ); //Exception error

        List<Logger> loggers = List.of(new DatabaseLogger(), new FileLogger(), new ConsoleLogger(), new MailLogger());

        CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
        //CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers);
        categoryManager.addCategory(category);
        categoryManager.addCategory(category1);

        //CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
        CourseManager courseManager = new CourseManager(new JdbcDao(), loggers);
        courseManager.addCourse(course);
        courseManager.addCourse(course1);
    }
}