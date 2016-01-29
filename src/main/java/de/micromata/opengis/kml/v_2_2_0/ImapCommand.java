package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImapCommandType", propOrder = {
        "displayName",
        "href"
})
@XmlRootElement(name = "imap:Command", namespace = "http://www.thomsonreuters.com/ns/2013/11/mapping/kml")
public class ImapCommand implements Cloneable{

    @XmlElement(name = "displayName")
    public String displayName;

    @XmlElement(name = "href")
    public String href;

    public ImapCommand(){
        super();
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getHref() {
        return href;
    }

    public ImapCommand setHref(String href) {
        this.href = href;
        return this;
    }

    public ImapCommand setDisplayName(String displayName){
        this.displayName = displayName;
        return this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = ((prime*result)+((displayName == null)? 0 :displayName.hashCode()));
        result = ((prime*result)+((href == null)? 0 :href.hashCode()));
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
        ImapCommand other = ((ImapCommand) obj);
        if (displayName == null) {
            if (other.displayName!= null) {
                return false;
            }
        } else {
            if (displayName.equals(other.displayName) == false) {
                return false;
            }
        }
        if (href == null) {
            if (other.href!= null) {
                return false;
            }
        } else {
            if (href.equals(other.href) == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ImapCommand clone() {
        ImapCommand copy;
        try {
            copy = ((ImapCommand) super.clone());
        } catch (CloneNotSupportedException _x) {
            throw new InternalError((_x.toString()));
        }
        return copy;
    }

}
