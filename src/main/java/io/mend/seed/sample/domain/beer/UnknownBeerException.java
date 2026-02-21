package io.mend.seed.sample.domain.beer;

import io.mend.seed.sample.domain.BeerId;

class UnknownBeerException extends RuntimeException {

  public UnknownBeerException(BeerId id) {
    super("Beer " + id.get() + " is unknown");
  }
}
