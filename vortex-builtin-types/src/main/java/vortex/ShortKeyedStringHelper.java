package vortex;


/**
* vortex/ShortKeyedStringHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/vortex-builtin-types/src/main/idl/vortex_builtin_types.idl
* Monday, February 29, 2016 3:24:12 PM EST
*/

abstract public class ShortKeyedStringHelper
{
  private static String  _id = "IDL:vortex/ShortKeyedString:1.0";

  public static void insert (org.omg.CORBA.Any a, vortex.ShortKeyedString that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static vortex.ShortKeyedString extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_short);
          _members0[0] = new org.omg.CORBA.StructMember (
            "key",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (vortex.ShortKeyedStringHelper.id (), "ShortKeyedString", _members0);
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

  public static vortex.ShortKeyedString read (org.omg.CORBA.portable.InputStream istream)
  {
    vortex.ShortKeyedString value = new vortex.ShortKeyedString ();
    value.key = istream.read_short ();
    value.value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, vortex.ShortKeyedString value)
  {
    ostream.write_short (value.key);
    ostream.write_string (value.value);
  }

}
