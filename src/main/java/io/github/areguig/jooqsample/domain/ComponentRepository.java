package io.github.areguig.jooqsample.domain;

import java.util.List;

public interface ComponentRepository {

    List<Component> findAllComponents();
}
