/*
 * An XML document type.
 * Localname: keyValue
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.KeyValueDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one keyValue(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class KeyValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.KeyValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUE$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "keyValue");
    
    
    /**
     * Gets the "keyValue" element
     */
    public de.lendholt.geo.wps.gcap.x12.KeyValueType getKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.KeyValueType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.KeyValueType)get_store().find_element_user(KEYVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "keyValue" element
     */
    public void setKeyValue(de.lendholt.geo.wps.gcap.x12.KeyValueType keyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.KeyValueType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.KeyValueType)get_store().find_element_user(KEYVALUE$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.KeyValueType)get_store().add_element_user(KEYVALUE$0);
            }
            target.set(keyValue);
        }
    }
    
    /**
     * Appends and returns a new empty "keyValue" element
     */
    public de.lendholt.geo.wps.gcap.x12.KeyValueType addNewKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.KeyValueType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.KeyValueType)get_store().add_element_user(KEYVALUE$0);
            return target;
        }
    }
}
