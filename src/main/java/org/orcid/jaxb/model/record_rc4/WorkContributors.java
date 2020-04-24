//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.record_rc4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.common_rc4.Contributor;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "contributor" })
@XmlRootElement(name = "work-contributors")
public class WorkContributors implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(namespace = "http://www.orcid.org/ns/work")
    protected List<Contributor> contributor;
    
    public WorkContributors() {
        
    }
    
    public WorkContributors(List<Contributor> contributor) {
        this.contributor=contributor;
    }

    /**
     * Gets the value of the contributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contributor }
     * 
     * 
     */
    public List<Contributor> getContributor() {
        if (contributor == null) {
            contributor = new ArrayList<Contributor>();
        }
        return this.contributor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkContributors)) {
            return false;
        }

        WorkContributors that = (WorkContributors) o;

        if (contributor != null ? !contributor.equals(that.contributor) : that.contributor != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return contributor != null ? contributor.hashCode() : 0;
    }
}