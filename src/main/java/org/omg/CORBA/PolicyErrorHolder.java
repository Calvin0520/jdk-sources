package org.omg.CORBA;

/**
* org/omg/CORBA/PolicyErrorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x86_64/jdk8u333/2551/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Tuesday, April 26, 2022 6:42:08 AM BST
*/


/**
   * Thrown to indicate problems with parameter values passed to the
   * <code>ORB.create_policy</code> operation.  
   */
public final class PolicyErrorHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.PolicyError value = null;

  public PolicyErrorHolder ()
  {
  }

  public PolicyErrorHolder (org.omg.CORBA.PolicyError initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.PolicyErrorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.PolicyErrorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.PolicyErrorHelper.type ();
  }

}
