package pl.zajavka.infrastructure.database.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import pl.zajavka.domain.Availability;
import pl.zajavka.infrastructure.database.entity.AvailabilityEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AvailabilityEntityMapper {


    AvailabilityEntity mapToEntity(Availability availability);
}
