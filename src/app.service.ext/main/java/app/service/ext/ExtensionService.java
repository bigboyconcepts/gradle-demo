package app.service.ext;

import app.service.MathService;

public class ExtensionService {

    private MathService mathService = new MathService();

    public int getExtension(int a, int b) {
        return mathService.sum(a, b);
    }

}
