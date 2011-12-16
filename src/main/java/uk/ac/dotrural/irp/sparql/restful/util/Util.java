package uk.ac.dotrural.irp.sparql.restful.util;

import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.sparql.resultset.JSONOutput;

public class Util
{
  public static String resultsetToString(ResultSet results)
  {
    JSONOutput json = new JSONOutput();
    String jsonResults = json.asString(results);

    return jsonResults;
  }
}
