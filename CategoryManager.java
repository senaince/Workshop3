package Kodlamaio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryManager {
    private List<Category> categories;

    public CategoryManager(){
        categories = new ArrayList<Category>();
        categories.add(new Category(1,"Programlama"));
    }
    public void addCategory(Category category){
        categories.add(category);
    }
    public List<Category> getAll(){
        return categories;
    }
    public void updateCategory(Category category){
        for (Category index : categories){
            if(index.getId()==category.getId()){
                index.setName(category.getName());
            }
        }
    }
    public void deleteCategory(int id){
        Iterator<Category> iterator = categories.iterator();
        while(iterator.hasNext()){
            Category index = iterator.next();
            if (index.getId()==id){
                iterator.remove();
            }
        }
    }
    public Category getById(int id){
        for (Category index : categories){
            if (index.getId()==id){
                return index;
            }
        }
        return null;
    }
}