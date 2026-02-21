package io.mend.seed.sample.application;

import static org.assertj.core.api.Assertions.*;
import static io.mend.seed.sample.domain.beer.BeersFixture.*;
import static io.mend.seed.shared.kipe.application.TestAuthentications.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import io.mend.seed.UnitTest;
import io.mend.seed.shared.kipe.application.AccessContext;
import io.mend.seed.shared.kipe.application.Seed4jSampleApplicationAuthorizations;

@UnitTest
class BeerToCreateAccessCheckerTest {

  private static final BeerToCreateAccessChecker checker = new BeerToCreateAccessChecker(
    new Seed4jSampleApplicationAuthorizations(List.of(new BeersAccessesConfiguration().beersAccesses()))
  );

  @Test
  void shouldNotAuthorizedUnauthorizedAction() {
    assertThat(checker.can(AccessContext.of(admin(), "unauthorized", beerToCreate()))).isFalse();
  }

  @Test
  void shouldAuthorizedAuthorizedAction() {
    assertThat(checker.can(AccessContext.of(admin(), "create", beerToCreate()))).isTrue();
  }
}
