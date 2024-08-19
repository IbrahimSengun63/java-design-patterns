package chain_of_responsibility;

public class AuthService {
    private Handler handler;
    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username,String password) {
        if (handler.handle(username,password)) {
            return true;
        }
        return false;
    }
}
