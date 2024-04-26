package Kodlamaio;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        CategoryManager cateManager = new CategoryManager();
        List<Category> cate = cateManager.getAll();
        for (Category index : cate) {
            System.out.println(index.getName());
        }
        System.out.println("-------------------------------------");
        CourseManager courManager = new CourseManager();
        List<Course> cour = courManager.getAll();
        for (Course index : cour) {
            System.out.println(index.getName() + " Course title: " + index.getDescription());
        }
        System.out.println("-------------------------------------");
        TutorManager tutoManager = new TutorManager();
        List<Tutor> tuto = tutoManager.getAll();
        for (Tutor index : tuto) {
            System.out.println(index.getId() + " Tutor name: " + index.getName());
        }
        System.out.println("-------------------------------------");

        cateManager.addCategory(new Category(2, "Analiz"));
        cateManager.addCategory(new Category(3, "Test"));
        for (Category index : cate) {
            System.out.println(index.getName());
        }
        System.out.println("-------------------------------------");

        courManager.deleteCourse(4);
        for (Course index : cour) {
            System.out.println(index.getId() + " Course Name: " + index.getName() + " Course title: " + index.getDescription());

        }
        System.out.println("-------------------------------------");

        tutoManager.updateTutor(new Tutor(1, "Engin Demirog"));
        for (Tutor index : tuto) {
            System.out.println(index.getId() + " Tutor name: " + index.getName());
        }
        System.out.println("-------------------------------------");

        Course course1 = courManager.getById(6);
        System.out.println(course1.getName());

    }
}