package drusin.lombokbuilderbug;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonView;

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
