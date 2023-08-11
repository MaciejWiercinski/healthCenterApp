package pl.zajavka.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class DoctorController {

    private static final String DOCTOR = "/doctor";

    @GetMapping(value = DOCTOR)
    public ModelAndView doctorPage() {
        return new ModelAndView("doctor");
    }
}
