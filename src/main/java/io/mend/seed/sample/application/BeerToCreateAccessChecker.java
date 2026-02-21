package io.mend.seed.sample.application;

import org.springframework.stereotype.Component;
import io.mend.seed.sample.domain.beer.BeerToCreate;
import io.mend.seed.shared.kipe.application.AccessChecker;
import io.mend.seed.shared.kipe.application.AccessContext;
import io.mend.seed.shared.kipe.application.Seed4jSampleApplicationAuthorizations;

@Component
class BeerToCreateAccessChecker implements AccessChecker<BeerToCreate> {

  private final Seed4jSampleApplicationAuthorizations authorizations;

  public BeerToCreateAccessChecker(Seed4jSampleApplicationAuthorizations authorizations) {
    this.authorizations = authorizations;
  }

  @Override
  public boolean can(AccessContext<BeerToCreate> access) {
    return authorizations.allAuthorized(access.authentication(), access.action(), BeerResource.BEERS);
  }
}
