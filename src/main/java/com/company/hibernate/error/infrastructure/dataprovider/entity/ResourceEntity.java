package com.company.hibernate.error.infrastructure.dataprovider.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Serdeable
@Entity
@Table(name = "RESOURCE_CA")
public class ResourceEntity {

    @Id
    @Column(name = "RECA_CD_RESOURCE_UID")
    private Long uid;

    @NotEmpty(message = "Identificador (ID) do recurso não pode ser vazio.")
    @NotNull(message = "Identificador (ID) do recurso não pode ser nulo.")
    @Size(max = 1000, message = "Identificador (ID) do recurso deve ter no máximo {max} caracteres.")
    @Pattern(regexp = "[^+&]*", message = "Identificador (ID) do recurso não deve conter os caracteres \"+\" e \"&\".")
    @Column(name = "RECA_CD_ID", nullable = false)
    @JsonProperty("id")
    private String resourceId;

    @ManyToOne
    @JoinColumn(name = "APEN_CD_APEN_UID")
    private ApplicationEnvironmentEntity applicationEnvironment;

    @ManyToOne
    @JoinColumn(name = "RECA_CD_RESOURCE_PARENT_UID")
    private ResourceEntity parent;



}
