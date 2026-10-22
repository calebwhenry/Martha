package org.example;

import java.util.ArrayList;

public class Person {

    public String name;
    public long phoneNum;
    public Gender gender;
    public Study currentStudy;
    public ArrayList<BibleStudy> studies;
    public ArrayList<Disciple> involvedDisciples;

    public Person(String name) {
        this.name = name;
        this.phoneNum = 0;
        this.gender = Gender.UNKNOWN;
    }

    public Person(String name, long phoneNum) {
        this(name);
        this.phoneNum = phoneNum;
        this.gender = Gender.UNKNOWN;
    }

    public Person(String name, Gender gender) {
        this(name);
        this.phoneNum = 0;
        this.gender = gender;
    }

    public Person(String name, long phoneNum, Gender gender) {
        this(name, phoneNum);
        this.gender = gender;
    }

    //METHODS
    public void addStudy(BibleStudy study) {
        if (studies.isEmpty() || Studies.studyList.get(study.getStudyType()) != null) {
            currentStudy = study.getStudyType();
        }
        studies.add(study);
        if(!involvedDisciples.contains(study.getLeader())) {
            involvedDisciples.add(study.getLeader());
        }
        if(!involvedDisciples.contains(study.getSetUp())) {
            involvedDisciples.add(study.getSetUp());
        }
    }

    public boolean removeStudy(BibleStudy study) {
        if (studies.contains(study)) {
            studies.remove(study);
            return true;
        } else {
            return false;
        }
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Study getCurrentStudy() {
        return currentStudy;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
