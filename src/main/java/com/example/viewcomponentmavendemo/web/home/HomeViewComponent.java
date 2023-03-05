package com.example.viewcomponentmavendemo.web.home;

import com.example.viewcomponentmavendemo.core.ExampleService;
import de.tschuehly.thymeleafviewcomponent.ViewComponent;
import de.tschuehly.thymeleafviewcomponent.ViewContext;
import de.tschuehly.thymeleafviewcomponent.ViewProperty;

@ViewComponent
public class HomeViewComponent {
    private final ExampleService exampleService;

    public HomeViewComponent(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public ViewContext render() {
        return new ViewContext(
                ViewProperty.of("helloWorld", "Hello World"),
                ViewProperty.of("coffee", exampleService.getCoffee()),
                ViewProperty.of("office", exampleService.getOfficeHours())
        );
    }
}
