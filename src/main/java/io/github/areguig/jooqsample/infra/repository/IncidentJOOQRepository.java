package io.github.areguig.jooqsample.infra.repository;

import static org.jooq.generated.sauron.Tables.INCIDENTS;

import io.github.areguig.jooqsample.domain.Incident;
import io.github.areguig.jooqsample.domain.IncidentRepository;
import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class IncidentJOOQRepository implements IncidentRepository {

    private final DSLContext dsl;

    @Override
    public List<Incident> findAllIncendentsByComponentId(@NonNull Integer componentId) {
        return dsl.select()
            .from(INCIDENTS)
            .where(INCIDENTS.ID_COMPONENT.eq(componentId))
            .fetchInto(Incident.class);
    }
}
