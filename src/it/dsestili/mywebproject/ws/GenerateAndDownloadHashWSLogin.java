/**
 * GenerateAndDownloadHashWSLogin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.dsestili.mywebproject.ws;

public interface GenerateAndDownloadHashWSLogin extends java.rmi.Remote {
    public it.dsestili.mywebproject.ws.Result generateAndDownloadHashLogin(java.lang.String folder, java.lang.String algorithm, java.lang.String modeParam, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
}
