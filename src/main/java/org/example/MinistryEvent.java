package org.example;

import java.time.*;

public class MinistryEvent extends Event{

    public LocalDateTime endTime;
    public Disciple leader;

    public MinistryEvent(String name, LocalDateTime startTime, Duration dur) {
        this.name = name;
        this.startTime = startTime;
        this.duration = dur;
        this.endTime = startTime.plus(duration);
        this.leader = null;
    }

    public Disciple whoSetUp(){
        return leader;
    }

    public void setUpBy(Disciple leader) {
        this.leader = leader;
    }

}
