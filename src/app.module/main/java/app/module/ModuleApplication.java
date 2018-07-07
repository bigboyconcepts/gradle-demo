package app.module;

import app.service.CoreService;

public class ModuleApplication {

    public static void main(String[] args) {
        CoreService coreService = new CoreService();
        System.out.printf("%s + %s = %s%n", 1, 2, coreService.sum(1, 2));
    }
}
