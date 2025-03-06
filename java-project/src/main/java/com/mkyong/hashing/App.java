package com.mkyong.hashing;

import org.apache.commons.codec.digest.DigestUtils;

public class App {

    public static void main(String[] args) {

     
        System.out.println("code is:"+sha256hex("1234"));

    }

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }

}
