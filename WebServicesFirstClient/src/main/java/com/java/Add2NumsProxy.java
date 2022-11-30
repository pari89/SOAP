package com.java;

public class Add2NumsProxy implements com.java.Add2Nums {
  private String _endpoint = null;
  private com.java.Add2Nums add2Nums = null;
  
  public Add2NumsProxy() {
    _initAdd2NumsProxy();
  }
  
  public Add2NumsProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdd2NumsProxy();
  }
  
  private void _initAdd2NumsProxy() {
    try {
      add2Nums = (new com.java.Add2NumsServiceLocator()).getAdd2Nums();
      if (add2Nums != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)add2Nums)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)add2Nums)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (add2Nums != null)
      ((javax.xml.rpc.Stub)add2Nums)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.java.Add2Nums getAdd2Nums() {
    if (add2Nums == null)
      _initAdd2NumsProxy();
    return add2Nums;
  }
  
  public int add2(int a, int b) throws java.rmi.RemoteException{
    if (add2Nums == null)
      _initAdd2NumsProxy();
    return add2Nums.add2(a, b);
  }
  
  
}