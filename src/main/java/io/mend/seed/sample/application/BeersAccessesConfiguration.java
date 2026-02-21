package io.mend.seed.sample.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.mend.seed.shared.authentication.domain.Role;
import io.mend.seed.shared.kipe.domain.RolesAccesses;

@Configuration
class BeersAccessesConfiguration {

  @Bean
  RolesAccesses beersAccesses() {
    return RolesAccesses.builder()
      .role(Role.ADMIN)
      .allAuthorized("create", BeerResource.BEERS)
      .allAuthorized("remove", BeerResource.BEERS)
      .and()
      .build();
  }
}
