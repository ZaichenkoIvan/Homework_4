package hometask.hometask4;

import hometask.hometask4.init.Menu;
import hometask.hometask4.view.StudentViewInfo;

public class ConsoleApplication {
    public static void main(String[] args) {
        new Menu().run();
        new StudentViewInfo().run();
    }
}
