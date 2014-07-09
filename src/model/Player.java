package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: kje
 * Date: 09.07.14
 * Time: 22:56
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private String name;
    Map<String, Integer> initKills = new HashMap<String, Integer>();
    Map<String, Integer> currentKills = new HashMap<String, Integer>();

    public Player(String name, Map currentKills){
        this.name = name;
        this.currentKills = currentKills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
