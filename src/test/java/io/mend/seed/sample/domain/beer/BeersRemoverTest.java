package io.mend.seed.sample.domain.beer;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import io.mend.seed.UnitTest;
import io.mend.seed.sample.domain.BeersIdentityFixture;

@UnitTest
@ExtendWith(MockitoExtension.class)
class BeersRemoverTest {

  @Mock
  private BeersRepository beers;

  @InjectMocks
  private BeersRemover remover;

  @Test
  void shouldNotRemoveUnknownBeerFromCatalog() {
    assertThatThrownBy(() -> remover.remove(BeersIdentityFixture.cloackOfFeathersId())).isExactlyInstanceOf(UnknownBeerException.class);
  }
}
