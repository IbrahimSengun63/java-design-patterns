package chain_of_responsibility;

public class UserExistsHandler extends Handler{
    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }
    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            return false;
        }
        return handleNext(username, password);
    }
}
