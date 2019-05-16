package client_juddi;

import service_juddi.SimpleBrowse;
import service_juddi.SimplePublish;

import java.util.Scanner;

public class app_main {
    public static void main(String[] args) {
        System.out.println("Вы хотитете зарегистрировать (key: 1) или найти (key: 2) бизнес");
        Scanner in = new Scanner(System.in);
        int chois;
        chois = in.nextInt();
        String newBusinessName = "Test";
        String newServiceName = "Test";
        String serviceWSDL = "http://localhost:8080/JobService?wsdl";
        switch (chois){
            case (1):
                System.out.println("Публикация нового бизнеса!");
                System.out.println("Введите название бизнеса: ");
                //newBusinessName = in.nextLine();

                System.out.println("Введите имя сервиса: ");
                //newServiceName = in.nextLine();

                System.out.println("Вставьте ваш WSDL: ");
                //serviceWSDL = in.nextLine();

                SimplePublish sp = new SimplePublish();
                sp.publish(newBusinessName,newServiceName,serviceWSDL);

                break;
            case (2):
                System.out.println("Поиск бизнеса!");
                SimpleBrowse sb = new SimpleBrowse();
                sb.Browse(args);
        }

    }
}
