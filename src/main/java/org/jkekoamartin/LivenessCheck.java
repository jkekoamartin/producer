package org.jkekoamartin;


import io.micronaut.health.HealthStatus;
import io.micronaut.management.health.indicator.HealthIndicator;
import io.micronaut.management.health.indicator.HealthResult;
import io.micronaut.management.health.indicator.annotation.Liveness;
import jakarta.inject.Singleton;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

@Singleton
@Liveness
public class LivenessCheck implements HealthIndicator {
    @Override
    public Publisher<HealthResult> getResult() {
        return Mono.just(HealthResult.builder("liveness", HealthStatus.UP).build());
    }
}
