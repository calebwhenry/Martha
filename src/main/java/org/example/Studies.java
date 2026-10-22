package org.example;

import java.util.HashMap;
import java.util.Map;

//STATIC "BIBLE STUDY" CLASS FOR INFORMATION STORAGE
public class Studies {
    public static Map<Study, Integer> studyList = new HashMap<>(Map.ofEntries(
            Map.entry(Study.INTRO, 0),
            Map.entry(Study.SEEKING_GOD, 1),
            Map.entry(Study.WORD_OF_GOD, 2),
            Map.entry(Study.DISCIPLESHIP, 3),
            Map.entry(Study.TRUTH, 4),
            Map.entry(Study.KINGDOM, 5),
            Map.entry(Study.PERSECUTION, 6),
            Map.entry(Study.LIGHT_AND_DARKNESS, 7),
            Map.entry(Study.CROSS, 8),
            Map.entry(Study.CHURCH, 9),
            Map.entry(Study.COUNT_THE_COST, 10)
    ));

    public String introScriptures = "Hebrews 5:11-14\n";

    public String seekingGodScriptures =
            "Psalm 119:1-2\n" +
            "Matthew 6:25-34\n" +
            "Acts 17:26-27\n" +
            "John 4:23-24\n" +
            "Acts 17:10-12\n" +
            "Jeremiah 29:11\n" +
            "Acts 8:26-39\n" +
            "Matthew 7:7-8\n";

    public String wordOfGodScriptures =
            "2 Timothy 3:16-17\n" +
            "Hebrews 4:12-13\n" +
            "2 Peter 1:20-21\n" +
            "Matthew 15:1-9\n" +
            "1 Timothy 4:16\n" +
            "John 8:31-32\n" +
            "James 1:22-25\n" +
            "John 12:47-48\n";

    public String discipleshipScriptures =
            "Acts 11:25-26\n" +
            "Matthew 28:18-20\n" +
            "Mark 1:16-20\n" +
            "Luke 9:23-25\n" +
            "Luke 14:25-33\n" +
            "Mark 10:17-31\n";

    public String truthScriptures =
            "John 8:31-32\n" +
            "1 Timothy 2:3-4\n" +
            "2 Timothy 4:3-4\n" +
            "Matthew 7:13-14\n" +
            "Matthew 7:21-23\n" +
            "John 10:7-9\n" +
            "2 Corinthians 11:3-4\n" +
            "2 Thessalonians 2:9-10\n";

    public String kingdomScriptures =
            "Acts 1:3\n" +
            "Acts 28:30-31\n" +
            "Matthew 13:44-46\n" +
            "Isaiah 2:1-4\n" +
            "Daniel 2:31-45\n" +
            "Matthew 3:1-6\n" +
            "Matthew 4:17\n" +
            "Matthew 16:13-19\n" +
            "Mark 9:1\n" +
            "Luke 24:44-49\n" +
            "John 3:1-7\n" +
            "Acts 1-2\n" +
            "Matthew 6:33\n";

    public String persecutionScriptures =
        "2 Timothy 3:12\n" +
        "Mark 3:20-21, 31-35\n" +
        "John 19:25-27\n" +
        "Acts 1:12-14\n" +
        "John 7:12-13\n" +
        "John 10:19-21\n" +
        "Luke 23:1-3\n" +
        "Acts 5:17-18, 38-42\n" +
        "Acts 28:21-22\n" +
        "1 Timothy 4:16\n" +
        "1 Peter 4:3-4\n" +
        "1 Peter 4:12-16\n" +
        "John 15:18-20, 16:1-4\n" +
        "Matthew 7:13-14\n" +
        "Matthew 5:10-12\n" +
        "Ephesians 6:10-18\n";

    public String lightAndDarknessScriptures =
        "1 Peter 2:9-10\n" +
        "Isaiah 59:1-2\n" +
        "Romans 3:23\n" +
        "Galatians 5:19-21\n" +
        "2 Timothy 3:1-5\n" +
        "James 4:17\n" +
        "Romans 6:23\n" +
        "John 3:1-7\n" +
        "Acts 2:36-38\n" +
        "Romans 6:1-4\n";

    public String crossScriptures =
        "2 Corinthians 5:13-15\n" +
        "Matthew 26:31-28:10\n" +
        "Isaiah 53:4-6\n";

    public String churchScriptures =
        "Colossians 1:15-18\n" +
        "Ephesians 2:19-21\n" +
        "1 Corinthians 12:12-13\n" +
        "1 Corinthians 1:10-13\n" +
        "Luke 12:51-53\n";

    public String ctcScriptures =
        "Luke 14:25-33\n" +
        "Hebrews 10:23-25\n" +
        "1 Corinthians 16:1-2\n" +
        "2 Corinthians 6:14-7:1\n";

    public Map<Study, String> scriptures = new HashMap<>(Map.ofEntries(
        Map.entry(Study.INTRO, introScriptures),
        Map.entry(Study.SEEKING_GOD, seekingGodScriptures),
        Map.entry(Study.WORD_OF_GOD, wordOfGodScriptures),
        Map.entry(Study.DISCIPLESHIP, discipleshipScriptures),
        Map.entry(Study.TRUTH, truthScriptures),
        Map.entry(Study.KINGDOM, kingdomScriptures),
        Map.entry(Study.PERSECUTION, persecutionScriptures),
        Map.entry(Study.LIGHT_AND_DARKNESS, lightAndDarknessScriptures),
        Map.entry(Study.CROSS, crossScriptures),
        Map.entry(Study.CHURCH, churchScriptures),
        Map.entry(Study.COUNT_THE_COST, ctcScriptures)
    ));

}
