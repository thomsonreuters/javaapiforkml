package de.micromata.opengis.kml.v_2_2_0;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImapCommandsType", propOrder = {
        "imapCommandList"
})
@XmlRootElement(name = "imap:Commands", namespace = "http://www.thomsonreuters.com/ns/2013/11/mapping/kml")
public class ImapCommands implements Cloneable{

    @XmlElement(name = "imap:Command")
    protected List<ImapCommand> imapCommandList;

    public ImapCommands(){
        super();
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        return ((prime*result)+((imapCommandList == null)? 0 : imapCommandList.hashCode()));
    }

    public ImapCommands addImapCommandToList(ImapCommand imapCommand){
        this.imapCommandList.add(imapCommand);
        return this;
    }

    public List<ImapCommand> getImapCommandList(){
        if(this.imapCommandList == null) this.imapCommandList = new ArrayList<ImapCommand>();
        return this.imapCommandList;
    }

    public ImapCommands createAndSetImapCommandList(){
        this.imapCommandList = new ArrayList<ImapCommand>();
        return this;
    }

    @Override
    public  boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(!super.equals(o)) return false;
        if(!(o instanceof ImapCommands)) return false;
        ImapCommands other = ((ImapCommands) o);
        if(imapCommandList == null){
            if(other.imapCommandList != null) return false;
        }else{
            if(!imapCommandList.equals(other.imapCommandList)) return false;
        }

        return true;
    }

    @Override
    public  ImapCommands clone(){
        ImapCommands copy;

        try{
            copy = ((ImapCommands) super.clone());
        }catch (CloneNotSupportedException _x){
            throw new InternalError((_x.toString()));
        }

        return copy;
    }

}
