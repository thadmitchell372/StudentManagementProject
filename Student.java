package com.company;

import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    String preferredName;
    String gradeLevel;
    float gpa;
    String favoriteSubject;
    String homeRoomTeacher;
    int studentIdNumber;
    String allergies;
    String homePhoneNumber;
    String homeAddress;
    String emailAddress;
    float lunchMoneyBalance;

    public Student() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredName = preferredName;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.favoriteSubject = favoriteSubject;
        this.homeRoomTeacher = homeRoomTeacher;
        this.studentIdNumber = studentIdNumber;
        this.allergies = allergies;
        this.homePhoneNumber = homePhoneNumber;
        this.homeAddress = homeAddress;
        this.emailAddress = emailAddress;
        this.lunchMoneyBalance = (float) lunchMoneyBalance;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", preferredName='" + preferredName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", gpa=" + gpa +
                ", favoriteSubject='" + favoriteSubject + '\'' +
                ", homeRoomTeacher='" + homeRoomTeacher + '\'' +
                ", studentIdNumber=" + studentIdNumber +
                ", allergies=" + Arrays.toString(new String[]{allergies}) +
                ", homePhoneNumber='" + homePhoneNumber + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", lunchMoneyBalance=" + lunchMoneyBalance +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    public String getHomeRoomTeacher() {
        return homeRoomTeacher;
    }

    public void setHomeRoomTeacher(String homeRoomTeacher) {
        this.homeRoomTeacher = homeRoomTeacher;
    }

    public int getStudentIdNumber() {
        return studentIdNumber;
    }

    public void setStudentIdNumber(int studentIdNumber) {
        this.studentIdNumber = studentIdNumber;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public float getLunchMoneyBalance() {
        return lunchMoneyBalance;
    }

    public void setLunchMoneyBalance(int lunchMoneyBalance) {
        this.lunchMoneyBalance = lunchMoneyBalance;
    }
}
