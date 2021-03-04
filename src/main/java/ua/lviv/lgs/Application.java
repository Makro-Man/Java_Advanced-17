package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws ParseException {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        UnivercityService univercityService=context.getBean(UnivercityService.class);
        List<Univercity> universitiesList = new ArrayList<>();
        universitiesList.add(new Univercity("Львівська політехніка", 13, 18000,30, "Львів"));
        universitiesList.add(new Univercity("Київський політехнічний інститут імені Ігоря Сікорського", 18, 16900,22, "Київ"));
        universitiesList.add(new Univercity("Львівський національний університет імені Івана Франка", 19, 18000,19, "Львів"));
        universitiesList.add(new Univercity("Одеський національний університет імені І. І. Мечникова", 15, 7700,35, "Одеса"));
        universitiesList.add(new Univercity("Вінницький національний технічний університет", 12, 7500,11, "Вінниця"));

        univercityService.createAll(universitiesList);

        System.out.println(univercityService.findById(1));

        System.out.println(univercityService.findByNumberOfStudents(18000));

        Univercity university = univercityService.findByName("Львівська політехніка");
        university.setNumberOfInstitutes(11);
        univercityService.update(university);

        univercityService.findAll().stream().forEach(System.out::println);

        univercityService.deleteById(3);
    }


}
