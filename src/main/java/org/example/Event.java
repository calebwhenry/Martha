package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Event {

    public String name;
    public LocalDateTime startTime;
    public Duration duration = Duration.ofHours(1);
    public String notes;
    public Ministry ministry;

    public String getName() {
        return name;
    }

    public void rename(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return startTime;
    }

    public void reschedule(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Ministry getMinistry() {
        return ministry;
    }

    public void setMinistry(Ministry ministry) {
        this.ministry = ministry;
    }
}
