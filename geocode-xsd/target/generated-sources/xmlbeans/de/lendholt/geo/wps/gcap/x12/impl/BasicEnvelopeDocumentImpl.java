/*
 * An XML document type.
 * Localname: basicEnvelope
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.BasicEnvelopeDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one basicEnvelope(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class BasicEnvelopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.BasicEnvelopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public BasicEnvelopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASICENVELOPE$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "basicEnvelope");
    
    
    /**
     * Gets the "basicEnvelope" element
     */
    public de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType getBasicEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType)get_store().find_element_user(BASICENVELOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "basicEnvelope" element
     */
    public void setBasicEnvelope(de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType basicEnvelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType)get_store().find_element_user(BASICENVELOPE$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType)get_store().add_element_user(BASICENVELOPE$0);
            }
            target.set(basicEnvelope);
        }
    }
    
    /**
     * Appends and returns a new empty "basicEnvelope" element
     */
    public de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType addNewBasicEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.BasicEnvelopeType)get_store().add_element_user(BASICENVELOPE$0);
            return target;
        }
    }
}
