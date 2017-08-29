package it.dsestili.mywebproject.ws;

public class GenerateAndDownloadHashWSLoginProxy implements it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLogin {
  private String _endpoint = null;
  private it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLogin generateAndDownloadHashWSLogin = null;
  
  public GenerateAndDownloadHashWSLoginProxy() {
    _initGenerateAndDownloadHashWSLoginProxy();
  }
  
  public GenerateAndDownloadHashWSLoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initGenerateAndDownloadHashWSLoginProxy();
  }
  
  private void _initGenerateAndDownloadHashWSLoginProxy() {
    try {
      generateAndDownloadHashWSLogin = (new it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLoginServiceLocator()).getGenerateAndDownloadHashWSLogin();
      if (generateAndDownloadHashWSLogin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)generateAndDownloadHashWSLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)generateAndDownloadHashWSLogin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (generateAndDownloadHashWSLogin != null)
      ((javax.xml.rpc.Stub)generateAndDownloadHashWSLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.dsestili.mywebproject.ws.GenerateAndDownloadHashWSLogin getGenerateAndDownloadHashWSLogin() {
    if (generateAndDownloadHashWSLogin == null)
      _initGenerateAndDownloadHashWSLoginProxy();
    return generateAndDownloadHashWSLogin;
  }
  
  public it.dsestili.mywebproject.ws.Result generateAndDownloadHashLogin(java.lang.String folder, java.lang.String algorithm, java.lang.String modeParam, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (generateAndDownloadHashWSLogin == null)
      _initGenerateAndDownloadHashWSLoginProxy();
    return generateAndDownloadHashWSLogin.generateAndDownloadHashLogin(folder, algorithm, modeParam, userName, password);
  }
  
  
}