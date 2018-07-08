package com.learn.utils;

import com.learn.dto.CustomUserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Objects;

/**
 * Created by farhans on 7/8/18.
 */
public class CommonUtils {

    public static CustomUserDetails getCurrentUser(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (Objects.nonNull(auth)) {
            return (CustomUserDetails)auth.getPrincipal();
        }
        return null;
    }

    public static String getCurrentUserName(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (Objects.nonNull(auth)) {
            return ((CustomUserDetails)auth.getPrincipal()).getUsername();
        }
        return null;
    }
}
