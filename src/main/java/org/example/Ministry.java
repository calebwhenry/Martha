package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ministry {

    //INSTANCE VARIABLES
    public String name;
    public Disciple leader;
    public ArrayList<Disciple> members;
    public ArrayList<Disciple> admins;
    public ArrayList<BibleTalk> BTs;

    //CONSTRUCTORS
    public Ministry(String name, Disciple leader) {
        this.name = name;
        this.leader = leader;
        this.members = new ArrayList<>();
        this.admins = new ArrayList<>();
        this.leader.setMinistry(this);
    }

    public Ministry() {
        this(null, null);
    }

    //METHODS
    public void addMembers(ArrayList<Disciple> members) {
        for (Disciple member : members) {
            this.addMember(member);
        }
    }

    public void addMember(Disciple member) {
        members.add(member);
    }

    public int removeMembers(ArrayList<Disciple> members) {
        int totalRemoved = 0;
        for (Disciple d : members) {
            totalRemoved += this.removeMember(d);
        }
        return totalRemoved;
    }

    public int removeMember(Disciple member) {
        if (this.members.contains(member)) {
            this.members.remove(member);
            return 1;
        } else {
            return 0;
        }
    }

    public void addAdmins(ArrayList<Disciple> admins) {
        for (Disciple a : admins) {
            this.addAdmin(a);
        }
    }

    public void addAdmin(Disciple newAdmin) {
        this.admins.add(newAdmin);
    }

    public void addBT(BibleTalk bt) {
        this.BTs.add(bt);
    }

    public boolean removeBT(BibleTalk bt) {
        if (BTs.contains(bt)) {
            this.BTs.remove(bt);
            return true;
        } else {
            return false;
        }
    }


    //GETTERS AND SETTERS
    public void setLeader(Disciple leader) {
        this.leader = leader;
    }

    public Disciple getLeader() {
        return leader;
    }

    public ArrayList<BibleTalk> getBTs() {
        return BTs;
    }

    public String toString() {
        return name;
    }
}
