
package me.boujdi.proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the me.boujdi.proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsulterCompte_QNAME = new QName("http://ws.example.org/", "ConsulterCompte");
    private final static QName _ConsulterCompteResponse_QNAME = new QName("http://ws.example.org/", "ConsulterCompteResponse");
    private final static QName _Convert_QNAME = new QName("http://ws.example.org/", "Convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://ws.example.org/", "ConvertResponse");
    private final static QName _Compte_QNAME = new QName("http://ws.example.org/", "compte");
    private final static QName _ListComptes_QNAME = new QName("http://ws.example.org/", "listComptes");
    private final static QName _ListComptesResponse_QNAME = new QName("http://ws.example.org/", "listComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: me.boujdi.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulterCompte }
     * 
     * @return
     *     the new instance of {@link ConsulterCompte }
     */
    public ConsulterCompte createConsulterCompte() {
        return new ConsulterCompte();
    }

    /**
     * Create an instance of {@link ConsulterCompteResponse }
     * 
     * @return
     *     the new instance of {@link ConsulterCompteResponse }
     */
    public ConsulterCompteResponse createConsulterCompteResponse() {
        return new ConsulterCompteResponse();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     * @return
     *     the new instance of {@link Convert }
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     * @return
     *     the new instance of {@link ConvertResponse }
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     * @return
     *     the new instance of {@link ListComptes }
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListComptesResponse }
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     * @return
     *     the new instance of {@link Client }
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "ConsulterCompte")
    public JAXBElement<ConsulterCompte> createConsulterCompte(ConsulterCompte value) {
        return new JAXBElement<>(_ConsulterCompte_QNAME, ConsulterCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "ConsulterCompteResponse")
    public JAXBElement<ConsulterCompteResponse> createConsulterCompteResponse(ConsulterCompteResponse value) {
        return new JAXBElement<>(_ConsulterCompteResponse_QNAME, ConsulterCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "Convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "ConvertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "listComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "listComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

}
