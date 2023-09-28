package geek_java_oop_lesson7;

// Класс представляющий студента и его реакцию на вакансии
public class Student implements Observer {

    private String name;
    private int salary = 2000;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if ((vacancy.getVacancyType() == VacancyType.INTERN || vacancy.getVacancyType() == VacancyType.DEVELOPER)
                && this.salary <= vacancy.getSalary()){
            System.out.printf("Студент %s: Мне подходит это предложение! (позиция: %s; компания: %s; зарплата: %d)\n",
                    name, vacancy.getPosition(), vacancy.getDescription(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Студент %s: Я буду искать дальше! (позиция: %s; компания: %s; зарплата: %d)\n",
                    name, vacancy.getPosition(), vacancy.getDescription(), vacancy.getSalary());
        }
    }
}
