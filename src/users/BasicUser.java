package users;

/**
 *
 * @author Team Cthulhu's Awakening
 */

abstract class BasicUser {

    private final int userId;
    private final String password; //

    public BasicUser(int userId, String inputPassword) {
        this.userId = userId;
        this.password = inputPassword;
        //Queue input employee number to the database
        //which will return the needed values to generate an user object
        //TO DO: implement methods for database communication
    }

    public int getUserId() {
        return userId;
    }
    
    
    public boolean verifyLogin() {
        //METHOD LOGIC HERE
        return true;
    }
    
    //public String getUserInfo() {}
    //Hva skal den returnere? toString-ekvivalent, eller objekt?

}
