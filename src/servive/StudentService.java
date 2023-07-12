package servive;

import model.Student;

import java.util.Scanner;

public class StudentService {

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

        System.out.println("Enter gender ");
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
    // bubble sorting
    public Student[] sortedAscendingByMark(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j].getMark() > students[j - 1].getMark()) {
                    double temp = students[j - 1].getMark();
                    students[j - 1].setMark(students[j].getMark());
                    students[j].setMark(temp);
                }
            }
        }
        return students;
    }

    public Student[] sortedDescendingByMark(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j].getMark() < students[j - 1].getMark()) {
                    double temp = students[j - 1].getMark();
                    students[j - 1].setMark(students[j].getMark());
                    students[j].setMark(temp);
                }
            }
        }
        return students;
    }

    //--------------------------------------------------------------------------------------------------------------

    public Student biggest(Student[] students) {
        Student max = students[0];
        for (int i = 1; i < students.length; i++) {
            if (max.getYear() > students[i].getYear()) {
                max = students[i];
            }
        }
        return max;
    }

    public Student youngest(Student[] students) {
        Student min = students[0];
        for (int i = 1; i < students.length; i++) {
            if (min.getYear() < students[i].getYear()) {
                min = students[i];
            }
        }
        return min;
    }


    //--------------------------------------------------------------------------------------------------------------
    //Stugel
    public Student findByGender(Student[] students, char gender, char biggerOrYounger) {
        Student temp = null;
        int checkTemp = 0;
        for (Student student : students) {
            if (student.getGender() == gender) {
                if (checkTemp == 0) {
                    temp = student;
                    checkTemp = 1;
                } else {
                    if (biggerOrYounger == '>') {
                        if (temp.getYear() > student.getYear()) {
                            temp = student;
                        }
                    } else if (biggerOrYounger == '<') {
                        if (temp.getYear() < student.getYear()) {
                            temp = student;
                        }
                    } else {
                        System.out.println("Not correct symbol,you can set only two symbol  > or < ");
                        break;
                    }
                }
            }
        }
        return temp;
    }

    //--------------------------------------------------------------------------------------------------------------


    public Student biggestMark(Student[] students) {
        Student maxMark = students[0];
        for (int i = 1; i < students.length; i++) {
            if (maxMark.getMark() < students[i].getMark()) {
                maxMark = students[i];
            }
        }
        return maxMark;
    }

    public Student[] checkedIsArmenian(Student[] students) {
        int count = 0;
        Student[] studentArray = new Student[]{};
        for (Student student : students) {
            if (student.isArmenian()) {
                count++;
            }
        }
        if (count != 0) {
            int i = 0;
            studentArray = new Student[count];
            for (Student student : students) {
                if (student.isArmenian()) {
                    studentArray[i] = student;
                    i++;
                }
            }
        }
        return studentArray;
    }


    //--------------------------------------------------------------------------------------------------------------
    //Stugel
    public Student[] showAllByGender(Student[] students, char gender) {
        int count = 0;
        Student[] studentArray = new Student[]{};
        for (Student student : students) {
            if (student.getGender() == gender) {
                count++;
            }
        }
        if (count != 0) {
            int i = 0;
            studentArray = new Student[count];
            for (Student student : students) {
                if (student.getGender() == gender) {
                    studentArray[i] = student;
                    i++;
                }
            }
        }
        return studentArray;
    }

    //--------------------------------------------------------------------------------------------------------------


    public void printStudentArray(Student[] students) {
        for (Student student : students) {
            studentInfo(student);
        }
    }

    public void studentInfo(Student s) {
        System.out.println(" Name : " + s.getName() +
                "\n Surname : " + s.getSurname() +
                "\n Year :  " + s.getYear() +
                "\n Mark : " + s.getMark() +
                "\n Is Armenian : " + (s.isArmenian() ? "YES" : "NO") +
                "\n Gender : " + (s.getGender() == 'F' ? "Female" : "Male"));
        System.out.println("----------------------------");
    }

}
