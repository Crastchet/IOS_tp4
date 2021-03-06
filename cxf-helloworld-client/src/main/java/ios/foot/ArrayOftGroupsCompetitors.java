
package ios.foot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOftGroupsCompetitors complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftGroupsCompetitors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tGroupsCompetitors" type="{http://footballpool.dataaccess.eu}tGroupsCompetitors" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftGroupsCompetitors", propOrder = {
    "tGroupsCompetitors"
})
public class ArrayOftGroupsCompetitors {

    @XmlElement(nillable = true)
    protected List<TGroupsCompetitors> tGroupsCompetitors;

    /**
     * Gets the value of the tGroupsCompetitors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tGroupsCompetitors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTGroupsCompetitors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGroupsCompetitors }
     * 
     * 
     */
    public List<TGroupsCompetitors> getTGroupsCompetitors() {
        if (tGroupsCompetitors == null) {
            tGroupsCompetitors = new ArrayList<TGroupsCompetitors>();
        }
        return this.tGroupsCompetitors;
    }

}
