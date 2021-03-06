
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
 *         &lt;element name="TopSelectedGoalScorersResult" type="{http://footballpool.dataaccess.eu}ArrayOftTopSelectedGoalScorer"/&gt;
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
    "topSelectedGoalScorersResult"
})
@XmlRootElement(name = "TopSelectedGoalScorersResponse")
public class TopSelectedGoalScorersResponse {

    @XmlElement(name = "TopSelectedGoalScorersResult", required = true)
    protected ArrayOftTopSelectedGoalScorer topSelectedGoalScorersResult;

    /**
     * Obtient la valeur de la propriété topSelectedGoalScorersResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTopSelectedGoalScorer }
     *     
     */
    public ArrayOftTopSelectedGoalScorer getTopSelectedGoalScorersResult() {
        return topSelectedGoalScorersResult;
    }

    /**
     * Définit la valeur de la propriété topSelectedGoalScorersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTopSelectedGoalScorer }
     *     
     */
    public void setTopSelectedGoalScorersResult(ArrayOftTopSelectedGoalScorer value) {
        this.topSelectedGoalScorersResult = value;
    }

}
