package io.mend.seed.sample.domain.beer;

import java.util.Optional;
import io.mend.seed.sample.domain.BeerId;

public interface BeersRepository {
  void save(Beer beer);

  Beers catalog();

  Optional<Beer> get(BeerId beer);
}
