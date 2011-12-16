package uk.ac.dotrural.irp.sparql.restful.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import uk.ac.dotrural.irp.sparql.restful.models.jaxb.input.Query;
import uk.ac.dotrural.irp.sparql.restful.models.jaxb.input.ServiceInitialiser;
import uk.ac.dotrural.irp.sparql.restful.models.jaxb.output.EndpointInfo;
import uk.ac.dotrural.irp.sparql.restful.models.jaxb.output.SystemMessage;

public interface RESTFulSPARQL
{  
  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  @Path("init")
  public SystemMessage init(ServiceInitialiser si);

  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  @Path("update")
  public void update(Query query);
  
  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  @Produces({MediaType.APPLICATION_JSON})
  @Path("query")
  public String query(Query query);
  
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  @Path("info")
  public EndpointInfo info();
}
