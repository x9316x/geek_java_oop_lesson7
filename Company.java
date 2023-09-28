package geek_java_oop_lesson7;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);

        // Создаем объект вакансии с необходимыми данными
        // Используем имя компании как описание и стандартное значение для позиции
        Vacancy vacancy = new Vacancy("Разработчик", name, salary, VacancyType.DEVELOPER);

        // Отправляем объект вакансии
        jobAgency.sendOffer(vacancy);
    }
}
