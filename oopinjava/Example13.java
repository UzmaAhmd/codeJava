package oopinjava;

class MyCourse {
    int courseId;
    String courseName;
    int duration;
    float fee;

    public MyCourse() {
        System.out.println("Dummy constructor");
    }

    public MyCourse(int courseId, String courseName, int duration, float fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "MyCourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", fee=" + fee +
                '}';
    }
}
public class Example13 {
        public static void main(String[] args) {
            // Using default constructor
            MyCourse course1 = new MyCourse();
            System.out.println("\nDefault course details:\n" + course1);

            // Setting values using setters
            course1.setCourseId(101);
            course1.setCourseName("Java Programming");
            course1.setDuration(60); // in days
            course1.setFee(111.11f);

            System.out.println("\nAfter setting values for course1 using setters:");
            System.out.println(course1);
            System.out.println("Course ID: " + course1.getCourseId());
            System.out.println("Course Name: " + course1.getCourseName());
            System.out.println("Duration: " + course1.getDuration() + " days");
            System.out.println("Fee: " + course1.getFee());

            // Using all-argument constructor
            MyCourse course2 = new MyCourse(102, "Data Structures", 90, 999.99f);
            System.out.println("\nSetting values for course2 using all-argument constructor:\n");
            System.out.println(course2);
            System.out.println("Course ID: " + course2.getCourseId());
            System.out.println("Course Name: " + course2.getCourseName());
            System.out.println("Duration: " + course2.getDuration() + " days");
            System.out.println("Fee: " + course2.getFee());
        }
    }

