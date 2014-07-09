package model;

/**
 * Created with IntelliJ IDEA.
 * User: kje
 * Date: 09.07.14
 * Time: 22:55
 * To change this template use File | Settings | File Templates.
 */
public class Challenge {
    private String challengeName;
    private int numberOfKills;
    private String weaponName;

    public Challenge(int numberOfKills, String weaponName){
        this.numberOfKills = numberOfKills;
        this.weaponName = weaponName;
        setChallengeName("Get " + numberOfKills + " kills with " + weaponName);
    }

    public String getChallengeName() {
        return challengeName;
    }

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    public int getNumberOfKills() {
        return numberOfKills;
    }

    public void setNumberOfKills(int numberOfKills) {
        this.numberOfKills = numberOfKills;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
