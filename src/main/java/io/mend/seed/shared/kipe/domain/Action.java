package io.mend.seed.shared.kipe.domain;

import io.mend.seed.shared.error.domain.Assert;

public record Action(String action) {
  public Action {
    Assert.notBlank("action", action);
  }

  @Override
  public String toString() {
    return action();
  }
}
