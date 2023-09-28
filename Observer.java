package geek_java_oop_lesson7;

// Интерфейс для "подписчиков", принимающих вакансии
public interface Observer {
    void receiveOffer(Vacancy vacancy);
}
