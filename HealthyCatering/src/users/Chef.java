package users;

import java.util.ArrayList;

/**
 *
 * @author Team Cthulhu's Awakening
 */
class Chef extends BasicUser {

    private ArrayList<Order> currentOrders;
    //TODO- Order and Course classes?
    private ArrayList<Course> currentCourses;

    public Chef(int userId, String password) {
        super(userId, password);
        //initiate currentOrders and currentCourses?
        //need logic for initiating from database
    }

    public ArrayList<Order> getOrders() {
        return currentOrders;
    }
    
    public boolean setOrderAsFinishedCooking(int orderId) {
        for(Order currentOrder : currentOrders){
            if(currentOrder.getOrderId == orderId) {
                currentOrder.setStatus("Done");
                return true;
            }
        }
        return false; //return true if ok
    }

    public boolean undoOrderAsFinished(int orderId) {
        for(Order currentOrder : currentOrders){
            if(currentOrder.getOrderId == orderId) {
                currentOrder.setStatus("Not Done"); //**PSUEDO**
                return true;
            }
        }
        return false; //return true if ok
    }    
    
    public ArrayList<Course> getCourseList() {
        return currentCourses;
    }
    
    public Course getCourse(String courseName) { //Parameters?
        //Need logic
        return null; //PLACEHOLDER
    }
    
    //public boolean addCourse(){}
    //public boolean setCourse(int courseId) {}
    //public boolean removeCourse(int courseId) {}
}
