package com.ahbun.sample;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * License object
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class License {
    @JsonProperty("name")
    String name;
    @JsonProperty("url")
    String url;

    public String getName() {
        return name;
    }

    public License setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public License setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return "License{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
