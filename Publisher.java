package geek_java_oop_lesson7;

public interface Publisher {

    void sendOffer(String companyName, int salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
