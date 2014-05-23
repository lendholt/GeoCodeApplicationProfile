/*
 * An XML document type.
 * Localname: de9im
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.De9ImDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one de9im(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class De9ImDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.De9ImDocument
{
    private static final long serialVersionUID = 1L;
    
    public De9ImDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DE9IM$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "de9im");
    
    
    /**
     * Gets the "de9im" element
     */
    public java.lang.String getDe9Im()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DE9IM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "de9im" element
     */
    public de.lendholt.geo.wps.gcap.x12.De9ImType xgetDe9Im()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.De9ImType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.De9ImType)get_store().find_element_user(DE9IM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "de9im" element
     */
    public void setDe9Im(java.lang.String de9Im)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DE9IM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DE9IM$0);
            }
            target.setStringValue(de9Im);
        }
    }
    
    /**
     * Sets (as xml) the "de9im" element
     */
    public void xsetDe9Im(de.lendholt.geo.wps.gcap.x12.De9ImType de9Im)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.De9ImType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.De9ImType)get_store().find_element_user(DE9IM$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.De9ImType)get_store().add_element_user(DE9IM$0);
            }
            target.set(de9Im);
        }
    }
}
