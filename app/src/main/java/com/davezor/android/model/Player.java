package com.davezor.android.model;

/**
 * Created by Flavadave on 4/12/2015.
 */
public class Player {
    private String mName;
    private int mNumber;
    private String mPosition;
    private int mAge;
    private int mTds;
    private int mYards;
    private int mSeasonsInLeague;
    private int mImageResource;

    public Player(String name, int number, String position, int age, int tds, int yards, int seasonsInLeague, int imageResource) {
        mName = name;
        mNumber = number;
        mPosition = position;
        mAge = age;
        mTds = tds;
        mYards = yards;
        mSeasonsInLeague = seasonsInLeague;
        mImageResource = imageResource;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }

    public String getPosition() {
        return mPosition;
    }

    public void setPosition(String position) {
        mPosition = position;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public int getTds() {
        return mTds;
    }

    public void setTds(int tds) {
        mTds = tds;
    }

    public int getYards() {
        return mYards;
    }

    public void setYards(int yards) {
        mYards = yards;
    }

    public int getSeasonsInLeague() {
        return mSeasonsInLeague;
    }

    public void setSeasonsInLeague(int seasonsInLeague) {
        mSeasonsInLeague = seasonsInLeague;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public void setImageResource(int imageResource) {
        mImageResource = imageResource;
    }
}
