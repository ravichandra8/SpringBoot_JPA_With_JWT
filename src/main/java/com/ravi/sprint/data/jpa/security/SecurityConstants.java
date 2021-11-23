package com.ravi.sprint.data.jpa.security;

public class SecurityConstants {
    public static final long EXPIRATION_TIME = 60*1000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/student/saveStudentDetails";
    public static final String TOKEN_SECRET = "asdfaff";
}
