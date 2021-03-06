
package de.mbg.webservice.client.gen;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MitarbeiterService", targetNamespace = "http://Server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MitarbeiterService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setpersNr", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.SetpersNr")
    @ResponseWrapper(localName = "setpersNrResponse", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.SetpersNrResponse")
    @Action(input = "http://Server/MitarbeiterService/setpersNrRequest", output = "http://Server/MitarbeiterService/setpersNrResponse")
    public boolean setpersNr(
        @WebParam(name = "arg0", targetNamespace = "")
        Mitarbeiter arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getpersNr", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.GetpersNr")
    @ResponseWrapper(localName = "getpersNrResponse", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.GetpersNrResponse")
    @Action(input = "http://Server/MitarbeiterService/getpersNrRequest", output = "http://Server/MitarbeiterService/getpersNrResponse")
    public int getpersNr(
        @WebParam(name = "arg0", targetNamespace = "")
        Mitarbeiter arg0);

    /**
     * 
     * @return
     *     returns java.util.List<de.mbg.webservice.client.gen.Mitarbeiter>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getall", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.Getall")
    @ResponseWrapper(localName = "getallResponse", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.GetallResponse")
    @Action(input = "http://Server/MitarbeiterService/getallRequest", output = "http://Server/MitarbeiterService/getallResponse")
    public List<Mitarbeiter> getall();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns de.mbg.webservice.client.gen.Mitarbeiter
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.AddResponse")
    @Action(input = "http://Server/MitarbeiterService/addRequest", output = "http://Server/MitarbeiterService/addResponse")
    public Mitarbeiter add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getName", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.GetNameResponse")
    @Action(input = "http://Server/MitarbeiterService/getNameRequest", output = "http://Server/MitarbeiterService/getNameResponse")
    public String getName(
        @WebParam(name = "arg0", targetNamespace = "")
        Mitarbeiter arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setName", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.SetName")
    @ResponseWrapper(localName = "setNameResponse", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.SetNameResponse")
    @Action(input = "http://Server/MitarbeiterService/setNameRequest", output = "http://Server/MitarbeiterService/setNameResponse")
    public boolean setName(
        @WebParam(name = "arg0", targetNamespace = "")
        Mitarbeiter arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns de.mbg.webservice.client.gen.Mitarbeiter
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "search", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://Server/", className = "de.mbg.webservice.client.gen.SearchResponse")
    @Action(input = "http://Server/MitarbeiterService/searchRequest", output = "http://Server/MitarbeiterService/searchResponse")
    public Mitarbeiter search(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
