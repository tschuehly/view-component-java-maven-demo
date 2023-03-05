package com.example.viewcomponentmavendemo.web.parameter;


import de.tschuehly.thymeleafviewcomponent.ViewComponent;
import de.tschuehly.thymeleafviewcomponent.ViewContext;
import de.tschuehly.thymeleafviewcomponent.ViewProperty;

@ViewComponent
public class ParameterViewComponent {
    public ViewContext render(String parameter) throws Exception {
        if (parameter == null) {
            throw new Exception("You need to pass in a parameter");
        }
        return new ViewContext(
                ViewProperty.of("office", parameter)
        );
    }
}
