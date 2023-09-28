package geek_java_oop_lesson7;

// Класс представляющий специалиста (мастера) и его реакцию на вакансии
public class Master implements Observer {

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if ((vacancy.getVacancyType() == VacancyType.DEVELOPER || vacancy.getVacancyType() == VacancyType.MANAGER)
                && this.salary <= vacancy.getSalary()){
            System.out.printf("Мастер %s: Мне подходит это предложение! (позиция: %s; компания: %s; зарплата: %d)\n",
                    name, vacancy.getPosition(), vacancy.getDescription(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Мастер %s: Я найду что-то лучше! (позиция: %s; компания: %s; зарплата: %d)\n",
                    name, vacancy.getPosition(), vacancy.getDescription(), vacancy.getSalary());
        }
    }
}
