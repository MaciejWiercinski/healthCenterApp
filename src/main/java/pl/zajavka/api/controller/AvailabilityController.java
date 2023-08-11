package pl.zajavka.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.zajavka.api.dto.AvailabilityDTO;
import pl.zajavka.api.dto.mapper.AvailabilityMapper;
import pl.zajavka.business.AvailabilityService;
import pl.zajavka.domain.Availability;

@Controller
@AllArgsConstructor
public class AvailabilityController {

    private static final String AVAILABILITY = "/doctor/availability";

    private final AvailabilityService availabilityService;
    private final AvailabilityMapper availabilityMapper;

    @GetMapping(value = AVAILABILITY)
    public ModelAndView availabilityPage() {
        ModelAndView modelAndView = new ModelAndView("availability");
        modelAndView.addObject("availabilityDTO", new AvailabilityDTO());
        return modelAndView;
    }

    @PostMapping(value = AVAILABILITY)
    public String makeAvailability(
            @ModelAttribute("availabilityDTO") AvailabilityDTO availabilityDTO
    ) {
       Availability availability = availabilityMapper.map(availabilityDTO);
       availabilityService.saveAvailability(availability);
        return "redirect:/doctor";
    }
}
