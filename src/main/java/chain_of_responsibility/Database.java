package chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String,String> users;

    public Database() {
        users = new HashMap<>();
        users.put("admin","1");
        users.put("user","2");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username,String password) {
        return users.get(username).equals(password);
    }
}
