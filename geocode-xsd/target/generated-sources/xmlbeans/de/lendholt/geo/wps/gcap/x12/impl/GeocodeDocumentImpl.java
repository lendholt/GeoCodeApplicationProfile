/*
 * An XML document type.
 * Localname: geocode
 * Namespace: http://lendholt.de/geo/wps/gcap/1.2
 * Java type: de.lendholt.geo.wps.gcap.x12.GeocodeDocument
 *
 * Automatically generated - do not modify.
 */
package de.lendholt.geo.wps.gcap.x12.impl;
/**
 * A document containing one geocode(@http://lendholt.de/geo/wps/gcap/1.2) element.
 *
 * This is a complex type.
 */
public class GeocodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.lendholt.geo.wps.gcap.x12.GeocodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODE$0 = 
        new javax.xml.namespace.QName("http://lendholt.de/geo/wps/gcap/1.2", "geocode");
    
    
    /**
     * Gets the "geocode" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeType getGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().find_element_user(GEOCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geocode" element
     */
    public void setGeocode(de.lendholt.geo.wps.gcap.x12.GeocodeType geocode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().find_element_user(GEOCODE$0, 0);
            if (target == null)
            {
                target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().add_element_user(GEOCODE$0);
            }
            target.set(geocode);
        }
    }
    
    /**
     * Appends and returns a new empty "geocode" element
     */
    public de.lendholt.geo.wps.gcap.x12.GeocodeType addNewGeocode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.lendholt.geo.wps.gcap.x12.GeocodeType target = null;
            target = (de.lendholt.geo.wps.gcap.x12.GeocodeType)get_store().add_element_user(GEOCODE$0);
            return target;
        }
    }
}
