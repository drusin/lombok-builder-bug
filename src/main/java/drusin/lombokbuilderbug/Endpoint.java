package drusin.lombokbuilderbug;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonView;

@Path("/")
@Component
public class Endpoint {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("")
	@JsonView(Dto.View.DefaultView.class)
	public Dto test() {
		return Dto.builder().isDefault(true).build();
		
		/*
		Expected: {"isDefault":true}
		
		Actual: {"isDefault":true,"default":true}
		this only happens when using JsonView!!!!
		 */
	}
}
