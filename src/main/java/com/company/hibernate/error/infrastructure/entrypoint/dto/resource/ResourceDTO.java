package com.company.hibernate.error.infrastructure.entrypoint.dto.resource;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
public class ResourceDTO {

    private Long uid;

    private String id;

    private Boolean statisticsEnabled;

    private Boolean enabled;

    private Long applicationEnvironmentEntityUid;

    private String parentId;

    private String type;


}
