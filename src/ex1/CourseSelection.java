package ex1;

public class CourseSelection {
    public static void main(String[] args) {
        String semester = "fall";
        String programs = "CS";

        switch (semester) {
            case "fall":
                switch (programs) {
                    case "CS":
                        System.out.println("Introduction to Computer Science");
                        break;
                    case "ES":
                        System.out.println("English Literature");
                        break;
                    default:
                        System.out.println("Invalid program name for Fall.");
                        break;
                }
                break;

            case "spring":
                switch (programs) {
                    case "CS":
                        System.out.println("Object-Oriented Programming");
                        break;
                    case "ES":
                        System.out.println("Introduction to Journalism");
                        break;
                    default:
                        System.out.println("Invalid program name for Spring.");
                        break;
                }
                break;

            default:
                System.out.println("Please choose either 'fall' or 'spring' for the semester.");
        }
    }
}
