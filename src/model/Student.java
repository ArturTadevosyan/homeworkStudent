package model;

public class Student {
    private String name;
    private String surname;
    private int year;
    private double mark;
    private boolean armenian;
    private char gender;
    private ConstVariable constVariable = new ConstVariable();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isArmenian() {
        return armenian;
    }

    public void setArmenian(boolean armenian) {
        this.armenian = armenian;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setGenderMale() {
        setGender(constVariable.getMale());
    }

    public void setGenderFemale() {
        setGender(constVariable.getFemale());
    }


}
