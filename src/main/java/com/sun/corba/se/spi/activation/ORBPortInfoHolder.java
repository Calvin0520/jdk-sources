package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ORBPortInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x86_64/jdk8u333/2551/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, April 26, 2022 6:42:08 AM BST
*/

public final class ORBPortInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.ORBPortInfo value = null;

  public ORBPortInfoHolder ()
  {
  }

  public ORBPortInfoHolder (com.sun.corba.se.spi.activation.ORBPortInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ORBPortInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ORBPortInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ORBPortInfoHelper.type ();
  }

}
