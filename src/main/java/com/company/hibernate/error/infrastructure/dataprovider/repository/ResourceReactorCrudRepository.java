package com.company.hibernate.error.infrastructure.dataprovider.repository;

import com.company.hibernate.error.infrastructure.dataprovider.entity.ResourceEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;
import reactor.core.publisher.Mono;

@Repository
public interface ResourceReactorCrudRepository extends ReactorCrudRepository<ResourceEntity, Long> {

    Mono<ResourceEntity> findByUid(Long uid);

    Mono<ResourceEntity> findByResourceId(String resourceId);

    Mono<ResourceEntity> findByApplicationEnvironmentUidAndResourceId(Long uid, String resourceId);

    Mono<ResourceEntity> save(ResourceEntity resourceEntity);
}

