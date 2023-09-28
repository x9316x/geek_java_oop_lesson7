package geek_java_oop_lesson7;

// Класс представляющий стажера и его реакцию на вакансии
public class Intern implements Observer {

    private String name;
    private int salary = 1000;

    public Intern(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (vacancy.getVacancyType() == VacancyType.INTERN && this.salary <= vacancy.getSalary()){
            System.out.printf("Стажер %s: Мне подходит это предложение! (позиция: %s; компания: %s; зарплата: %d)\n",
                    name, vacancy.getPosition(), vacancy.getDescription(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Стажер %s: Я буду искать дальше! (позиция: %s; компания: %s; зарплата: %d)\n",
                    name, vacancy.getPosition(), vacancy.getDescription(), vacancy.getSalary());
        }
    }
}
