import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class
App {
    public static void main(String[] args){
        Integer port;
        ProcessBuilder processBuilder = new ProcessBuilder();

        if (processBuilder.environment().get("PORT") != null){
            port = Integer.parseInt(processBuilder.environment().get("PORT"));
        }else {
            port =4567;
                    
        }
        port(port);
        staticFileLocation("/public");
//        String connectionString = "jdbc:h2:~/todolist.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
//        Sql2o sql2o = new Sql2o(connectionString, "", "");
//        Sql2oTaskDao taskDao = new Sql2oTaskDao(sql2o);
        post("/newsquad", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String name = req.queryParams("name");
//            int size= Integer.parseInt(req.queryParams("age"));
            String cause = req.queryParams("cause");

            HeroSquad squad=new HeroSquad(name,cause);
            System.out.println("Squad id after post is: "+squad.getSquadIds());
            model.put("hero",squad);

            return new ModelAndView(model, "welcome.hbs");
        }, new HandlebarsTemplateEngine());
        post("/newheroes/:id", (req, res) -> {
            Map<String, Object> vim = new HashMap<>();
            String name = req.queryParams("name");
            int age = Integer.parseInt(req.queryParams("age"));
            String power = req.queryParams("power");
            String weakness = req.queryParams("weakness");
            String nameofSquad=req.queryParams("squadId");
            int id=Integer.parseInt(req.params("id"));
            Heroes hero=new Heroes(name,age,power,weakness,nameofSquad,id);

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
            Map<String,ArrayList> vim = new HashMap<>();


ArrayList<HeroSquad> squads=HeroSquad.ShowSquads();

            model.put("squads",squads);



            return new ModelAndView(model, "squads.hbs");
        }, new HandlebarsTemplateEngine());
        get("/theheroes/:index", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            Map<String,ArrayList> vim = new HashMap<>();
            Integer id=Integer.parseInt(req.params(":index"));


                HeroSquad hq=HeroSquad.GetSquadById(id);
                model.put("squads",hq);
                model.put("id",id);

return new ModelAndView(model, "heroes.hbs");
            }, new HandlebarsTemplateEngine());
        get("/theheroes", (req, res) -> {
            Map<String, Object> vim = new HashMap<>();
//            int id=Integer.parseInt(req.params(":squadId"));

            ArrayList<HeroSquad> squads=HeroSquad.ShowSquads();
//            HeroSquad squads=HeroSquad.getSquadId(id);

            vim.put("squads",squads);

            return new ModelAndView(vim, "heroes.hbs");
        },new HandlebarsTemplateEngine());
        get("/showheroes", (req, res) -> {
            Map<String, Object> vim = new HashMap<>();
            ArrayList<Heroes> gettheheroes = Heroes.showHeroes();
            vim.put("gettheheroes",gettheheroes);
            return new ModelAndView(vim, "showheroes.hbs");
        },new HandlebarsTemplateEngine());
        get("/showheroes/:index", (req, res) -> {
            Map<String, Object> vim = new HashMap<>();
            int id=Integer.parseInt(req.params(":index"));

                ArrayList<Heroes> hq=HeroSquad.getSquad(id);
                vim.put("squads",hq);




                System.out.println("Heroes after zero are: "+hq);
                System.out.println("Name is");


            return new ModelAndView(vim, "showheroes.hbs");
        },new HandlebarsTemplateEngine());

    }

}
