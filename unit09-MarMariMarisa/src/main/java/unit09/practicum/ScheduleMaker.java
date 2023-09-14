package unit09.practicum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScheduleMaker {
    public static List<Course> makeSchedule(List<Course> courses){
        //sort the courses by starting time
        // pick the next course avalible at the ending time of the current course
        // this next course should have the shortest duration and then add
        // it to the courseList, repeat until the courses have all been looked through
        Collections.sort(courses, new CourseComparator());
        List<Course> courseList = new ArrayList<>();

        for(Course c : courses){
            courseList.add(c);
        }
        for(int i = 0; i < courseList.size() - 1; i++){
            if(courseList.get(i).getStart() == courseList.get(i + 1).getStart()){
                if(courseList.get(i).duration() > courseList.get(i + 1).duration()){
                    courseList.remove(i);
                    i--;
                }
            }
        }
        for(int i = 0; i < courseList.size() - 1; i++){
            if(courseList.get(i).getEnd() > courseList.get(i + 1).getStart()){
                courseList.remove(i + 1);
            }
        }
        return courseList;

    }
    public static void main(String[] args) {
        List<Course> courses = Course.exampleCourses();
        System.out.println(makeSchedule(courses));
    }
}
