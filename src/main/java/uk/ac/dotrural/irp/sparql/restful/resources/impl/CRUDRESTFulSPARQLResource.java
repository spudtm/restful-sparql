package uk.ac.dotrural.irp.sparql.restful.resources.impl;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.springframework.context.annotation.Scope;

import uk.ac.dotrural.irp.sparql.restful.models.jaxb.input.Query;
import uk.ac.dotrural.irp.sparql.restful.models.jaxb.input.ServiceInitialiser;
import uk.ac.dotrural.irp.sparql.restful.models.jaxb.output.EndpointInfo;
import uk.ac.dotrural.irp.sparql.restful.models.jaxb.output.SystemMessage;
import uk.ac.dotrural.irp.sparql.restful.resources.RESTFulSPARQL;
import uk.ac.dotrural.irp.sparql.restful.services.SPARQLEndpoint;
import uk.ac.dotrural.irp.sparql.restful.util.Util;

@Path("/")
@Scope("request")
public class CRUDRESTFulSPARQLResource implements RESTFulSPARQL
{
  @Context
  private UriInfo uriInfo;
  
  private SPARQLEndpoint endpoint;
  
  public void setEndpoint(SPARQLEndpoint endpoint)
  {
    this.endpoint = endpoint;
  }
  
  public SystemMessage init(ServiceInitialiser si)
  {
    return endpoint.init(uriInfo, si);
  }

  public void update(Query query)
  {
    endpoint.update(query);
  }

  public String query(Query query)
  {
    return Util.resultsetToString(endpoint.query(query));
  }

  public EndpointInfo info()
  {
    return endpoint.info();
  }
}