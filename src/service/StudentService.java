package service;

import model.ConstVariable;
import model.Student;

import java.util.Scanner;

public class StudentService {
    private ConstVariable constVariable = new ConstVariable();

    //--------------------------------------------------------------------------------------------------------------

    public Student create() {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name ");
        String name = scanner.next();

        System.out.println("Enter surname ");
        String surname = scanner.next();

        System.out.println("Enter year ");
        int year = scanner.nextInt();

        System.out.println("Enter mark ");
        double mark = scanner.nextDouble();

        System.out.println("Enter is armenian ");
        boolean armenian = scanner.nextBoolean();

        System.out.println("Enter gender ( Female |  Male )");
        char gender = scanner.next().charAt(0);

        student.setName(name);
        student.setSurname(surname);
        student.setYear(year);
        student.setMark(mark);
        student.setArmenian(armenian);
        student.setGender(gender);

        return student;
    }


    //--------------------------------------------------------------------------------------------------------------

    public Student[] sortedAscendingByMark(Student[] students) {
        Student temp;
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j].getMark() > students[j - 1].getMark()) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        return students;
    }


    public Student[] sortedDescendingByMark(Student[] students) {
        Student temp;
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j].getMark() < students[j - 1].getMark()) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        return students;
    }

    //--------------------------------------------------------------------------------------------------------------

    public Student findByYearBiggestStudent(Student[] students) {
        System.out.println("Find By Biggest year Student");

        Student max = students[0];
        for (int i = 1; i < students.length; i++) {
            if (max.getYear() > students[i].getYear()) {
                max = students[i];
            }
        }
        return max;
    }

    public Student findByYearYoungestStudent(Student[] students) {
        System.out.println("Find By Youngest year Student");

        Student min = students[0];
        for (int i = 1; i < students.length; i++) {
            if (min.getYear() < students[i].getYear()) {
                min = students[i];
            }
        }
        return min;
    }


    //--------------------------------------------------------------------------------------------------------------

    public Student findByGenderAndYear(Student[] students, char gender, char sign) {
        String genderName = (gender == constVariable.getFemale()) ? "Female" : "Male";

        String bigOrLowSign = constVariable.isBiggerSign(sign) ? "biggest" : "youngest";

        System.out.println("Find By Gender '" + genderName + "' and By '" + bigOrLowSign + "' year student");
        Student temp = null;
        if (constVariable.isBiggerSign(sign) || constVariable.isYoungerSign(sign)) {
            boolean checkTemp = false;
            for (Student student : students) {
                if (student.getGender() == gender) {
                    if (!checkTemp) {
                        temp = student;
                        checkTemp = true;
                    } else {
                        if (constVariable.isBiggerSign(sign)) {
                            if (temp.getYear() > student.getYear()) {
                                temp = student;
                            }
                        } else if (constVariable.isYoungerSign(sign)) {
                            if (temp.getYear() < student.getYear()) {
                                temp = student;
                            }
                        }
                    }
                }
            }
        }
        return temp;
    }

    //--------------------------------------------------------------------------------------------------------------


    public Student findByBiggestMarkStudent(Student[] students) {
        System.out.println("Find Biggest Mark Student");

        Student maxMark = students[0];
        for (int i = 1; i < students.length; i++) {
            if (maxMark.getMark() < students[i].getMark()) {
                maxMark = students[i];
            }
        }
        return maxMark;
    }

    public Student findByLowerMarkStudent(Student[] students) {
        System.out.println("Find Lower Mark Student");

        Student minMark = students[0];
        for (int i = 1; i < students.length; i++) {
            if (minMark.getMark() > students[i].getMark()) {
                minMark = students[i];
            }
        }
        return minMark;
    }


    //--------------------------------------------------------------------------------------------------------------

    public Student[] findIsArmenianStudents(Student[] students) {
        System.out.println("Find Is Armenian Students");

        int count = 0;
        for (Student student : students) {
            if (student.isArmenian()) {
                count++;
            }
        }
        if (count == 0) {
            return new Student[]{};
        }

        int i = 0;
        Student[] studentArray = new Student[count];
        for (Student student : students) {
            if (student.isArmenian()) {
                studentArray[i] = student;
                i++;
            }
        }
        return studentArray;
    }


    //--------------------------------------------------------------------------------------------------------------

    public Student[] findAllStudentsByGender(Student[] students, char gender) {
        String genderName = (gender == constVariable.getFemale()) ? "Female" : "Male";

        System.out.println("Find All By gender  '" + genderName + "' Students");

        int count = 0;
        for (Student student : students) {
            if (student.getGender() == gender) {
                count++;
            }
        }
        if (count == 0) {
            return new Student[]{};
        }
        int i = 0;
        Student[] studentArray = new Student[count];
        for (Student student : students) {
            if (student.getGender() == gender) {
                studentArray[i] = student;
                i++;
            }
        }

        return studentArray;
    }

    //--------------------------------------------------------------------------------------------------------------


    public void printingStudentArray(Student[] students) {
        for (Student student : students) {
            toString(student);
        }
    }

    public void toString(Student s) {
        System.out.println(" Name : " + s.getName() +
                "\n Surname : " + s.getSurname() +
                "\n Year :  " + s.getYear() +
                "\n Mark : " + s.getMark() +
                "\n Is Armenian : " + (s.isArmenian() ? "YES" : "NO") +
                "\n Gender : " + (s.getGender() == 'F' ? "Female" : "Male") +
                "\n ----------------------------");
    }

    //--------------------------------------------------------------------------------------------------------------

}
