# lombok-builder-bug

When using `jax-rs`, `jackson` and `@JsonView`, this Dto

```java
@Builder
public class Dto {
	@JsonView(DefaultView.class)
	private boolean isDefault;
}
```

results in this Json

```json
{
  "isDefault": true,
  "default": true
}
```

instead of

```json
{
  "isDefault": true
}
```
