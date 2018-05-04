package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private AuthorRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        // save a couple of authors
        repository.save(new Author("Alice", "Smith"));
        repository.save(new Author("BillyBob", "Smith"));

        System.out.println("Authors found with findALL():");
        System.out.println("==============================");
        for (Author author : repository.findAll()) {
            System.out.println(author);
        }
        System.out.println();

        System.out.println("Author found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Authors found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Author author : repository.findByLastName("Smith")) {
            System.out.println(author);
        }
    }

}
