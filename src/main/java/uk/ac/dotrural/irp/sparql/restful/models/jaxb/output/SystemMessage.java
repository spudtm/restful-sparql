package uk.ac.dotrural.irp.sparql.restful.models.jaxb.output;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SystemMessage
{
  private String msgType;
  private String details;

  public SystemMessage()
  {}
  
  public SystemMessage(String msgType, String details)
  {
    super();
    this.msgType = msgType;
    this.details = details;
  }

  @XmlElement(name="msgType")
  public String getMsgType()
  {
    return msgType;
  }
  
  public void setMsgType(String msgType)
  {
    this.msgType = msgType;
  }
  
  @XmlElement(name="details")
  public String getDetails()
  {
    return details;
  }
  
  public void setDetails(String details)
  {
    this.details = details;
  }
}
