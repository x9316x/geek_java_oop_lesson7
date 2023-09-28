package geek_java_oop_lesson7;

// Интерфейс для "издателей", отправляющих вакансии
public interface Publisher {
    void sendOffer(Vacancy vacancy);
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
}
