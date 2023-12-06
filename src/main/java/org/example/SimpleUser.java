package org.example;

import jdk.jshell.Snippet;

public class SimpleUser {

    private long id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;


    public SimpleUser(SimpleUserBuilder simpleUserBuilder) {
        this.id = simpleUserBuilder.userInfo.getId();
        this.name = simpleUserBuilder.userInfo.getName();
        this.age = simpleUserBuilder.userInfo.getAge();
        this.address = simpleUserBuilder.userAddress.margedAddress();
        this.phoneNumber = simpleUserBuilder.userInfo.getPhoneNumber();
    }

    public SimpleUser() {

    }

    public static SimpleUserBuilder builder() {
        return null;
    }

    public static class SimpleUserBuilder {
        /*private long id;
        private String name;
        private int age;
        private String address;
        private String phoneNumber;*/
        private UserInfo userInfo;
        private UserAddress userAddress;

        public SimpleUserBuilder userInfo(UserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public SimpleUserBuilder userAddress(UserAddress userAddress) {
            this.userAddress = userAddress;
            return this;
        }
/* public SimpleUserBuilder id(long id) {
            this.id = id;
            return this;
        }

        public SimpleUserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SimpleUserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public SimpleUserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public SimpleUserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }*/

        public SimpleUser build() {
            return new SimpleUser(this);
            //SimpleUser simpleUser = new SimpleUser();
            //return simpleUser.id = userInfo.getId();
        }
    }
}
