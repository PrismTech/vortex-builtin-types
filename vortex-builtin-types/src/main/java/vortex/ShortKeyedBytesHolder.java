package vortex;

/**
* vortex/ShortKeyedBytesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/vortex-builtin-types/src/main/idl/vortex_builtin_types.idl
* Monday, February 29, 2016 10:53:59 AM EST
*/

public final class ShortKeyedBytesHolder implements org.omg.CORBA.portable.Streamable
{
  public vortex.ShortKeyedBytes value = null;

  public ShortKeyedBytesHolder ()
  {
  }

  public ShortKeyedBytesHolder (vortex.ShortKeyedBytes initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = vortex.ShortKeyedBytesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    vortex.ShortKeyedBytesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return vortex.ShortKeyedBytesHelper.type ();
  }

}
