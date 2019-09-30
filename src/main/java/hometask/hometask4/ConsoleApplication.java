package hometask.hometask4;

import hometask.hometask4.init.Menu;
import hometask.hometask4.view.StudentViewInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApplication {
    private Menu menu;
    private StudentViewInfo studentViewInfo;

    @Autowired
    public ConsoleApplication(Menu menu, StudentViewInfo studentViewInfo) {
        this.menu = menu;
        this.studentViewInfo = studentViewInfo;
    }

    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("hometask.hometask4");
        ConsoleApplication main = ctx.getBean(ConsoleApplication.class);
        main.menu.run();
        main.studentViewInfo.run();
    }
}

