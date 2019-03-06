package io.github.areguig.jooqsample.domain;

import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class Component {

    private Integer id;

    private String name;

    private String description;

    private String link;

    public int status;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    private boolean enabled;

    private List<Incident> incidents;

}