package chain_of_responsibility;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if ("admin".equals(username)) {
            return true;
        }
        return handleNext(username, password);
    }
}
