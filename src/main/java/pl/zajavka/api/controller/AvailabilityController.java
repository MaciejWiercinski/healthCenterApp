package pl.zajavka.api.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.zajavka.api.dto.AvailabilityDTO;
import pl.zajavka.api.dto.mapper.AvailabilityMapper;
import pl.zajavka.business.AvailabilityService;

@Controller
@AllArgsConstructor
public class AvailabilityController {

    private static final String AVAILABILITY = "/doctor/availability";

    private final AvailabilityService availabilityService;
    private final AvailabilityMapper availabilityMapper;

    @PostMapping(value = AVAILABILITY)
    private String makeAvailability(@Valid @ModelAttribute("availabilityDTO")AvailabilityDTO availabilityDTO) {

        return "redirect:/doctor";
    }
}
