package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImapAlertSourcesType", propOrder = {
    "imapSourceList"
})
@XmlRootElement(name = "imap:AlertSources", namespace = "http://www.thomsonreuters.com/ns/2013/11/mapping/kml")
public class ImapAlertSources implements Cloneable{

  @XmlAttribute(name = "type")
  protected String type;

  @XmlElement(name = "imap:Source")
  protected List<ImapSource> imapSourceList;

  public ImapAlertSources(){
    super();
  }

  @Override
  public int hashCode(){
    final int prime = 31;
    int result = super.hashCode();

    return ((prime*result)+((imapSourceList == null) ? 0 : imapSourceList.hashCode()));
  }

  public ImapAlertSources setType(String type){
    this.type = type;
    return this;
  }

  public ImapAlertSources addImapSourceToList(ImapSource imapSource){
    if(this.imapSourceList == null) this.imapSourceList = new ArrayList<ImapSource>();
    this.imapSourceList.add(imapSource);
    return this;
  }

  public List<ImapSource> getImapSourceList(){
    if(this.imapSourceList == null) this.imapSourceList = new ArrayList<ImapSource>();
    return this.imapSourceList;
  }

  public ImapAlertSources createAndSetImapSourceList(){
    this.imapSourceList = new ArrayList<ImapSource>();
    return this;
  }

  @Override
  public  boolean equals(Object o){
    if(this == o) return true;
    if(o == null) return false;
    if(!super.equals(o)) return false;
    if(!(o instanceof ImapAlertSources)) return false;
    ImapAlertSources other = ((ImapAlertSources) o);
    if(imapSourceList == null){
      if(other.imapSourceList != null) return false;
    }else{
      if(!imapSourceList.equals(other.imapSourceList)) return false;
    }

    return true;
  }

  @Override
  public  ImapAlertSources clone(){
    ImapAlertSources copy;

    try{
      copy = ((ImapAlertSources) super.clone());
    }catch (CloneNotSupportedException _x){
      throw new InternalError((_x.toString()));
    }

    return copy;
  }

}
