/**
 * GenerateAndDownloadHashWSLoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.dsestili.mywebproject.ws;

public class GenerateAndDownloadHashWSLoginServiceLocator extends org.apache.axis.client.Service implements it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLoginService {

    public GenerateAndDownloadHashWSLoginServiceLocator() {
    }


    public GenerateAndDownloadHashWSLoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GenerateAndDownloadHashWSLoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GenerateAndDownloadHashWSLogin
    private java.lang.String GenerateAndDownloadHashWSLogin_address = "http://localhost:8080/MyWebProjectLogin/services/GenerateAndDownloadHashWSLogin";

    public java.lang.String getGenerateAndDownloadHashWSLoginAddress() {
        return GenerateAndDownloadHashWSLogin_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GenerateAndDownloadHashWSLoginWSDDServiceName = "GenerateAndDownloadHashWSLogin";

    public java.lang.String getGenerateAndDownloadHashWSLoginWSDDServiceName() {
        return GenerateAndDownloadHashWSLoginWSDDServiceName;
    }

    public void setGenerateAndDownloadHashWSLoginWSDDServiceName(java.lang.String name) {
        GenerateAndDownloadHashWSLoginWSDDServiceName = name;
    }

    public it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLogin getGenerateAndDownloadHashWSLogin() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GenerateAndDownloadHashWSLogin_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGenerateAndDownloadHashWSLogin(endpoint);
    }

    public it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLogin getGenerateAndDownloadHashWSLogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLoginSoapBindingStub _stub = new it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLoginSoapBindingStub(portAddress, this);
            _stub.setPortName(getGenerateAndDownloadHashWSLoginWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGenerateAndDownloadHashWSLoginEndpointAddress(java.lang.String address) {
        GenerateAndDownloadHashWSLogin_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLogin.class.isAssignableFrom(serviceEndpointInterface)) {
                it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLoginSoapBindingStub _stub = new it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLoginSoapBindingStub(new java.net.URL(GenerateAndDownloadHashWSLogin_address), this);
                _stub.setPortName(getGenerateAndDownloadHashWSLoginWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GenerateAndDownloadHashWSLogin".equals(inputPortName)) {
            return getGenerateAndDownloadHashWSLogin();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.mywebproject.dsestili.it", "GenerateAndDownloadHashWSLoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.mywebproject.dsestili.it", "GenerateAndDownloadHashWSLogin"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GenerateAndDownloadHashWSLogin".equals(portName)) {
            setGenerateAndDownloadHashWSLoginEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
