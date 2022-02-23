package assignment1;
//CONCRETE Colleague
public class Planeimp extends Plane{
  public Planeimp(CentralControl med, String Id,String location){
    super(med,Id,location);
  }
  @Override
  public void sendmsg(String msg){
    System.out.println(this.Id+": Message: "+msg+" Location: "+this.location);
    mediator.sendwarning(msg,this);
  }
  @Override
  public void recievemsg(String msg){
    System.out.println(this.Id+": Recieved message:"+msg+" from location: "+this.location);
  }
}
