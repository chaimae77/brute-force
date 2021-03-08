package ma.sqli.brute.force;

import ma.sqli.brute.force.models.User;

import java.util.HashMap;

/**
 * @author : El Mahdi Benzekri
 * @since : 3/7/21, dim.
 **/
public class BruteForceApp {

   private int counter;
    User user=new User();
    public String login(String admin, String password) {

            if (user.getUsers().get(admin).equals(password)){
                counter = 0;
                return user.rightLogin(admin, password);
            }
            else {
                counter++ ;
                return user.ForcePassword(admin, password, counter) ;
            }
        }

    public void addUser(String admin, String s) {

        user.getUsers().put(admin, s) ;

    }
}
