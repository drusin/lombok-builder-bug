# lombok-builder-bug

When using `jax-rs`, `jackson` and `@JsonView`, this Dto

```java
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dto {
	public static class View {
		public static class DefaultView { /* */ }
	}
	
	@JsonView(Dto.View.DefaultView.class)
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
