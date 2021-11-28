import java.util.List;
import java.util.Queue;
import java.util.function.Predicate;

public interface VeterinaryClinic {

    //клиника умеет добавлять клиента в очередь
    void addClient(Client client);

    //клиника умеет возвращать очереьд клиентов
    Queue<Client> geClientQueue();

    //клиника умеет назначить клиенту (всем его животным) ветеринара
    void assignVeterinarian(Client client, Veterinarian veterinarian);

}
