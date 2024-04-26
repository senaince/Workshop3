package Kodlamaio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TutorManager {

    private List<Tutor> tutors;

    public TutorManager(){
        tutors = new ArrayList<Tutor>();
        tutors.add(new Tutor(1,"Engin"));
        tutors.add(new Tutor(2,"Halit"));
    }
    public void addTutor(Tutor tutor){
        tutors.add(tutor);
    }
    public List<Tutor> getAll(){
        return tutors;
    }
    public void updateTutor(Tutor tutor){
        for (Tutor index : tutors){
            if(index.getId()==tutor.getId()){
                index.setName(tutor.getName());
            }
        }
    }
    public void deleteTutor(int id){
        Iterator<Tutor> iterator = tutors.iterator();
        while(iterator.hasNext()){
            Tutor index = iterator.next();
            if (index.getId()==id){
                iterator.remove();
            }
        }
    }
    public Tutor getById(int id){
        for (Tutor index : tutors){
            if (index.getId()==id){
                return index;
            }
        }
        return null;
    }

}