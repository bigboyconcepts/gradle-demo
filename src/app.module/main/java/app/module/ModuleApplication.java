package app.module;

import app.service.MathService;
import app.service.ext.ExtensionService;

public class ModuleApplication {

    public static void main(String[] args) {
        MathService mathService = new MathService();
        ExtensionService extService = new ExtensionService();
        System.out.printf("%s + %s = %s%n", 1, 2, mathService.sum(1, 2));
        System.out.printf("Extension = %s%n", extService.getExtension(1, 2));
    }
}
