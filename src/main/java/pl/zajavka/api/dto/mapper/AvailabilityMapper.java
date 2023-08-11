package pl.zajavka.api.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import pl.zajavka.api.dto.AvailabilityDTO;
import pl.zajavka.domain.Availability;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public interface AvailabilityMapper {
    @Mappings({
            @Mapping(target = "startDate", source = "availabilityDTO.startDate", qualifiedByName = "mapDateTime"),
            @Mapping(target = "endDate", source = "availabilityDTO.endDate", qualifiedByName = "mapDateTime")
    })
    Availability map(AvailabilityDTO availabilityDTO);
    @Named("mapDateTime")
    default LocalDateTime mapDateTime(String dateTimeString) {
        return LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
    }
}
