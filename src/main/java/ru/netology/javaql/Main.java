package ru.netology.javaql;

import ru.netology.javaql.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        int mounth = service.calculate(100000, 60000, 150000);
        System.out.println(mounth);
    }
}
