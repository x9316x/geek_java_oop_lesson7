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
        jobAgency.sendOffer(name, salary);
    }


}
