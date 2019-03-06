package io.github.areguig.jooqsample.infra.repository;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

import io.github.areguig.jooqsample.domain.Component;
import io.github.areguig.jooqsample.domain.ComponentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ComponentJOOQRepository implements ComponentRepository {

    private final DSLContext dsl;

    @Override
    public List<Component> findAllComponents() {
        return dsl.select()
            .from(table("sauron.components"))
            .orderBy(field("created_at").desc())
            .fetchInto(Component.class);
    }
}
