package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Disciple caleb = new Disciple(7605057836L);
        Ministry UCR = new Ministry("UCR", caleb);
        caleb.setName("Caleb Henry");
        caleb.setBirthday(LocalDate.of(2002, 9, 27));
        caleb.setSpirthday(LocalDate.of(2021, 4, 17));
        caleb.setGender(Gender.MALE);
        BibleTalk relentless = new BibleTalk("Relentless", caleb, UCR, null);

        Disciple bri = new Disciple(1234567890, "Briana Lester", "gIRl", LocalDate.of(1994, 10, 27), LocalDate.of(2015,1,4), UCR, relentless, null);

        relentless.setCoLeader(bri);


        System.out.println(caleb.getInfo());
        System.out.println(bri.getInfo());
    }


    /// ACTIONS:

    //ADD/REMOVE BIBLE STUDY

    //ADD/REMOVE MEMBER

    //CHANGE MEMBER INFO

    //BUILD NEW MINISTRY

    //CHANGE BT STRUCTURE

    //GET INFO

    //REMINDERS
}