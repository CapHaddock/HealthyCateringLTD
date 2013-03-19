package users;

import java.util.ArrayList;

/**
 *
 * @author Team Cthulhu's Awakening
 */
class Salesman extends BasicUser {

    private ArrayList<Customer> customerList;
    //Customer class?

    public Salesman(int userId, String inputPassword) {
        super(userId, inputPassword);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    //public Customer getCustomer(int customerId) {}
    
    //public int addCustomer(Customer newCustomer) {
    //return customerId }
    
    //public boolean setCustomer(int customerId) {} //set what?
    
    //public Order addOrder(Order newOrder) {} //return new order
    
    //public boolean setOrderStatus(){}
    
    //public ArrayList<Course> getCourseList() {} //Parameters? move to superclass?
}
