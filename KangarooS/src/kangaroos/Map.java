
package kangaroos;


/**
 *
 * @author hello
 */
public class Map{ 
    LinkedList<Points> points = new LinkedList<>(); // aku tak buat private sebab senang untuk akses
    int numberofpoints;
    public Map(){
        
    }
    
    public Map(int numberofpoints){
        this.numberofpoints = numberofpoints;
    }
    
    public int numberofspot(){
        return numberofpoints;
    }
    
    public Points getPoint(int pointID){
        for (int i = 0; i < points.length(); i++) {
            if(points.atindex(i).getpointID()==pointID)
                return points.atindex(i);
        }
        return null;//this will occur only if input pointID is not existed
    }

    public int getPointfood(int pointID){
        for (int i = 0; i < points.length(); i++) {
            if(points.atindex(i).getpointID()==pointID)
                return points.atindex(i).getfood();
        }
        System.out.println("pointID is not exist, so you got -1");
        return -1;
    }

    public int numColony(){
        return Points.numberofcolony;
    }

    public void tick(){
        for (int i = 0; i < JumpGroove.Kangaroos.length(); i++) {
            JumpGroove.Kangaroos.atindex(i).collectfood();
        }
        for (int i = 0; i < JumpGroove.Kangaroos.length(); i++) {
            JumpGroove.Kangaroos.atindex(i).tick();
        }
        
    }
}
