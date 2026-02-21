package io.mend.seed.sample.domain;

import java.util.UUID;
import io.mend.seed.shared.error.domain.Assert;

public record BeerId(UUID id) {
  public BeerId {
    Assert.notNull("id", id);
  }

  public static BeerId newId() {
    return new BeerId(UUID.randomUUID());
  }

  public UUID get() {
    return id();
  }
}
