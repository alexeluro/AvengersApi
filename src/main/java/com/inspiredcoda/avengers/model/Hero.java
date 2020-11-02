package com.inspiredcoda.avengers.model;

public class Hero {

    private String codeName;
    private Gender gender;
    private String alias;
    private String picUrl;
    private boolean canFly;

    public Hero() {
    }

    public Hero(String codeName, Gender gender, String alias, String picUrl, boolean canFly) {
        this.codeName = codeName;
        this.gender = gender;
        this.alias = alias;
        this.picUrl = picUrl;
        this.canFly = canFly;
    }

    public String getCodeName() {
        return codeName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getAlias() {
        return alias;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public String getPicUrl() {
        return picUrl;
    }

}

