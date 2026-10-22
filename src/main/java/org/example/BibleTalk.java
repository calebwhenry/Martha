package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BibleTalk {

    //INSTANCE VARIABLES
    public String name;
    public Disciple leader;
    public Disciple coLeader;
    public Ministry ministry;
    public ArrayList<Disciple> members;
    public ArrayList<BibleStudy> bibleStudies;
    public ArrayList<BibleStudy> bibleStudiesMen;
    public ArrayList<BibleStudy> bibleStudiesWomen;

    //CONSTRUCTORS
    public BibleTalk(String name, Disciple leader, Ministry ministry, Disciple coLeader) {
        this.name = name;
        this.leader = leader;
        this.ministry = ministry;
        this.coLeader = coLeader;
        this.leader.setBibleTalk(this);
    }

    public BibleTalk(String name){
        this(name, null, null, null);
    }

    //METHODS
    public void addMember(Disciple disciple) {
        if (!members.contains(disciple)) {
            this.members.add(disciple);
        }
    }

    public void addMembers(ArrayList<Disciple> members) {
        for (Disciple m : members) {
            this.addMember(m);
        }
    }

    public boolean removeMember(Disciple disciple) {
        if (members.contains(disciple)) {
            members.remove(disciple);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Clears old Bible studies and keeps upcoming ones.
     *
     * @return list of people studying the Bible previously who haven't set up new studies.
     */
    public ArrayList<Person> clearOldStudies() {
        ArrayList<BibleStudy> upcoming = new ArrayList<>();
        ArrayList<BibleStudy> old = new ArrayList<>();
        for (BibleStudy bs : bibleStudies) {
            if (bs.getTime().isAfter(LocalDateTime.now())) {
                upcoming.add(bs);
            } else {
                old.add(bs);
            }
        }
        ArrayList<Person> check = new ArrayList<>();
        outerLoop:
        for (BibleStudy oldBS : old) {
            for (BibleStudy newBS : upcoming) {
                if (oldBS.getStudent().equals(newBS.getStudent())) {
                    continue outerLoop;
                }
            }
            check.add(oldBS.getStudent());
        }
        bibleStudies.removeAll(bibleStudies);
        bibleStudies.addAll(upcoming);
        return check;
    }

    public void addBibleStudy(BibleStudy bs) {
        bibleStudies.add(bs);
    }

    public void addBibleStudies(ArrayList<BibleStudy> bs) {
        bibleStudies.addAll(bs);
    }

    public boolean removeBibleStudy(BibleStudy bs) {
        if (bibleStudies.contains(bs)) {
            bibleStudies.remove(bs);
            return true;
        } else {
            return false;
        }
    }

    //GETTERS AND SETTERS
    public Disciple getLeader() {
        return leader;
    }

    public void setLeader(Disciple leader) {
        this.leader = leader;
    }

    public ArrayList<Disciple> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Disciple> members) {
        this.members = members;
    }

    public Ministry getMinistry() {
        return ministry;
    }

    public void setMinistry(Ministry ministry) {
        this.ministry = ministry;
    }

    public Disciple getCoLeader() {
        return coLeader;
    }

    public void setCoLeader(Disciple coLeader) {
        this.coLeader = coLeader;
        this.coLeader.setBibleTalk(this);
    }

    public ArrayList<BibleStudy> getBibleStudies() {
        return bibleStudies;
    }

    @Override
    public String toString() {
        return name;
    }
}
