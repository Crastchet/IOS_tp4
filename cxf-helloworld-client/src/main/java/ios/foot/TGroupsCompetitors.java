
package ios.foot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour tGroupsCompetitors complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tGroupsCompetitors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupInfo" type="{http://footballpool.dataaccess.eu}tGroupInfo"/&gt;
 *         &lt;element name="TeamsInGroup" type="{http://footballpool.dataaccess.eu}ArrayOftTeamInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGroupsCompetitors", propOrder = {
    "groupInfo",
    "teamsInGroup"
})
public class TGroupsCompetitors {

    @XmlElement(name = "GroupInfo", required = true)
    protected TGroupInfo groupInfo;
    @XmlElement(name = "TeamsInGroup", required = true)
    protected ArrayOftTeamInfo teamsInGroup;

    /**
     * Obtient la valeur de la propriété groupInfo.
     * 
     * @return
     *     possible object is
     *     {@link TGroupInfo }
     *     
     */
    public TGroupInfo getGroupInfo() {
        return groupInfo;
    }

    /**
     * Définit la valeur de la propriété groupInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link TGroupInfo }
     *     
     */
    public void setGroupInfo(TGroupInfo value) {
        this.groupInfo = value;
    }

    /**
     * Obtient la valeur de la propriété teamsInGroup.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftTeamInfo }
     *     
     */
    public ArrayOftTeamInfo getTeamsInGroup() {
        return teamsInGroup;
    }

    /**
     * Définit la valeur de la propriété teamsInGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftTeamInfo }
     *     
     */
    public void setTeamsInGroup(ArrayOftTeamInfo value) {
        this.teamsInGroup = value;
    }

}