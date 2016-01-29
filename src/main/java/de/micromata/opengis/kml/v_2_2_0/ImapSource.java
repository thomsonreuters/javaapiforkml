package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImapSourceType", propOrder = {
    "value"
})
@XmlRootElement(name = "imap:Source", namespace = "http://www.thomsonreuters.com/ns/2013/11/mapping/kml")
public class ImapSource implements Cloneable{

  @XmlAttribute(name = "displayName")
  public String displayName;

  @XmlAttribute(name = "defaultActivation")
  public String defaultActivation;

  @XmlValue
  public String value;

  public ImapSource setDisplayName(String displayName){
    this.displayName = displayName;
    return this;
  }

  public ImapSource setDefaultActivation(String defaultActivation){
    this.defaultActivation = defaultActivation;
    return this;
  }

  public ImapSource setValue(String value){
    this.value = value;
    return this;
  }

  @Override
  public int hashCode(){
    final int prime = 31;
    int result = super.hashCode();
    result = ((prime*result)+((displayName == null) ? 0 : displayName.hashCode()));
    result = ((prime*result) + ((defaultActivation == null ) ? 0 : defaultActivation.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (super.equals(obj) == false) {
      return false;
    }
    if ((obj instanceof ImapCommand) == false) {
      return false;
    }
    ImapSource other = ((ImapSource) obj);
    if (displayName == null) {
      if (other.displayName!= null) {
        return false;
      }
    } else {
      if (displayName.equals(other.displayName) == false) {
        return false;
      }
    }
    if (value == null) {
      if (other.value!= null) {
        return false;
      }
    } else {
      if (value.equals(other.value) == false) {
        return false;
      }
    }
    return true;
  }

  @Override
  public ImapSource clone(){
    ImapSource copy;
    try{
      copy = (ImapSource) super.clone();
    }catch (CloneNotSupportedException ce){
      throw new InternalError(ce.toString());
    }

    return copy;
  }

}
