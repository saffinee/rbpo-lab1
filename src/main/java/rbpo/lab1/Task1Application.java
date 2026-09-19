package rbpo.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task1Application {//class - шаблон, в котором хранится код и данные. Почти всё в Java находится внутри классов.

    public static void main(String[] args) {
        SpringApplication.run(Task1Application.class, args);
    } //команда Spring Boot: «запусти приложение, начиная с этого класса».
        //main - специальный метод: JVM начинает выполнение программы именно с него
//    public - метод доступен JVM;
//    static - метод принадлежит самому классу, а не отдельному объекту;
//    void - метод ничего не возвращает;
//    main - имя метода;
//    String[] args - массив текстовых аргументов, которые можно передать при запуске;
//    { ... } - тело метода.
}


//@ - аннотации, спринг читает их при запуске и понимает, как обращаться с классом
