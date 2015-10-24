package pravin.pract;

/**
 * based on example from www.codejava.net
 */
import java.util.List;

import pravin.pract.springdao.UserDAO;
import pravin.pract.springmodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    @Autowired
    private UserDAO userDao;

    @RequestMapping(value="/")
    public ModelAndView home() {
        List<User> listUsers = userDao.list();
        ModelAndView model = new ModelAndView("home");
        model.addObject("userList", listUsers);
        return model;
    }

    @RequestMapping(value="/index.html")
    public ModelAndView justMsg() {
        List<User> listUsers = userDao.list();
        ModelAndView model = new ModelAndView("index");
        model.addObject("userList", listUsers);
        return model;
    }

}