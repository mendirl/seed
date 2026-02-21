package io.mend.seed.shared.authentication.domain;

import java.util.Set;
import java.util.stream.Stream;
import io.mend.seed.shared.collection.domain.Seed4jSampleApplicationCollections;
import io.mend.seed.shared.error.domain.Assert;

public record Roles(Set<Role> roles) {
  public static final Roles EMPTY = new Roles(null);

  public Roles(Set<Role> roles) {
    this.roles = Seed4jSampleApplicationCollections.immutable(roles);
  }

  public boolean hasRole() {
    return !roles.isEmpty();
  }

  public boolean hasRole(Role role) {
    Assert.notNull("role", role);

    return roles.contains(role);
  }

  public Stream<Role> stream() {
    return get().stream();
  }

  public Set<Role> get() {
    return roles();
  }
}
