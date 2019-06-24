import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Heroes {
    public static ArrayList<Heroes> theHeroes = new ArrayList<>();

    public ArrayList<String> squad_with_heroes = new ArrayList<>();
    private String heroname;
    private int age;
    private String specialpower;
    private String weakness;
    private String associated_squad;
    Heroes(String name, int age, String power, String weakness,String squadname) {

        this.heroname = name;
        this.age = age;
        this.specialpower = power;
        this.weakness = weakness;

        this.match(squadname,name);
        this.associated_squad=squadname;
        theHeroes.add(this);

    };

    public static ArrayList<Heroes> showHeroes() {
        return theHeroes;
    }

//    public void Herotosquad(String squadname, String heroname) {
//        Object ob=new HeroSquad();
//        HeroSquad obj=(HeroSquad)ob;
//        HeroSquad.heroes_in_squad.put(squadname, ((HeroSquad) ob).squad_with_heroes.add());
//    }
 public static String match(String squadname,String heroname){
String str="";
     for(Map.Entry<String, ArrayList<String>> entry : HeroSquad.heroes_in_squad.entrySet()){
          if(entry.getKey().equals(squadname)){
                entry.getValue().add(heroname);

                str=entry.getKey();

                break;
          }
     }
     return str;
 }
 //function to know which hero is in which squad
public String getHeroSquad(String name){
        String squadname="";
    for(Map.Entry<String, ArrayList<String>> entry : HeroSquad.heroes_in_squad.entrySet()){
        ArrayList squad=entry.getValue();
        for(int i=0;i<squad.size();i++){
            if(name.equals(squad.get(i))){

                squadname=entry.getKey();
                break;
            }
        }
    }
    return squadname;
}

    public String getHeroname() {
        return this.heroname;
    }

    public String getWeakness() {
        return this.weakness;
    }
    public String getPower() {
        return this.specialpower;


    }
    public String getAssociated_squad(){
        return this.associated_squad;
    }

    public int getAge() {
        return this.age;
    }


}
