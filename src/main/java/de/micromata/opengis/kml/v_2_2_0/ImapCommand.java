package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.*;

/**
 * Created by cato on 26/11/2015.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImapCommandType", propOrder = {
        "displayName",
        "href"
})
@XmlRootElement(name = "imap:Command", namespace = "http://www.opengis.net/kml/2.2")
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

    /**
     *
     * @param value
     *     allowed object is
     *     {@link String}
     *
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     *
     * @return
     *     possible object is
     *     {@link String}
     *
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     *     allowed object is
     *     {@link String}
     *
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     */

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
        if ((obj instanceof Data) == false) {
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
