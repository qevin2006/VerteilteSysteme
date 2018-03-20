
package de.mbg.webservice.client.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.mbg.webservice.client.gen package. 
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

    private final static QName _SetpersNr_QNAME = new QName("http://Server/", "setpersNr");
    private final static QName _SearchResponse_QNAME = new QName("http://Server/", "searchResponse");
    private final static QName _Search_QNAME = new QName("http://Server/", "search");
    private final static QName _GetpersNrResponse_QNAME = new QName("http://Server/", "getpersNrResponse");
    private final static QName _SetpersNrResponse_QNAME = new QName("http://Server/", "setpersNrResponse");
    private final static QName _GetNameResponse_QNAME = new QName("http://Server/", "getNameResponse");
    private final static QName _AddResponse_QNAME = new QName("http://Server/", "addResponse");
    private final static QName _GetpersNr_QNAME = new QName("http://Server/", "getpersNr");
    private final static QName _GetName_QNAME = new QName("http://Server/", "getName");
    private final static QName _Getall_QNAME = new QName("http://Server/", "getall");
    private final static QName _Add_QNAME = new QName("http://Server/", "add");
    private final static QName _SetName_QNAME = new QName("http://Server/", "setName");
    private final static QName _SetNameResponse_QNAME = new QName("http://Server/", "setNameResponse");
    private final static QName _GetallResponse_QNAME = new QName("http://Server/", "getallResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.mbg.webservice.client.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link SetName }
     * 
     */
    public SetName createSetName() {
        return new SetName();
    }

    /**
     * Create an instance of {@link SetNameResponse }
     * 
     */
    public SetNameResponse createSetNameResponse() {
        return new SetNameResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link Getall }
     * 
     */
    public Getall createGetall() {
        return new Getall();
    }

    /**
     * Create an instance of {@link GetpersNr }
     * 
     */
    public GetpersNr createGetpersNr() {
        return new GetpersNr();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetallResponse }
     * 
     */
    public GetallResponse createGetallResponse() {
        return new GetallResponse();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SetpersNr }
     * 
     */
    public SetpersNr createSetpersNr() {
        return new SetpersNr();
    }

    /**
     * Create an instance of {@link SetpersNrResponse }
     * 
     */
    public SetpersNrResponse createSetpersNrResponse() {
        return new SetpersNrResponse();
    }

    /**
     * Create an instance of {@link GetpersNrResponse }
     * 
     */
    public GetpersNrResponse createGetpersNrResponse() {
        return new GetpersNrResponse();
    }

    /**
     * Create an instance of {@link Mitarbeiter }
     * 
     */
    public Mitarbeiter createMitarbeiter() {
        return new Mitarbeiter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpersNr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "setpersNr")
    public JAXBElement<SetpersNr> createSetpersNr(SetpersNr value) {
        return new JAXBElement<SetpersNr>(_SetpersNr_QNAME, SetpersNr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Search }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "search")
    public JAXBElement<Search> createSearch(Search value) {
        return new JAXBElement<Search>(_Search_QNAME, Search.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetpersNrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getpersNrResponse")
    public JAXBElement<GetpersNrResponse> createGetpersNrResponse(GetpersNrResponse value) {
        return new JAXBElement<GetpersNrResponse>(_GetpersNrResponse_QNAME, GetpersNrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetpersNrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "setpersNrResponse")
    public JAXBElement<SetpersNrResponse> createSetpersNrResponse(SetpersNrResponse value) {
        return new JAXBElement<SetpersNrResponse>(_SetpersNrResponse_QNAME, SetpersNrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetpersNr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getpersNr")
    public JAXBElement<GetpersNr> createGetpersNr(GetpersNr value) {
        return new JAXBElement<GetpersNr>(_GetpersNr_QNAME, GetpersNr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getall")
    public JAXBElement<Getall> createGetall(Getall value) {
        return new JAXBElement<Getall>(_Getall_QNAME, Getall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "setName")
    public JAXBElement<SetName> createSetName(SetName value) {
        return new JAXBElement<SetName>(_SetName_QNAME, SetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "setNameResponse")
    public JAXBElement<SetNameResponse> createSetNameResponse(SetNameResponse value) {
        return new JAXBElement<SetNameResponse>(_SetNameResponse_QNAME, SetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getallResponse")
    public JAXBElement<GetallResponse> createGetallResponse(GetallResponse value) {
        return new JAXBElement<GetallResponse>(_GetallResponse_QNAME, GetallResponse.class, null, value);
    }

}
