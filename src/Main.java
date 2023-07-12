import model.Student;
import servive.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        Student student = new Student();
        student.setName("Vardan");
        student.setSurname("Exiazaryan");
        student.setYear(2012);
        student.setMark(55.8);
        student.setArmenian(true);
        student.setGender('M');

        Student student1 = new Student();
        student1.setName("Silva");
        student1.setSurname("Gevorgyan");
        student1.setYear(2018);
        student1.setMark(85.8);
        student1.setArmenian(true);
        student1.setGender('F');

        Student student2 = new Student();
        student2.setName("Nare");
        student2.setSurname("Xukasov");
        student2.setYear(2010);
        student2.setMark(100);
        student2.setArmenian(false);
        student2.setGender('F');

        Student student3 = new Student();
        student3.setName("Hrach");
        student3.setSurname("Tumanyan");
        student3.setYear(1994);
        student3.setMark(21.5);
        student3.setArmenian(false);
        student3.setGender('M');

        Student student4 = new Student();
        student4.setName("Lusine");
        student4.setSurname("Xachatryan");
        student4.setYear(1964);
        student4.setMark(98.5);
        student4.setArmenian(true);
        student4.setGender('F');


//        System.out.println("=======================================");
//        Student student = service.create();
//
//        System.out.println("================ Student =======================");
//        Student student1 = service.create();
//
//        System.out.println("================Student 1=======================");
//        Student student2 = service.create();

        System.out.println("================Student  =======================");
        service.studentInfo(student);

        System.out.println("================Student 1=======================");
        service.studentInfo(student1);

        System.out.println("================Student 2=======================");
        service.studentInfo(student2);

        System.out.println("================Student 3=======================");
        service.studentInfo(student3);

        System.out.println("================Student 4=======================");
        service.studentInfo(student4);

        System.out.println("====================     Start     ======================");


//
//        System.out.println("=======================================");
//        System.out.println("Show Biggest Student");
//        service.studentInfo(service.biggest(new Student[]{student, student1, student2, student3, student4}));
//
//        System.out.println("=======================================");
//        System.out.println("Show Youngest Student");
//        service.studentInfo(service.youngest(new Student[]{student, student1, student2, student3, student4}));
//
//
//
//        System.out.println("=======================================");
//        System.out.println("Show Biggest Female Student");
//        service.studentInfo(service.biggerByGender(new Student[]{student, student1, student2, student3, student4}, 'F'));
//
//        System.out.println("=======================================");
//        System.out.println("Show Biggest Male Student");
//        service.studentInfo(service.biggerByGender(new Student[]{student, student1, student2, student3, student4}, 'M'));
//
//
//        System.out.println("=======================================");
//        System.out.println("Show Youngest Female Student");
//        service.studentInfo(service.youngestByGender(new Student[]{student, student1, student2, student3, student4}, 'F'));
//
//        System.out.println("=======================================");
//        System.out.println("Show Youngest Male Student");
//        service.studentInfo(service.youngestByGender(new Student[]{student, student1, student2, student3, student4}, 'M'));
//
//
//
//        System.out.println("=======================================");
//        System.out.println("Show Biggest Mark Student");
//        service.studentInfo(service.biggestMark(new Student[]{student, student1, student2, student3, student4}));
//
//
//
//        System.out.println("=======================================");
//        System.out.println("Show Is Armenian Students");
//        service.printStudentArray(service.checkedIsArmenian(new Student[]{student, student1, student2, student3, student4}));
//
//
//
//        System.out.println("=======================================");
//        System.out.println("Show All Female Students");
//        service.printStudentArray(service.allFemale(new Student[]{student, student1, student2, student3, student4}));
//
//        System.out.println("=======================================");
//        System.out.println("Show All Male Students");
//        service.printStudentArray(service.allMale(new Student[]{student, student1, student2, student3, student4}));
//
//
//
//        System.out.println("=======================================");
//        System.out.println("Sorted Students By Mark Ascending ");
//        service.printStudentArray(service.sortedAscendingByMark(new Student[]{student, student1, student2, student3, student4}));
//
//        System.out.println("=======================================");
//        System.out.println("Sorted Students By Mark Descending");
//        service.printStudentArray(service.sortedDescendingByMark(new Student[]{student, student1, student2, student3, student4}));
//
//
//
//        System.out.println("=======================================");
//        System.out.println("Show Biggest Male Student");
//        service.studentInfo(service.findByGender(new Student[]{student, student1, student2, student3, student4}, 'M','>'));
//
//        System.out.println("=======================================");
//        System.out.println("Show Youngest Male Student");
//        service.studentInfo(service.findByGender(new Student[]{student, student1, student2, student3, student4}, 'M','<'));


        System.out.println("=======================================");
        System.out.println("Show All Female Students");
        service.printStudentArray(service.byGender(new Student[]{student, student1, student2, student3, student4},'F'));

        System.out.println("=======================================");
        System.out.println("Show All Male Students");
        service.printStudentArray(service.byGender(new Student[]{student, student1, student2, student3, student4},'M'));


    }

}
