public interface Pet {

    //животное споботно сообщить свою историю болезни
    DiseaseHistory getDiseaseHistory();

    //животное спобно сообщить, живо ли оно
    boolean isAlive();
}
