package com.ahbun.sample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/***
 * Info object
 */
public class Info {
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("version")
    private String version;
    @JsonProperty("license")
    private License license;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public Info setTitle(String title) {
        this.title = title;
        return this;
    }

    public Info setDescription(String description) {
        this.description = description;
        return this;
    }

    public Info setVersion(String version) {
        this.version = version;
        return this;
    }

    public License getLicense() {
        return license;
    }

    public Info setLicense(License license) {
        this.license = license;
        return this;
    }

    @Override
    public String toString() {
        return "Info{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", version='" + version + '\'' +
                ", license=" + license +
                '}';
    }
}
