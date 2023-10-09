package com.company.hibernate.error.infrastructure.entrypoint.rest.endpoint;

import com.company.hibernate.error.infrastructure.dataprovider.entity.ResourceEntity;
import com.company.hibernate.error.infrastructure.dataprovider.repository.ResourceReactorCrudRepository;
import com.company.hibernate.error.infrastructure.entrypoint.dto.resource.ResourceDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Validated
@Controller("/resource")
public class ResourceEndpoint {


    private final ResourceReactorCrudRepository resourceRepository;

    @Post
    public Mono<HttpResponse<ResourceEntity>> createResource(@Body @Valid ResourceDTO resourceDTO) {
        return resourceRepository.findByApplicationEnvironmentUidAndResourceId(4391L, "searchAdmin")
                .map(resource -> HttpResponse.status(HttpStatus.CREATED)
                .body(resource));
    }
}
