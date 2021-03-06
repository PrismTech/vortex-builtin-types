package vortex;


/**
* vortex/LongKeyedBytesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/vortex-builtin-types/src/main/idl/vortex_builtin_types.idl
* Monday, February 29, 2016 3:24:12 PM EST
*/

abstract public class LongKeyedBytesHelper
{
  private static String  _id = "IDL:vortex/LongKeyedBytes:1.0";

  public static void insert (org.omg.CORBA.Any a, vortex.LongKeyedBytes that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static vortex.LongKeyedBytes extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "key",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (vortex.LongKeyedBytesHelper.id (), "LongKeyedBytes", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static vortex.LongKeyedBytes read (org.omg.CORBA.portable.InputStream istream)
  {
    vortex.LongKeyedBytes value = new vortex.LongKeyedBytes ();
    value.key = istream.read_long ();
    int _len0 = istream.read_long ();
    value.value = new byte[_len0];
    istream.read_octet_array (value.value, 0, _len0);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, vortex.LongKeyedBytes value)
  {
    ostream.write_long (value.key);
    ostream.write_long (value.value.length);
    ostream.write_octet_array (value.value, 0, value.value.length);
  }

}
