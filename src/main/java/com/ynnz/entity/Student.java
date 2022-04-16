package com.ynnz.entity;

public class Student {
    private String id;

    private String name;

    private String state;

    private String submissionTime;

    private String ip;

    private String reviewTime;

    private String reviewer;

    private String reviewIp;

    private String score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getReviewIp() {
        return reviewIp;
    }

    public void setReviewIp(String reviewIp) {
        this.reviewIp = reviewIp;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Student(String id, String reviewTime, String reviewer, String reviewIp, String score) {
        this.id = id;
        this.reviewTime = reviewTime;
        this.reviewer = reviewer;
        this.reviewIp = reviewIp;
        this.score = score;
    }

    public Student() {
        super();
    }

    public Student(String id, String name, String state, String submissionTime, String ip, String reviewTime, String reviewer, String reviewIp, String score) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.submissionTime = submissionTime;
        this.ip = ip;
        this.reviewTime = reviewTime;
        this.reviewer = reviewer;
        this.reviewIp = reviewIp;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", submissionTime='" + submissionTime + '\'' +
                ", ip='" + ip + '\'' +
                ", reviewTime='" + reviewTime + '\'' +
                ", reviewer='" + reviewer + '\'' +
                ", reviewIp='" + reviewIp + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

}