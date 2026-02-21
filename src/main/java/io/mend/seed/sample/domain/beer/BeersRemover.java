package io.mend.seed.sample.domain.beer;

import io.mend.seed.sample.domain.BeerId;
import io.mend.seed.shared.error.domain.Assert;

public class BeersRemover {

  private final BeersRepository beers;

  public BeersRemover(BeersRepository beers) {
    Assert.notNull("beers", beers);

    this.beers = beers;
  }

  public void remove(BeerId id) {
    Assert.notNull("id", id);

    Beer beer = beers.get(id).orElseThrow(() -> new UnknownBeerException(id));

    beer.removeFromSell();
    beers.save(beer);
  }
}
