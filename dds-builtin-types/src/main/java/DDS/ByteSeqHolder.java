package DDS;


/**
* DDS/ByteSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/dds-builtin-types/src/main/idl/dds_builtin_types.idl
* Monday, February 29, 2016 10:53:56 AM EST
*/

public final class ByteSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public ByteSeqHolder ()
  {
  }

  public ByteSeqHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DDS.ByteSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DDS.ByteSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DDS.ByteSeqHelper.type ();
  }

}