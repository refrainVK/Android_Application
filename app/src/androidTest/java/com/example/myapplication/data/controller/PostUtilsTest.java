package com.example.myapplication.data.controller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Yifan Chen
 * @version 1.0.0
 * @since 9/1/2020 2:59 PM
 */
public class PostUtilsTest {

    @Test
    public void registerByPost() {
        System.out.println(PostUtils.RegisterByPost("testPostRegister", "123444"));
    }
}