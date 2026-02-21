package io.mend.seed.shared.kipe.application;

import org.springframework.stereotype.Component;
import io.mend.seed.shared.kipe.domain.KipeDummy;

@Component
class KipeDummyAccessChecker implements AccessChecker<KipeDummy> {

  @Override
  public boolean can(AccessContext<KipeDummy> access) {
    return access.authentication() != null && access.element().value().equals("authorized");
  }
}
