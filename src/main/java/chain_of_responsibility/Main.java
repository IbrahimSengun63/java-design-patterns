package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        service.logIn("admin","1");
    }
}
