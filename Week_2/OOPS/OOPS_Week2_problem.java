package music;
public interface Playable {
    public void play();
}

package music.string;
import music.Playable;
public class Venna implements Playable{
    public void play(){
        System.out.println("Function called by the Veena Object");
    }
}

package music.wind;
import music.Playable;
public class Saxophone implements Playable{
    public void play(){
        System.out.println("Function called by Saxophone Object");
    }
}

package live;
import music.Playable;
import music.string.Venna;
import music.wind.Saxophone;

public class Test {
   public static void main(String[] args){
      Venna v1 = new Venna();
      v1.play();

      Saxophone s1 = new Saxophone();
      s1.play();

    Playable p;

        p = new Venna();
        p.play();

        p = new Saxophone();
        p.play();
   }
}
