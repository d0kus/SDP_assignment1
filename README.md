# Assignment 1: Builder Pattern — Gym Membership

## 1. Domain Description
A gym membership configurator implemented in Java using the Builder creational design pattern. It replaces telescoping constructors with step-by-step assembly, automated validation, and preset configurations via a Director.

---

## 2. Clean Code Principles

### Principle 1: Meaningful Names
Field and method identifiers clearly express domain intent without cryptic abbreviations or ambiguities.

```java
// Clear, intention-revealing domain names
private int durationMonth;
private String accessTier;
private boolean hasPoolAccess;
```

### Principle 2: Elimination of Magic Numbers
Hardcoded boundary limits are encapsulated in named constants to improve readability and maintainability.

```java
// Named static constants replace unexplained raw numbers
private static final int MIN_DURATION_MONTHS = 1;
private static final int MAX_DURATION_MONTHS = 12;

if (durationMonth < MIN_DURATION_MONTHS || durationMonth > MAX_DURATION_MONTHS) {
    throw new IllegalStateException("Duration out of permitted boundaries.");
}
```

### Principle 3: Validated Construction (Fail-Fast)
The `build()` method verifies state validity prior to instantiation, throwing an explicit exception on invalid state.

```java
public GymMembership build() {
    validate(); // Fails fast before creating the object
    return new GymMembership(this);
}

private void validate() {
    // Rejects null, empty, or whitespace-only names
    if (clientName == null || clientName.trim().isEmpty()) {
        throw new IllegalStateException("Client name must not be empty.");
    }
}
```

### Principle 4: Single Responsibility Principle (SRP)
Methods and classes maintain a single focus; validation logic is decoupled from instance assembly.

```java
// validate() solely handles constraint verification
private void validate() {
    if (guestPasses < 0) {
        throw new IllegalStateException("Guest passes cannot be negative.");
    }
    if (freezeDays < 0) {
        throw new IllegalStateException("Freeze days cannot be negative.");
    }
}
```

### Principle 5: Method Chaining (Fluent API)
Setters mutate one field and return the builder instance (`this`), enabling concise and expressive call chaining.

```java
// Returns 'this' to allow method cascading: builder.setGuestPasses(2).build()
public GymMembershipBuilder setGuestPasses(int guestPasses) {
    this.guestPasses = guestPasses;
    return this;
}
```

---
