package io.mend.seed.sample.application;

import io.mend.seed.shared.kipe.domain.Resource;

enum BeerResource implements Resource {
  BEERS("beers");

  private final String key;

  BeerResource(String key) {
    this.key = key;
  }

  @Override
  public String key() {
    return key;
  }
}
