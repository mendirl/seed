package io.mend.seed.shared.kipe.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import io.mend.seed.UnitTest;

@UnitTest
class ActionTest {

  @Test
  void shouldGetActionAsToString() {
    assertThat(new Action("act")).hasToString("act");
  }
}
