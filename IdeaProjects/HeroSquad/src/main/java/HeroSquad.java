import java.util.ArrayList;
import java.util.*;





    public class HeroSquad {
        public static ArrayList<HeroSquad>theSquads=new ArrayList<>();
        public ArrayList<String> heroes=new ArrayList<>();
        public static Map<String,ArrayList<String>> heroes_in_squad=new HashMap<String,ArrayList<String>>();
        private int squadId;
        private ArrayList<String> heroess;
        private String squadpeople;
        private String name;
        private static int maxsize;
        private String cause;
        private ArrayList<Object> characters;
        HeroSquad(String name,String cause){
          this.name=name;
          this.cause=cause;
          theSquads.add(this);
          this.squadId=theSquads.size();
          this.heroess=this.heroes;
          heroes_in_squad.put(name,this.heroes);


        };

public static ArrayList<HeroSquad> ShowSquads(){
    return theSquads;
}
public ArrayList<String> showHeroes(){
    return this.heroes;
}
public String getName(){
    return  this.name;
}
        public String getCause(){
            return  this.cause;
        }
        public int getSquadId(){
    return this.squadId;
        }


//        public String getSquad(String name){
//            String squadpeople="";
//            ArrayList<Object> heroes=new ArrayList<>();
//            for(Map.Entry<String, ArrayList<String>> entry : HeroSquad.heroes_in_squad.entrySet()){
//                if(entry.getKey().equals(name)){
//                    for(int i=0;i<entry.getValue().size();i++){
//                        squadpeople+=(entry.getValue().get(i));
//                        squadpeople+=" ";
//                    }
//                }
//            }
//            this.squadpeople=squadpeople;
//            return squadpeople;
//        }
//        public String showHeroess(){
//          return this.squadpeople;
//        }
        public ArrayList<String> showHeroess(){
    return this.heroess;
        }

    }

