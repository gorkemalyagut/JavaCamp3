package oppWithNLayeredApp.business;

import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.CommonDao;
import oppWithNLayeredApp.entites.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CategoryManager {
    private final CommonDao commonDao;
    private final List<Logger> loggers;

    public CategoryManager(CommonDao commonDao, List<Logger> loggers) {
        this.commonDao = commonDao;
        this.loggers = loggers;
    }

    List<Category> categories = new ArrayList<>();

    public void addCategory(Category category) throws Exception {
        for (Category category1 : categories) {
            if (category1.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Kurs ismi tekrar edemez");
            }
        }
        categories.add(category);
        commonDao.addCategory(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }


    }
}

