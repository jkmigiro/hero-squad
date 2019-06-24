import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");

        post("/newsquad", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String name = req.queryParams("name");
//            int size= Integer.parseInt(req.queryParams("age"));
            String cause = req.queryParams("cause");

            HeroSquad squad=new HeroSquad(name,cause);
            model.put("hero",squad);

            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());
        post("/newheroes", (req, res) -> {
            Map<String, Object> vim = new HashMap<>();
            String name = req.queryParams("name");
            int age = Integer.parseInt(req.queryParams("age"));
            String power = req.queryParams("power");
            String weakness = req.queryParams("weakness");
            String nameofSquad=req.queryParams("squadId");

            Heroes hero=new Heroes(name,age,power,weakness,nameofSquad);

            return new ModelAndView(vim, "success.hbs");
        }, new HandlebarsTemplateEngine());
        post("/welcome", (req, res) -> {
            Map<String, Object> vim = new HashMap<>();

            String username=req.session().attribute("welcome");


            return new ModelAndView(vim, "welcome.hbs");

        }, new HandlebarsTemplateEngine());
        get("/welcome", (req, res) -> {
            Map<String, Object> model = new HashMap<>();

            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<HeroSquad> squads=HeroSquad.ShowSquads();
            model.put("squads",squads);
            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());
        get("/thesquads", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<HeroSquad> squads=HeroSquad.ShowSquads();
            ArrayList<HeroSquad> fin=HeroSquad.theSquads;

            model.put("squads",squads);
            model.put("fin",fin);
            return new ModelAndView(model, "squads.hbs");
        }, new HandlebarsTemplateEngine());
        get("/theheroes", (req, res) -> {
            Map<String, Object> vim = new HashMap<>();


            ArrayList<HeroSquad> squads=HeroSquad.ShowSquads();

            vim.put("squads",squads);

            return new ModelAndView(vim, "heroes.hbs");
        },new HandlebarsTemplateEngine());
        get("/showheroes", (req, res) -> {
            Map<String, Object> vim = new HashMap<>();
            ArrayList<Heroes> gettheheroes = Heroes.showHeroes();
            vim.put("gettheheroes",gettheheroes);
            return new ModelAndView(vim, "showheroes.hbs");
        },new HandlebarsTemplateEngine());

    }

}
