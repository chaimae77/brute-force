package ma.sqli.brute.force.models;

import java.util.HashMap;

public class User {
    private String admin;
    private String s;
     private  HashMap<String, String> users = new HashMap<String,String>();


    public User() {
    }
    public String ForcePassword(String admin, String password, int count){
        if (count >= 3){
            return " Multiple Erroneous" ;
        }
        else {
            return "Authentification failed";
        }
    }

    public String rightLogin(String admin, String password){
        return "Welcome " + admin;
    }


    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public HashMap<String, String> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, String> users) {
        this.users = users;
    }
}
