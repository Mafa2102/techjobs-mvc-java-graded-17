package org.launchcode.techjobsmvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();
    static HashMap<String, String> columnChoices = new HashMap<>();



    @ModelAttribute("actions")
    public static HashMap getActionChoices(){
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
        return actionChoices;
    }

    @ModelAttribute("columns")
    public static HashMap getColumnChoices(){
        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");
        return columnChoices;
    }


}
