package DDS;


/**
* DDS/_String.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/dds-builtin-types/src/main/idl/dds_builtin_types.idl
* Monday, February 29, 2016 10:53:56 AM EST
*/

/**
* Updated by idl2j
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/dds-builtin-types/src/main/idl/dds_builtin_types.idl
* Monday, February 29, 2016 10:53:57 o'clock AM EST
*/

import com.prismtech.cafe.dcps.keys.KeyList;

@KeyList(
    topicType = "_String",
    keys = {}
)
public final class _String implements org.omg.CORBA.portable.IDLEntity
{
  public String value = null;

  public _String ()
  {
  } // ctor

  public _String (String _value)
  {
    value = _value;
  } // ctor

} // class _String
