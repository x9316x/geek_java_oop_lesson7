package geek_java_oop_lesson7;

// Класс, представляющий вакансию
public class Vacancy {

    private String position; // название позиции
    private String description; // описание вакансии
    private int salary; // предлагаемая зарплата
    private VacancyType vacancyType; // тип вакансии

    public Vacancy(String position, String description, int salary, VacancyType vacancyType) {
        this.position = position;
        this.description = description;
        this.salary = salary;
        this.vacancyType = vacancyType;
    }

    // геттеры и сеттеры для всех полей

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public void setVacancyType(VacancyType vacancyType) {
        this.vacancyType = vacancyType;
    }
}

// Enum, представляющий типы вакансий
enum VacancyType {
    INTERN,
    DEVELOPER,
    MANAGER,
    DESIGNER
}
