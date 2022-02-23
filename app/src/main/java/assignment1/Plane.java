package assignment1;
//Colleague Class
public abstract class Plane{
  public CentralControl mediator;
  protected String Id;
  protected String location;
//ID IS THE TAIL NUMBER ON THE PLANE BEING FLOWN
  public Plane(CentralControl med, String Id,String location){
    this.mediator = med;
    this.Id = Id;
    this.location = location;
  }
  public abstract void sendmsg (String msg);//recieve message such as current speed as well as location
  public abstract void recievemsg (String msg);
  public String getlocation(){
    return this.location;
  }
}
