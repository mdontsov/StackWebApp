import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

@Controller
public class WebController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry controllerRegistry) {
        controllerRegistry.addViewController("result").setViewName("result");
    }

    @GetMapping
    public String getForm(StackController stackcontroller) {
        return "form";
    }

    @PostMapping("/")
    public String checkStackInfo(@Valid StackController stackController, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "form";
        } else {
            return "redirect:/results";
        }
    }

}
