package com.srv.retrofit.model;

public class GitHubUser {

    private String name;
    private String company;
    private String blog;
    private String id;
    private String location;
    private String bio;
    private String public_repos;

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getBio() {
        return bio;
    }

    public String getPublic_repos() {
        return public_repos;
    }

    public String getName() {
        return name;
    }

    public String getBlog() {
        return blog;
    }

    public String getCompany() {
        return company;
    }

}
