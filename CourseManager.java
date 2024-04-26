package Kodlamaio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseManager {
    private List<Course> courses;

    public CourseManager(){
        courses = new ArrayList<Course>();
        courses.add(new Course(1,"C#","Engin","öğreniyoruz."));
        courses.add(new Course(2,"Java Script","Engin","Java script öğreniyoruz."));
        courses.add(new Course(3,".Net","Engin",".Net öğreniyoruz."));
        courses.add(new Course(4,"2022 Java","Engin","2022 Java öğreniyoruz."));
        courses.add(new Course(5,"Java","Engin","Java öğreniyoruz."));
        courses.add(new Course(6,"Selenium","Halit","Selenium öğreniyoruz."));
        courses.add(new Course(7,"2024 C#","Engin","2024 C# öğreniyoruz."));
        courses.add(new Course(8,"Programlamaya giriş","Engin","Programlama öğreniyoruz."));
    }
    public void addCourse(Course course){
        courses.add(course);
    }
    public List<Course> getAll(){
        return courses;
    }
    public void updateCourse(Course course){
        for (Course index : courses){
            if(index.getId()==course.getId()){
                index.setName(course.getName());
            }
        }
    }
    public void deleteCourse(int id){
        Iterator<Course> iterator = courses.iterator();
        while(iterator.hasNext()){
            Course index = iterator.next();
            if (index.getId()==id){
                iterator.remove();
            }
        }
    }
    public Course getById(int id){
        for (Course index : courses){
            if (index.getId()==id){
                return index;
            }
        }
        return null;
    }
}