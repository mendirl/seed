package io.mend.seed.sample.domain.order;

import io.mend.seed.sample.domain.Amount;
import io.mend.seed.sample.domain.BeerId;
import io.mend.seed.shared.error.domain.Assert;

public record OrderedBeer(BeerId beer, Amount unitPrice) {
  public OrderedBeer {
    Assert.notNull("beer", beer);
    Assert.notNull("unitPrice", unitPrice);
  }
}
