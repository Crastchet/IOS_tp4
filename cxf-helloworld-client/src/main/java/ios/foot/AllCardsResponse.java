
package ios.foot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllCardsResult" type="{http://footballpool.dataaccess.eu}ArrayOftCardInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allCardsResult"
})
@XmlRootElement(name = "AllCardsResponse")
public class AllCardsResponse {

    @XmlElement(name = "AllCardsResult", required = true)
    protected ArrayOftCardInfo allCardsResult;

    /**
     * Obtient la valeur de la propriété allCardsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCardInfo }
     *     
     */
    public ArrayOftCardInfo getAllCardsResult() {
        return allCardsResult;
    }

    /**
     * Définit la valeur de la propriété allCardsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCardInfo }
     *     
     */
    public void setAllCardsResult(ArrayOftCardInfo value) {
        this.allCardsResult = value;
    }

}
