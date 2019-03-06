package io.github.areguig.jooqsample.domain;

import java.util.Date;
import lombok.Data;

@Data
public class Incident {

    private long id;

    private long idComponent;

    private int status;

    private String message;

    private Date createdAt;

    private Date updatedAt;
}
