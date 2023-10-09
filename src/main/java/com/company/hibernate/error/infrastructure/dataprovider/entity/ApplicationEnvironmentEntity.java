package com.company.hibernate.error.infrastructure.dataprovider.entity;


import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Serdeable
@Entity
@Table(name = "APPLICATION_ENVIRONMENT")
@SqlResultSetMapping(name="scalar", columns=@ColumnResult(name = "APEN_CD_APEN_UID"))
public class ApplicationEnvironmentEntity {

    @Id
    @Column(name = "APEN_CD_APEN_UID")
    private Long uid;

    @OneToMany(mappedBy = "applicationEnvironment")
    private Set<ResourceEntity> resources;


}