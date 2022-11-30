/**
 * Add2NumsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.java;

public class Add2NumsServiceLocator extends org.apache.axis.client.Service implements com.java.Add2NumsService {

    public Add2NumsServiceLocator() {
    }


    public Add2NumsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Add2NumsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Add2Nums
    private java.lang.String Add2Nums_address = "http://localhost:8080/WebServicesFirst/services/Add2Nums";

    public java.lang.String getAdd2NumsAddress() {
        return Add2Nums_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Add2NumsWSDDServiceName = "Add2Nums";

    public java.lang.String getAdd2NumsWSDDServiceName() {
        return Add2NumsWSDDServiceName;
    }

    public void setAdd2NumsWSDDServiceName(java.lang.String name) {
        Add2NumsWSDDServiceName = name;
    }

    public com.java.Add2Nums getAdd2Nums() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Add2Nums_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdd2Nums(endpoint);
    }

    public com.java.Add2Nums getAdd2Nums(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.java.Add2NumsSoapBindingStub _stub = new com.java.Add2NumsSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdd2NumsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdd2NumsEndpointAddress(java.lang.String address) {
        Add2Nums_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.java.Add2Nums.class.isAssignableFrom(serviceEndpointInterface)) {
                com.java.Add2NumsSoapBindingStub _stub = new com.java.Add2NumsSoapBindingStub(new java.net.URL(Add2Nums_address), this);
                _stub.setPortName(getAdd2NumsWSDDServiceName());
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
        if ("Add2Nums".equals(inputPortName)) {
            return getAdd2Nums();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://java.com", "Add2NumsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://java.com", "Add2Nums"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Add2Nums".equals(portName)) {
            setAdd2NumsEndpointAddress(address);
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
