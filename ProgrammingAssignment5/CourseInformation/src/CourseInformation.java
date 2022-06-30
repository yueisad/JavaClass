import java.util.Scanner;

public class CourseInformation {
    public static void main(String[] args) {

        //import scanner
        Scanner scnr = new Scanner(System.in);

        //define the new classes 
        Course course = new Course();
        OfferedCourse offeredCourse = new OfferedCourse();

        //define variables from the other classes 
        String courseNumber, courseTitle;
        String offeredCourseTitle, offeredCourseNumber, term, classTime, instructor;

        //place user values in variables
        //System.out.println("course number");
        courseNumber = scnr.nextLine();
        //System.out.println("course title");
        courseTitle = scnr.nextLine();
       //System.out.println("offered course number");
        offeredCourseNumber = scnr.nextLine();
        //System.out.println("offered course title");
        offeredCourseTitle = scnr.nextLine();
       //System.out.println("term");
        instructor = scnr.nextLine();

        term = scnr.nextLine();
       //System.out.println("class time");
        classTime = scnr.nextLine();
        //System.out.println("instructor");

        //call methods
        course.setCourseTitle(courseTitle);
        course.setCourseNumber(courseNumber);
        course.printInfo();

        offeredCourse.setCourseTitle(offeredCourseTitle);
        offeredCourse.setCourseNumber(offeredCourseNumber);
        offeredCourse.setClassTime(classTime);
        offeredCourse.setTerm(term);
        offeredCourse.setInstructorName(instructor);
        offeredCourse.printInfo();

        System.out.println("   Instructor Name: " + offeredCourse.getInstructorName());
        System.out.println("   Term: " + offeredCourse.getTerm());
        System.out.println("   Class Time: " + offeredCourse.getClassTime());



    }
    
}
