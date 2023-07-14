import model.ConstVariable;
import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        ConstVariable constVariable = new ConstVariable();


        System.out.println("================Student  =======================");
        Student student = service.create();
        service.toString(student);

        System.out.println("================Student 1=======================");
        Student student1 = service.create();
        service.toString(student1);

        System.out.println("================Student 2=======================");
        Student student2 = service.create();
        service.toString(student2);



        System.out.println("====================     Start     ======================");
        Student[] students = new Student[]{student, student1, student2};


        System.out.println("=======================================");
        service.toString(service.findByYearBiggestStudent(students));

        System.out.println("=======================================");
        service.toString(service.findByYearYoungestStudent(students));


        System.out.println("=======================================");
        service.toString(service.findByBiggestMarkStudent(students));

        System.out.println("=======================================");
        service.toString(service.findByLowerMarkStudent(students));


        System.out.println("=======================================");
        service.printingStudentArray(service.findIsArmenianStudents(students));


        System.out.println("=======================================");
        service.toString(service.findByGenderAndYear(students, constVariable.getMale(), constVariable.getBigger()));

        System.out.println("=======================================");
        service.toString(service.findByGenderAndYear(students, constVariable.getFemale(), constVariable.getBigger()));

        System.out.println("=======================================");
        service.toString(service.findByGenderAndYear(students, constVariable.getMale(), constVariable.getYounger()));

        System.out.println("=======================================");
        service.toString(service.findByGenderAndYear(students, constVariable.getFemale(), constVariable.getYounger()));


        System.out.println("=======================================");
        service.printingStudentArray(service.findAllStudentsByGender(students, constVariable.getFemale()));

        System.out.println("=======================================");
        service.printingStudentArray(service.findAllStudentsByGender(students, constVariable.getMale()));


        // Sorted
        System.out.println("=======================================");
        System.out.println("Sorted Students By Mark Ascending ");
        service.printingStudentArray(service.sortedAscendingByMark(students));

        System.out.println("=======================================");
        System.out.println("Sorted Students By Mark Descending");
        service.printingStudentArray(service.sortedDescendingByMark(students));


    }

}
