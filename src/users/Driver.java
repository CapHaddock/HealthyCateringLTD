package users;

import java.util.ArrayList;

/**
 *
 * @author Team Cthulhu's Awakening
 */
class Driver extends BasicUser {

    private ArrayList<Object> currentOrderList; //return Order objects?
    //ArrayList, or Array?
    //class for Orders?

    public Driver(int userId, String password) {
        super(userId, password);
    }

    public ArrayList getDriverOrderList() {
        return currentOrderList;
    }

    public boolean setOrderAsDelivered(int orderId) {

        //Logic here
        return true; //return true if ok?
    }

    public boolean undoOrderAsDelivered(int orderId) {
        //Logic needed
        return true; //return true if ok
    }
}
