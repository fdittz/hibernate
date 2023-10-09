package com.company.hibernate.error;

import com.company.hibernate.error.infrastructure.dataprovider.repository.ResourceReactorCrudRepository;
import io.micronaut.context.annotation.Property;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class DemoTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    ResourceReactorCrudRepository resourceReactorCrudRepository;

    @Test
    void testItWorks() {
        resourceReactorCrudRepository.findByApplicationEnvironmentUidAndResourceId(4391L, "appenv").block();
        Assertions.assertTrue(application.isRunning());
    }

}
