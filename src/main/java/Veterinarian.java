import java.util.Date;

public interface Veterinarian extends Comparable {

    //ветеринар способен внести новое событие в историю болезни,
    void addDiseaseEvent(DiseaseHistory diseaseHistory, DiseaseEvent event);

    //ветеринар способен опеделить событие из истории болезни
    DiseaseEvent getDiseaseEvent(Pet pet);

}
