package javaDay2Homework1;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(0,"Yaz�l�m Geli�tirme Kursu"," (C# * ANGULAR)", " - Engin Demiro�");
		
		Course course2=new Course(1,"Yaz�l�m Geli�tirme Kursu"," (JAVA * REACT)", " - Engin Demiro�");
		
		Course[] courses = {course1,course2};
		
		for(Course course : courses) {
			System.out.println(course.courseName + course.courseDetail + course.courseTeacher);
		}
		
		courseManager coursemanager=new courseManager();
		coursemanager.signInCourse(course1);
		
		coursemanager.signInCourse(course2);
		

	}

}
