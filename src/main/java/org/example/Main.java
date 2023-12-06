package org.example;

public class Main {
    public static void main(String[] args) {

        //SimpleUser simpleUser = new SimpleUser();

        /*SimpleUser simpleUser1 = SimpleUser.builder()
                .id(1L)
                .name("제로베이스")
                .age(25)
                .address("서울시")
                .phoneNumber("010-1234-5678")
                .build();*/

        SimpleUser simpleUser2 = SimpleUser.builder()
                .userInfo(new UserInfo())
                .userAddress(new UserAddress())
                .build();
    }
}