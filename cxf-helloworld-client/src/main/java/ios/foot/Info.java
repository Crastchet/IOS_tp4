package ios.foot;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This Visual DataFlex Web Service exposes functions for the current football pool
 *
 * This class was generated by Apache CXF 3.2.0
 * 2017-10-25T14:43:37.359+02:00
 * Generated source version: 3.2.0
 * 
 */
@WebServiceClient(name = "Info", 
                  wsdlLocation = "http://footballpool.dataaccess.eu/data/info.wso?WSDL",
                  targetNamespace = "http://footballpool.dataaccess.eu") 
public class Info extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://footballpool.dataaccess.eu", "Info");
    public final static QName InfoSoap12 = new QName("http://footballpool.dataaccess.eu", "InfoSoap12");
    public final static QName InfoSoap = new QName("http://footballpool.dataaccess.eu", "InfoSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://footballpool.dataaccess.eu/data/info.wso?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Info.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://footballpool.dataaccess.eu/data/info.wso?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public Info(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Info(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Info() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Info(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Info(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Info(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns InfoSoapType
     */
    @WebEndpoint(name = "InfoSoap12")
    public InfoSoapType getInfoSoap12() {
        return super.getPort(InfoSoap12, InfoSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoSoapType
     */
    @WebEndpoint(name = "InfoSoap12")
    public InfoSoapType getInfoSoap12(WebServiceFeature... features) {
        return super.getPort(InfoSoap12, InfoSoapType.class, features);
    }


    /**
     *
     * @return
     *     returns InfoSoapType
     */
    @WebEndpoint(name = "InfoSoap")
    public InfoSoapType getInfoSoap() {
        return super.getPort(InfoSoap, InfoSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoSoapType
     */
    @WebEndpoint(name = "InfoSoap")
    public InfoSoapType getInfoSoap(WebServiceFeature... features) {
        return super.getPort(InfoSoap, InfoSoapType.class, features);
    }

}