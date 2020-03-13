package com.ahbun.sample;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Contact object
 */
public class Contact {
    @JsonProperty("name")
    /** The identifying name of the contact person/organization. */
    private String name;

    @JsonProperty("url")
    /** The URL pointing to the contact information. MUST be in the format of a URL. */
    private String url;

    @JsonProperty("email")
    /** The email address of the contact person/organization. MUST be in the format of an email address. */
    private String email;

    public String getName() {
        return name;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Contact setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }
}
