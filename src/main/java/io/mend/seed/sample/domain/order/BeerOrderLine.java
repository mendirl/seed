package io.mend.seed.sample.domain.order;

import io.mend.seed.sample.domain.Amount;
import io.mend.seed.shared.error.domain.Assert;

public record BeerOrderLine(OrderedBeer beer, int quantity) {
  public BeerOrderLine {
    Assert.notNull("beer", beer);
    Assert.field("quantity", quantity).min(1);
  }

  Amount amount() {
    return beer().unitPrice().times(quantity());
  }
}
