package pravin.pract.springdao;

/**
 * based on example from www.codejava.net
 */
import java.util.List;

import pravin.pract.springmodel.User;

public interface UserDAO {
    public List<User> list();
}
