package javaDay2Homework1;

public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course(0,"Yazýlým Geliþtirme Kursu"," (C# * ANGULAR)", " - Engin Demiroð");
		
		Course course2=new Course(1,"Yazýlým Geliþtirme Kursu"," (JAVA * REACT)", " - Engin Demiroð");
		
		Course[] courses = {course1,course2};
		
		for(Course course : courses) {
			System.out.println(course.courseName + course.courseDetail + course.courseTeacher);
		}
		
		courseManager coursemanager=new courseManager();
		coursemanager.signInCourse(course1);
		
		coursemanager.signInCourse(course2);
		

	}

}
