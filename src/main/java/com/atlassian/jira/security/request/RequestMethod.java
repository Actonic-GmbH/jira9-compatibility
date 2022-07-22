package com.atlassian.jira.security.request;

import com.atlassian.annotations.PublicApi;

import java.util.Locale;

@PublicApi
public enum RequestMethod {
    GET,
    HEAD,
    OPTIONS,
    CONNECT,
    DELETE,
    POST,
    PUT,
    PATCH,
    TRACE;

    public boolean matches(String method) {
        return this.name().toUpperCase(Locale.ROOT).equals(method.toUpperCase(Locale.ROOT));
    }
}
