package com.example.hp.wehack;

/**
 * Created by Akanksha on 10/4/2018.
 */

public class json2 {
    json3 statistics;
    json4 snippet;
    json5 contentDetails;

    public json2(json3 statistics,json4 snippet, json5 contentDetails)
    {
        this.statistics = statistics;
        this.snippet = snippet;
        this.contentDetails = contentDetails;
    }

    public json3 getStatistics() {
        return statistics;
    }

    public json4 getSnippet() {
        return snippet;
    }

    public json5 getContentDetails() {
        return contentDetails;
    }
}
