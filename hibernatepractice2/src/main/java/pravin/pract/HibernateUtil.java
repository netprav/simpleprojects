package pravin.pract;

/**
 * Created by bharati on 26/10/2015.
 */

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static{
        try{
            // if mapping is from XML then use just Configuration().configure
            // in this case, since mappings is based on Annotations (in Student entity), it is AnnotationConfiguration
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }catch (Throwable ex) {
            System.err.println("Session Factory could not be created." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
