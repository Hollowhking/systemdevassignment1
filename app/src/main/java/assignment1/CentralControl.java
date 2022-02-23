package assignment1;
//MEDIATOR INTERFACE
public interface CentralControl{
    public void sendwarning(String msg, Plane plane);
    public void addPlane(Plane plane);
}
