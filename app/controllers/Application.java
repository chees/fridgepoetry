package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	List<WordSet> sets = WordSet.find("order by creationDate desc").fetch(10);
        render(sets);
    }

}