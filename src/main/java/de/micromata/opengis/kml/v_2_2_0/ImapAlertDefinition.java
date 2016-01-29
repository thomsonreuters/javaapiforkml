package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImapAlertDefinitionType", propOrder = {
    "imapAlertSources"
})
@XmlRootElement(name = "AlertDefinition", namespace = "http://www.thomsonreuters.com/ns/2013/11/mapping/kml")
public class ImapAlertDefinition extends Feature implements Cloneable{

  @XmlElement(name = "imap:AlertSources")
  protected ImapAlertSources imapAlertSources;

  public ImapAlertDefinition(){
    super();
  }

  public ImapAlertDefinition setImapAlertSources(ImapAlertSources imapAlertSources){
    this.imapAlertSources = imapAlertSources;
    return this;
  }

  public ImapAlertSources getImapAlertSources(){
    if(this.imapAlertSources == null) this.imapAlertSources = new ImapAlertSources();
    return this.imapAlertSources;
  }

  public ImapAlertDefinition createAndSetImapAlertSources(){
    this.imapAlertSources = new ImapAlertSources();
    return this;
  }

  @Override
  public int hashCode(){
    final int prime = 31;
    int result = super.hashCode();
    return ((prime*result)+((imapAlertSources == null)? 0 : imapAlertSources.hashCode()));
  }

  @Override
  public ImapAlertDefinition clone(){
    ImapAlertDefinition copy;

    try{
      copy = (ImapAlertDefinition) super.clone();
    }catch (Throwable ce){
      throw new InternalError(ce.toString());
    }
    return copy;
  }

}
