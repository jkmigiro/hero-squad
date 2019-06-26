import java.sql.Connection;
import java.util.ArrayList;
import java.util.*;





    public class HeroSquad {
        public static ArrayList<HeroSquad>theSquads=new ArrayList<>();
        public ArrayList<Heroes> heroes=new ArrayList<>(maxsize);
        public static Map<Integer,ArrayList<Heroes>> heroes_in_squad=new HashMap<Integer, ArrayList<Heroes>>();
        private int id;
        private ArrayList<Heroes> heroess;
        private String squadpeople;
        private String name;
        private static int maxsize=6;
        private String cause;
        private ArrayList<Object> characters;
        HeroSquad(String name,String cause){
          this.name=name;
          this.cause=cause;
          theSquads.add(this);
          this.id=theSquads.size();
          this.heroess=this.heroes;
          heroes_in_squad.put(this.id-1,heroes);


        };

public static ArrayList<HeroSquad> ShowSquads(){
    return theSquads;
}
public ArrayList<Heroes> showHeroes(){
    return this.heroes;
}
public String getName(){
    return  this.name;
}
        public String getCause(){
            return  this.cause;
        }
        public static HeroSquad getSquadId(int id){
                return theSquads.get(id-1);
        }
        public int getSquadIds(){
    return this.id;
        }
        public static HeroSquad GetSquadById(int theId)
        {
    return theSquads.get(theId);
        };


        public static ArrayList<Heroes> getSquad(int id){
            ArrayList<Heroes> squadpeople=new ArrayList<>();
            ArrayList<Object> heroes=new ArrayList<>();
            for(Map.Entry<Integer, ArrayList<Heroes>> entry : HeroSquad.heroes_in_squad.entrySet()){
                if(entry.getKey()==id){
                    squadpeople=entry.getValue();
                    break;

                }
            }
            return squadpeople;

        };
        public String showpoeple(){
          return this.squadpeople;
        }
        public ArrayList<Heroes> showHeroess(){
    return this.heroess;
        }

    }

