/*
 * An XML document type.
 * Localname: notEmptyNMTOKEN
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKENDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one notEmptyNMTOKEN(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class NotEmptyNMTOKENDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKENDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotEmptyNMTOKENDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTEMPTYNMTOKEN$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "notEmptyNMTOKEN");
    
    
    /**
     * Gets the "notEmptyNMTOKEN" element
     */
    public java.lang.String getNotEmptyNMTOKEN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTEMPTYNMTOKEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "notEmptyNMTOKEN" element
     */
    public de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN xgetNotEmptyNMTOKEN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().find_element_user(NOTEMPTYNMTOKEN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "notEmptyNMTOKEN" element
     */
    public void setNotEmptyNMTOKEN(java.lang.String notEmptyNMTOKEN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTEMPTYNMTOKEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTEMPTYNMTOKEN$0);
            }
            target.setStringValue(notEmptyNMTOKEN);
        }
    }
    
    /**
     * Sets (as xml) the "notEmptyNMTOKEN" element
     */
    public void xsetNotEmptyNMTOKEN(de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN notEmptyNMTOKEN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN target = null;
            target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().find_element_user(NOTEMPTYNMTOKEN$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.NotEmptyNMTOKEN)get_store().add_element_user(NOTEMPTYNMTOKEN$0);
            }
            target.set(notEmptyNMTOKEN);
        }
    }
}
