package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class BibleStudy extends Event {

    public Study studyType;
    public Disciple leader;
    public Disciple setUp;
    public Person student;


    public BibleStudy(Disciple leader, Disciple setUp, Person studying, LocalDateTime time, Study type, Ministry ministry) {
        //THIS:
        this.studyType = type;
        this.leader = leader;
        this.setUp = setUp;
        this.student = studying;

        //SUPER SECTION:
        super.name = studying.getName() + " - " + type.toString() + " - " + leader.getName();
        super.startTime = time;
        super.ministry = ministry;
        super.notes = "";
        if (type == Study.SEEKING_GOD || type == Study.INTRO || type == Study.TRUTH) {
            super.duration = Duration.ofHours(1);
        } else if (type == Study.WORD_OF_GOD || type == Study.COUNT_THE_COST || type == Study.DISCIPLESHIP || type == Study.PERSECUTION) {
            super.duration = Duration.ofMinutes(90);
        } else {
            super.duration = Duration.ofHours(2);
        }
    }

    public Study getStudyType() {
        return studyType;
    }

    public void setStudyType(Study studyType) {
        this.studyType = studyType;
    }

    public Disciple getLeader() {
        return leader;
    }

    public void setLeader(Disciple leader) {
        this.leader = leader;
    }

    public Disciple getSetUp() {
        return setUp;
    }

    public void setSetUp(Disciple setUp) {
        this.setUp = setUp;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }
}
