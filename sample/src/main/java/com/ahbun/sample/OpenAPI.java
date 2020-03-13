package com.ahbun.sample;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/***
 * Open API object
 */
public class OpenAPI {
    @JsonProperty("openapi")
    private String openapi;
    @JsonProperty("info")
    private Info info;

    public String getOpenapi() {
        return openapi;
    }

    public OpenAPI setOpenapi(String openapi) {
        this.openapi = openapi;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenAPI openAPI = (OpenAPI) o;
        return openapi.equals(openAPI.openapi) &&
                info.equals(openAPI.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openapi, info);
    }

    @Override
    public String toString() {
        return "OpenAPI{" +
                "openapi='" + openapi + '\'' +
                ", info=" + info +
                '}';
    }

    public Info getInfo() {
        return info;
    }

    public OpenAPI setInfo(Info info) {
        this.info = info;
        return this;
    }
}
