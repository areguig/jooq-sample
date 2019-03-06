package io.github.areguig.jooqsample.domain;

import java.util.List;
import lombok.NonNull;

public interface IncidentRepository {

    List<Incident> findAllIncendentsByComponentId(@NonNull Integer componentId);
}
