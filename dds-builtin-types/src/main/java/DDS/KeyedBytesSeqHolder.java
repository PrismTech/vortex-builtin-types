package DDS;


/**
* DDS/KeyedBytesSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/dds-builtin-types/src/main/idl/dds_builtin_types.idl
* Monday, February 29, 2016 3:24:09 PM EST
*/

public final class KeyedBytesSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public DDS.KeyedBytes value[] = null;

  public KeyedBytesSeqHolder ()
  {
  }

  public KeyedBytesSeqHolder (DDS.KeyedBytes[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DDS.KeyedBytesSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DDS.KeyedBytesSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DDS.KeyedBytesSeqHelper.type ();
  }

}
