package org.example;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Disciple extends Person {

    public ArrayList<String> nickNames;
    public LocalDate birthday;
    public LocalDate spirthday;
    public Ministry ministry;
    public BibleTalk bibleTalk;
    public Disciple discipler;


    //CONSTRUCTORS
    public Disciple (long phoneNum) {
        this(phoneNum, null, "unknown", null, null, null, null, null);
    }

    public Disciple (long phoneNum, String name, @NotNull String gender, LocalDate birthday, LocalDate spirthday, Ministry ministry, BibleTalk bibleTalk, Disciple discipler) {
        super(name, phoneNum);
        this.nickNames = new ArrayList<>();

        if (gender.equalsIgnoreCase("male") ||
                gender.equalsIgnoreCase("man") ||
                gender.equalsIgnoreCase("guy") ||
                gender.equalsIgnoreCase("dude")){
            this.gender = Gender.MALE;
        } else if (gender.equalsIgnoreCase("female") ||
                gender.equalsIgnoreCase("girl") ||
                gender.equalsIgnoreCase("woman") ||
                gender.equalsIgnoreCase("gal")) {
            this.gender = Gender.FEMALE;
        } else {
            this.gender = Gender.UNKNOWN;
        }

        //Instance variables:
        this.birthday = birthday;
        this.spirthday = spirthday;
        this.ministry = ministry;
        this.bibleTalk = bibleTalk;
        this.discipler = discipler;

        //not studying the Bible:
        super.studies = null;
        super.involvedDisciples = null;
        super.currentStudy = null;
    }


    //METHODS
    public void addNickname(String newNickname) {
        nickNames.add(newNickname);
    }

    public boolean removeNickName(String nickname) {
        if (nickNames.contains(nickname)) {
            nickNames.remove(nickname);
            return true;
        } else {
            return false;
        }
    }

    //GETTERS AND SETTERS

    public ArrayList<String> getNickNames(){
        return nickNames;
    }

    public void setNickNames(ArrayList<String> nickNames) {
        this.nickNames = nickNames;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getSpirthday() {
        return spirthday;
    }

    public void setSpirthday(LocalDate spirthday) {
        this.spirthday = spirthday;
    }

    public Ministry getMinistry() {
        return ministry;
    }

    public void setMinistry(Ministry ministry) {
        this.ministry = ministry;
    }

    public BibleTalk getBibleTalk() {
        return bibleTalk;
    }

    public void setBibleTalk(BibleTalk bibleTalk) {
        this.bibleTalk = bibleTalk;
    }

    public Disciple getDiscipler() {
        return discipler;
    }

    public void setDiscipler(Disciple discipler) {
        this.discipler = discipler;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getInfo() {
        return "This is " + name + "\n" +
                "Birthday: " + birthday + "\n" +
                "Spirthday: " + spirthday + "\n" +
                "Ministry: " + ministry + "\n" +
                "Bible Talk: " + bibleTalk + "\n" +
                "Discipler: " + discipler + "\n" +
                "Phone Number: " + phoneNum + "\n" +
                "Gender: " + gender + "\n";
    }
}
