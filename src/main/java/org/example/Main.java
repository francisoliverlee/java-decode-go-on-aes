package org.example;

public class Main {
    public static String key = "Etc9D3CkCMzlLIAY";

    public static void main(String[] args) throws Exception {
        String encodedByGo = "jDGkLH9N2dC8a1ph-8-xbA";
        String plainText = AesUtil.decrypt(key, encodedByGo);
        System.out.println(plainText);

        String encodedByJava = AesUtil.encrypt(key, plainText);
        System.out.println(encodedByJava.equalsIgnoreCase(encodedByGo));
    }
}