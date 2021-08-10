package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> book = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String search;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please select your option.");
            System.out.println("1. Add Student");
            System.out.println("2. Search Directory");
            System.out.println("3. Delete Student");
            System.out.println("4. Print Entire Directory");
            System.out.println("5. Exit Program");
            search = input.nextLine();


            if (search.toLowerCase().equals("add student") || search.equals("1")) {
                Student student = new Student();
                System.out.println("Please enter their first name: ");
                String answer = input.nextLine();
                student.setFirstName(answer);
                System.out.println("Please enter their last name: ");
                answer = input.nextLine();
                student.setLastName(answer);
                System.out.println("Please enter their preferred name: ");
                answer = input.nextLine();
                student.setPreferredName(answer);
                System.out.println("Please enter their current grade: ");
                answer = input.nextLine();
                student.setGradeLevel(answer);
                System.out.println("Please enter their GPA: ");
                float floatAnswer = Float.parseFloat(input.nextLine());
                student.setGpa(floatAnswer);
                search = input.nextLine();
                System.out.println("Please enter their favorite subject: ");
                answer = input.nextLine();
                student.setFavoriteSubject(answer);
                System.out.println("Please enter their home room teacher: ");
                answer = input.nextLine();
                student.setHomeRoomTeacher(answer);
                System.out.println("Please enter their student ID number: ");
                int intAnswer = input.nextInt();
                student.setStudentIdNumber(intAnswer);
                search = input.nextLine();
                System.out.println("Please enter their allergies(separate each with a comma): ");
                answer = input.nextLine();
                student.setAllergies(answer);
                System.out.println("Please enter their home phone number(no dashes): ");
                answer = input.nextLine();
                student.setHomePhoneNumber(answer);
                System.out.println("Please enter their home address(Only street number and street name): ");
                answer = input.nextLine();
                student.setHomeAddress(answer);
                System.out.println("Please enter their email address: ");
                answer = input.nextLine();
                student.setEmailAddress(answer);
                System.out.println("Please enter their lunch balance: ");
                floatAnswer = input.nextFloat();
                student.setLunchMoneyBalance((int) floatAnswer);
                System.out.println(student);
                search = input.nextLine();
                book.add(student);


            }
            if (search.toLowerCase().equals("search directory") || search.equals("2")) {
                String lastN;
                String firstN;

                System.out.println("Would you like to search by 1) first name, 2) last name, 3) phone number, or 4) email?: ");
                String searchA = input.nextLine();

                if (searchA.toLowerCase().equals("first name") || searchA.equals("1")) {
                    System.out.println("What first name would you like to search with?: ");
                    firstN = input.nextLine();
                    for (int j = 0; j < book.size(); j++) {
                        if (book.get(j).getFirstName().startsWith(firstN)) {
                            System.out.println(book.get(j));
                        } else {
                            System.out.println("Sorry no matches!");
                        }
                    }
                }

                if (searchA.toLowerCase().equals("last name") || searchA.equals("2")) {
                    System.out.println("What last name would you like to search with?: ");
                    lastN = input.nextLine();
                    for (int j = 0; j < book.size(); j++) {
                        if (book.get(j).getLastName().startsWith(lastN)) {
                            System.out.println(book.get(j));
                        } else {
                            System.out.println("Sorry no matches!");
                        }
                    }
                }
                if (searchA.toLowerCase().equals("preferred name") || searchA.equals("3")) {
                    System.out.println("What preferred name would you like to search with?: ");
                    firstN = input.nextLine();
                    for (int j = 0; j < book.size(); j++) {
                        if (book.get(j).getPreferredName().startsWith(firstN)) {
                            System.out.println(book.get(j));
                        } else {
                            System.out.println("Sorry no matches!");
                        }
                    }
                }

                if (searchA.toLowerCase().equals("grade level") || searchA.equals("4")) {
                    System.out.println("What grade level do you want to search?: ");
                    firstN = input.nextLine();
                    for (int j = 0; j < book.size(); j++) {
                        if (book.get(j).getGradeLevel().startsWith(firstN)) {
                            System.out.println(book.get(j));
                        } else {
                            System.out.println("Sorry no matches!");
                        }
                    }
                }
                if (searchA.toLowerCase().equals("gpa") || searchA.equals("5")) {
                    System.out.println("For GPA, what is the lower end of the range you would to search with");
                    float gpa1 = input.nextFloat();
                    System.out.println("What is the upper end?: ");
                    float gpa2 = input.nextFloat();
                    for (int j = 0; j < book.size(); j++) {
                        if (book.get(j).getGpa() >= gpa1 && book.get(j).getGpa() <= gpa2) {
                            System.out.println(book.get(j));
                        } else {
                            System.out.println("Sorry no matches!");
                        }
                    }
                }
                //To Do: Make this a range search

                if (searchA.toLowerCase().equals("favorite subject") || searchA.equals("6")) {
                    System.out.println("What favorite subject would you like to search with?: ");
                    firstN = input.nextLine();
                    for (int j = 0; j < book.size(); j++) {
                        if (book.get(j).getFavoriteSubject().startsWith(firstN)) {
                            System.out.println(book.get(j));
                        } else {
                            System.out.println("Sorry no matches!");
                        }
                    }
                    if (searchA.toLowerCase().equals("home room teacher") || searchA.equals("7")) {
                        System.out.println("What home room teacher would you like to search?: ");
                        firstN = input.nextLine();
                        for (int j = 0; j < book.size(); j++) {
                            if (book.get(j).getHomeRoomTeacher().startsWith(firstN)) {
                                System.out.println(book.get(j));
                            } else {
                                System.out.println("Sorry no matches!");
                            }
                        }
                    }

                    if (searchA.toLowerCase().equals("id number") || searchA.equals("8")) {
                        System.out.println("What is the student ID?: ");
                        int studentId = input.nextInt();
                        for (int j = 0; j < book.size(); j++) {
                            if (book.get(j).getStudentIdNumber() == studentId) {
                                System.out.println(book.get(j));
                            } else {
                                System.out.println("Sorry no matches!");
                            }
                        }
                        if (searchA.toLowerCase().equals("allergies") || searchA.equals("9")) {
                            System.out.println("What allergy do you want to search with?: ");
                            firstN = input.nextLine();
                            for (int j = 0; j < book.size(); j++) {
                                if (book.get(j).getAllergies().startsWith(firstN)) {
                                    System.out.println(book.get(j));
                                } else {
                                    System.out.println("Sorry no matches!");
                                }
                            }
                        }

                        if (searchA.toLowerCase().equals("home phone number") || searchA.equals("10")) {
                            System.out.println("What does the phone number start with?: ");
                            lastN = input.nextLine();
                            for (int j = 0; j < book.size(); j++) {
                                if (book.get(j).getHomePhoneNumber().startsWith(firstN)) {
                                    System.out.println(book.get(j));
                                } else {
                                    System.out.println("Sorry no matches!");
                                }
                            }
                        }
                        if (searchA.toLowerCase().equals("home address") || searchA.equals("11")) {
                            System.out.println("What does the home address start with?: ");
                            firstN = input.nextLine();
                            for (int j = 0; j < book.size(); j++) {
                                if (book.get(j).getHomeAddress().startsWith(firstN)) {
                                    System.out.println(book.get(j));
                                } else {
                                    System.out.println("Sorry no matches!");
                                }
                            }
                        }

                        if (searchA.toLowerCase().equals("email address") || searchA.equals("12")) {
                            System.out.println("What does the email start with?: ");
                            lastN = input.nextLine();
                            for (int j = 0; j < book.size(); j++) {
                                if (book.get(j).getEmailAddress().startsWith(firstN)) {
                                    System.out.println(book.get(j));
                                } else {
                                    System.out.println("Sorry no matches!");
                                }
                            }
                        }
//                if (search.toLowerCase().equals("lunch money balance") || search.equals("13")) {
//                    System.out.println("What does the first name start with?: ");
//                    lastN = input.nextLine();
//                    for (int j=0;j<book.size();j++){
//                        if(book.get(j).getGradeLevel().startsWith(firstN)){
//                            System.out.println(book.get(j));
//                        } else {
//                            System.out.println("Sorry no matches!");
//                        }
//                }
                        // Do we want to be able to search Lunch Money Balance? Maybe do a search in descending or ascending order
                    }
                }
            }
            if (search.toLowerCase().equals("delete student") || search.equals("3")) {
                System.out.println("What is the student ID you would like to delete?");
                int intSearch = input.nextInt();
                for (int i = 0; i < book.size(); i++) {
                    if (book.get(i).getStudentIdNumber() == intSearch) {
                        book.remove(i);
                    }
                }
            }
            if (search.toLowerCase().equals("print directory") || search.equals("4")) {
                for (Object add : book) {
                    System.out.println(add);
                }
            }


        }
        while (!search.equals("5"));
    }
}



