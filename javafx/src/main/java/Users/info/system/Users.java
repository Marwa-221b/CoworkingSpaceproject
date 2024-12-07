package Users.info.system;

public abstract class Users {
    protected String name;
    private String password ;
    protected String email;
    protected String PhoneNumber;

    public Users() {}

    public Users(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Users(String name, String password, String email, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.email = email;
        PhoneNumber = phoneNumber;
    }

    public void login(){

    }
    public void logout(){

    }
}
