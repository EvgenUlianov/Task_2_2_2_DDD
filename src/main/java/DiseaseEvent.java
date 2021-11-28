import java.util.Date;

public interface DiseaseEvent {

    //у события из истории болезни есть дата
    Date getDate();

    //у события из истории болезни есть описание
    String getDescription();
}
