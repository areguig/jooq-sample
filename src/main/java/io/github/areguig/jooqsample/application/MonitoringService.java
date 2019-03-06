package io.github.areguig.jooqsample.application;

import io.github.areguig.jooqsample.domain.Component;
import io.github.areguig.jooqsample.domain.ComponentRepository;
import io.github.areguig.jooqsample.domain.IncidentRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonitoringService {

    private final ComponentRepository componentRepository;

    private final IncidentRepository incidentRepository;

    public List<Component> enabledComponents() {
        return componentRepository.findAllComponents()
            .stream()
            .filter(Component::isEnabled)
            .peek(component -> component.setIncidents(incidentRepository.findAllIncendentsByComponentId(component.getId())))
            .collect(Collectors.toList());
    }
}
