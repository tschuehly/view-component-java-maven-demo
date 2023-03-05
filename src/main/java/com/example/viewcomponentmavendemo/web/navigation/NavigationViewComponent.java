package com.example.viewcomponentmavendemo.web.navigation;

import com.example.viewcomponentmavendemo.core.ExampleService;
import de.tschuehly.thymeleafviewcomponent.ViewComponent;
import de.tschuehly.thymeleafviewcomponent.ViewContext;
import de.tschuehly.thymeleafviewcomponent.ViewProperty;

@ViewComponent
public class NavigationViewComponent {
    private final ExampleService exampleService;

    public NavigationViewComponent(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    ViewContext render(){
        return new ViewContext(
                ViewProperty.of("someOtherProperty",exampleService.getSomeOtherProperty())
        );
    }
}
