package assignment1;
import java.util.ArrayList;
import java.util.List;
//CONCRETE MEDIATOR
public class CentralControlimp implements CentralControl{
  private List<Plane> planes;
  public CentralControlimp(){
    this.planes = new ArrayList<>();
  }
  @Override
  public void addPlane(Plane plane){
    this.planes.add(plane);
  }
  @Override
  public void sendwarning(String msg, Plane plane){
    for (Plane p : this.planes){
      if(p != plane){
        p.recievemsg(msg);
      }
    }
  }
}
