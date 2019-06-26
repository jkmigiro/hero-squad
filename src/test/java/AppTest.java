import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void Squads(){

        HeroSquad ty=new HeroSquad("Jasper","Flyin");
        HeroSquad ky=new HeroSquad("Vera","Space");
        System.out.println("The squad is using a constructor: "+ty.showHeroess());
        Heroes gy=new Heroes("Vim",20,"Slidin","Kryptonite","Jasper",1);
        System.out.println("The squad is using a constructor: "+ty.showHeroess());
        Heroes dy=new Heroes("NaeNae",20,"Slidin","Kryptonite","Jasper",1);
        System.out.println("The squad is using a constructor: "+ty.showHeroess());
        Heroes qy=new Heroes("Deros",20,"Slidin","Kryptonite","Jasper",1);
        Heroes wy=new Heroes("Vimed",20,"Slidin","Kryptonite","Vera",2);
        Heroes yy=new Heroes("Onii",20,"Slidin","Kryptonite","Vera",2);
        Heroes zy=new Heroes("Chan",20,"Slidin","Kryptonite","Vera",3);

        ArrayList<HeroSquad> fin=HeroSquad.theSquads;

        assertEquals("Jasper",ty.getName());
        for(int i=0;i<fin.size();i++){
            System.out.println("Name is:"+fin.get(i).getCause());
        }
        System.out.println(HeroSquad.ShowSquads().get(0).getCause());
        System.out.println(ty.getName()+"  "+ty.getCause());
//        System.out.println(gy.getHeroname()+" "+gy.getWeakness()+" "+Heroes.showHeroes().get(0).getWeakness()+" "+Heroes.showHeroes());

        System.out.println(HeroSquad.heroes_in_squad);
        System.out.println(gy.getAssociated_squad()+" "+dy.getAssociated_squad()+" "+qy.getAssociated_squad()+" "+wy.getAssociated_squad()+" "+yy.getAssociated_squad());
        System.out.println(HeroSquad.theSquads.get(0).getName()+" "+HeroSquad.theSquads.get(1).getName());
        System.out.println("One"+ty.heroes+" and two "+ky.heroes);
        ArrayList<HeroSquad> obj=HeroSquad.ShowSquads();
        for(int i=0;i<obj.size();i++){
            System.out.println("Squad name is: "+obj.get(i).getName());
            System.out.println("Squad cause is: "+obj.get(i).getCause());
            System.out.println("ID is: "+obj.get(i).getSquadIds());

        }
        System.out.println("The squad is: "+ty.showHeroess());
        System.out.println("The squad is using a constructor: "+ty.showHeroess());
        System.out.println("Jasper id is: "+ty.getSquadIds()+" Vera is is: "+ky.getSquadIds());

        System.out.println("Index 0 of HeroSquad is: "+HeroSquad.getSquadId(1).getName());
        System.out.println("Index 0 of HeroSquad is: "+HeroSquad.getSquadId(2).getName());
        System.out.println("Heroes Jasper Squad are: "+ty.showHeroes());
System.out.println(HeroSquad.getSquadId(1).showHeroes());
System.out.println("Gotcha"+HeroSquad.getSquad(0));
        System.out.println("Heroes Vera Squad are: "+ky.showHeroes());

    }

}
